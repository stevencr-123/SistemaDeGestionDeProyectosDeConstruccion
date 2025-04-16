
package View;

import Dao.UsuarioDAO;
import Model.Usuario;
import javax.swing.JOptionPane;

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
        txtPassword = new javax.swing.JTextField();
        lblUser = new javax.swing.JLabel();
        lbl_Contraseña = new javax.swing.JLabel();
        lbl_Titulo = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        lbl_SubTitulo = new javax.swing.JLabel();
        lbl_Icono = new javax.swing.JLabel();
        check_RecordarUsuario = new javax.swing.JCheckBox();
        lbl_mensaje = new javax.swing.JLabel();

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

        txtPassword.setBackground(new java.awt.Color(226, 229, 231));
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel_Login.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 260, 30));

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
        lbl_SubTitulo.setForeground(new java.awt.Color(204, 204, 204));
        lbl_SubTitulo.setText("Sistema integral de reparaciones");
        jPanel_Login.add(lbl_SubTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 200, 20));

        lbl_Icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Login.png"))); // NOI18N
        jPanel_Login.add(lbl_Icono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 130, 130));

        check_RecordarUsuario.setForeground(new java.awt.Color(51, 51, 255));
        check_RecordarUsuario.setText("Recordar usuario");
        jPanel_Login.add(check_RecordarUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 480, -1, -1));

        lbl_mensaje.setForeground(new java.awt.Color(51, 51, 255));
        lbl_mensaje.setText("¿Olvidó su contraseña?");
        jPanel_Login.add(lbl_mensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 480, 130, -1));

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
     String password = txtPassword.getText().trim();
     
     if(email.isEmpty() || password.isEmpty()){
         JOptionPane.showMessageDialog(this, "Email y contraseña son requeridos", "Error", JOptionPane.ERROR_MESSAGE);
         return;
     }
     
     UsuarioDAO usuarioDAO = new UsuarioDAO();
     Usuario usuario = usuarioDAO.validarCredenciales(email, password);
     
     if(usuario != null){
         if(usuarioDAO.esAdministrador(usuario)){
             JOptionPane.showMessageDialog(this, "Bienvenido Administrador", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
        new Administrador().setVisible(true);
            this.dispose();
         }else if(usuarioDAO.esFuncionarioPublico(usuario)){
           JOptionPane.showMessageDialog(this, "Bienvenido Funcionario Publico", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
          //new funcionario().setVisible(true);
          this.dispose();
     }else if(usuarioDAO.esInspectorMunicipal(usuario)){
           JOptionPane.showMessageDialog(this, "Bienvenido Inspector Municipal", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
          //new inspector().setVisible(true);
          this.dispose();
     }else if(usuarioDAO.esPromotor(usuario)){
           JOptionPane.showMessageDialog(this, "Bienvenido Promotor", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
          //new promotor().setVisible(true);
          this.dispose();
     }else if(usuarioDAO.esObrero(usuario)){
           JOptionPane.showMessageDialog(this, "Bienvenido Obrero", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
          new Obrero().setVisible(true);
          this.dispose();
     }else if(usuarioDAO.esCiudadano(usuario)){
           JOptionPane.showMessageDialog(this, "Bienvenido Ciudadano", "Login Exitoso", JOptionPane.INFORMATION_MESSAGE);
          //new ciudadano().setVisible(true);
          this.dispose();
     }
  }else{
         JOptionPane.showMessageDialog(this, "Email o contraseña incorrectos", "Error login", JOptionPane.ERROR_MESSAGE);
     }
     
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed

    }//GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
