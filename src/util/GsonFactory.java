
package util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.time.LocalDate;

public class GsonFactory {
    private static Gson instance;
    
    public static Gson getInstance() {
        if (instance == null) {
            instance = new GsonBuilder()
                .registerTypeAdapter(LocalDate.class, new LocalDateAdapter())
                .create();
        }
        return instance;
    }
}