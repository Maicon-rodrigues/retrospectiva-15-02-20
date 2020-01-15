import java.util.HashMap;
import java.util.Map;

public class Paises {
    public static void main(String[] args) {

        Map<String, String> mapaMundo = new HashMap<>();

        mapaMundo.put("Brasil", "Brasilia");
        mapaMundo.put("Argentina", "Buenos Aires");
        mapaMundo.put("Espanha", "Madrid");
        mapaMundo.put("Peru", "Lima");
        mapaMundo.put("Italia", "Roma");

        System.out.println(mapaMundo);
        if (mapaMundo.containsKey("Brasil")){
            System.out.println("ola, Brasil");

        }
    }
}