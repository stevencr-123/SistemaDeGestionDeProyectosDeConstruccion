package view;

import model.RolSistema;
import model.TipoIdentificacion;
import factory.UsuarioFactory;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import model.Persona;
import model.Usuario;

public class DialogModificarEmpleado extends javax.swing.JDialog {

    private boolean modificado = false;

    public DialogModificarEmpleado(java.awt.Frame parent, boolean modal) {
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
        jSeparator = new javax.swing.JSeparator();
        lblDatosLaborales = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        lblDatosPersonales = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        txtNombreEmpleado = new javax.swing.JTextField();
        separadorNombre = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        separadorApellido = new javax.swing.JSeparator();
        etiNombre = new javax.swing.JLabel();
        etiApellidoEmpleado = new javax.swing.JLabel();
        cmbTipoIdentificacion = new javax.swing.JComboBox<>();
        etiTipoIdentificacion = new javax.swing.JLabel();
        etiIdentificacionEmpleado = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        separadorIdentificacion = new javax.swing.JSeparator();
        txtCorreoEmpleado = new javax.swing.JTextField();
        separadorCorreo = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        separadorTelefono = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        cmbPuestoTrabajo = new javax.swing.JComboBox<>();
        txtSalario = new javax.swing.JTextField();
        separadorSalario = new javax.swing.JSeparator();
        etiSalario = new javax.swing.JLabel();
        etiPuestoTrabajo = new javax.swing.JLabel();
        etiCorreoEmpleado = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JLabel();
        btnCerrar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("MODIFICAR EMPLEADO\n");
        setBackground(new java.awt.Color(255, 255, 255));
        setModal(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelBase.setBackground(new java.awt.Color(255, 255, 255));
        panelBase.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiTItulo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiTItulo.setForeground(new java.awt.Color(0, 0, 0));
        etiTItulo.setText("INFORMACION DEL EMPLEADO");
        panelBase.add(etiTItulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 300, 40));

        btnCerrar.setBackground(new java.awt.Color(0, 102, 51));
        btnCerrar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCerrar.setText("Modificar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        panelBase.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 420, 140, 40));

        jSeparator.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelBase.add(jSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(431, 80, -1, 390));

        lblDatosLaborales.setBackground(new java.awt.Color(255, 204, 0));
        lblDatosLaborales.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblDatosLaborales.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosLaborales.setText("Datos Laborales");
        panelBase.add(lblDatosLaborales, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 200, -1));
        panelBase.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 380, 10));

        lblDatosPersonales.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        lblDatosPersonales.setForeground(new java.awt.Color(0, 0, 0));
        lblDatosPersonales.setText("Datos personales");
        panelBase.add(lblDatosPersonales, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 80, 200, -1));
        panelBase.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 110, 380, 10));

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
        panelBase.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 150, 290, 20));

        separadorNombre.setBackground(new java.awt.Color(0, 0, 0));
        separadorNombre.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 170, 290, 10));

        txtApellido.setBorder(null);
        panelBase.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 200, 290, 20));

        separadorApellido.setBackground(new java.awt.Color(0, 0, 0));
        separadorApellido.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 220, 290, 10));

        etiNombre.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiNombre.setForeground(new java.awt.Color(51, 51, 51));
        etiNombre.setText("Nombre:");
        panelBase.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, -1, -1));

        etiApellidoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiApellidoEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiApellidoEmpleado.setText("Apellido:");
        panelBase.add(etiApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 200, -1, -1));

        cmbTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "CEDULA", "REGISTROCIVIL", "DIE", "TI", "PASAPORTE", " " }));
        panelBase.add(cmbTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 250, 170, 30));

        etiTipoIdentificacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTipoIdentificacion.setForeground(new java.awt.Color(51, 51, 51));
        etiTipoIdentificacion.setText("Tipo ID:");
        panelBase.add(etiTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 260, -1, -1));

        etiIdentificacionEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiIdentificacionEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiIdentificacionEmpleado.setText("Numero ID:");
        panelBase.add(etiIdentificacionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, -1, -1));

        txtIdentificacion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtIdentificacion.setBorder(null);
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        panelBase.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 190, 20));

        separadorIdentificacion.setBackground(new java.awt.Color(0, 0, 0));
        separadorIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 190, 10));

        txtCorreoEmpleado.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCorreoEmpleado.setBorder(null);
        txtCorreoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEmpleadoActionPerformed(evt);
            }
        });
        panelBase.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 330, 240, 20));

        separadorCorreo.setBackground(new java.awt.Color(0, 0, 0));
        separadorCorreo.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 240, 10));

        txtTelefono.setBorder(null);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        panelBase.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 380, 230, 20));

        separadorTelefono.setBackground(new java.awt.Color(0, 0, 0));
        separadorTelefono.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 400, 230, 10));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Información de Contacto");
        panelBase.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 300, -1));
        panelBase.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 380, 10));

        cmbPuestoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ninguno", "Promotor", "Obrero", "Funcionario publico", "Inspector municipal" }));
        cmbPuestoTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelBase.add(cmbPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 160, 30));

        txtSalario.setBorder(null);
        panelBase.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 190, 160, 20));

        separadorSalario.setBackground(new java.awt.Color(0, 0, 0));
        separadorSalario.setForeground(new java.awt.Color(0, 0, 0));
        panelBase.add(separadorSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 160, 10));

        etiSalario.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiSalario.setForeground(new java.awt.Color(51, 51, 51));
        etiSalario.setText("Salario:");
        panelBase.add(etiSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 50, 20));

        etiPuestoTrabajo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPuestoTrabajo.setForeground(new java.awt.Color(51, 51, 51));
        etiPuestoTrabajo.setText("Cargo:");
        panelBase.add(etiPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        etiCorreoEmpleado.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiCorreoEmpleado.setForeground(new java.awt.Color(51, 51, 51));
        etiCorreoEmpleado.setText("Correo:");
        panelBase.add(etiCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        etiTelefono.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTelefono.setForeground(new java.awt.Color(51, 51, 51));
        etiTelefono.setText("Telefono:");
        panelBase.add(etiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, 70, 20));

        btnCerrar1.setBackground(new java.awt.Color(153, 0, 0));
        btnCerrar1.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnCerrar1.setText("Cancelar");
        btnCerrar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrar1ActionPerformed(evt);
            }
        });
        panelBase.add(btnCerrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 140, 40));

        getContentPane().add(panelBase, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 510));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        try {
            Usuario usuarioModificado = obtenerUsuarioModificado();
            marcarComoModificado();
            JOptionPane.showMessageDialog(this, "Usuario modificado correctamente.");
            dispose();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

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

    private void btnCerrar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrar1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrar1ActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DialogModificarEmpleado dialog = new DialogModificarEmpleado(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton btnCerrar1;
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
    private javax.swing.JSeparator jSeparator;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDatosLaborales;
    private javax.swing.JLabel lblDatosPersonales;
    private javax.swing.JPanel panelBase;
    private javax.swing.JSeparator separadorApellido;
    private javax.swing.JSeparator separadorCorreo;
    private javax.swing.JSeparator separadorIdentificacion;
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

   public void mostrarUsuario(Usuario usuario) {
    // Cargar datos personales
    txtNombreEmpleado.setText(usuario.getPersona().getPrimerNombre());
    txtApellido.setText(usuario.getPersona().getPrimerApellido());
    txtCorreoEmpleado.setText(usuario.getEmail());
    txtIdentificacion.setText(usuario.getPersona().getNumeroIdentificacion());
    cmbTipoIdentificacion.setSelectedItem(usuario.getPersona().getTipoIdentificacion().name());
    txtTelefono.setText(usuario.getPersona().getTelefono());

    // Cargar datos laborales
    cmbPuestoTrabajo.setSelectedItem(formatearRolParaComboBox(usuario.getRol()));
    txtSalario.setText(String.valueOf(usuario.getPersona().getSalario()));

    // Campos no editables
    txtCorreoEmpleado.setEditable(false);
    txtIdentificacion.setEditable(false);
    cmbTipoIdentificacion.setEnabled(false);
    cmbPuestoTrabajo.setEnabled(false);
}

private String formatearRolParaComboBox(RolSistema rol) {
    // Convierte el nombre del enum al formato correcto para el ComboBox
    return rol.name().substring(0, 1) + rol.name().substring(1).toLowerCase().replace("_", " ");
}


    public Usuario obtenerUsuarioModificado() throws Exception {
        // Validaciones previas
        String nombre = txtNombreEmpleado.getText().trim();
        String apellido = txtApellido.getText().trim();
        String correo = txtCorreoEmpleado.getText().trim();
        String telefono = txtTelefono.getText().trim();
        String numeroId = txtIdentificacion.getText().trim();
        String salarioStr = txtSalario.getText().trim();
        String tipoId = (String) cmbTipoIdentificacion.getSelectedItem();
        String puesto = (String) cmbPuestoTrabajo.getSelectedItem();

        if (nombre.isEmpty() || apellido.isEmpty() || correo.isEmpty() || numeroId.isEmpty()) {
            throw new Exception("Todos los campos personales son obligatorios.");
        }
        if (telefono.isEmpty()) {
            throw new Exception("El teléfono es obligatorio.");
        }
        if (salarioStr.isEmpty()) {
            throw new Exception("El salario es obligatorio.");
        }

        double salario;
        try {
            salario = Double.parseDouble(salarioStr);
            if (salario <= 0) {
                throw new Exception("El salario debe ser mayor a cero.");
            }
        } catch (NumberFormatException e) {
            throw new Exception("El salario debe ser un número válido.");
        }

        // Validación del correo
        if (!correo.contains("@")) {
            throw new Exception("El correo no es válido.");
        }

        // Validación del teléfono
        if (!telefono.matches("\\d+")) {
            throw new Exception("El teléfono debe contener solo números.");
        }

        // Obtención del rol
        RolSistema rol;
        try {
            rol = RolSistema.valueOf(puesto.toUpperCase().replace(" ", "_"));
        } catch (IllegalArgumentException e) {
            throw new Exception("El rol seleccionado no es válido.");
        }

        // Obtener el valor del combo box y convertirlo a TipoIdentificacion
        TipoIdentificacion tipoIdentificacion;
        try {
            tipoIdentificacion = TipoIdentificacion.valueOf(tipoId.toUpperCase().replace(" ", "_"));
        } catch (IllegalArgumentException e) {
            throw new Exception("El tipo de identificación seleccionado no es válido.");
        }

// Crear la instancia concreta de Persona según el rol
        Persona persona;
        switch (rol) {
            case OBRERO:
                persona = new model.Obrero(tipoIdentificacion, numeroId, nombre, apellido, correo, salario,telefono);
                break;
            case PROMOTOR:
                persona = new model.Promotor(tipoIdentificacion, numeroId, nombre, apellido, correo, salario, telefono);
                break;
            case INSPECTOR_MUNICIPAL:
                persona = new model.InspectorMunicipal(tipoIdentificacion, numeroId, nombre, apellido, correo, salario, telefono);
                break;
            case FUNCIONARIO_PUBLICO:
                persona = new model.FuncionarioPublico(tipoIdentificacion, numeroId, nombre, apellido, correo, salario, telefono);
                break;
            case CIUDADANO:
                persona = new model.Ciudadano(tipoIdentificacion, numeroId, nombre, apellido, correo, salario, telefono);
                break;
            case ADMINISTRADOR:
                persona = model.Administrador.getInstance(tipoIdentificacion, numeroId, nombre, apellido, correo, salario, telefono);
                break;
            default:
                throw new Exception("Rol desconocido: " + rol);
        }

        // Crear el usuario actualizado usando la fábrica
        return UsuarioFactory.crearUsuario(correo, correo, rol, persona);
    }

    private void marcarComoModificado() {
        this.modificado = true;
    }

    public boolean isModificado() {
        return modificado; // Esta variable debe cambiar si el usuario guarda los cambios
    }

}
