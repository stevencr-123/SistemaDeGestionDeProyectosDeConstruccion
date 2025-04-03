
package Dao;

import Model.RolSistema;
import Model.Usuario;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.FileReader;
public class UsuarioDAO {

    private static final String JSON_FILE = "C:\\Users\\HP\\OneDrive\\Documentos\\NetBeansProjects\\GestionParaProyectosDeConstruccion\\src\\Resource\\usuarios.json";
    
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
    
}

