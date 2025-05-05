package view;

import controller.ProyectoController;
import java.awt.Color;
import java.util.List;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import repository.impl.ProyectoRepositoryJsonImpl;
import repository.interfaces.IProyectoRepository;
import service.impl.ProyectoServiceImpl;
import service.interfaces.IProyectoService;
import exceptions.ValidacionException;
import exceptions.ProyectoYaExisteException;
import exceptions.NombreProyectoExistenteException;
import exceptions.FechaInvalidaException;
import exceptions.ProyectoNoEncontradoException;
import java.awt.Font;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.JTableHeader;
import model.Proyecto;
import org.jdesktop.swingx.JXTable;
import org.jdesktop.swingx.decorator.ColorHighlighter;
import org.jdesktop.swingx.decorator.ComponentAdapter;
import org.jdesktop.swingx.decorator.HighlightPredicate;
import org.jdesktop.swingx.decorator.Highlighter;
import org.jdesktop.swingx.search.SearchFactory;
import org.jdesktop.swingx.search.TableSearchable;
import org.jdesktop.swingx.table.TableColumnExt;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.JTableHeader;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class AdministradorWindown extends javax.swing.JFrame {

    // Crear el repositorio y el servicio
    IProyectoRepository repo = new ProyectoRepositoryJsonImpl();
    IProyectoService servicio = new ProyectoServiceImpl(repo);
    ProyectoController proyectoController = new ProyectoController(servicio);

    public AdministradorWindown() {
        initComponents();
        configurarTablaProyectos();        
        configurarBuscador();
        configurarComportamientoTablaConClickDerecho();

        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PopupMenuProyectos = new javax.swing.JPopupMenu();
        menuItemVerDetalles = new javax.swing.JMenuItem();
        menuItemEditar = new javax.swing.JMenuItem();
        menuItemEliminar = new javax.swing.JMenuItem();
        panelBase = new javax.swing.JPanel();
        panelEncabezado = new javax.swing.JPanel();
        etiEncabezadoAdmin = new javax.swing.JLabel();
        panelBarraOpciones = new javax.swing.JPanel();
        panelOpcionProyectos = new javax.swing.JPanel();
        etiOpcionProyectos = new javax.swing.JLabel();
        panelOpcionEmpleados = new javax.swing.JPanel();
        etiOpcionEmpleados = new javax.swing.JLabel();
        panelOpcionContratar = new javax.swing.JPanel();
        etiOpcionContratar = new javax.swing.JLabel();
        panelOpcionListarObras = new javax.swing.JPanel();
        etiOpcionListarObras = new javax.swing.JLabel();
        etiOpcionIcon = new javax.swing.JLabel();
        TabbedAdmin = new javax.swing.JTabbedPane();
        panelContratar = new javax.swing.JPanel();
        panelFormularioContrato = new javax.swing.JPanel();
        txtCorreoEmpleado = new javax.swing.JTextField();
        etiCorreoEmpleado = new javax.swing.JLabel();
        cmbPuestoTrabajo = new javax.swing.JComboBox<>();
        etiPuestoTrabajo = new javax.swing.JLabel();
        txtNombreEmpleado = new javax.swing.JTextField();
        etiApellidoEmpleado = new javax.swing.JLabel();
        etiIdentificacionEmpleado = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        separadorNombre = new javax.swing.JSeparator();
        separadorTelefono = new javax.swing.JSeparator();
        separadorIdentificacion = new javax.swing.JSeparator();
        separadorApellido = new javax.swing.JSeparator();
        btnContratar = new javax.swing.JButton();
        cmbTipoIdentificacion = new javax.swing.JComboBox<>();
        etiTipoIdentificacion = new javax.swing.JLabel();
        etiTelefono = new javax.swing.JLabel();
        separadorCorreo = new javax.swing.JSeparator();
        txtApellido = new javax.swing.JTextField();
        etiNombre = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        etiSalario = new javax.swing.JLabel();
        txtSalario = new javax.swing.JTextField();
        separadorSalario = new javax.swing.JSeparator();
        txtTelefono = new javax.swing.JTextField();
        panelEmpleados = new javax.swing.JPanel();
        scrollEmpleados = new javax.swing.JScrollPane();
        jTable_Empleados = new javax.swing.JTable();
        panelCrearProyecto = new javax.swing.JPanel();
        panelFormularioProyecto = new javax.swing.JPanel();
        etiCodigo = new javax.swing.JLabel();
        etiNombreProyecto = new javax.swing.JLabel();
        etiDireccionProyecto = new javax.swing.JLabel();
        etiTipoReparacion = new javax.swing.JLabel();
        etiFechaEstimada = new javax.swing.JLabel();
        etiPrioridadProyecto = new javax.swing.JLabel();
        etiPresupuesto = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        cmbTiporeparacion = new javax.swing.JComboBox<>();
        cmbPrioridad = new javax.swing.JComboBox<>();
        txtPresupuesto = new javax.swing.JTextField();
        separadorPresupuesto = new javax.swing.JSeparator();
        separadorCodigo = new javax.swing.JSeparator();
        separadorNombreProyecto = new javax.swing.JSeparator();
        separadorDireccionProyecto = new javax.swing.JSeparator();
        DatePickFechaEstimada = new org.jdesktop.swingx.JXDatePicker();
        scrollArea = new javax.swing.JScrollPane();
        txtArea = new org.jdesktop.swingx.JXTextArea();
        etiSeccionPlanificacion = new org.jdesktop.swingx.JXLabel();
        etiSeccionDatosGenerales = new org.jdesktop.swingx.JXLabel();
        etiDescripcion = new org.jdesktop.swingx.JXLabel();
        etiDetallesTecnicos = new org.jdesktop.swingx.JXLabel();
        separadorSeccion2 = new javax.swing.JSeparator();
        separadorSeccion1 = new javax.swing.JSeparator();
        separadorSecction3 = new javax.swing.JSeparator();
        etiObligatorioNombre = new javax.swing.JLabel();
        etiObligatorioDireccion = new javax.swing.JLabel();
        etiObligatorioTipoReparacion = new javax.swing.JLabel();
        etiObligatorioPrioridad = new javax.swing.JLabel();
        etiObligatorioPresupuesto = new javax.swing.JLabel();
        etiObligatorioFechaEstimada = new javax.swing.JLabel();
        etiObligatorioCodigo = new javax.swing.JLabel();
        btnLimpiarCampos = new javax.swing.JButton();
        panelVerProyectos = new javax.swing.JPanel();
        scrollProyectos = new javax.swing.JScrollPane();
        jXTableProyectos = new org.jdesktop.swingx.JXTable();
        panelBuscador = new javax.swing.JPanel();
        cmbFiltro = new javax.swing.JComboBox<>();
        txtBuscar = new javax.swing.JTextField();
        chkCoincidenciaMayusculas = new javax.swing.JCheckBox();
        btnBuscar = new javax.swing.JButton();
        datePickerFechaInicio = new org.jdesktop.swingx.JXDatePicker();
        datePickerFechaFin = new org.jdesktop.swingx.JXDatePicker();
        txtPresupuestoMin = new javax.swing.JTextField();
        txtPresupuestoMax = new javax.swing.JTextField();
        btnBusquedaAvanzada = new javax.swing.JButton();
        etiFechaInicio = new javax.swing.JLabel();
        etiFechaFin = new javax.swing.JLabel();
        etiPresupuestoMin = new javax.swing.JLabel();
        etiPresupuestoMax = new javax.swing.JLabel();
        btnActualizar = new javax.swing.JButton();

        menuItemVerDetalles.setText("jMenuItem1");
        menuItemVerDetalles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuItemVerDetallesActionPerformed(evt);
            }
        });
        PopupMenuProyectos.add(menuItemVerDetalles);

        menuItemEditar.setText("jMenuItem2");
        PopupMenuProyectos.add(menuItemEditar);

        menuItemEliminar.setText("jMenuItem3");
        PopupMenuProyectos.add(menuItemEliminar);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelBase.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelEncabezado.setBackground(new java.awt.Color(0, 51, 102));
        panelEncabezado.setPreferredSize(new java.awt.Dimension(1000, 100));
        panelEncabezado.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiEncabezadoAdmin.setFont(new java.awt.Font("Segoe UI Semibold", 0, 36)); // NOI18N
        etiEncabezadoAdmin.setForeground(new java.awt.Color(255, 233, 127));
        etiEncabezadoAdmin.setText("Administrador");
        panelEncabezado.add(etiEncabezadoAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 240, 70));

        panelBase.add(panelEncabezado, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 880, 90));

        panelBarraOpciones.setBackground(new java.awt.Color(0, 51, 102));
        panelBarraOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelOpcionProyectos.setBackground(new java.awt.Color(0, 51, 102));
        panelOpcionProyectos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOpcionProyectosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionProyectosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionProyectosMouseExited(evt);
            }
        });

        etiOpcionProyectos.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        etiOpcionProyectos.setForeground(new java.awt.Color(255, 233, 127));
        etiOpcionProyectos.setText("Proyectos ");

        javax.swing.GroupLayout panelOpcionProyectosLayout = new javax.swing.GroupLayout(panelOpcionProyectos);
        panelOpcionProyectos.setLayout(panelOpcionProyectosLayout);
        panelOpcionProyectosLayout.setHorizontalGroup(
            panelOpcionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionProyectosLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(etiOpcionProyectos)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        panelOpcionProyectosLayout.setVerticalGroup(
            panelOpcionProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionProyectosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiOpcionProyectos, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBarraOpciones.add(panelOpcionProyectos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 200, 50));

        panelOpcionEmpleados.setBackground(new java.awt.Color(0, 51, 102));
        panelOpcionEmpleados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOpcionEmpleadosMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionEmpleadosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionEmpleadosMouseExited(evt);
            }
        });

        etiOpcionEmpleados.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        etiOpcionEmpleados.setForeground(new java.awt.Color(255, 233, 127));
        etiOpcionEmpleados.setText(" Empleados");

        javax.swing.GroupLayout panelOpcionEmpleadosLayout = new javax.swing.GroupLayout(panelOpcionEmpleados);
        panelOpcionEmpleados.setLayout(panelOpcionEmpleadosLayout);
        panelOpcionEmpleadosLayout.setHorizontalGroup(
            panelOpcionEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionEmpleadosLayout.createSequentialGroup()
                .addContainerGap(46, Short.MAX_VALUE)
                .addComponent(etiOpcionEmpleados)
                .addGap(59, 59, 59))
        );
        panelOpcionEmpleadosLayout.setVerticalGroup(
            panelOpcionEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionEmpleadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiOpcionEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBarraOpciones.add(panelOpcionEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 200, 50));

        panelOpcionContratar.setBackground(new java.awt.Color(0, 51, 102));
        panelOpcionContratar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOpcionContratarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionContratarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionContratarMouseExited(evt);
            }
        });

        etiOpcionContratar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        etiOpcionContratar.setForeground(new java.awt.Color(255, 233, 127));
        etiOpcionContratar.setText("Contratar");

        javax.swing.GroupLayout panelOpcionContratarLayout = new javax.swing.GroupLayout(panelOpcionContratar);
        panelOpcionContratar.setLayout(panelOpcionContratarLayout);
        panelOpcionContratarLayout.setHorizontalGroup(
            panelOpcionContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionContratarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(etiOpcionContratar)
                .addContainerGap(65, Short.MAX_VALUE))
        );
        panelOpcionContratarLayout.setVerticalGroup(
            panelOpcionContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelOpcionContratarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiOpcionContratar, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBarraOpciones.add(panelOpcionContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 200, 50));

        panelOpcionListarObras.setBackground(new java.awt.Color(0, 51, 102));
        panelOpcionListarObras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelOpcionListarObrasMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                panelOpcionListarObrasMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                panelOpcionListarObrasMouseExited(evt);
            }
        });

        etiOpcionListarObras.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        etiOpcionListarObras.setForeground(new java.awt.Color(255, 233, 127));
        etiOpcionListarObras.setText(" Listar Obras ");

        javax.swing.GroupLayout panelOpcionListarObrasLayout = new javax.swing.GroupLayout(panelOpcionListarObras);
        panelOpcionListarObras.setLayout(panelOpcionListarObrasLayout);
        panelOpcionListarObrasLayout.setHorizontalGroup(
            panelOpcionListarObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionListarObrasLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(etiOpcionListarObras)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        panelOpcionListarObrasLayout.setVerticalGroup(
            panelOpcionListarObrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelOpcionListarObrasLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etiOpcionListarObras, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelBarraOpciones.add(panelOpcionListarObras, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 200, 50));

        etiOpcionIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/Login.png"))); // NOI18N
        panelBarraOpciones.add(etiOpcionIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 130, 150));

        panelBase.add(panelBarraOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 570));

        panelContratar.setBackground(new java.awt.Color(255, 255, 255));

        panelFormularioContrato.setBackground(new java.awt.Color(255, 255, 255));
        panelFormularioContrato.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFormularioContrato.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtCorreoEmpleado.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtCorreoEmpleado.setBorder(null);
        txtCorreoEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoEmpleadoActionPerformed(evt);
            }
        });
        panelFormularioContrato.add(txtCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 100, 20));

        etiCorreoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiCorreoEmpleado.setText("Correo:");
        panelFormularioContrato.add(etiCorreoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        cmbPuestoTrabajo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Promotor", "Obrero" }));
        cmbPuestoTrabajo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        panelFormularioContrato.add(cmbPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 100, -1));

        etiPuestoTrabajo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiPuestoTrabajo.setText("Trabajo:");
        panelFormularioContrato.add(etiPuestoTrabajo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, -1, -1));

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
        panelFormularioContrato.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 100, 20));

        etiApellidoEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiApellidoEmpleado.setText("Apellido:");
        panelFormularioContrato.add(etiApellidoEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, -1, -1));

        etiIdentificacionEmpleado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiIdentificacionEmpleado.setText("Identificacion");
        panelFormularioContrato.add(etiIdentificacionEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, -1, -1));

        txtIdentificacion.setBackground(new java.awt.Color(0, 0, 0, 0));
        txtIdentificacion.setBorder(null);
        txtIdentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdentificacionKeyTyped(evt);
            }
        });
        panelFormularioContrato.add(txtIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 130, 100, 20));

        separadorNombre.setBackground(new java.awt.Color(0, 0, 0));
        separadorNombre.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 100, 10));

        separadorTelefono.setBackground(new java.awt.Color(0, 0, 0));
        separadorTelefono.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 100, 10));

        separadorIdentificacion.setBackground(new java.awt.Color(0, 0, 0));
        separadorIdentificacion.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 100, 10));

        separadorApellido.setBackground(new java.awt.Color(0, 0, 0));
        separadorApellido.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 100, 10));

        btnContratar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnContratar.setText("Contratar");
        btnContratar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratarActionPerformed(evt);
            }
        });
        panelFormularioContrato.add(btnContratar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 120, 50));

        cmbTipoIdentificacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CEDULA" }));
        panelFormularioContrato.add(cmbTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 220, 100, -1));

        etiTipoIdentificacion.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiTipoIdentificacion.setText("Tipo de cedula");
        panelFormularioContrato.add(etiTipoIdentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, -1, -1));

        etiTelefono.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiTelefono.setText("Telefono:");
        panelFormularioContrato.add(etiTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 80, 20));

        separadorCorreo.setBackground(new java.awt.Color(0, 0, 0));
        separadorCorreo.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 100, 10));

        txtApellido.setBorder(null);
        panelFormularioContrato.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 100, 20));

        etiNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiNombre.setText("Nombre");
        panelFormularioContrato.add(etiNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        panelFormularioContrato.add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 350, -1, -1));

        etiSalario.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        etiSalario.setText("Salario:");
        panelFormularioContrato.add(etiSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 250, 70, 20));

        txtSalario.setBorder(null);
        panelFormularioContrato.add(txtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 110, 20));

        separadorSalario.setBackground(new java.awt.Color(0, 0, 0));
        separadorSalario.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioContrato.add(separadorSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 110, 10));

        txtTelefono.setBorder(null);
        panelFormularioContrato.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 110, 20));

        javax.swing.GroupLayout panelContratarLayout = new javax.swing.GroupLayout(panelContratar);
        panelContratar.setLayout(panelContratarLayout);
        panelContratarLayout.setHorizontalGroup(
            panelContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContratarLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(panelFormularioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(536, Short.MAX_VALUE))
        );
        panelContratarLayout.setVerticalGroup(
            panelContratarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelContratarLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelFormularioContrato, javax.swing.GroupLayout.PREFERRED_SIZE, 391, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        TabbedAdmin.addTab("ContratarEmpleado", panelContratar);

        jTable_Empleados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Correo", "Cedula", "Rol", "Seguro Laboral", "Tipo identificacion", "Fecha contratacion", "Salario"
            }
        ));
        scrollEmpleados.setViewportView(jTable_Empleados);

        javax.swing.GroupLayout panelEmpleadosLayout = new javax.swing.GroupLayout(panelEmpleados);
        panelEmpleados.setLayout(panelEmpleadosLayout);
        panelEmpleadosLayout.setHorizontalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEmpleados, javax.swing.GroupLayout.DEFAULT_SIZE, 880, Short.MAX_VALUE)
        );
        panelEmpleadosLayout.setVerticalGroup(
            panelEmpleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollEmpleados, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 465, Short.MAX_VALUE)
        );

        TabbedAdmin.addTab("VerEmpleados", panelEmpleados);

        panelCrearProyecto.setBackground(new java.awt.Color(255, 255, 255));

        panelFormularioProyecto.setBackground(new java.awt.Color(255, 255, 255));
        panelFormularioProyecto.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        etiCodigo.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiCodigo.setForeground(new java.awt.Color(102, 102, 102));
        etiCodigo.setText("Codigo:");
        panelFormularioProyecto.add(etiCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 50, -1));

        etiNombreProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiNombreProyecto.setForeground(new java.awt.Color(102, 102, 102));
        etiNombreProyecto.setText("Nombre:");
        panelFormularioProyecto.add(etiNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        etiDireccionProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiDireccionProyecto.setForeground(new java.awt.Color(102, 102, 102));
        etiDireccionProyecto.setText("Direccion:");
        panelFormularioProyecto.add(etiDireccionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 70, 20));

        etiTipoReparacion.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiTipoReparacion.setForeground(new java.awt.Color(102, 102, 102));
        etiTipoReparacion.setText("Tipo de reparación:");
        panelFormularioProyecto.add(etiTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 70, -1, 20));

        etiFechaEstimada.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiFechaEstimada.setForeground(new java.awt.Color(102, 102, 102));
        etiFechaEstimada.setText("Fecha fin estimada:");
        panelFormularioProyecto.add(etiFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 140, -1, -1));

        etiPrioridadProyecto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPrioridadProyecto.setForeground(new java.awt.Color(102, 102, 102));
        etiPrioridadProyecto.setText("Prioridad:");
        panelFormularioProyecto.add(etiPrioridadProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 150, 90, 20));

        etiPresupuesto.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        etiPresupuesto.setForeground(new java.awt.Color(102, 102, 102));
        etiPresupuesto.setText("Presupuesto:");
        panelFormularioProyecto.add(etiPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 70, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(0, 0, 255));
        btnGuardar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        panelFormularioProyecto.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 160, 40));

        txtCodigo.setBackground(new java.awt.Color(204, 204, 204));
        txtCodigo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(txtCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, 140, 20));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 160, 20));

        txtDireccion.setBackground(new java.awt.Color(204, 204, 204));
        txtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 170, 20));

        cmbTiporeparacion.setBackground(new java.awt.Color(204, 204, 204));
        cmbTiporeparacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "ESTRUCTURAL", "ELECTRICA", "HIDRAULICA", "PAVIMENTACION", "OTROS" }));
        cmbTiporeparacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(cmbTiporeparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 100, 140, 30));

        cmbPrioridad.setBackground(new java.awt.Color(204, 204, 204));
        cmbPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NINGUNA", "URGENTE", "ALTA", "MEDIA", "BAJA" }));
        cmbPrioridad.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(cmbPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, 140, 30));

        txtPresupuesto.setBackground(new java.awt.Color(204, 204, 204));
        txtPresupuesto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(txtPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 100, 150, 20));

        separadorPresupuesto.setBackground(new java.awt.Color(0, 0, 0));
        separadorPresupuesto.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioProyecto.add(separadorPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 120, 150, 10));

        separadorCodigo.setBackground(new java.awt.Color(0, 0, 0));
        separadorCodigo.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioProyecto.add(separadorCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 140, 10));

        separadorNombreProyecto.setBackground(new java.awt.Color(0, 0, 0));
        separadorNombreProyecto.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioProyecto.add(separadorNombreProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 160, 10));

        separadorDireccionProyecto.setBackground(new java.awt.Color(0, 0, 0));
        separadorDireccionProyecto.setForeground(new java.awt.Color(0, 0, 0));
        panelFormularioProyecto.add(separadorDireccionProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 170, 10));

        DatePickFechaEstimada.setBackground(new java.awt.Color(204, 204, 204));
        DatePickFechaEstimada.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        panelFormularioProyecto.add(DatePickFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 160, -1));

        txtArea.setBackground(new java.awt.Color(204, 204, 204));
        txtArea.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Descripción", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("SansSerif", 0, 14), new java.awt.Color(102, 102, 102))); // NOI18N
        txtArea.setColumns(20);
        txtArea.setRows(5);
        scrollArea.setViewportView(txtArea);

        panelFormularioProyecto.add(scrollArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 270, 310, 160));

        etiSeccionPlanificacion.setForeground(new java.awt.Color(0, 204, 51));
        etiSeccionPlanificacion.setText("               Planificación");
        etiSeccionPlanificacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelFormularioProyecto.add(etiSeccionPlanificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 260, 20));

        etiSeccionDatosGenerales.setForeground(new java.awt.Color(0, 204, 204));
        etiSeccionDatosGenerales.setText("           Datos generales");
        etiSeccionDatosGenerales.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelFormularioProyecto.add(etiSeccionDatosGenerales, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 20, 230, 20));

        etiDescripcion.setForeground(new java.awt.Color(255, 204, 0));
        etiDescripcion.setText("               Descripción");
        etiDescripcion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelFormularioProyecto.add(etiDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 250, 20));

        etiDetallesTecnicos.setForeground(new java.awt.Color(255, 51, 51));
        etiDetallesTecnicos.setText("           Detalles técnicos");
        etiDetallesTecnicos.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        panelFormularioProyecto.add(etiDetallesTecnicos, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, 250, 20));

        separadorSeccion2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFormularioProyecto.add(separadorSeccion2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, 10, 430));

        separadorSeccion1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        panelFormularioProyecto.add(separadorSeccion1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 10, 310));
        panelFormularioProyecto.add(separadorSecction3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 490, 10));

        etiObligatorioNombre.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioNombre.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioNombre.setText("*");
        panelFormularioProyecto.add(etiObligatorioNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(93, 150, -1, 20));

        etiObligatorioDireccion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioDireccion.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioDireccion.setText("*");
        panelFormularioProyecto.add(etiObligatorioDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, 20, 20));

        etiObligatorioTipoReparacion.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioTipoReparacion.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioTipoReparacion.setText("*");
        panelFormularioProyecto.add(etiObligatorioTipoReparacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 10, 20));

        etiObligatorioPrioridad.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioPrioridad.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioPrioridad.setText("*");
        panelFormularioProyecto.add(etiObligatorioPrioridad, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 150, 10, 20));

        etiObligatorioPresupuesto.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioPresupuesto.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioPresupuesto.setText("*");
        panelFormularioProyecto.add(etiObligatorioPresupuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 70, 10, 20));

        etiObligatorioFechaEstimada.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioFechaEstimada.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioFechaEstimada.setText("*");
        panelFormularioProyecto.add(etiObligatorioFechaEstimada, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 140, 10, 20));

        etiObligatorioCodigo.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        etiObligatorioCodigo.setForeground(new java.awt.Color(255, 51, 51));
        etiObligatorioCodigo.setText("*");
        panelFormularioProyecto.add(etiObligatorioCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 70, 10, 20));

        btnLimpiarCampos.setBackground(new java.awt.Color(102, 102, 102));
        btnLimpiarCampos.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnLimpiarCampos.setText("Limpiar campos");
        btnLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActionPerformed(evt);
            }
        });
        panelFormularioProyecto.add(btnLimpiarCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, 150, 40));

        javax.swing.GroupLayout panelCrearProyectoLayout = new javax.swing.GroupLayout(panelCrearProyecto);
        panelCrearProyecto.setLayout(panelCrearProyectoLayout);
        panelCrearProyectoLayout.setHorizontalGroup(
            panelCrearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCrearProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelFormularioProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 868, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelCrearProyectoLayout.setVerticalGroup(
            panelCrearProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelFormularioProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        TabbedAdmin.addTab("CrearProyecto", panelCrearProyecto);

        jXTableProyectos.setBackground(new java.awt.Color(51, 51, 51));
        jXTableProyectos.setForeground(new java.awt.Color(0, 0, 0));
        jXTableProyectos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Código", "Nombre", "Dirección", "Tipo", "Prioridad", "Estado", "Presupuesto", "Inicio", "Fin", "Descripción"
            }
        ));
        jXTableProyectos.setAutoscrolls(false);
        jXTableProyectos.setColumnControlVisible(true);
        jXTableProyectos.setColumnSelectionAllowed(false);
        jXTableProyectos.setEditable(false);
        jXTableProyectos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jXTableProyectos.setGridColor(new java.awt.Color(102, 102, 102));
        jXTableProyectos.setRowHeight(28);
        jXTableProyectos.setSelectionBackground(new java.awt.Color(75, 110, 175));
        jXTableProyectos.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jXTableProyectos.setSelectionMode(1);
        jXTableProyectos.setShowGrid(false);
        scrollProyectos.setViewportView(jXTableProyectos);

        panelBuscador.setBackground(new java.awt.Color(255, 255, 255));

        cmbFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "Termina en", "Comienza con", "Igual a", "Contiene" }));

        chkCoincidenciaMayusculas.setForeground(new java.awt.Color(0, 0, 0));
        chkCoincidenciaMayusculas.setText(" Mayusculas/Minusculas");

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBuscar.setText("Buscar");

        datePickerFechaFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datePickerFechaFinActionPerformed(evt);
            }
        });

        txtPresupuestoMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPresupuestoMinActionPerformed(evt);
            }
        });

        btnBusquedaAvanzada.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnBusquedaAvanzada.setText("Busqueda avnzada");
        btnBusquedaAvanzada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedaAvanzadaActionPerformed(evt);
            }
        });

        etiFechaInicio.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaInicio.setText("Fecha Inicio");

        etiFechaFin.setForeground(new java.awt.Color(0, 0, 0));
        etiFechaFin.setText("Fecha Fin");

        etiPresupuestoMin.setForeground(new java.awt.Color(0, 0, 0));
        etiPresupuestoMin.setText("Presupuesto Min");

        etiPresupuestoMax.setForeground(new java.awt.Color(0, 0, 0));
        etiPresupuestoMax.setText("Presupuesto Max");

        btnActualizar.setBackground(new java.awt.Color(204, 204, 204));
        btnActualizar.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(0, 0, 0));
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscadorLayout = new javax.swing.GroupLayout(panelBuscador);
        panelBuscador.setLayout(panelBuscadorLayout);
        panelBuscadorLayout.setHorizontalGroup(
            panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBuscadorLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBuscadorLayout.createSequentialGroup()
                        .addComponent(btnBusquedaAvanzada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiFechaInicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiFechaFin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(datePickerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(etiPresupuestoMin)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                        .addComponent(txtPresupuestoMin, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(etiPresupuestoMax)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPresupuestoMax, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(panelBuscadorLayout.createSequentialGroup()
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(chkCoincidenciaMayusculas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        panelBuscadorLayout.setVerticalGroup(
            panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscadorLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbFiltro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chkCoincidenciaMayusculas)
                    .addComponent(btnBuscar)
                    .addComponent(btnActualizar)
                    .addComponent(txtBuscar))
                .addGap(18, 18, 18)
                .addGroup(panelBuscadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datePickerFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datePickerFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBusquedaAvanzada)
                    .addComponent(etiFechaInicio)
                    .addComponent(etiFechaFin)
                    .addComponent(etiPresupuestoMin)
                    .addComponent(txtPresupuestoMin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPresupuestoMax, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etiPresupuestoMax))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelVerProyectosLayout = new javax.swing.GroupLayout(panelVerProyectos);
        panelVerProyectos.setLayout(panelVerProyectosLayout);
        panelVerProyectosLayout.setHorizontalGroup(
            panelVerProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollProyectos)
            .addGroup(panelVerProyectosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBuscador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelVerProyectosLayout.setVerticalGroup(
            panelVerProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelVerProyectosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(panelBuscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 344, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        TabbedAdmin.addTab("VerProyectos", panelVerProyectos);

        panelBase.add(TabbedAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 880, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBase, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void panelOpcionProyectosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionProyectosMouseClicked
        TabbedAdmin.setSelectedIndex(2);
    }//GEN-LAST:event_panelOpcionProyectosMouseClicked

    private void panelOpcionProyectosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionProyectosMouseEntered
        panelOpcionProyectos.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_panelOpcionProyectosMouseEntered

    private void panelOpcionProyectosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionProyectosMouseExited
        panelOpcionProyectos.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_panelOpcionProyectosMouseExited

    private void panelOpcionEmpleadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionEmpleadosMouseClicked
        TabbedAdmin.setSelectedIndex(1);
    }//GEN-LAST:event_panelOpcionEmpleadosMouseClicked

    private void panelOpcionEmpleadosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionEmpleadosMouseEntered
        panelOpcionEmpleados.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_panelOpcionEmpleadosMouseEntered

    private void panelOpcionEmpleadosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionEmpleadosMouseExited
        panelOpcionEmpleados.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_panelOpcionEmpleadosMouseExited

    private void panelOpcionListarObrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListarObrasMouseClicked
        TabbedAdmin.setSelectedIndex(3);

        try {
            List<Proyecto> proyectos = proyectoController.obtenerTodosLosProyectos();
            cargarProyectosEnTabla(proyectos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar proyectos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_panelOpcionListarObrasMouseClicked

    private void panelOpcionListarObrasMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListarObrasMouseEntered
        panelOpcionListarObras.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_panelOpcionListarObrasMouseEntered

    private void panelOpcionListarObrasMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionListarObrasMouseExited
        panelOpcionListarObras.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_panelOpcionListarObrasMouseExited

    private void txtCorreoEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoEmpleadoActionPerformed

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

    private void btnContratarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratarActionPerformed

    }//GEN-LAST:event_btnContratarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

    }//GEN-LAST:event_btnLimpiarActionPerformed

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

    private void panelOpcionContratarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionContratarMouseClicked
        TabbedAdmin.setSelectedIndex(0);
    }//GEN-LAST:event_panelOpcionContratarMouseClicked

    private void panelOpcionContratarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionContratarMouseEntered
        panelOpcionContratar.setBackground(new Color(70, 130, 180));
    }//GEN-LAST:event_panelOpcionContratarMouseEntered

    private void panelOpcionContratarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelOpcionContratarMouseExited
        panelOpcionContratar.setBackground(new Color(0, 51, 102));
    }//GEN-LAST:event_panelOpcionContratarMouseExited

    private void txtPresupuestoMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPresupuestoMinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPresupuestoMinActionPerformed

    private void datePickerFechaFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datePickerFechaFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datePickerFechaFinActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        limpiarFiltros();
        try {
            List<Proyecto> proyectos = proyectoController.obtenerTodosLosProyectos();
            cargarProyectosEnTabla(proyectos);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al cargar proyectos: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBusquedaAvanzadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedaAvanzadaActionPerformed
        filtrarTablaProyectosAvanzado();
    }//GEN-LAST:event_btnBusquedaAvanzadaActionPerformed

    private void menuItemVerDetallesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuItemVerDetallesActionPerformed
        
try {
    int fila = jXTableProyectos.getSelectedRow();
    if (fila != -1) {
        Proyecto proyecto = obtenerProyectoDesdeFila(fila);
        if (proyecto != null) {
            JDialogVerDetallesProyecto dialogo = new JDialogVerDetallesProyecto(this, true);
            dialogo.mostrarProyecto(proyecto);
            dialogo.setLocationRelativeTo(this);
            dialogo.setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo obtener la información del proyecto.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Selecciona un proyecto de la tabla.", "Aviso", JOptionPane.WARNING_MESSAGE);
    }
} catch (ProyectoNoEncontradoException e) {
    JOptionPane.showMessageDialog(this, e.getMessage(), "Proyecto no encontrado", JOptionPane.ERROR_MESSAGE);
} catch (Exception ex) {
    Logger.getLogger(AdministradorWindown.class.getName()).log(Level.SEVERE, null, ex);
}


    }//GEN-LAST:event_menuItemVerDetallesActionPerformed

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
            java.util.logging.Logger.getLogger(AdministradorWindown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdministradorWindown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdministradorWindown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdministradorWindown.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdministradorWindown().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker DatePickFechaEstimada;
    private javax.swing.JPopupMenu PopupMenuProyectos;
    private javax.swing.JTabbedPane TabbedAdmin;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnBusquedaAvanzada;
    private javax.swing.JButton btnContratar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnLimpiarCampos;
    private javax.swing.JCheckBox chkCoincidenciaMayusculas;
    private javax.swing.JComboBox<String> cmbFiltro;
    private javax.swing.JComboBox<String> cmbPrioridad;
    private javax.swing.JComboBox<String> cmbPuestoTrabajo;
    private javax.swing.JComboBox<String> cmbTipoIdentificacion;
    private javax.swing.JComboBox<String> cmbTiporeparacion;
    private org.jdesktop.swingx.JXDatePicker datePickerFechaFin;
    private org.jdesktop.swingx.JXDatePicker datePickerFechaInicio;
    private javax.swing.JLabel etiApellidoEmpleado;
    private javax.swing.JLabel etiCodigo;
    private javax.swing.JLabel etiCorreoEmpleado;
    private org.jdesktop.swingx.JXLabel etiDescripcion;
    private org.jdesktop.swingx.JXLabel etiDetallesTecnicos;
    private javax.swing.JLabel etiDireccionProyecto;
    private javax.swing.JLabel etiEncabezadoAdmin;
    private javax.swing.JLabel etiFechaEstimada;
    private javax.swing.JLabel etiFechaFin;
    private javax.swing.JLabel etiFechaInicio;
    private javax.swing.JLabel etiIdentificacionEmpleado;
    private javax.swing.JLabel etiNombre;
    private javax.swing.JLabel etiNombreProyecto;
    private javax.swing.JLabel etiObligatorioCodigo;
    private javax.swing.JLabel etiObligatorioDireccion;
    private javax.swing.JLabel etiObligatorioFechaEstimada;
    private javax.swing.JLabel etiObligatorioNombre;
    private javax.swing.JLabel etiObligatorioPresupuesto;
    private javax.swing.JLabel etiObligatorioPrioridad;
    private javax.swing.JLabel etiObligatorioTipoReparacion;
    private javax.swing.JLabel etiOpcionContratar;
    private javax.swing.JLabel etiOpcionEmpleados;
    private javax.swing.JLabel etiOpcionIcon;
    private javax.swing.JLabel etiOpcionListarObras;
    private javax.swing.JLabel etiOpcionProyectos;
    private javax.swing.JLabel etiPresupuesto;
    private javax.swing.JLabel etiPresupuestoMax;
    private javax.swing.JLabel etiPresupuestoMin;
    private javax.swing.JLabel etiPrioridadProyecto;
    private javax.swing.JLabel etiPuestoTrabajo;
    private javax.swing.JLabel etiSalario;
    private org.jdesktop.swingx.JXLabel etiSeccionDatosGenerales;
    private org.jdesktop.swingx.JXLabel etiSeccionPlanificacion;
    private javax.swing.JLabel etiTelefono;
    private javax.swing.JLabel etiTipoIdentificacion;
    private javax.swing.JLabel etiTipoReparacion;
    private javax.swing.JTable jTable_Empleados;
    private org.jdesktop.swingx.JXTable jXTableProyectos;
    private javax.swing.JMenuItem menuItemEditar;
    private javax.swing.JMenuItem menuItemEliminar;
    private javax.swing.JMenuItem menuItemVerDetalles;
    private javax.swing.JPanel panelBarraOpciones;
    private javax.swing.JPanel panelBase;
    private javax.swing.JPanel panelBuscador;
    private javax.swing.JPanel panelContratar;
    private javax.swing.JPanel panelCrearProyecto;
    private javax.swing.JPanel panelEmpleados;
    private javax.swing.JPanel panelEncabezado;
    private javax.swing.JPanel panelFormularioContrato;
    private javax.swing.JPanel panelFormularioProyecto;
    private javax.swing.JPanel panelOpcionContratar;
    private javax.swing.JPanel panelOpcionEmpleados;
    private javax.swing.JPanel panelOpcionListarObras;
    private javax.swing.JPanel panelOpcionProyectos;
    private javax.swing.JPanel panelVerProyectos;
    private javax.swing.JScrollPane scrollArea;
    private javax.swing.JScrollPane scrollEmpleados;
    private javax.swing.JScrollPane scrollProyectos;
    private javax.swing.JSeparator separadorApellido;
    private javax.swing.JSeparator separadorCodigo;
    private javax.swing.JSeparator separadorCorreo;
    private javax.swing.JSeparator separadorDireccionProyecto;
    private javax.swing.JSeparator separadorIdentificacion;
    private javax.swing.JSeparator separadorNombre;
    private javax.swing.JSeparator separadorNombreProyecto;
    private javax.swing.JSeparator separadorPresupuesto;
    private javax.swing.JSeparator separadorSalario;
    private javax.swing.JSeparator separadorSeccion1;
    private javax.swing.JSeparator separadorSeccion2;
    private javax.swing.JSeparator separadorSecction3;
    private javax.swing.JSeparator separadorTelefono;
    private javax.swing.JTextField txtApellido;
    private org.jdesktop.swingx.JXTextArea txtArea;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCorreoEmpleado;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdentificacion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtNombreEmpleado;
    private javax.swing.JTextField txtPresupuesto;
    private javax.swing.JTextField txtPresupuestoMax;
    private javax.swing.JTextField txtPresupuestoMin;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
private void configurarTablaProyectos() {
    jXTableProyectos.setColumnControlVisible(true);
    jXTableProyectos.setHorizontalScrollEnabled(true);
    jXTableProyectos.setShowGrid(true);
    jXTableProyectos.setGridColor(new Color(60, 60, 60)); // Gris discreto

    jXTableProyectos.setRowHeight(30);
    jXTableProyectos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

    // Fondo y texto del cuerpo de la tabla
    jXTableProyectos.setBackground(new Color(0, 40, 30)); // Verde oscuro consistente con el fondo
    jXTableProyectos.setForeground(Color.WHITE);

    // Selección
    jXTableProyectos.setSelectionBackground(new Color(30, 144, 255)); // Azul brillante
    jXTableProyectos.setSelectionForeground(Color.BLACK);

    // Encabezado
    JTableHeader header = jXTableProyectos.getTableHeader();
    header.setBackground(new Color(0, 0, 50)); // Azul oscuro elegante
    header.setForeground(new Color(255, 215, 0)); // Dorado para destacar
    header.setFont(new Font("Segoe UI", Font.BOLD, 14));
    header.setOpaque(true);

    // Tipografía general
    jXTableProyectos.setFont(new Font("Segoe UI", Font.PLAIN, 13));
}

    private void configurarBuscador() {
        cmbFiltro.setModel(new DefaultComboBoxModel<>(new String[]{
            "Código", "Nombre", "Prioridad", "Tipo", "Estado", "Dirección", "Fecha Fin", "Descripción"
        }));
        cmbFiltro.setSelectedIndex(0);

        btnBuscar.setText("🔎 Buscar");
        btnBuscar.setBackground(new Color(0, 120, 215));
        btnBuscar.setForeground(Color.WHITE);
        btnBuscar.setFont(new Font("Segoe UI", Font.BOLD, 12));

        btnBuscar.addActionListener(e -> filtrarTablaProyectos());
    }

    private void filtrarTablaProyectos() {
        String criterio = cmbFiltro.getSelectedItem().toString().toLowerCase();
        String texto = txtBuscar.getText().trim();

        if (texto.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un texto para buscar.", "Advertencia", JOptionPane.WARNING_MESSAGE);
            return;
        }

        boolean distinguirMayus = chkCoincidenciaMayusculas.isSelected();
        if (!distinguirMayus) {
            texto = texto.toLowerCase();
        }

        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jXTableProyectos.getModel());
        jXTableProyectos.setRowSorter(sorter);

        final String textoFinal = texto;

        RowFilter<Object, Object> filtro = new RowFilter<>() {
            public boolean include(Entry<?, ?> entry) {
                String valor = "";
                switch (criterio) {
                    case "código" ->
                        valor = entry.getStringValue(0);
                    case "nombre" ->
                        valor = entry.getStringValue(1);
                    case "dirección" ->
                        valor = entry.getStringValue(2);
                    case "tipo" ->
                        valor = entry.getStringValue(3);
                    case "prioridad" ->
                        valor = entry.getStringValue(4);
                    case "estado" ->
                        valor = entry.getStringValue(5);
                    case "presupuesto" ->
                        valor = entry.getStringValue(6);
                    case "fecha fin" ->
                        valor = entry.getStringValue(8);
                    case "descripción" ->
                        valor = entry.getStringValue(9);
                }
                if (!distinguirMayus && valor != null) {
                    valor = valor.toLowerCase();
                }
                return valor != null && valor.contains(textoFinal);
            }
        };
        sorter.setRowFilter(filtro);
    }

    private void filtrarTablaProyectosAvanzado() {
        TableRowSorter<TableModel> sorter = new TableRowSorter<>(jXTableProyectos.getModel());
        jXTableProyectos.setRowSorter(sorter);

        List<RowFilter<Object, Object>> filtros = new ArrayList<>();

        // Obtener fechas directamente desde el DatePicker (no del editor de texto)
        Date fechaInicio = datePickerFechaInicio.getDate();
        Date fechaFin = datePickerFechaFin.getDate();

        // Columnas:
        int colPresupuesto = 6; // ✅ Confirma que Presupuesto está en columna 6
        int colFechaInicio = 7; // ✅ Confirma que Fecha Inicio está en columna 7

        if (fechaInicio != null) {
            filtros.add(RowFilter.dateFilter(RowFilter.ComparisonType.AFTER, new java.sql.Date(fechaInicio.getTime() - 1), colFechaInicio));
        }

        if (fechaFin != null) {
            filtros.add(RowFilter.dateFilter(RowFilter.ComparisonType.BEFORE, new java.sql.Date(fechaFin.getTime() + 1), colFechaInicio));
        }

        try {
            String presupuestoMinStr = txtPresupuestoMin.getText().trim();
            String presupuestoMaxStr = txtPresupuestoMax.getText().trim();

            if (!presupuestoMinStr.isEmpty()) {
                double min = Double.parseDouble(presupuestoMinStr);
                filtros.add(RowFilter.numberFilter(RowFilter.ComparisonType.AFTER, min - 0.01, colPresupuesto));
            }

            if (!presupuestoMaxStr.isEmpty()) {
                double max = Double.parseDouble(presupuestoMaxStr);
                filtros.add(RowFilter.numberFilter(RowFilter.ComparisonType.BEFORE, max + 0.01, colPresupuesto));
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Formato de presupuesto inválido (usa solo números)");
            return;
        }

        // Aplicar filtro compuesto solo si hay al menos un filtro
        if (!filtros.isEmpty()) {
            RowFilter<Object, Object> filtroCompuesto = RowFilter.andFilter(filtros);
            sorter.setRowFilter(filtroCompuesto);
        } else {
            sorter.setRowFilter(null); // Mostrar todo si no hay filtros
        }
    }

    private void limpiarFiltros() {
        jXTableProyectos.setRowSorter(null); // Esto remueve cualquier filtro activo

        // También limpiamos campos de búsqueda si quieres:
        txtBuscar.setText("");
        txtPresupuestoMin.setText("");
        txtPresupuestoMax.setText("");
        datePickerFechaInicio.setDate(null);
        datePickerFechaFin.setDate(null);
        chkCoincidenciaMayusculas.setSelected(false);
        cmbFiltro.setSelectedIndex(0);
    }

    private void cargarProyectosEnTabla(List<Proyecto> proyectos) {
        DefaultTableModel modelo = (DefaultTableModel) jXTableProyectos.getModel();
        modelo.setRowCount(0);

        for (Proyecto p : proyectos) {
            modelo.addRow(new Object[]{
                p.getCodigo(),
                p.getNombre(),
                p.getDireccion(),
                p.getTipoReparacion(),
                p.getPrioridad(),
                p.getEstado(),
                p.getPresupuesto(), // Double
                java.sql.Date.valueOf(p.getFechaInicio()), // ✅ conversión a Date
                java.sql.Date.valueOf(p.getFechaFinEstimada()), // ✅ conversión a Date
                p.getDescripcion()
            });
        }
    }

    private Proyecto obtenerProyectoDesdeFila(int fila) throws ProyectoNoEncontradoException, Exception {
        int filaModelo = jXTableProyectos.convertRowIndexToModel(fila);
        String codigo = jXTableProyectos.getModel().getValueAt(filaModelo, 0).toString();
        Proyecto proyecto = servicio.buscarProyectoPorId(codigo);

        if (proyecto == null) {
            throw new ProyectoNoEncontradoException("No se encontró el proyecto con código: " + codigo);
        }

        return proyecto;
    }
   
private void configurarComportamientoTablaConClickDerecho() {
    jXTableProyectos.addMouseListener(new MouseAdapter() {
        private void mostrarMenuSiEsNecesario(MouseEvent e) {
            int fila = jXTableProyectos.rowAtPoint(e.getPoint());
            if (fila != -1) {
                jXTableProyectos.setRowSelectionInterval(fila, fila); // Selecciona la fila
                PopupMenuProyectos.show(e.getComponent(), e.getX(), e.getY()); // Muestra el menú
            } else {
                jXTableProyectos.clearSelection();
            }
        }

        @Override
        public void mousePressed(MouseEvent e) {
            if (e.isPopupTrigger()) {
                mostrarMenuSiEsNecesario(e);
            }
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            if (e.isPopupTrigger()) {
                mostrarMenuSiEsNecesario(e);
            }
        }
    });
}



    
}
