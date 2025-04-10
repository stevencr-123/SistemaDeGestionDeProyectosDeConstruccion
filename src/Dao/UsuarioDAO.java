
package Dao;

import Model.RolSistema;
import Model.Usuario;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;

public class UsuarioDAO {

    private static final String JSON_FILE = "C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\GestionParaProyectosDeConstruccion\\src\\Resource\\data\\usuarios.json";
    
    public Usuario validarCredenciales (String email, String password){
        try (FileReader reader = new FileReader(JSON_FILE)){
            JsonObject jsonObject = JsonParser.parseReader(reader).getAsJsonObject();
            JsonArray usuariosJson = jsonObject.getAsJsonArray("usuarios");
            
            for (int i = 0; i < usuariosJson.size(); i++) { 
                JsonObject usuarioJson = usuariosJson.get(i).getAsJsonObject();
                
                String userEmail = usuarioJson.get("email").getAsString();
                String userPassword = usuarioJson.get("password").getAsString();
                
                if (userEmail.equals(email) && userPassword.equals(password)){
                    RolSistema rol = RolSistema.valueOf(usuarioJson.get("rol").getAsString());
                    return new Usuario(userEmail, userPassword, rol);
                    
                }
                
            }
        } catch (Exception e){
            e.printStackTrace();
        }
        return null;
        
    }
    
    public boolean esAdministrador (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.ADMINISTRADOR;
    }
    
    public boolean esFuncionarioPublico (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.FUNCIONARIO_PUBLICO;
    }
    
    public boolean esObrero (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.OBRERO;
    }
    
    public boolean esCiudadano (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.CIUDADANO;
    }
    
    public boolean esInspectorMunicipal (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.INSPECTOR_MUNICIPAL;
    }
    
    public boolean esPromotor (Usuario usuario){
        return usuario != null && usuario.getRol() == RolSistema.PROMOTOR;
    }
    
}

