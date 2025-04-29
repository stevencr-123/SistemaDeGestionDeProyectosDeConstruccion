package Controller;


import Model.Obrero;
import Dao.ObreroDAO;
import java.time.LocalDate;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import Model.Obrero;
import Model.TipoIdentificacion;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class AdminController {

    private DefaultTableModel tableModelObrero;
    private ObreroDAO obreroDAO = new ObreroDAO();
    private String cedulaOriginal;

    
    private JPopupMenu popupMenu;
    private JTable tablaObreros;
    private JTextField txtNombre;
    private JTextField txtApellido;
    private JTextField txtCedula;
    private JTextField txtCorreo;
    private JTextField txtTelefono;
    private JTextField txtSalario;
    private JComboBox<String> cbTipoCedula;
    private JComboBox<String> cbEspecialidad;

    // Setters para los componentes
    public void setTablaObreros(JTable tablaObreros) {
        this.tablaObreros = tablaObreros;
        this.tableModelObrero = (DefaultTableModel) tablaObreros.getModel();
    }

    public void setTxtNombre(JTextField txtNombre) {
        this.txtNombre = txtNombre;
    }

    public void setTxtApellido(JTextField txtApellido) {
        this.txtApellido = txtApellido;
    }

    public void setTxtCedula(JTextField txtCedula) {
        this.txtCedula = txtCedula;
    }

    public void setTxtCorreo(JTextField txtCorreo) {
        this.txtCorreo = txtCorreo;
    }

    public void setTxtTelefono(JTextField txtTelefono) {
        this.txtTelefono = txtTelefono;
    }

    public void setTxtSalario(JTextField txtSalario) {
        this.txtSalario = txtSalario;
    }

    public void setCbTipoCedula(JComboBox<String> cbTipoCedula) {
        this.cbTipoCedula = cbTipoCedula;
    }

    public void setCbEspecialidad(JComboBox<String> cbEspecialidad) {
        this.cbEspecialidad = cbEspecialidad;
    }

    // Inicializar tabla
    public void initTableObreros() {
        tableModelObrero = new DefaultTableModel(
            new Object[]{"Tipo Cedula", "Cedula", "Nombre", "Apellido", "Correo", "Especialidad", "Salario", "Fecha Contratación"}, 0
        ) {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tablaObreros.setModel(tableModelObrero);
    }

    // Cargar datos en la tabla
    public void cargarDatosEnTabla() {
        tableModelObrero.setRowCount(0);
        List<Obrero> obreros = obreroDAO.cargarTodos();
        for (Obrero obrero : obreros) {
            String fechaStr = (obrero.getFechaContratacion() != null)
            ? obrero.getFechaContratacion().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
            : "No especificada";
        Object[] row = {
            obrero.getPrimerNombre(),        
            obrero.getPrimerApellido(),      
            obrero.getEmail(),
            obrero.getNumeroIdentificacion(),
            obrero.getEspecialidad(),
            obrero.isSeguroLaboral(),
            obrero.getTipoIdentificacion(),
            fechaStr,      
            obrero.getSalarioHora(),
            };
            tableModelObrero.addRow(row);
        }
    }

    // Guardar desde formulario
    public void guardarObreroDesdeFormulario() {
        try {
            String nombre = txtNombre.getText().trim();
            String apellido = txtApellido.getText().trim();
            String cedula = txtCedula.getText().trim();
            String correo = txtCorreo.getText().trim();
            String telefono = txtTelefono.getText().trim();
            String salarioStr = txtSalario.getText().trim();
            String tipoCedulaStr = cbTipoCedula.getSelectedItem().toString();
            String especialidad = cbEspecialidad.getSelectedItem().toString();

            if (nombre.isEmpty() || apellido.isEmpty() || cedula.isEmpty() || correo.isEmpty()
                    || telefono.isEmpty() || salarioStr.isEmpty() || tipoCedulaStr.isEmpty()
                    || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            double salario;
            try {
                salario = Double.parseDouble(salarioStr);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El salario debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            TipoIdentificacion tipoIdentificacion;
            try {
                tipoIdentificacion = TipoIdentificacion.valueOf(tipoCedulaStr);
            } catch (IllegalArgumentException e) {
                JOptionPane.showMessageDialog(null, "Tipo de identificación no válido.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            boolean existe = obreroDAO.cargarTodos().stream()
                .anyMatch(o -> o.getNumeroIdentificacion().equals(cedula));
            if (existe) {
                JOptionPane.showMessageDialog(null, "Ya existe un obrero con esta cédula.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }

            Obrero nuevoObrero = new Obrero(
                tipoIdentificacion,
                cedula,
                nombre,
                apellido,
                correo,
                especialidad,
                true,
                salario
            );
            nuevoObrero.setFechaContratacion(LocalDate.now());

            obreroDAO.guardarObrero(nuevoObrero);
            JOptionPane.showMessageDialog(null, "Obrero guardado exitosamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
            cargarDatosEnTabla();
            limpiarFormularioObrero();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al guardar obrero: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
        }
    }

    public void limpiarFormularioObrero() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtCedula.setText("");
        txtCorreo.setText("");
        txtTelefono.setText("");
        txtSalario.setText("");
        cbTipoCedula.setSelectedIndex(0);
        cbEspecialidad.setSelectedIndex(0);
    }

    public void inicializarPopupMenu() {
        popupMenu = new JPopupMenu();
        JMenuItem modificar = new JMenuItem("Modificar");
        JMenuItem eliminar = new JMenuItem("Despedir");

        popupMenu.add(modificar);
        popupMenu.add(eliminar);

        tablaObreros.setComponentPopupMenu(popupMenu);

        modificar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                modificarObreroSeleccionado();
            }
        });

        eliminar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                eliminarObreroSeleccionado();
            }
        });
    }

    private void modificarObreroSeleccionado() {
        int selectedRow = tablaObreros.getSelectedRow();

        if (selectedRow != -1) {
            String cedula = (String) tableModelObrero.getValueAt(selectedRow, 3);
            Obrero obrero = obreroDAO.obtenerPorIdentificacion(cedula);

            if (obrero != null) {
                boolean cambios = false;

                String nuevoEmail = JOptionPane.showInputDialog(null, "Nuevo Email:", obrero.getEmail());
                if (nuevoEmail != null && !nuevoEmail.trim().isEmpty() && !nuevoEmail.equals(obrero.getEmail())) {
                    boolean ok = obreroDAO.actualizarObrero(cedula, nuevoEmail, null, null);
                    if (ok) {
                        cambios = true;
                        JOptionPane.showMessageDialog(null, "Email actualizado correctamente");
                    }
                }

                String nuevaEspecialidad = JOptionPane.showInputDialog(null, "Nueva Especialidad:", obrero.getEspecialidad());
                if (nuevaEspecialidad != null && !nuevaEspecialidad.trim().isEmpty() && !nuevaEspecialidad.equals(obrero.getEspecialidad())) {
                    boolean ok = obreroDAO.actualizarObrero(cedula, null, nuevaEspecialidad, null);
                    if (ok) {
                        cambios = true;
                        JOptionPane.showMessageDialog(null, "Especialidad actualizada correctamente");
                    }
                }

                int opcion = JOptionPane.showConfirmDialog(null, "¿Tiene seguro laboral?", "Seguro", JOptionPane.YES_NO_CANCEL_OPTION);
                if (opcion == JOptionPane.YES_OPTION || opcion == JOptionPane.NO_OPTION) {
                    boolean tieneSeguro = (opcion == JOptionPane.YES_OPTION);
                    if (tieneSeguro != obrero.isSeguroLaboral()) {
                        boolean ok = obreroDAO.actualizarObrero(cedula, null, null, tieneSeguro);
                        if (ok) {
                            cambios = true;
                            JOptionPane.showMessageDialog(null, "Seguro laboral actualizado correctamente");
                        }
                    }
                }

                if (cambios) {
                    cargarDatosEnTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No se realizaron cambios");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Obrero no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un obrero primero", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }

    private void eliminarObreroSeleccionado() {
        int selectedRow = tablaObreros.getSelectedRow();

        if (selectedRow != -1) {
            String cedula = (String) tableModelObrero.getValueAt(selectedRow, 3);

            int confirm = JOptionPane.showConfirmDialog(null,
                    "¿Está seguro de eliminar al obrero con cédula " + cedula + "?",
                    "Confirmación",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.YES_OPTION) {
                boolean eliminado = obreroDAO.borrarObrero(cedula);

                if (eliminado) {
                    JOptionPane.showMessageDialog(null, "Obrero eliminado correctamente");
                    cargarDatosEnTabla();
                } else {
                    JOptionPane.showMessageDialog(null, "No se pudo eliminar el obrero", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Seleccione un obrero primero", "Advertencia", JOptionPane.WARNING_MESSAGE);
        }
    }


}
