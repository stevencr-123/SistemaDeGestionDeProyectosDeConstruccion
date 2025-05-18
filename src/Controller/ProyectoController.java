package controller;

import model.EstadoProyecto;
import model.Prioridad;
import model.TipoReparacion;
import exceptions.FechaInvalidaException;
import exceptions.NombreProyectoExistenteException;
import exceptions.ProyectoNoEncontradoException;
import exceptions.ProyectoYaExisteException;
import model.Proyecto;
import exceptions.ValidacionException;
import javax.swing.*;
import java.time.LocalDate;
import java.time.ZoneId;
import service.interfaces.IProyectoService;

public class ProyectoController {

    private JTextField txtCodigo;
    private JTextField txtNombre;
    private JTextField txtDireccion;
    private JComboBox<String> cmbTiporeparacion;
    private JComboBox<String> cmbPrioridad;
    private JTextField txtPresupuesto;
    private org.jdesktop.swingx.JXDatePicker datePickFechaEstimada;
    private org.jdesktop.swingx.JXTextArea  txtDescripcion;
    private IProyectoService proyectoService;

    
    // Constructor adicional en ProyectoController
public ProyectoController(IProyectoService proyectoService) {
    this.proyectoService = proyectoService;
}

    
public ProyectoController(JTextField txtCodigo, JTextField txtNombre, JTextField txtDireccion,
                          JComboBox<String> cmbTiporeparacion, JComboBox<String> cmbPrioridad,
                          JTextField txtPresupuesto, org.jdesktop.swingx.JXDatePicker datePickFechaEstimada,
                          org.jdesktop.swingx.JXTextArea txtDescripcion,IProyectoService proyectoService) {
    this.txtCodigo = txtCodigo;
    this.txtNombre = txtNombre;
    this.txtDireccion = txtDireccion;
    this.cmbTiporeparacion = cmbTiporeparacion;
    this.cmbPrioridad = cmbPrioridad;
    this.txtPresupuesto = txtPresupuesto;
    this.datePickFechaEstimada = datePickFechaEstimada;
    this.txtDescripcion = txtDescripcion;
    this.proyectoService = proyectoService;
}

    public Proyecto extraerDatosFormulario() throws ValidacionException {
        String codigo = txtCodigo.getText().trim();
        String nombre = txtNombre.getText().trim();
        String direccion = txtDireccion.getText().trim();
        String tipoReparacionStr = (String) cmbTiporeparacion.getSelectedItem();
        String prioridadStr = (String) cmbPrioridad.getSelectedItem();
        String presupuestoTexto = txtPresupuesto.getText().trim();
        java.util.Date fechaUtil = datePickFechaEstimada.getDate();
        String descripcion = txtDescripcion.getText().trim();

        // Validaciones
        if (codigo.isEmpty() || nombre.isEmpty() || direccion.isEmpty() || presupuestoTexto.isEmpty() || descripcion.isEmpty()) {
            throw new ValidacionException("Todos los campos marcados con * son obligatorios.");
        }

        if (tipoReparacionStr == null || tipoReparacionStr.isBlank()) {
            throw new ValidacionException("Debe seleccionar un tipo de reparación.");
        }

        if (prioridadStr == null || prioridadStr.isBlank()) {
            throw new ValidacionException("Debe seleccionar una prioridad.");
        }

        if (fechaUtil == null) {
            throw new ValidacionException("Debe seleccionar una fecha de finalización.");
        }

        double presupuesto;
        try {
            presupuesto = Double.parseDouble(presupuestoTexto);
            if (presupuesto < 0) {
                throw new ValidacionException("El presupuesto no puede ser negativo.");
            }
        } catch (NumberFormatException e) {
            throw new ValidacionException("El presupuesto debe ser un número válido.");
        }

        // Conversión de tipos
        TipoReparacion tipoReparacion = TipoReparacion.valueOf(tipoReparacionStr.toUpperCase().replace(" ", "_"));
        Prioridad prioridad = Prioridad.valueOf(prioridadStr.toUpperCase());
        EstadoProyecto estado = EstadoProyecto.PLANEACION;
        LocalDate fechaFinEstimada = fechaUtil.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaInicio = LocalDate.now(); // puedes ajustarla si lo deseas

        return new Proyecto(
                codigo,
                nombre,
                direccion,
                tipoReparacion,
                fechaInicio,
                fechaFinEstimada,
                prioridad,
                presupuesto,
                estado,
                descripcion
        );
    }

    public void limpiarFormulario() {
        txtCodigo.setText("");
        txtNombre.setText("");
        txtDireccion.setText("");
        cmbTiporeparacion.setSelectedIndex(0);
        cmbPrioridad.setSelectedIndex(0);
        txtPresupuesto.setText("");
        datePickFechaEstimada.setDate(null);
        txtDescripcion.setText("");
    }
    
   public void crearProyecto() throws ValidacionException,
                                   ProyectoYaExisteException,
                                   NombreProyectoExistenteException,
                                   FechaInvalidaException,
                                   Exception {
    Proyecto proyecto = extraerDatosFormulario();
    proyectoService.crearProyecto(proyecto);
    limpiarFormulario();
    JOptionPane.showMessageDialog(null, "Proyecto creado correctamente.", "Éxito", JOptionPane.INFORMATION_MESSAGE);
}

public java.util.List<Proyecto> obtenerTodosLosProyectos() throws Exception {
    return proyectoService.obtenerTodos();
}

public void eliminarProyecto(String codigo) throws ProyectoNoEncontradoException, Exception {
        proyectoService.eliminarProyecto(codigo);
    }

public void actualizarProyecto(Proyecto proyecto) throws Exception {
    proyectoService.actualizarProyecto(proyecto);
}


}
