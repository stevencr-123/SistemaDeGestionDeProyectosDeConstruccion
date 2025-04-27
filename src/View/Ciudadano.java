package view;

public class Ciudadano extends javax.swing.JFrame {
    
    public Ciudadano() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelEncabezado = new javax.swing.JPanel();
        lblTituloEncabezado = new javax.swing.JLabel();
        lblNombreTrabajador = new javax.swing.JLabel();
        separadorEncabezado = new javax.swing.JSeparator();
        panelOpcionesBoton = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        Proyectos = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        TbbedCiudadano = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        panelProyecto = new javax.swing.JPanel();
        panelReportes = new javax.swing.JPanel();
        panelVerDatos = new javax.swing.JPanel();
        panelEditarDatos = new javax.swing.JPanel();
        barraMenu = new javax.swing.JMenuBar();
        menuInicio = new javax.swing.JMenu();
        menuFondos = new javax.swing.JMenu();
        menuItemFondo1 = new javax.swing.JMenuItem();
        separadorFondos = new javax.swing.JPopupMenu.Separator();
        menuItemFondo2 = new javax.swing.JMenuItem();
        menuProyecto = new javax.swing.JMenu();
        menuItemVerProyecto = new javax.swing.JMenuItem();
        separadorVerProyecto = new javax.swing.JPopupMenu.Separator();
        menuIntemActualizarProyecto = new javax.swing.JMenuItem();
        separadorActualizarProyecto = new javax.swing.JPopupMenu.Separator();
        menuItemCerrarProyecto = new javax.swing.JMenuItem();
        menuConfiguración = new javax.swing.JMenu();
        menuItemMiInformacion = new javax.swing.JMenu();
        menuItemVerInfo = new javax.swing.JMenuItem();
        menuItemActualizarInfo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(102, 102, 102));
        panelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEncabezado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEncabezado.setText("CIUDADANO");
        panelEncabezado.add(lblTituloEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 120, 40));

        lblNombreTrabajador.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblNombreTrabajador.setText("NOMBRE DEL CIUDADANO");
        panelEncabezado.add(lblNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(413, 22, -1, -1));

        separadorEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        separadorEncabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEncabezado.add(separadorEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 330, 10));

        getContentPane().add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 100));

        panelOpcionesBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));

        btnInicio.setText("INICIO");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        Proyectos.setText("PROYECTOS");
        Proyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectosActionPerformed(evt);
            }
        });

        btnReporte.setText("REPORTES");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelOpcionesBotonLayout = new javax.swing.GroupLayout(panelOpcionesBoton);
        panelOpcionesBoton.setLayout(panelOpcionesBotonLayout);
        panelOpcionesBotonLayout.setHorizontalGroup(
            panelOpcionesBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionesBotonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82)
                .addComponent(Proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116))
        );
        panelOpcionesBotonLayout.setVerticalGroup(
            panelOpcionesBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionesBotonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelOpcionesBotonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Proyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21))
        );

        getContentPane().add(panelOpcionesBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 700, 60));

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        TbbedCiudadano.addTab("Inicio", panelInicio);

        javax.swing.GroupLayout panelProyectoLayout = new javax.swing.GroupLayout(panelProyecto);
        panelProyecto.setLayout(panelProyectoLayout);
        panelProyectoLayout.setHorizontalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelProyectoLayout.setVerticalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        TbbedCiudadano.addTab("Proyecto", panelProyecto);

        javax.swing.GroupLayout panelReportesLayout = new javax.swing.GroupLayout(panelReportes);
        panelReportes.setLayout(panelReportesLayout);
        panelReportesLayout.setHorizontalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelReportesLayout.setVerticalGroup(
            panelReportesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        TbbedCiudadano.addTab("Reportes", panelReportes);

        javax.swing.GroupLayout panelVerDatosLayout = new javax.swing.GroupLayout(panelVerDatos);
        panelVerDatos.setLayout(panelVerDatosLayout);
        panelVerDatosLayout.setHorizontalGroup(
            panelVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelVerDatosLayout.setVerticalGroup(
            panelVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        TbbedCiudadano.addTab("Ver Datos", panelVerDatos);

        javax.swing.GroupLayout panelEditarDatosLayout = new javax.swing.GroupLayout(panelEditarDatos);
        panelEditarDatos.setLayout(panelEditarDatosLayout);
        panelEditarDatosLayout.setHorizontalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        panelEditarDatosLayout.setVerticalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 415, Short.MAX_VALUE)
        );

        TbbedCiudadano.addTab("Editar Datos", panelEditarDatos);

        getContentPane().add(TbbedCiudadano, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, -1, 450));

        barraMenu.setBackground(new java.awt.Color(153, 153, 153));
        barraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 55, 121)));
        barraMenu.setForeground(new java.awt.Color(102, 102, 102));
        barraMenu.setToolTipText("");

        menuInicio.setText("Inicio");

        menuFondos.setText("Fondos");

        menuItemFondo1.setText("Fondo1");
        menuFondos.add(menuItemFondo1);
        menuFondos.add(separadorFondos);

        menuItemFondo2.setText("Fondo2");
        menuFondos.add(menuItemFondo2);

        menuInicio.add(menuFondos);

        barraMenu.add(menuInicio);

        menuProyecto.setText("Proyecto");

        menuItemVerProyecto.setText("Ver proyecto");
        menuProyecto.add(menuItemVerProyecto);
        menuProyecto.add(separadorVerProyecto);

        menuIntemActualizarProyecto.setText("Actualizar Proyecto");
        menuProyecto.add(menuIntemActualizarProyecto);
        menuProyecto.add(separadorActualizarProyecto);

        menuItemCerrarProyecto.setText("Cerrar proyecto");
        menuProyecto.add(menuItemCerrarProyecto);

        barraMenu.add(menuProyecto);

        menuConfiguración.setText("Configuración");

        menuItemMiInformacion.setText("Mis datos");

        menuItemVerInfo.setText("Ver mi información");
        menuItemMiInformacion.add(menuItemVerInfo);

        menuItemActualizarInfo.setText("Modificar mi Información");
        menuItemMiInformacion.add(menuItemActualizarInfo);

        menuConfiguración.add(menuItemMiInformacion);

        barraMenu.add(menuConfiguración);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed
        TbbedCiudadano.setSelectedIndex(2);
    }//GEN-LAST:event_btnReporteActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        TbbedCiudadano.setSelectedIndex(0);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void ProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectosActionPerformed
        TbbedCiudadano.setSelectedIndex(1);
    }//GEN-LAST:event_ProyectosActionPerformed

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
            java.util.logging.Logger.getLogger(Ciudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ciudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ciudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ciudadano.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ciudadano().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proyectos;
    private javax.swing.JTabbedPane TbbedCiudadano;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnReporte;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblTituloEncabezado;
    private javax.swing.JMenu menuConfiguración;
    private javax.swing.JMenu menuFondos;
    private javax.swing.JMenu menuInicio;
    private javax.swing.JMenuItem menuIntemActualizarProyecto;
    private javax.swing.JMenuItem menuItemActualizarInfo;
    private javax.swing.JMenuItem menuItemCerrarProyecto;
    private javax.swing.JMenuItem menuItemFondo1;
    private javax.swing.JMenuItem menuItemFondo2;
    private javax.swing.JMenu menuItemMiInformacion;
    private javax.swing.JMenuItem menuItemVerInfo;
    private javax.swing.JMenuItem menuItemVerProyecto;
    private javax.swing.JMenu menuProyecto;
    private javax.swing.JPanel panelEditarDatos;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelInicio;
    private javax.swing.JPanel panelOpcionesBoton;
    private javax.swing.JPanel panelProyecto;
    private javax.swing.JPanel panelReportes;
    private javax.swing.JPanel panelVerDatos;
    private javax.swing.JPopupMenu.Separator separadorActualizarProyecto;
    private javax.swing.JSeparator separadorEncabezado;
    private javax.swing.JPopupMenu.Separator separadorFondos;
    private javax.swing.JPopupMenu.Separator separadorVerProyecto;
    // End of variables declaration//GEN-END:variables
}
