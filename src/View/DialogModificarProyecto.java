package view;

import controller.ProyectoController;
import model.EstadoProyecto;
import model.Prioridad;
import model.TipoReparacion;
import exceptions.FechaInvalidaException;
import exceptions.NombreProyectoExistenteException;
import exceptions.ProyectoYaExisteException;
import exceptions.ValidacionException;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;
import model.Proyecto;
import reposiroty.impl.ProyectoRepositoryJsonImpl;
import repository.interfaces.IProyectoRepository;
import service.impl.ProyectoServiceImpl;
import service.interfaces.IProyectoService;

public class DialogModificarProyecto extends javax.swing.JDialog {

    IProyectoRepository repo = new ProyectoRepositoryJsonImpl();
    IProyectoService servicio = new ProyectoServiceImpl(repo);
    ProyectoController proyectoController = new ProyectoController(servicio);

    public DialogModificarProyecto(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        etiTItulo = new javax.swing.JLabel();
        separadorSecction9 = new javax.swing.JSeparator();
        separadorSecction4 = new javax.swing.JSeparator();
        separadorSecction7 = new javax.swing.JSeparator();
        separadorSecction8 = new javax.swing.JSeparator();
        scrollArea = new javax.swing.JScrollPane();
        txtArea = new org.jdesktop.swingx.JXTextArea();
        etiFechaEstimada = new javax.swing.JLabel();
        DatePickFechaEstimada = new org.jdesktop.swingx.JXDatePicker();
        txtPresupuesto = new javax.swing.JTextField();
        etiPresupuesto = new javax.swing.JLabel();
        separadorPresupuesto = new javax.swing.JSeparator();
        txtCodigo = new javax.swing.JTextField();
        etiCodigo = new javax.swing.JLabel();
        etiNombreProyecto = new javax.swing.JLabel();
        etiDireccionProyecto = new javax.swing.JLabel();
        cmbTiporeparacion = new javax.swing.JComboBox<>();
        etiTipoReparacion = new javax.swing.JLabel();
        etiPrioridadProyecto = new javax.swing.JLabel();
        cmbPrioridad = new javax.swing.JComboBox<>();
        txtDireccion = new javax.swing.JTextField();
        separadorDireccionProyecto = new javax.swing.JSeparator();
        separadorNombreProyecto = new javax.swing.JSeparator();
        txtNombre = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        separadorSeccion1 = new javax.swing.JSeparator();
        etiSeccionDatosGenerales = new org.jdesktop.swingx.JXLabel();
        etiSeccionPlanificacion = new org.jdesktop.swingx.JXLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        etiDescripcion = new org.jdesktop.swingx.JXLabel();
        etiDetallesTecnicos = new org.jdesktop.swingx.JXLabel();
        etiEstadoProyecto = new javax.swing.JLabel();
        cmbEstado = new javax.swing.JComboBox<>();
        etiFechaEstimada1 = new javax.swing.JLabel();
        DatePickFechaInicio = new org.jdesktop.swingx.JXDatePicker();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODIFICAR PROYECTO\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTItulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiTItulo.setForeground(new java.awt.Color(0, 0, 0));
        etiTItulo.setText("              PROYECTO");
        panelBase.add(etiTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 0, 250, 40));

        separadorSecction9.setBackground(new java.awt.Color(0, 0, 0));
        separadorSecction9.setOpaque(true);
        panelBase.add(separadorSecction9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 310, -1));

        separadorSecction4.setBackground(new java.awt.Color(0, 0, 0));
        separadorSecction4.setOpaque(true);
        panelBase.add(separadorSecction4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 310, -1));

        separadorSecction7.setBackground(new java.awt.Color(0, 0, 0));
        separadorSecction7.setOpaque(true);
        panelBase.add(separadorSecction7, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 310, 320, -1));

        separadorSecction8.setBackground(new java.awt.Color(0, 0, 0));
        separadorSecction8.setOpaque(true);
        panelBase.add(separadorSecction8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, 310, -1));

        txtArea.setBackground(new java.awt.Color(204, 204, 204));
        txtArea.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtArea.setColumns(20);
        txtArea.setRows(5);
        scrollArea.setViewportView(txtArea);

        panelBase.add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 320, 330, 110));

        etiFechaEstimada.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiFechaEstimada.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaEstimada.setText("Fecha fin estimada:");
        panelBase.add(etiFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, -1, 30));

        DatePickFechaEstimada.setBackground(new java.awt.Color(204, 204, 204));
        DatePickFechaEstimada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(DatePickFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 160, -1));

        txtPresupuesto.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtPresupuesto.setBorder(null);
        panelBase.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 190, 20));

        etiPresupuesto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        etiPresupuesto.setText("Presupuesto:");
        panelBase.add(etiPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, -1, -1));

        separadorPresupuesto.setBackground(new java.awt.Color(0, 0, 0));
        separadorPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 160, 190, 10));

        txtCodigo.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBorder(null);
        panelBase.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 250, 30));

        etiCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiCodigo.setForeground(new java.awt.Color(0, 0, 0));
        etiCodigo.setText("Codigo:");
        panelBase.add(etiCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 50, -1));

        etiNombreProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiNombreProyecto.setForeground(new java.awt.Color(0, 0, 0));
        etiNombreProyecto.setText("Nombre:");
        panelBase.add(etiNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        etiDireccionProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiDireccionProyecto.setForeground(new java.awt.Color(0, 0, 0));
        etiDireccionProyecto.setText("Direccion:");
        panelBase.add(etiDireccionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 70, 20));

        cmbTiporeparacion.setBackground(new java.awt.Color(255, 255, 255));
        cmbTiporeparacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Estructural", "Electrica", "Hidraulica", "Pavimentacion", "Otros" }));
        cmbTiporeparacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(cmbTiporeparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, 140, 30));

        etiTipoReparacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTipoReparacion.setForeground(new java.awt.Color(0, 0, 0));
        etiTipoReparacion.setText("Tipo de reparación:");
        panelBase.add(etiTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 20));

        etiPrioridadProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPrioridadProyecto.setForeground(new java.awt.Color(0, 0, 0));
        etiPrioridadProyecto.setText("Prioridad:");
        panelBase.add(etiPrioridadProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 70, 20));

        cmbPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguna", "Urgente", "Alta", "Media", "Baja" }));
        cmbPrioridad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(cmbPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 390, 200, 30));

        txtDireccion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtDireccion.setBorder(null);
        panelBase.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 240, 20));

        separadorDireccionProyecto.setBackground(new java.awt.Color(0, 0, 0));
        separadorDireccionProyecto.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorDireccionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 240, 10));

        separadorNombreProyecto.setBackground(new java.awt.Color(0, 0, 0));
        separadorNombreProyecto.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 250, 10));

        txtNombre.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombre.setBorder(null);
        panelBase.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 250, 20));

        btnGuardar.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelBase.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 440, 160, 40));

        separadorSeccion1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelBase.add(separadorSeccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 80, 10, 390));

        etiSeccionDatosGenerales.setForeground(new java.awt.Color(0, 0, 0));
        etiSeccionDatosGenerales.setText("Datos generales");
        etiSeccionDatosGenerales.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelBase.add(etiSeccionDatosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 150, 20));

        etiSeccionPlanificacion.setForeground(new java.awt.Color(0, 0, 0));
        etiSeccionPlanificacion.setText(" Planificación");
        etiSeccionPlanificacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelBase.add(etiSeccionPlanificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 80, 130, 20));

        btnLimpiarCampos.setBackground(new java.awt.Color(102, 102, 255));
        btnLimpiarCampos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        panelBase.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 440, 150, 40));

        etiDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        etiDescripcion.setText(" Descripción");
        etiDescripcion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelBase.add(etiDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 110, 20));

        etiDetallesTecnicos.setForeground(new java.awt.Color(0, 0, 0));
        etiDetallesTecnicos.setText("Detalles técnicos");
        etiDetallesTecnicos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelBase.add(etiDetallesTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 160, 20));

        etiEstadoProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiEstadoProyecto.setForeground(new java.awt.Color(0, 0, 0));
        etiEstadoProyecto.setText("Estado:");
        panelBase.add(etiEstadoProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 450, 70, 20));

        cmbEstado.setBackground(new java.awt.Color(255, 255, 255));
        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Planeacion", "En proceso", "Suspendido", "Finalizado" }));
        cmbEstado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(cmbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 440, 200, 30));

        etiFechaEstimada1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiFechaEstimada1.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaEstimada1.setText("Fecha Inicio:");
        panelBase.add(etiFechaEstimada1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 180, -1, 30));

        DatePickFechaInicio.setBackground(new java.awt.Color(204, 204, 204));
        DatePickFechaInicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(DatePickFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 180, 160, -1));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed

        try {

            // Crear el controlador con los componentes del formulario y el servicio
            ProyectoController controller = new ProyectoController(
                    txtCodigo,
                    txtNombre,
                    txtDireccion,
                    cmbTiporeparacion,
                    cmbPrioridad,
                    txtPresupuesto,
                    DatePickFechaEstimada,
                    txtArea,
                    servicio
            );

            // Usar el método encapsulado del controlador
            controller.crearProyecto();

        } catch (ValidacionException
                | ProyectoYaExisteException
                | NombreProyectoExistenteException
                | FechaInvalidaException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error de Validación", JOptionPane.WARNING_MESSAGE);
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error inesperado: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActionPerformed
        ProyectoController controller = new ProyectoController(txtCodigo, txtNombre, txtDireccion, cmbTiporeparacion, cmbPrioridad, txtPresupuesto, DatePickFechaEstimada, txtArea, servicio);
        controller.limpiarFormulario();
    }//GEN-LAST:event_btnLimpiarCamposActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogModificarProyecto dialog = new DialogModificarProyecto(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePickFechaEstimada;
    private org.jdesktop.swingx.JXDatePicker DatePickFechaInicio;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JComboBox<String> cmbEstado;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JComboBox<String> cmbTiporeparacion;
    private javax.swing.JLabel etiCodigo;
    private org.jdesktop.swingx.JXLabel etiDescripcion;
    private org.jdesktop.swingx.JXLabel etiDetallesTecnicos;
    private javax.swing.JLabel etiDireccionProyecto;
    private javax.swing.JLabel etiEstadoProyecto;
    private javax.swing.JLabel etiFechaEstimada;
    private javax.swing.JLabel etiFechaEstimada1;
    private javax.swing.JLabel etiNombreProyecto;
    private javax.swing.JLabel etiPresupuesto;
    private javax.swing.JLabel etiPrioridadProyecto;
    private org.jdesktop.swingx.JXLabel etiSeccionDatosGenerales;
    private org.jdesktop.swingx.JXLabel etiSeccionPlanificacion;
    private javax.swing.JLabel etiTItulo;
    private javax.swing.JLabel etiTipoReparacion;
    private javax.swing.JPanel panelBase;
    private javax.swing.JScrollPane scrollArea;
    private javax.swing.JSeparator separadorDireccionProyecto;
    private javax.swing.JSeparator separadorNombreProyecto;
    private javax.swing.JSeparator separadorPresupuesto;
    private javax.swing.JSeparator separadorSeccion1;
    private javax.swing.JSeparator separadorSecction4;
    private javax.swing.JSeparator separadorSecction7;
    private javax.swing.JSeparator separadorSecction8;
    private javax.swing.JSeparator separadorSecction9;
    private org.jdesktop.swingx.JXTextArea txtArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresupuesto;
    // End of variables declaration//GEN-END:variables

    public void mostrarProyecto(Proyecto proyecto) {
        txtCodigo.setText(proyecto.getCodigo());
        txtNombre.setText(proyecto.getNombre());
        txtDireccion.setText(proyecto.getDireccion());

        // Seleccionar el tipo de reparación en el ComboBox
        cmbTiporeparacion.setSelectedItem(formatearEnumParaComboBox(proyecto.getTipoReparacion().name()));

        // Seleccionar la prioridad en el ComboBox
        cmbPrioridad.setSelectedItem(formatearEnumParaComboBox(proyecto.getPrioridad().name()));

        // Estado del proyecto (ComboBox)
        cmbEstado.setSelectedItem(formatearEnumParaComboBox(proyecto.getEstado().name()));

        // Asignar el presupuesto
        txtPresupuesto.setText(String.valueOf(proyecto.getPresupuesto()));

        // Asignar las fechas usando JDatePicker
        DatePickFechaInicio.setDate(java.sql.Date.valueOf(proyecto.getFechaInicio()));
        DatePickFechaEstimada.setDate(java.sql.Date.valueOf(proyecto.getFechaFinEstimada()));

        // Descripción del proyecto
        txtArea.setText(proyecto.getDescripcion());
        
        //Campos no editables
        txtCodigo.setEnabled(false);
        DatePickFechaInicio.setEnabled(false);
    }

    public Proyecto getProyectoModificado() {
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        String direccion = txtDireccion.getText().trim();

        // Obtener el tipo de reparación desde el ComboBox
        TipoReparacion tipo = TipoReparacion.valueOf(formatearComboBoxParaEnum(cmbTiporeparacion.getSelectedItem().toString()));

        // Obtener la prioridad desde el ComboBox
        Prioridad prioridad = Prioridad.valueOf(formatearComboBoxParaEnum(cmbPrioridad.getSelectedItem().toString()));

        // Obtener el estado desde el ComboBox
        EstadoProyecto estado = EstadoProyecto.valueOf(formatearComboBoxParaEnum(cmbEstado.getSelectedItem().toString()));

        // Obtener el presupuesto
        double presupuesto = Double.parseDouble(txtPresupuesto.getText().trim());

        // Obtener las fechas desde JDatePicker
        LocalDate fechaInicio = DatePickFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaFinEstimada = DatePickFechaEstimada.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        // Obtener la descripción
        String descripcion = txtArea.getText().trim();

        return new Proyecto(codigo, nombre, direccion, tipo, fechaInicio, fechaFinEstimada, prioridad, presupuesto, estado, descripcion);
    }

    private String formatearEnumParaComboBox(String enumValue) {
        // Convierte el valor del enum al formato correcto para el ComboBox
        return enumValue.charAt(0) + enumValue.substring(1).toLowerCase().replace("_", " ");
    }

    private String formatearComboBoxParaEnum(String comboBoxValue) {
        // Convierte el valor del ComboBox al formato correcto para el enum
        return comboBoxValue.toUpperCase().replace(" ", "_");
    }

}
