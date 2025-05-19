
package view;

import java.awt.Color;

public class Obrero extends javax.swing.JFrame {
    
    public Obrero() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelBase = new javax.swing.JPanel();
        jPanelEncabezado = new javax.swing.JPanel();
        jLabelTextoEncabezado = new javax.swing.JLabel();
        jSeparatorEncabezado = new javax.swing.JSeparator();
        jLabelNombreEncabezado = new javax.swing.JLabel();
        jPanelOpciones = new javax.swing.JPanel();
        jLabelMenuOpciones = new javax.swing.JLabel();
        jPanelTareasOpciones = new javax.swing.JPanel();
        jLabelTareasOpciones = new javax.swing.JLabel();
        jPanelVerProyectoOpciones = new javax.swing.JPanel();
        jLabelVerProyectoOpciones = new javax.swing.JLabel();
        jPanelModificarOpciones = new javax.swing.JPanel();
        jLabelModificarOpciones = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPaneObrero = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        proyecto = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList3 = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jPanelModificar = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNombreObrero = new javax.swing.JTextField();
        jLabelApellido = new javax.swing.JLabel();
        jTextFieldApellidoObrero = new javax.swing.JTextField();
        jLabelEmail = new javax.swing.JLabel();
        jTextFieldEmailObrero = new javax.swing.JTextField();
        jPasswordObrero = new javax.swing.JPasswordField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelSeguro = new javax.swing.JLabel();
        jTextFieldSeguroObrero = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel25 = new javax.swing.JLabel();
        jLabelNewEspecialidad = new javax.swing.JLabel();
        jTextFieldNewEspecialidad = new javax.swing.JTextField();
        jLabelNewEmail = new javax.swing.JLabel();
        jLabelNewPass = new javax.swing.JLabel();
        jTextFieldNewEmail = new javax.swing.JTextField();
        jPasswordFieldNewPass = new javax.swing.JPasswordField();
        jLabelNewSeguro = new javax.swing.JLabel();
        jLabelTipoID = new javax.swing.JLabel();
        jTextFieldTipoID = new javax.swing.JTextField();
        jLabelID = new javax.swing.JLabel();
        jTextFieldID = new javax.swing.JTextField();
        jButtonActualizar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jComboBoxNewSeguro = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelBase.setBackground(new java.awt.Color(153, 153, 153));
        jPanelBase.setPreferredSize(new java.awt.Dimension(600, 450));
        jPanelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEncabezado.setBackground(new java.awt.Color(51, 51, 51));
        jPanelEncabezado.setMaximumSize(new java.awt.Dimension(100, 100));
        jPanelEncabezado.setPreferredSize(new java.awt.Dimension(200, 400));
        jPanelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTextoEncabezado.setBackground(new java.awt.Color(255, 255, 255));
        jLabelTextoEncabezado.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelTextoEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTextoEncabezado.setText("TRABAJADOR:");
        jPanelEncabezado.add(jLabelTextoEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 32, 239, -1));
        jPanelEncabezado.add(jSeparatorEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 76, 362, 15));

        jLabelNombreEncabezado.setFont(new java.awt.Font("SansSerif", 2, 18)); // NOI18N
        jLabelNombreEncabezado.setText("NOMBRE DEL OBRERO");
        jPanelEncabezado.add(jLabelNombreEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 280, 40));

        jPanelBase.add(jPanelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 100));

        jPanelOpciones.setBackground(new java.awt.Color(102, 102, 102));
        jPanelOpciones.setFocusable(false);
        jPanelOpciones.setMaximumSize(new java.awt.Dimension(600, 600));
        jPanelOpciones.setMinimumSize(new java.awt.Dimension(500, 500));
        jPanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelMenuOpciones.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabelMenuOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelMenuOpciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgLogin.png"))); // NOI18N
        jLabelMenuOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelMenuOpcionesMouseClicked(evt);
            }
        });
        jPanelOpciones.add(jLabelMenuOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(62, 38, 86, 85));

        jPanelTareasOpciones.setBackground(new java.awt.Color(102, 204, 255));
        jPanelTareasOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelTareasOpcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelTareasOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelTareasOpcionesMouseExited(evt);
            }
        });
        jPanelTareasOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTareasOpciones.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelTareasOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelTareasOpciones.setText("TAREAS");
        jPanelTareasOpciones.add(jLabelTareasOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 17, -1, -1));

        jPanelOpciones.add(jPanelTareasOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 203, 210, 50));

        jPanelVerProyectoOpciones.setBackground(new java.awt.Color(153, 153, 255));
        jPanelVerProyectoOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelVerProyectoOpcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelVerProyectoOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelVerProyectoOpcionesMouseExited(evt);
            }
        });
        jPanelVerProyectoOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVerProyectoOpciones.setBackground(new java.awt.Color(255, 255, 255));
        jLabelVerProyectoOpciones.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelVerProyectoOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVerProyectoOpciones.setText("VER PROYECTO");
        jPanelVerProyectoOpciones.add(jLabelVerProyectoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 14, -1, -1));

        jPanelOpciones.add(jPanelVerProyectoOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 297, 210, 50));

        jPanelModificarOpciones.setBackground(new java.awt.Color(102, 102, 255));
        jPanelModificarOpciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelModificarOpcionesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelModificarOpcionesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelModificarOpcionesMouseExited(evt);
            }
        });
        jPanelModificarOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelModificarOpciones.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabelModificarOpciones.setForeground(new java.awt.Color(255, 255, 255));
        jLabelModificarOpciones.setText("MODIFICAR DATOS");
        jPanelModificarOpciones.add(jLabelModificarOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 16, -1, -1));

        jPanelOpciones.add(jPanelModificarOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 381, 210, 50));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("   MENU");
        jPanelOpciones.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(42, 135, 119, -1));

        jPanelBase.add(jPanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 560));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel2.setText("BIENVENIDO AL SISTEMA DE RECONTRUCCIONES ESTATALES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 185, -1, 164));

        jTabbedPaneObrero.addTab("Inicio", jPanel2);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jScrollPane1.setViewportView(jList1);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 120, 780, 312));

        jLabel3.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel3.setText("GESTIONA TUS TAREAS Y ACTIVIDADES CORRESPONDIENTES");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 747, 45));

        jTabbedPaneObrero.addTab("Tareas", jPanel3);

        jPanel1.setLayout(new java.awt.CardLayout());

        proyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jList3.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Proyecto_1", " ", "Proyecto_2", " ", "Proyecto_3" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList3);

        proyecto.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 136, 616, 270));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel5.setText("                     Proyectos");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(20, 0, 20, 0));
        proyecto.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 425, -1));

        jPanel1.add(proyecto, "card3");

        jTabbedPaneObrero.addTab("Ver proyecto", jPanel1);

        jPanelModificar.setBackground(new java.awt.Color(204, 204, 255));
        jPanelModificar.setForeground(new java.awt.Color(204, 204, 255));
        jPanelModificar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setBackground(new java.awt.Color(153, 153, 255));
        jLabel18.setFont(new java.awt.Font("SansSerif", 3, 24)); // NOI18N
        jLabel18.setText("MODIFICAR INFORMACIÓN");
        jPanelModificar.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 325, 54));

        jLabelNombre.setText("  Nombre");
        jPanelModificar.add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 250, 59, -1));

        jTextFieldNombreObrero.setEditable(false);
        jPanelModificar.add(jTextFieldNombreObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 138, -1));

        jLabelApellido.setText("   Apellido");
        jPanelModificar.add(jLabelApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 69, -1));

        jTextFieldApellidoObrero.setEditable(false);
        jPanelModificar.add(jTextFieldApellidoObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 160, -1));

        jLabelEmail.setText("           Email");
        jPanelModificar.add(jLabelEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, 103, -1));

        jTextFieldEmailObrero.setEditable(false);
        jPanelModificar.add(jTextFieldEmailObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 350, 138, -1));

        jPasswordObrero.setEditable(false);
        jPanelModificar.add(jPasswordObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 160, -1));

        jLabelPassword.setText("      Contraseña");
        jPanelModificar.add(jLabelPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 100, -1));

        jLabelSeguro.setText("Seguro laboral");
        jPanelModificar.add(jLabelSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 81, -1));

        jTextFieldSeguroObrero.setEditable(false);
        jPanelModificar.add(jTextFieldSeguroObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 138, -1));

        jLabel24.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("                  MIS DATOS");
        jLabel24.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelModificar.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 279, 24));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanelModificar.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, 10, 360));

        jLabel25.setFont(new java.awt.Font("SansSerif", 3, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("    ACTUALIZAR CAMPOS");
        jPanelModificar.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, 240, 20));

        jLabelNewEspecialidad.setText("Especialidad");
        jPanelModificar.add(jLabelNewEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 250, 80, 20));
        jPanelModificar.add(jTextFieldNewEspecialidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 138, -1));

        jLabelNewEmail.setText("           Email");
        jPanelModificar.add(jLabelNewEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 103, -1));

        jLabelNewPass.setText("      Contraseña");
        jPanelModificar.add(jLabelNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 250, 100, -1));
        jPanelModificar.add(jTextFieldNewEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 350, 160, -1));
        jPanelModificar.add(jPasswordFieldNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 280, 160, -1));

        jLabelNewSeguro.setText("Seguro laboral");
        jPanelModificar.add(jLabelNewSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 320, 81, -1));

        jLabelTipoID.setText("Tipo de identificación");
        jPanelModificar.add(jLabelTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 120, -1));

        jTextFieldTipoID.setEditable(false);
        jTextFieldTipoID.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jPanelModificar.add(jTextFieldTipoID, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 420, 160, 20));

        jLabelID.setText("Identificación");
        jPanelModificar.add(jLabelID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 80, -1));

        jTextFieldID.setEditable(false);
        jPanelModificar.add(jTextFieldID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, 140, 20));

        jButtonActualizar.setText("ACTUALIZAR");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });
        jPanelModificar.add(jButtonActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 420, -1, -1));

        jButtonCancelar.setText("CANCELAR");
        jPanelModificar.add(jButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 420, 100, -1));

        jComboBoxNewSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SI", "NO", " " }));
        jPanelModificar.add(jComboBoxNewSeguro, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, 110, -1));

        jTabbedPaneObrero.addTab("Modificar info", jPanelModificar);

        jPanelBase.add(jTabbedPaneObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 790, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelTareasOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTareasOpcionesMouseEntered
      jPanelTareasOpciones.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanelTareasOpcionesMouseEntered

    private void jPanelTareasOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTareasOpcionesMouseExited
      jPanelTareasOpciones.setBackground(new Color(102,204,255));
    }//GEN-LAST:event_jPanelTareasOpcionesMouseExited

    private void jPanelVerProyectoOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVerProyectoOpcionesMouseEntered
        jPanelVerProyectoOpciones.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanelVerProyectoOpcionesMouseEntered

    private void jPanelVerProyectoOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVerProyectoOpcionesMouseExited
        jPanelVerProyectoOpciones.setBackground(new Color(153,153,255));
    }//GEN-LAST:event_jPanelVerProyectoOpcionesMouseExited

    private void jPanelModificarOpcionesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelModificarOpcionesMouseEntered
       jPanelModificarOpciones.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_jPanelModificarOpcionesMouseEntered

    private void jPanelModificarOpcionesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelModificarOpcionesMouseExited
     jPanelModificarOpciones.setBackground(new Color(102,102,255));
    }//GEN-LAST:event_jPanelModificarOpcionesMouseExited

    private void jPanelTareasOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelTareasOpcionesMouseClicked
        jTabbedPaneObrero.setSelectedIndex(1);
    }//GEN-LAST:event_jPanelTareasOpcionesMouseClicked

    private void jPanelVerProyectoOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelVerProyectoOpcionesMouseClicked
       jTabbedPaneObrero.setSelectedIndex(2);
    }//GEN-LAST:event_jPanelVerProyectoOpcionesMouseClicked

    private void jPanelModificarOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelModificarOpcionesMouseClicked
       jTabbedPaneObrero.setSelectedIndex(3);
    }//GEN-LAST:event_jPanelModificarOpcionesMouseClicked

    private void jLabelMenuOpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelMenuOpcionesMouseClicked
        jTabbedPaneObrero.setSelectedIndex(0);
    }//GEN-LAST:event_jLabelMenuOpcionesMouseClicked

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
      
    }//GEN-LAST:event_jButtonActualizarActionPerformed

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
            java.util.logging.Logger.getLogger(Obrero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Obrero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Obrero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Obrero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Obrero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JComboBox<String> jComboBoxNewSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelEmail;
    private javax.swing.JLabel jLabelID;
    private javax.swing.JLabel jLabelMenuOpciones;
    private javax.swing.JLabel jLabelModificarOpciones;
    private javax.swing.JLabel jLabelNewEmail;
    private javax.swing.JLabel jLabelNewEspecialidad;
    private javax.swing.JLabel jLabelNewPass;
    private javax.swing.JLabel jLabelNewSeguro;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelNombreEncabezado;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelSeguro;
    private javax.swing.JLabel jLabelTareasOpciones;
    private javax.swing.JLabel jLabelTextoEncabezado;
    private javax.swing.JLabel jLabelTipoID;
    private javax.swing.JLabel jLabelVerProyectoOpciones;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanelBase;
    private javax.swing.JPanel jPanelEncabezado;
    private javax.swing.JPanel jPanelModificar;
    private javax.swing.JPanel jPanelModificarOpciones;
    private javax.swing.JPanel jPanelOpciones;
    private javax.swing.JPanel jPanelTareasOpciones;
    private javax.swing.JPanel jPanelVerProyectoOpciones;
    private javax.swing.JPasswordField jPasswordFieldNewPass;
    private javax.swing.JPasswordField jPasswordObrero;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparatorEncabezado;
    private javax.swing.JTabbedPane jTabbedPaneObrero;
    private javax.swing.JTextField jTextFieldApellidoObrero;
    private javax.swing.JTextField jTextFieldEmailObrero;
    private javax.swing.JTextField jTextFieldID;
    private javax.swing.JTextField jTextFieldNewEmail;
    private javax.swing.JTextField jTextFieldNewEspecialidad;
    private javax.swing.JTextField jTextFieldNombreObrero;
    private javax.swing.JTextField jTextFieldSeguroObrero;
    private javax.swing.JTextField jTextFieldTipoID;
    private javax.swing.JPanel proyecto;
    // End of variables declaration//GEN-END:variables

}
