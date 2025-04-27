
package view;

public class VistaObrero extends javax.swing.JFrame {

    public VistaObrero() {
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
        jLabel1 = new javax.swing.JLabel();
        panelOpcionesBoton = new javax.swing.JPanel();
        btnInicio = new javax.swing.JButton();
        Proyectos = new javax.swing.JButton();
        btnTareas = new javax.swing.JButton();
        TbbedObrero = new javax.swing.JTabbedPane();
        panelInicio = new javax.swing.JPanel();
        lblImgInicio = new javax.swing.JLabel();
        panelProyecto = new javax.swing.JPanel();
        panelTareas = new javax.swing.JPanel();
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
        menuCerrar = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(102, 102, 102));
        panelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloEncabezado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lblTituloEncabezado.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloEncabezado.setText("  TRABAJADOR");
        panelEncabezado.add(lblTituloEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 150, 40));

        lblNombreTrabajador.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        lblNombreTrabajador.setText("NOMBRE DEL TRABAJADOR");
        panelEncabezado.add(lblNombreTrabajador, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, -1, -1));

        separadorEncabezado.setBackground(new java.awt.Color(0, 0, 0));
        separadorEncabezado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelEncabezado.add(separadorEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 330, 10));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/imgLogin.png"))); // NOI18N
        panelEncabezado.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 6, 70, 70));

        getContentPane().add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 100));

        panelOpcionesBoton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 255)));
        panelOpcionesBoton.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/btnInicio.gif"))); // NOI18N
        btnInicio.setText("   INICIO");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });
        panelOpcionesBoton.add(btnInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 160, 70));

        Proyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/btnProyecto.png"))); // NOI18N
        Proyectos.setText("    PROYECTOS");
        Proyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProyectosActionPerformed(evt);
            }
        });
        panelOpcionesBoton.add(Proyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 0, 170, 70));

        btnTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/btnTareas.png"))); // NOI18N
        btnTareas.setText("TAREAS");
        btnTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTareasActionPerformed(evt);
            }
        });
        panelOpcionesBoton.add(btnTareas, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 170, 70));

        getContentPane().add(panelOpcionesBoton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 560, 770, 70));

        lblImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Fondo1_Obrero.png"))); // NOI18N

        javax.swing.GroupLayout panelInicioLayout = new javax.swing.GroupLayout(panelInicio);
        panelInicio.setLayout(panelInicioLayout);
        panelInicioLayout.setHorizontalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInicioLayout.createSequentialGroup()
                .addComponent(lblImgInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelInicioLayout.setVerticalGroup(
            panelInicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImgInicio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        TbbedObrero.addTab("Inicio", panelInicio);

        javax.swing.GroupLayout panelProyectoLayout = new javax.swing.GroupLayout(panelProyecto);
        panelProyecto.setLayout(panelProyectoLayout);
        panelProyectoLayout.setHorizontalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelProyectoLayout.setVerticalGroup(
            panelProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TbbedObrero.addTab("Proyecto", panelProyecto);

        javax.swing.GroupLayout panelTareasLayout = new javax.swing.GroupLayout(panelTareas);
        panelTareas.setLayout(panelTareasLayout);
        panelTareasLayout.setHorizontalGroup(
            panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelTareasLayout.setVerticalGroup(
            panelTareasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TbbedObrero.addTab("Reportes", panelTareas);

        javax.swing.GroupLayout panelVerDatosLayout = new javax.swing.GroupLayout(panelVerDatos);
        panelVerDatos.setLayout(panelVerDatosLayout);
        panelVerDatosLayout.setHorizontalGroup(
            panelVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelVerDatosLayout.setVerticalGroup(
            panelVerDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TbbedObrero.addTab("Ver Datos", panelVerDatos);

        javax.swing.GroupLayout panelEditarDatosLayout = new javax.swing.GroupLayout(panelEditarDatos);
        panelEditarDatos.setLayout(panelEditarDatosLayout);
        panelEditarDatosLayout.setHorizontalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        panelEditarDatosLayout.setVerticalGroup(
            panelEditarDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        TbbedObrero.addTab("Editar Datos", panelEditarDatos);

        getContentPane().add(TbbedObrero, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 36, 770, 520));

        barraMenu.setBackground(new java.awt.Color(153, 153, 153));
        barraMenu.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));
        barraMenu.setForeground(new java.awt.Color(102, 102, 102));
        barraMenu.setToolTipText("");

        menuInicio.setText("Inicio");

        menuFondos.setText("Fondos");

        menuItemFondo1.setText("Fondo1");
        menuItemFondo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFondo1ActionPerformed(evt);
            }
        });
        menuFondos.add(menuItemFondo1);
        menuFondos.add(separadorFondos);

        menuItemFondo2.setText("Fondo2");
        menuItemFondo2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemFondo2ActionPerformed(evt);
            }
        });
        menuFondos.add(menuItemFondo2);

        menuInicio.add(menuFondos);

        barraMenu.add(menuInicio);

        menuProyecto.setText("Proyecto");

        menuItemVerProyecto.setText("Ver proyecto");
        menuItemVerProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerProyectoActionPerformed(evt);
            }
        });
        menuProyecto.add(menuItemVerProyecto);
        menuProyecto.add(separadorVerProyecto);

        menuIntemActualizarProyecto.setText("Ver tareas");
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

        menuCerrar.setText("Cerrar Sesión");
        barraMenu.add(menuCerrar);

        setJMenuBar(barraMenu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        TbbedObrero.setSelectedIndex(0);
    }//GEN-LAST:event_btnInicioActionPerformed

    private void ProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProyectosActionPerformed
        TbbedObrero.setSelectedIndex(1);
    }//GEN-LAST:event_ProyectosActionPerformed

    private void btnTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTareasActionPerformed
        TbbedObrero.setSelectedIndex(2);
    }//GEN-LAST:event_btnTareasActionPerformed

    private void menuItemFondo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFondo1ActionPerformed
       lblImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Fondo1_Obrero.png")));
    }//GEN-LAST:event_menuItemFondo1ActionPerformed

    private void menuItemFondo2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemFondo2ActionPerformed
       lblImgInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resource/Login.png")));
    }//GEN-LAST:event_menuItemFondo2ActionPerformed

    private void menuItemVerProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerProyectoActionPerformed
       TbbedObrero.setSelectedComponent(panelProyecto);
    }//GEN-LAST:event_menuItemVerProyectoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaObrero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Proyectos;
    private javax.swing.JTabbedPane TbbedObrero;
    private javax.swing.JMenuBar barraMenu;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnTareas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImgInicio;
    private javax.swing.JLabel lblNombreTrabajador;
    private javax.swing.JLabel lblTituloEncabezado;
    private javax.swing.JMenu menuCerrar;
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
    private javax.swing.JPanel panelTareas;
    private javax.swing.JPanel panelVerDatos;
    private javax.swing.JPopupMenu.Separator separadorActualizarProyecto;
    private javax.swing.JSeparator separadorEncabezado;
    private javax.swing.JPopupMenu.Separator separadorFondos;
    private javax.swing.JPopupMenu.Separator separadorVerProyecto;
    // End of variables declaration//GEN-END:variables
}
