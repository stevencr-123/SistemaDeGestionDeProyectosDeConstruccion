package DAO;

import Model.ReporteFuncionario;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.*;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioPublicoDAO {
    private List<ReporteFuncionario> reportes = new ArrayList<>();
    
    
    private static final String ARCHIVO_JSON = "C:\\Users\\Camilo Jurado\\OneDrive\\Desktop\\SistemaDeGestionDeProyectosDeConstruccion\\src\\Resource\\data\\reportes_funcionarios.json";

    private final Gson gson = new Gson();

    public FuncionarioPublicoDAO() {
        cargarDesdeJSON();  
    }

    public void agregarReporte(ReporteFuncionario reporte) {
        reportes.add(reporte);
        guardarEnJSON();
    }

    public List<ReporteFuncionario> obtenerReportesPorCodigo(String codigoProyecto) {
        List<ReporteFuncionario> resultado = new ArrayList<>();
        for (ReporteFuncionario r : reportes) {
            if (r.getCodigoProyecto().equals(codigoProyecto)) {
                resultado.add(r);
            }
        }
        return resultado;
    }

    public List<ReporteFuncionario> obtenerTodos() {
        return reportes;
    }

    private void guardarEnJSON() {
    try {
        File archivo = new File(ARCHIVO_JSON);
        File carpetaPadre = archivo.getParentFile();

        if (carpetaPadre != null && !carpetaPadre.exists()) {
            carpetaPadre.mkdirs(); 
        }

        try (Writer writer = new FileWriter(archivo)) {
            gson.toJson(reportes, writer);
        }
    } catch (IOException e) {
        e.printStackTrace();
    }
}


    private void cargarDesdeJSON() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            Type tipoLista = new TypeToken<List<ReporteFuncionario>>() {}.getType();
            reportes = gson.fromJson(reader, tipoLista);
            if (reportes == null) reportes = new ArrayList<>();
        } catch (FileNotFoundException e) {
            
            reportes = new ArrayList<>();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
