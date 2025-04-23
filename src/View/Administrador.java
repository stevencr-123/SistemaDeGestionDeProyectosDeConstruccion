
package View;

import DAO.ObreroDAO;
import Dao.ProyectoDAO;
import Model.EstadoProyecto;
import Model.Obrero;
import Model.Prioridad;
import Model.ProyectoReparacion;
import Model.TipoIdentificacion;
import Model.TipoReparacion;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author Camilo Jurado
 */
public class Administrador extends javax.swing.JFrame {
    
    private DefaultTableModel tableModelEmpleados;
    private DefaultTableModel tableModelProyectos;
    private ObreroDAO obreroDAO = new ObreroDAO();
    private ProyectoDAO proyectoDAO = new ProyectoDAO();
    ;
    
    
    public Administrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        setupTableModel();
        cargarDatosEnTabla();
        inicializarMenu();
        cargarProyectosEnTabla();
        inicializarMenuProyecto();
    }
    
    
   public void inicializarMenu() {
    JMenuItem eliminar = new JMenuItem("Despedir");
    JMenuItem modificar = new JMenuItem("Modificar");
    
    
    ppmenutabla.add(modificar);  
    ppmenutabla.add(eliminar);  
    
    
    jTable_Empleados.setComponentPopupMenu(ppmenutabla);
    
  modificar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = jTable_Empleados.getSelectedRow();

        if (selectedRow != -1) {
            String cedula = (String) jTable_Empleados.getValueAt(selectedRow, 3);

            ObreroDAO obreroDAO = new ObreroDAO();
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
            JOptionPane.showMessageDialog(null, 
                "Seleccione un obrero primero", 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }
    }
});

  
  
    
    eliminar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = jTable_Empleados.getSelectedRow();

            if (selectedRow != -1) {
                String cedula = (String) jTable_Empleados.getValueAt(selectedRow, 3);

                int confirm = JOptionPane.showConfirmDialog(null, 
                    "¿Está seguro de eliminar al obrero con cédula " + cedula + "?", 
                    "Confirmación", 
                    JOptionPane.YES_NO_OPTION);
                
                if (confirm == JOptionPane.YES_OPTION) {
                    ObreroDAO obreroDAO = new ObreroDAO();
                    boolean eliminado = obreroDAO.borrarObrero(cedula);
                    
                    if (eliminado) {
                        JOptionPane.showMessageDialog(null, "Obrero eliminado correctamente");
                        cargarDatosEnTabla();
                    } else {
                        JOptionPane.showMessageDialog(null, 
                            "No se pudo eliminar el obrero", 
                            "Error", 
                            JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                JOptionPane.showMessageDialog(null, 
                    "Seleccione un obrero primero", 
                    "Advertencia", 
                    JOptionPane.WARNING_MESSAGE);
            }
        }
    });

}

   
   
   public void inicializarMenuProyecto() {

    JMenuItem modificar = new JMenuItem("Modificar");
    JMenuItem eliminar = new JMenuItem("Eliminar");

    jPopupMenuTablaproyectos.add(modificar);
    jPopupMenuTablaproyectos.add(eliminar);

    jTable_Proyectos.setComponentPopupMenu(jPopupMenuTablaproyectos);

    modificar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            int selectedRow = jTable_Proyectos.getSelectedRow();

            if (selectedRow != -1) {
                String codigo = (String) jTable_Proyectos.getValueAt(selectedRow, 0);
                ProyectoDAO proyectodao = new ProyectoDAO();
                ProyectoReparacion proyecto = proyectodao.cargarTodos().stream()
                        .filter(p -> p.getCodigo().equals(codigo))
                        .findFirst()
                        .orElse(null);

                if (proyecto != null) {
                    String nuevoNombre = JOptionPane.showInputDialog(null, "Nuevo nombre del proyecto:", proyecto.getNombre());
                    String nuevaDireccion = JOptionPane.showInputDialog(null, "Nueva dirección:", proyecto.getDireccion());

                    if (nuevoNombre != null && nuevaDireccion != null) {
                        proyecto.setNombre(nuevoNombre);
                        proyecto.setDireccion(nuevaDireccion);

                        List<ProyectoReparacion> lista = proyectodao.cargarTodos();
                        for (int i = 0; i < lista.size(); i++) {
                            if (lista.get(i).getCodigo().equals(proyecto.getCodigo())) {
                                lista.set(i, proyecto);
                                break;
                            }
                        }
                        proyectodao.guardarListaProyectos(lista);
                        JOptionPane.showMessageDialog(null, "Proyecto modificado exitosamente");
                        cargarProyectosEnTabla();
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Proyecto no encontrado", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un proyecto primero");
            }
        }
    });

    eliminar.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent e) {
        int selectedRow = jTable_Proyectos.getSelectedRow();

        if (selectedRow != -1) {
            String codigo = (String) jTable_Proyectos.getValueAt(selectedRow, 0);

            int confirm = JOptionPane.showConfirmDialog(null, 
                "¿Está seguro de eliminar el proyecto con código " + codigo + "?", 
                "Confirmación", 
                JOptionPane.YES_NO_OPTION);
            
            if (confirm == JOptionPane.YES_OPTION) {
                ProyectoDAO proyectodao = new ProyectoDAO();
                List<ProyectoReparacion> lista = proyectodao.cargarTodos();
                boolean eliminado = lista.removeIf(p -> p.getCodigo().equals(codigo));
                
                if (eliminado) {
                    proyectodao.guardarListaProyectos(lista);
                    JOptionPane.showMessageDialog(null, "Proyecto eliminado correctamente");
                    cargarProyectosEnTabla();
                } else {
                    JOptionPane.showMessageDialog(null, 
                        "No se pudo eliminar el proyecto", 
                        "Error", 
                        JOptionPane.ERROR_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, 
                "Seleccione un proyecto primero", 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }
    }
});

    
   
   }

   
    
     private void setupTableModel() {
        tableModelEmpleados = (DefaultTableModel) jTable_Empleados.getModel();
    }
     
     
       private void guardarObrerosDesdeFormulario() {
        
        try {
            String nombre = jTextnombre.getText().trim();
            String apellido = jTextapellido.getText().trim();
            String Cedula = jTextcedula.getText().trim();
            String telefono = jTextFieldtelefono.getText().trim();
            TipoIdentificacion tipoCedula = TipoIdentificacion.valueOf(jComboBox1.getSelectedItem().toString());
            String correo = jTextcorreo.getText().trim();
            String especialidad = jComboTrabajo.getSelectedItem().toString();
            double salario = Double.parseDouble(jTextsalario.getText().trim());
    

            if (nombre.isEmpty() || correo.isEmpty()|| Cedula.isEmpty() || telefono.isEmpty() || correo.isEmpty() || especialidad.isEmpty()) {
                JOptionPane.showMessageDialog(this,
                        "Todos los campos son obligatorios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            boolean seguroLaboral = true;
            Obrero nuevoObrero = new Obrero(
            tipoCedula,        
            Cedula,            
            nombre,            
            apellido,          
            correo,            
            especialidad,      
            seguroLaboral,
            salario
);
            nuevoObrero.setFechaContratacion(LocalDate.now());
            obreroDAO.guardarObrero(nuevoObrero);

            JOptionPane.showMessageDialog(this,
                    "Obrero guardado exitosamente:\n"
                    +
                    JOptionPane.INFORMATION_MESSAGE);

            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al guardar obrero: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
     
    
    
    private void limpiar(){
        jTextnombre.setText("");
        jTextapellido.setText("");
        jTextcedula.setText("");
        jTextFieldtelefono.setText("");
        jComboBox1.setSelectedItem(0);
        jTextcorreo.setText("");
        jComboTrabajo.setSelectedItem(0);
        jTextsalario.setText("");
    }
    
    
    
    private void initTableModelEmpleados() {
    tableModelEmpleados = new DefaultTableModel(
        new Object[]{"tipo identificacion", "Nombre", "Apellidos", "Correo", "Cédula", "Teléfono", "Especialidad", "Seguro Laboral","salario"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    jTable_Empleados.setModel(tableModelEmpleados); 
}

    
    private void cargarDatosEnTabla() {
        tableModelEmpleados.setRowCount(0);
        
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
            tableModelEmpleados.addRow(row);
        }
    
    }
    private void setupTableMode() {
        tableModelProyectos = (DefaultTableModel) jTable_Proyectos.getModel();
    }
    private void guardarProyectoDesdeFormulario() {
        
        try {
            String codigo = txtCodigo.getText().trim();
            String nombre = txtNombre.getText().trim();
            String direccion = txtDireccion.getText().trim();
            TipoReparacion tiporeparacion = TipoReparacion.valueOf(txtTiporeparacion.getSelectedItem().toString());
            LocalDate fechafin = LocalDate.parse(txtFechaestimada.getText());
            Prioridad prioridad = Prioridad.valueOf(txtPrioridad.getSelectedItem().toString());
            double presupuesto = Double.parseDouble(txtPresupuesto.getText().trim());
            EstadoProyecto estadoproyecto = EstadoProyecto.valueOf(txtEstado.getSelectedItem().toString());

            if (codigo.isEmpty() || nombre.isEmpty()|| direccion.isEmpty() ) {
                JOptionPane.showMessageDialog(this,
                        "Todos los campos son obligatorios",
                        "Error",
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            //boolean seguroLaboral = true;
            ProyectoReparacion nuevoProyecto = new ProyectoReparacion(
            codigo, 
            nombre, 
            direccion,
            tiporeparacion,
            LocalDate.now(),
            fechafin, 
            prioridad, 
            presupuesto,
            estadoproyecto);
            
            
            proyectoDAO.guardarProyecto(nuevoProyecto);

            JOptionPane.showMessageDialog(this,
    "Proyecto guardado exitosamente.",
    "Éxito",
    JOptionPane.INFORMATION_MESSAGE);

            
            

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this,
                    "Error al guardar obrero: " + e.getMessage(),
                    "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    private void initTableModelProyectos() {
    tableModelProyectos = new DefaultTableModel(
        new Object[]{"Codigo", "Nombre", "Direccion", "Tipo", "Inicio", "Fin", "Prioridad", "Presupuesto","Estado"}, 0) {
        @Override
        public boolean isCellEditable(int row, int column) {
            return false;
        }
    };
    jTable_Proyectos.setModel(tableModelProyectos); 
}

    
    private void cargarProyectosEnTabla() {
        
    if (tableModelProyectos == null) {
        initTableModelProyectos();
    }
    tableModelProyectos.setRowCount(0);  

    List<ProyectoReparacion> proyectos = proyectoDAO.cargarTodos();
    
    for (ProyectoReparacion proyecto : proyectos) {
        Object[] row = {
            proyecto.getCodigo(),
            proyecto.getNombre(),
            proyecto.getDireccion(),
            proyecto.getTipoReparacion(),
            proyecto.getFechaInicio() != null 
                ? proyecto.getFechaInicio().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")) 
                : "No especificada",
            proyecto.getFechaFinEstimada(),
            proyecto.getPrioridad(),
            proyecto.getPresupuesto(),
            proyecto.getEstado()
        };
        tableModelProyectos.addRow(row);
    }
    
    

}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ppmenutabla = new javax.swing.JPopupMenu();
        jPopupMenuTablaproyectos = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jTextcorreo = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jComboTrabajo = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jTextnombre = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextcedula = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jTextFieldtelefono = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jTextapellido = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextsalario = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_Empleados = new javax.swing.JTable();
        jPanel9 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Proyectos = new javax.swing.JTable();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTiporeparacion = new javax.swing.JComboBox<>();
        txtFechaestimada = new javax.swing.JTextField();
        txtPrioridad = new javax.swing.JComboBox<>();
        txtPresupuesto = new javax.swing.JTextField();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        txtEstado = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setPreferredSize(new java.awt.Dimension(1000, 100));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 233, 127));
        jLabel1.setText("Administrador");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 320, 70));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 860, 130));

        jPanel3.setBackground(new java.awt.Color(0, 51, 102));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 51, 102));
        jPanel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel5MouseExited(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 233, 127));
        jLabel2.setText("Proyectos");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 60));

        jPanel4.setBackground(new java.awt.Color(0, 51, 102));
        jPanel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel4MouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 233, 127));
        jLabel3.setText("Empleados");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, 200, 60));

        jPanel6.setBackground(new java.awt.Color(0, 51, 102));
        jPanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel6MouseExited(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 233, 127));
        jLabel4.setText("Contratar");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 60));
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 130, 150));

        jPanel13.setBackground(new java.awt.Color(0, 51, 102));
        jPanel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel13MouseExited(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 233, 127));
        jLabel21.setText("Lista Obras");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel21)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 410, 200, 50));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 600));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));

        jPanel10.setBackground(new java.awt.Color(255, 255, 255));
        jPanel10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTextcorreo.setBackground(new java.awt.Color(0, 0, 0, 0));
        jTextcorreo.setBorder(null);
        jTextcorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextcorreoActionPerformed(evt);
            }
        });
        jPanel10.add(jTextcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel13.setText("Correo:");
        jPanel10.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        jComboTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promotor", "Obrero" }));
        jComboTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel10.add(jComboTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, -1));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel11.setText("Trabajo:");
        jPanel10.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

        jTextnombre.setBackground(new java.awt.Color(0, 0, 0, 0));
        jTextnombre.setBorder(null);
        jTextnombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextnombreActionPerformed(evt);
            }
        });
        jTextnombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextnombreKeyTyped(evt);
            }
        });
        jPanel10.add(jTextnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Apellido:");
        jPanel10.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel12.setText("Cedula:");
        jPanel10.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        jTextcedula.setBackground(new java.awt.Color(0, 0, 0, 0));
        jTextcedula.setBorder(null);
        jTextcedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextcedulaKeyTyped(evt);
            }
        });
        jPanel10.add(jTextcedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 10));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 100, 10));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 10));

        jSeparator4.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 10));

        jSeparator6.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 10));

        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jButton2.setText("Contratar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 50));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA" }));
        jPanel10.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, -1));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel14.setText("Tipo de cedula");
        jPanel10.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel15.setText("Telefono:");
        jPanel10.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 20));

        jTextFieldtelefono.setBorder(null);
        jPanel10.add(jTextFieldtelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 100, 20));

        jSeparator7.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 10));

        jTextapellido.setBorder(null);
        jPanel10.add(jTextapellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, 20));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel16.setText("Nombre:");
        jPanel10.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel10.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setText("Salario:");
        jPanel10.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, 20));

        jTextsalario.setBorder(null);
        jPanel10.add(jTextsalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 110, 20));

        jSeparator5.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel10.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 290, 110, 10));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(516, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("tab1", jPanel7);

        jTable_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Cedula", "Rol", "Seguro Laboral", "Tipo identificacion", "Fecha contratacion", "Salario"
            }
        ));
        jScrollPane2.setViewportView(jTable_Empleados);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel8);

        jTable_Proyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nombre", "Direccion", "Tipo", "Inicio", "Fin", "Prioridad", "Presupuesto", "Estado"
            }
        ));
        jScrollPane1.setViewportView(jTable_Proyectos);

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 860, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel9);

        jPanel11.setBackground(new java.awt.Color(255, 255, 255));

        jPanel12.setBackground(new java.awt.Color(255, 255, 255));
        jPanel12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel17.setText("Codigo:");
        jPanel12.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 22, -1, -1));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel18.setText("Nombre:");
        jPanel12.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 22, -1, -1));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel19.setText("Direccion:");
        jPanel12.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 101, -1, -1));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel20.setText("Tipo de reparacion:");
        jPanel12.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 101, -1, -1));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel22.setText("Fecha fin estimada:");
        jPanel12.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 181, -1, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel23.setText("Prioridad:");
        jPanel12.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 273, -1, -1));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel24.setText("Presupuesto");
        jPanel12.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 273, -1, -1));

        jButton3.setText("Guardar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel12.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 100, 30));

        txtCodigo.setBorder(null);
        jPanel12.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 53, 100, -1));

        txtNombre.setBorder(null);
        jPanel12.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 53, 100, -1));

        txtDireccion.setBorder(null);
        jPanel12.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 132, 100, -1));

        txtTiporeparacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ESTRUCTURAL", "ELECTRICA", "HIDRAULICA", "PAVIMENTACION", "OTROS" }));
        jPanel12.add(txtTiporeparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 132, -1, -1));

        txtFechaestimada.setBorder(null);
        jPanel12.add(txtFechaestimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 212, 100, -1));

        txtPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "URGENTE", "ALTA", "MEDIA", "BAJA;" }));
        jPanel12.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, -1));

        txtPresupuesto.setBorder(null);
        jPanel12.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 300, 100, -1));

        jSeparator9.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator9.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 100, 10));

        jSeparator10.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator10.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 110, 10));

        jSeparator11.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator11.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 100, 10));

        jSeparator12.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator12.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 10));

        jSeparator13.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator13.setForeground(new java.awt.Color(0, 0, 0));
        jPanel12.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 230, 100, 10));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel25.setText("Estado");
        jPanel12.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        txtEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PLANEACION", "EN PROCESO", "SUSPENDIDO", "FINALIZADO" }));
        jPanel12.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(444, Short.MAX_VALUE))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("tab4", jPanel11);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 860, 470));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseEntered
      jPanel6.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanel6MouseEntered

    private void jPanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseExited
       jPanel6.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_jPanel6MouseExited

    private void jPanel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseEntered
       jPanel4.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanel4MouseEntered

    private void jPanel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseExited
       jPanel4.setBackground(new Color(0,51,102));
    }//GEN-LAST:event_jPanel4MouseExited

    private void jPanel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseEntered
       jPanel5.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanel5MouseEntered

    private void jPanel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseExited
        jPanel5.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_jPanel5MouseExited

    private void jPanel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel5MouseClicked
      jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jPanel5MouseClicked

    private void jPanel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel6MouseClicked
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_jPanel6MouseClicked

    private void jPanel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel4MouseClicked
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jPanel4MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        guardarObrerosDesdeFormulario();
        cargarDatosEnTabla();
        limpiar();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextcedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextcedulaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "Solo se permiten números en este campo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextcedulaKeyTyped

    private void jTextnombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextnombreKeyTyped
char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras en este campo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jTextnombreKeyTyped

    private void jTextnombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextnombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextnombreActionPerformed

    private void jTextcorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextcorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextcorreoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
cargarDatosEnTabla();
        JOptionPane.showMessageDialog(this, 
            "Tabla actualizada correctamente", 
            "Actualización", 
            JOptionPane.INFORMATION_MESSAGE);
        limpiar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        guardarProyectoDesdeFormulario();
        cargarProyectosEnTabla();


    }//GEN-LAST:event_jButton3ActionPerformed

    private void jPanel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseClicked
        jTabbedPane1.setSelectedIndex(3);
    }//GEN-LAST:event_jPanel13MouseClicked

    private void jPanel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseEntered
       jPanel13.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanel13MouseEntered

    private void jPanel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel13MouseExited
        jPanel13.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_jPanel13MouseExited

    
                                       
        
                                        

    /**
     * @param args the command line arguments
     */
   public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Administrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboTrabajo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JPopupMenu jPopupMenuTablaproyectos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable_Empleados;
    private javax.swing.JTable jTable_Proyectos;
    private javax.swing.JTextField jTextFieldtelefono;
    private javax.swing.JTextField jTextapellido;
    private javax.swing.JTextField jTextcedula;
    private javax.swing.JTextField jTextcorreo;
    private javax.swing.JTextField jTextnombre;
    private javax.swing.JTextField jTextsalario;
    private javax.swing.JPopupMenu ppmenutabla;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JComboBox<String> txtEstado;
    private javax.swing.JTextField txtFechaestimada;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JComboBox<String> txtPrioridad;
    private javax.swing.JComboBox<String> txtTiporeparacion;
    // End of variables declaration//GEN-END:variables
}
