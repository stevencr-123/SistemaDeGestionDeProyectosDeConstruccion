
package view;

import Model.Proyecto;

public class DialogVerDetallesProyecto extends javax.swing.JDialog {

    public DialogVerDetallesProyecto(java.awt.Frame parent, boolean modal) {
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

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DETALLES DEL PROYECTO\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setForeground(new java.awt.Color(255, 255, 255));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTItulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiTItulo.setForeground(new java.awt.Color(0, 51, 102));
        etiTItulo.setText("              PROYECTO");
        panelBase.add(etiTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 250, 40));

        etiCodigo.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiCodigo.setForeground(new java.awt.Color(0, 0, 0));
        etiCodigo.setText("Código del proyecto");
        etiCodigo.setEnabled(false);
        panelBase.add(etiCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, 40));

        etiNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiNombre.setForeground(new java.awt.Color(0, 0, 0));
        etiNombre.setText("Nombre del proyecto");
        etiNombre.setEnabled(false);
        panelBase.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 150, -1));

        etiDireccion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiDireccion.setForeground(new java.awt.Color(0, 0, 0));
        etiDireccion.setText(" Dirección");
        etiDireccion.setEnabled(false);
        panelBase.add(etiDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 80, 20));

        etiTipoReparacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiTipoReparacion.setForeground(new java.awt.Color(0, 0, 0));
        etiTipoReparacion.setText("Tipo de reparación");
        etiTipoReparacion.setEnabled(false);
        panelBase.add(etiTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        etiPrioridad.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiPrioridad.setForeground(new java.awt.Color(0, 0, 0));
        etiPrioridad.setText("Prioridad");
        etiPrioridad.setEnabled(false);
        panelBase.add(etiPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 70, 20));

        etiEstado.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiEstado.setForeground(new java.awt.Color(0, 0, 0));
        etiEstado.setText("Estado");
        etiEstado.setEnabled(false);
        panelBase.add(etiEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 50, -1));

        etiFechaInicio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaInicio.setText("Fecha de inicio");
        etiFechaInicio.setEnabled(false);
        panelBase.add(etiFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 110, 20));

        etiFechaFinEstimada.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiFechaFinEstimada.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaFinEstimada.setText("Fecha de fin estimada");
        etiFechaFinEstimada.setEnabled(false);
        panelBase.add(etiFechaFinEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, -1, -1));

        etiPresupuesto.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        etiPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        etiPresupuesto.setText("Presupuesto");
        etiPresupuesto.setEnabled(false);
        panelBase.add(etiPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 180, 90, -1));

        txtDireccion.setEditable(false);
        txtDireccion.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, 200, -1));

        txtTipoReparacion.setEditable(false);
        txtTipoReparacion.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 200, -1));

        txtPrioridad.setEditable(false);
        txtPrioridad.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 320, 200, -1));

        txtEstado.setEditable(false);
        txtEstado.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, 200, -1));

        txtPresupuesto.setEditable(false);
        txtPresupuesto.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 180, 200, -1));

        txtFechaInicio.setEditable(false);
        txtFechaInicio.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, 200, -1));

        txtCodigo.setEditable(false);
        txtCodigo.setForeground(new java.awt.Color(153, 153, 153));
        txtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCodigoActionPerformed(evt);
            }
        });
        panelBase.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 200, -1));

        txtNombre.setEditable(false);
        txtNombre.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 140, 200, -1));

        txtFechaFinEstimada.setEditable(false);
        txtFechaFinEstimada.setForeground(new java.awt.Color(153, 153, 153));
        panelBase.add(txtFechaFinEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 140, 200, -1));

        btnCerrar.setBackground(new java.awt.Color(0, 51, 255));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelBase.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 420, 120, 40));
        panelBase.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 400, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 255));
        jLabel1.setText("Información general");
        panelBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 170, 30));
        panelBase.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 80, 400, 10));

        jLabel2.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Planificación");
        panelBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 50, -1, 30));
        panelBase.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 260, 400, 10));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Detalles técnicos");
        panelBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));
        panelBase.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 260, 400, 10));

        jLabel4.setFont(new java.awt.Font("SansSerif", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Descripción");
        panelBase.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, -1, 20));

        txtDescripcion.setEditable(false);
        txtDescripcion.setColumns(20);
        txtDescripcion.setForeground(new java.awt.Color(153, 153, 153));
        txtDescripcion.setRows(5);
        scrollArea.setViewportView(txtDescripcion);

        panelBase.add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 270, 400, 120));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCodigoActionPerformed
    
    }//GEN-LAST:event_txtCodigoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
                  this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVerDetallesProyecto dialog = new DialogVerDetallesProyecto(new javax.swing.JFrame(), true);
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
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


}
