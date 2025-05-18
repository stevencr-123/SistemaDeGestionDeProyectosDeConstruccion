package view;

import model.RolSistema;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Persona;
import model.Proyecto;
import model.Usuario;

public class DialogVerDetallesEmpleado extends javax.swing.JDialog {

    public DialogVerDetallesEmpleado(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.setLocationRelativeTo(null);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelBase = new javax.swing.JPanel();
        etiTItulo = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombreEmpleado = new javax.swing.JTextField();
        separadorNombre = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        separadorApellido = new javax.swing.JSeparator();
        cmbTipoIdentificacion = new javax.swing.JComboBox<>();
        etiTipoIdentificacion = new javax.swing.JLabel();
        etiApellidoEmpleado = new javax.swing.JLabel();
        etiNombre = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        etiIdentificacionEmpleado = new javax.swing.JLabel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        etiCorreoEmpleado = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JLabel();
        separadorCorreo = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        separadorTelefono = new javax.swing.JSeparator();
        etiSalario = new javax.swing.JLabel();
        etiPuestoTrabajo = new javax.swing.JLabel();
        cmbPuestoTrabajo = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        separadorSalario = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("DETALLES DEL EMPLEADO\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setForeground(new java.awt.Color(255, 255, 255));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTItulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiTItulo.setForeground(new java.awt.Color(0, 0, 0));
        etiTItulo.setText("INFORMACIPON DEL EMPLEADO");
        panelBase.add(etiTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 290, 40));

        btnCerrar.setBackground(new java.awt.Color(204, 0, 0));
        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelBase.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, 170, 40));

        jLabel2.setBackground(new java.awt.Color(255, 204, 0));
        jLabel2.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Datos Laborales");
        panelBase.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 200, -1));
        panelBase.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 380, 10));

        jLabel3.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Datos personales");
        panelBase.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 90, 200, -1));
        panelBase.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 120, 380, 10));

        txtNombreEmpleado.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtNombreEmpleado.setBorder(null);
        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });
        txtNombreEmpleado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreEmpleadoKeyTyped(evt);
            }
        });
        panelBase.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 160, 290, 20));

        separadorNombre.setBackground(new java.awt.Color(0, 0, 0));
        separadorNombre.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 290, 10));

        txtApellido.setBorder(null);
        panelBase.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 210, 290, 20));

        separadorApellido.setBackground(new java.awt.Color(0, 0, 0));
        separadorApellido.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 290, 10));

        cmbTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "CEDULA", "REGISTROCIVIL", "DIE", "TI", "PASAPORTE", " " }));
        panelBase.add(cmbTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 260, 170, 30));

        etiTipoIdentificacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTipoIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        etiTipoIdentificacion.setText("Tipo ID:");
        panelBase.add(etiTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, -1, -1));

        etiApellidoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiApellidoEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiApellidoEmpleado.setText("Apellido:");
        panelBase.add(etiApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 210, -1, -1));

        etiNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiNombre.setForeground(new java.awt.Color(51, 51, 51));
        etiNombre.setText("Nombre:");
        panelBase.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 160, -1, -1));

        txtIdentificacion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtIdentificacion.setBorder(null);
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        panelBase.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 320, 190, 20));

        etiIdentificacionEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiIdentificacionEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiIdentificacionEmpleado.setText("Numero ID:");
        panelBase.add(etiIdentificacionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 320, -1, -1));

        txtCorreoEmpleado.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCorreoEmpleado.setBorder(null);
        txtCorreoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEmpleadoActionPerformed(evt);
            }
        });
        panelBase.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 240, 20));

        etiCorreoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiCorreoEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiCorreoEmpleado.setText("Correo:");
        panelBase.add(etiCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        etiTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTelefono.setForeground(new java.awt.Color(51, 51, 51));
        etiTelefono.setText("Telefono:");
        panelBase.add(etiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 70, 20));

        separadorCorreo.setBackground(new java.awt.Color(0, 0, 0));
        separadorCorreo.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 240, 10));

        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panelBase.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 230, 20));

        separadorTelefono.setBackground(new java.awt.Color(0, 0, 0));
        separadorTelefono.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 410, 230, 10));

        etiSalario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiSalario.setForeground(new java.awt.Color(51, 51, 51));
        etiSalario.setText("Salario:");
        panelBase.add(etiSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 50, 20));

        etiPuestoTrabajo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPuestoTrabajo.setForeground(new java.awt.Color(51, 51, 51));
        etiPuestoTrabajo.setText("Cargo:");
        panelBase.add(etiPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        cmbPuestoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Promotor", "Obrero", "Funcionario publico", "Inspector municipal" }));
        cmbPuestoTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBase.add(cmbPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 160, 30));

        txtSalario.setBorder(null);
        panelBase.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 160, 20));

        separadorSalario.setBackground(new java.awt.Color(0, 0, 0));
        separadorSalario.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 160, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Información de Contacto");
        panelBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, -1));
        panelBase.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 380, 10));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 60, -1, 400));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void txtNombreEmpleadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isLetter(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Solo se permiten letras en este campo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtNombreEmpleadoKeyTyped

    private void txtIdentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdentificacionKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c) && c != KeyEvent.VK_BACK_SPACE && c != KeyEvent.VK_DELETE) {
            evt.consume();

            JOptionPane.showMessageDialog(null, "Solo se permiten números en este campo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_txtIdentificacionKeyTyped

    private void txtCorreoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEmpleadoActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogVerDetallesEmpleado dialog = new DialogVerDetallesEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.JComboBox<String> cmbPuestoTrabajo;
    private javax.swing.JComboBox<String> cmbTipoIdentificacion;
    private javax.swing.JLabel etiApellidoEmpleado;
    private javax.swing.JLabel etiCorreoEmpleado;
    private javax.swing.JLabel etiIdentificacionEmpleado;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiPuestoTrabajo;
    private javax.swing.JLabel etiSalario;
    private javax.swing.JLabel etiTItulo;
    private javax.swing.JLabel etiTelefono;
    private javax.swing.JLabel etiTipoIdentificacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JPanel panelBase;
    private javax.swing.JSeparator separadorApellido;
    private javax.swing.JSeparator separadorCorreo;
    private javax.swing.JSeparator separadorNombre;
    private javax.swing.JSeparator separadorSalario;
    private javax.swing.JSeparator separadorTelefono;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables

public void mostrarDetallesUsuario(Usuario usuario) {
    if (usuario == null) {
        System.err.println("El usuario es nulo. No se pueden mostrar los detalles.");
        return;
    }

    Persona persona = usuario.getPersona();
    if (persona == null) {
        System.err.println("La persona asociada al usuario es nula.");
        return;
    }

    // Cargar datos personales
    txtNombreEmpleado.setText(persona.getPrimerNombre());
    txtApellido.setText(persona.getPrimerApellido());
    txtCorreoEmpleado.setText(usuario.getEmail());
    txtIdentificacion.setText(persona.getNumeroIdentificacion());
    cmbTipoIdentificacion.setSelectedItem(persona.getTipoIdentificacion().name());
    txtTelefono.setText(persona.getTelefono());

    // Cargar datos laborales
    String rolFormateado = formatearRolParaComboBox(usuario.getRol());

    // Buscar el elemento que coincida en el ComboBox (manejo de posibles diferencias)
    for (int i = 0; i < cmbPuestoTrabajo.getItemCount(); i++) {
        String item = cmbPuestoTrabajo.getItemAt(i).toString();
        if (item.equalsIgnoreCase(rolFormateado)) {
            cmbPuestoTrabajo.setSelectedIndex(i);
            break;
        }
    }

    txtSalario.setText(String.valueOf(persona.getSalario()));

    // Deshabilitar campos para solo visualización
    txtNombreEmpleado.setEditable(false);
    txtApellido.setEditable(false);
    txtCorreoEmpleado.setEditable(false);
    txtTelefono.setEditable(false);
    txtIdentificacion.setEditable(false);
    txtSalario.setEditable(false);
    cmbTipoIdentificacion.setEnabled(false);
    cmbPuestoTrabajo.setEnabled(false);
}


  private String formatearRolParaComboBox(RolSistema rol) {
    // Convierte el nombre del enum al formato correcto para el ComboBox
    return rol.name().substring(0, 1) + rol.name().substring(1).toLowerCase().replace("_", " ");
}

}
