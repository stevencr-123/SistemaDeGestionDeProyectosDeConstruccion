
package view;

import controller.ProyectoController;
import enums.EstadoProyecto;
import enums.Prioridad;
import enums.TipoReparacion;
import java.time.LocalDate;
import javax.swing.JOptionPane;
import model.Proyecto;
import repository.impl.ProyectoRepositoryJsonImpl;
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
        etiCodigo = new javax.swing.JLabel();
        etiNombre = new javax.swing.JLabel();
        etiDireccion = new javax.swing.JLabel();
        etiTipoReparacion = new javax.swing.JLabel();
        etiPrioridad = new javax.swing.JLabel();
        etiEstado = new javax.swing.JLabel();
        etiFechaInicio = new javax.swing.JLabel();
        etiFechaFinEstimada = new javax.swing.JLabel();
        etiPresupuesto = new javax.swing.JLabel();
        txtDireccion = new javax.swing.JTextField();
        txtTipoReparacion = new javax.swing.JTextField();
        txtPrioridad = new javax.swing.JTextField();
        txtEstado = new javax.swing.JTextField();
        txtPresupuesto = new javax.swing.JTextField();
        txtFechaInicio = new javax.swing.JTextField();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtFechaFinEstimada = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        scrollArea = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DETALLES DEL PROYECTO\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTItulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiTItulo.setForeground(new java.awt.Color(0, 51, 102));
        etiTItulo.setText("              PROYECTO");
        panelBase.add(etiTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 40));

        etiCodigo.setBackground(new java.awt.Color(0, 0, 0));
        etiCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiCodigo.setForeground(new java.awt.Color(6, 6, 6));
        etiCodigo.setText("Código del proyecto:");
        etiCodigo.setEnabled(false);
        panelBase.add(etiCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 40));

        etiNombre.setBackground(new java.awt.Color(255, 255, 255));
        etiNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiNombre.setForeground(new java.awt.Color(0, 0, 0));
        etiNombre.setText("Nombre del proyecto:");
        etiNombre.setEnabled(false);
        panelBase.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        etiDireccion.setBackground(new java.awt.Color(255, 255, 255));
        etiDireccion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etiDireccion.setText(" Dirección:");
        etiDireccion.setEnabled(false);
        panelBase.add(etiDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        etiTipoReparacion.setBackground(new java.awt.Color(255, 255, 255));
        etiTipoReparacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTipoReparacion.setForeground(new java.awt.Color(0, 0, 0));
        etiTipoReparacion.setText("Tipo de reparación:");
        etiTipoReparacion.setEnabled(false);
        panelBase.add(etiTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        etiPrioridad.setBackground(new java.awt.Color(255, 255, 255));
        etiPrioridad.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPrioridad.setForeground(new java.awt.Color(0, 0, 0));
        etiPrioridad.setText("Prioridad:");
        etiPrioridad.setEnabled(false);
        panelBase.add(etiPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 20));

        etiEstado.setBackground(new java.awt.Color(255, 255, 255));
        etiEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiEstado.setForeground(new java.awt.Color(0, 0, 0));
        etiEstado.setText("Estado:");
        etiEstado.setEnabled(false);
        panelBase.add(etiEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, -1));

        etiFechaInicio.setBackground(new java.awt.Color(255, 255, 255));
        etiFechaInicio.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaInicio.setText("Fecha de inicio:");
        etiFechaInicio.setEnabled(false);
        panelBase.add(etiFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 110, 20));

        etiFechaFinEstimada.setBackground(new java.awt.Color(255, 255, 255));
        etiFechaFinEstimada.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiFechaFinEstimada.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaFinEstimada.setText("Fecha de fin estimada:");
        etiFechaFinEstimada.setEnabled(false);
        panelBase.add(etiFechaFinEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        etiPresupuesto.setBackground(new java.awt.Color(255, 255, 255));
        etiPresupuesto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        etiPresupuesto.setText("Presupuesto:");
        etiPresupuesto.setEnabled(false);
        panelBase.add(etiPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 90, -1));

        txtDireccion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtDireccion.setForeground(new java.awt.Color(0, 0, 0));
        txtDireccion.setBorder(null);
        panelBase.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 300, -1));

        txtTipoReparacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtTipoReparacion.setForeground(new java.awt.Color(0, 0, 0, 0));
        txtTipoReparacion.setBorder(null);
        panelBase.add(txtTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 280, 250, -1));

        txtPrioridad.setForeground(new java.awt.Color(0, 0, 0, 0));
        txtPrioridad.setBorder(null);
        panelBase.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 320, 300, 20));

        txtEstado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtEstado.setForeground(new java.awt.Color(0, 0, 0));
        txtEstado.setBorder(null);
        panelBase.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 360, 300, -1));

        txtPresupuesto.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        txtPresupuesto.setBorder(null);
        panelBase.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 180, 290, -1));

        txtFechaInicio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaInicio.setBorder(null);
        panelBase.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 100, 270, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtCodigo.setForeground(new java.awt.Color(0, 0, 0));
        txtCodigo.setBorder(null);
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        panelBase.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 240, -1));

        txtNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(0, 0, 0));
        txtNombre.setBorder(null);
        panelBase.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 240, -1));

        txtFechaFinEstimada.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtFechaFinEstimada.setForeground(new java.awt.Color(0, 0, 0));
        txtFechaFinEstimada.setBorder(null);
        panelBase.add(txtFechaFinEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 230, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 102, 51));
        btnCerrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCerrar.setText("Modificar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelBase.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 430, 120, 40));
        panelBase.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Información general");
        panelBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 200, 30));
        panelBase.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 400, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Planificación");
        panelBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));
        panelBase.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Detalles técnicos");
        panelBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        panelBase.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 400, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Descripción");
        panelBase.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 20));

        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setRows(5);
        scrollArea.setViewportView(txtDescripcion);

        panelBase.add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 400, 120));

        jSeparator6.setPreferredSize(null);
        panelBase.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 300, 10));

        jSeparator7.setPreferredSize(null);
        panelBase.add(jSeparator7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 303, 250, 10));

        jSeparator8.setPreferredSize(null);
        panelBase.add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 207, 300, 0));

        jSeparator9.setPreferredSize(null);
        panelBase.add(jSeparator9, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 163, 240, 10));

        jSeparator10.setPreferredSize(null);
        panelBase.add(jSeparator10, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 123, 240, 10));

        jSeparator11.setPreferredSize(null);
        panelBase.add(jSeparator11, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 163, 230, 10));

        jSeparator12.setPreferredSize(null);
        panelBase.add(jSeparator12, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 203, 290, 10));

        jSeparator13.setPreferredSize(null);
        panelBase.add(jSeparator13, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 340, 300, 10));

        jSeparator14.setPreferredSize(null);
        panelBase.add(jSeparator14, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 123, 270, 10));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
    
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        try {
        Proyecto proyectoModificado = getProyectoModificado();
        proyectoController.actualizarProyecto(proyectoModificado);
        JOptionPane.showMessageDialog(this, "Proyecto actualizado correctamente.");
        this.dispose();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al modificar el proyecto: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }           
        
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
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
    private javax.swing.JButton btnCerrar;
    private javax.swing.JLabel etiCodigo;
    private javax.swing.JLabel etiDireccion;
    private javax.swing.JLabel etiEstado;
    private javax.swing.JLabel etiFechaFinEstimada;
    private javax.swing.JLabel etiFechaInicio;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiPresupuesto;
    private javax.swing.JLabel etiPrioridad;
    private javax.swing.JLabel etiTItulo;
    private javax.swing.JLabel etiTipoReparacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel panelBase;
    private javax.swing.JScrollPane scrollArea;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtEstado;
    private javax.swing.JTextField txtFechaFinEstimada;
    private javax.swing.JTextField txtFechaInicio;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtPrioridad;
    private javax.swing.JTextField txtTipoReparacion;
    // End of variables declaration//GEN-END:variables

public void mostrarProyecto(Proyecto proyecto) {
    txtCodigo.setText(proyecto.getCodigo());
    txtNombre.setText(proyecto.getNombre());
    txtDireccion.setText(proyecto.getDireccion());
    txtTipoReparacion.setText(""+proyecto.getTipoReparacion());
    txtPrioridad.setText(""+proyecto.getPrioridad());
    txtEstado.setText(""+proyecto.getEstado());
    txtPresupuesto.setText(String.valueOf(proyecto.getPresupuesto()));
    txtFechaInicio.setText(proyecto.getFechaInicio().toString());
    txtFechaFinEstimada.setText(proyecto.getFechaFinEstimada().toString());
    txtDescripcion.setText(proyecto.getDescripcion());
}
public Proyecto getProyectoModificado() {
    String codigo = txtCodigo.getText().trim();
    String nombre = txtNombre.getText().trim();
    String direccion = txtDireccion.getText().trim();
    TipoReparacion tipo = TipoReparacion.valueOf(txtTipoReparacion.getText().trim());
    Prioridad prioridad = Prioridad.valueOf(txtPrioridad.getText().trim());
    EstadoProyecto estado = EstadoProyecto.valueOf(txtEstado.getText().trim());
    double presupuesto = Double.parseDouble(txtPresupuesto.getText().trim());
    LocalDate fechaInicio = LocalDate.parse(txtFechaInicio.getText().trim());
    LocalDate fechaFinEstimada = LocalDate.parse(txtFechaFinEstimada.getText().trim());
    String descripcion = txtDescripcion.getText().trim();

    return new Proyecto(codigo, nombre, direccion, tipo, fechaInicio, fechaFinEstimada, prioridad, presupuesto, estado, descripcion);
}




}
