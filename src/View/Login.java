package view;

import controller.UsuarioController;
import exceptions.AutenticacionException;
import javax.swing.JOptionPane;
import model.Usuario;
import util.SesionUtil;

public class Login extends javax.swing.JFrame {

    public Login() {

        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_Login = new javax.swing.JPanel();
        txtUser = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lbl_Contraseña = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        lbl_SubTitulo = new javax.swing.JLabel();
        lbl_Icono = new javax.swing.JLabel();
        check_RecordarUsuario = new javax.swing.JCheckBox();
        lbl_mensaje = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel_Login.setBackground(new java.awt.Color(255, 255, 255));
        jPanel_Login.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUser.setBackground(new java.awt.Color(226, 229, 231));
        txtUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserActionPerformed(evt);
            }
        });
        jPanel_Login.add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 300, 260, 30));

        lblUser.setBackground(new java.awt.Color(51, 51, 255));
        lblUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblUser.setForeground(new java.awt.Color(51, 51, 255));
        lblUser.setText("    Usuario");
        jPanel_Login.add(lblUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 70, 20));

        lbl_Contraseña.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_Contraseña.setForeground(new java.awt.Color(51, 51, 255));
        lbl_Contraseña.setText("Contraseña");
        jPanel_Login.add(lbl_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 350, 80, -1));

        lbl_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbl_Titulo.setForeground(new java.awt.Color(0, 0, 255));
        lbl_Titulo.setText("CONTRUTEC-FOR-THE_FUTURE");
        jPanel_Login.add(lbl_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 290, 30));

        jButtonIngresar.setBackground(new java.awt.Color(70, 130, 180));
        jButtonIngresar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButtonIngresar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngresar.setText("Acceder al sistema");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        jPanel_Login.add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, -1, 30));

        lbl_SubTitulo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbl_SubTitulo.setText("Sistema integral de reparaciones");
        jPanel_Login.add(lbl_SubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 20));

        lbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/imgs/Login.png"))); // NOI18N
        jPanel_Login.add(lbl_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 130));

        check_RecordarUsuario.setForeground(new java.awt.Color(51, 51, 255));
        check_RecordarUsuario.setText("Recordar usuario");
        jPanel_Login.add(check_RecordarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        lbl_mensaje.setForeground(new java.awt.Color(51, 51, 255));
        lbl_mensaje.setText("¿Olvidó su contraseña?");
        jPanel_Login.add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 130, -1));

        password.setBackground(new java.awt.Color(226, 229, 231));
        jPanel_Login.add(password, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 260, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_Login, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserActionPerformed
        txtUser.putClientProperty("JComponent.roundRect", true);


    }//GEN-LAST:event_txtUserActionPerformed

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
String email = txtUser.getText().trim();
String passwordStr = new String(password.getPassword()).trim();

UsuarioController usuarioController = new UsuarioController();

try {
    Usuario usuario = usuarioController.login(email, passwordStr);

    JOptionPane.showMessageDialog(this,
            "Inicio de sesión exitoso. ¡Bienvenido, " + usuario.getEmail() + "!",
            "Éxito",
            JOptionPane.INFORMATION_MESSAGE);

    // Redirección basada en el rol
    switch (usuario.getRol()) {
        case ADMINISTRADOR:
            new AdministradorWindown().setVisible(true);
            break;
        case PROMOTOR:
            //new Promotor().setVisible(true);
            break;
        case FUNCIONARIO_PUBLICO:
           // new FuncionarioPublico().setVisible(true);
            break;
        case OBRERO:
            new Obrero().setVisible(true);
            break;
        case INSPECTOR_MUNICIPAL:
            //new InspectorMunicipal().setVisible(true);
            break;
        case CIUDADANO:
            new Ciudadano().setVisible(true);
            break;
        default:
            JOptionPane.showMessageDialog(this,
                    "Rol no reconocido. Contacte con soporte.",
                    "Error de rol",
                    JOptionPane.ERROR_MESSAGE);
            return;
    }

     SesionUtil.iniciarSesion(usuario);
     
    this.dispose(); // Cierra la ventana de login actual

} catch (AutenticacionException e) {
    JOptionPane.showMessageDialog(this,
            e.getMessage(),
            "Error de autenticación",
            JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    JOptionPane.showMessageDialog(this,
            "Ocurrió un error inesperado: " + e.getMessage(),
            "Error",
            JOptionPane.ERROR_MESSAGE);
    e.printStackTrace(); // Opcional: solo para desarrollo
}


    }//GEN-LAST:event_jButtonIngresarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox check_RecordarUsuario;
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JPanel jPanel_Login;
    private javax.swing.JLabel lblUser;
    private javax.swing.JLabel lbl_Contraseña;
    private javax.swing.JLabel lbl_Icono;
    private javax.swing.JLabel lbl_SubTitulo;
    private javax.swing.JLabel lbl_Titulo;
    private javax.swing.JLabel lbl_mensaje;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
