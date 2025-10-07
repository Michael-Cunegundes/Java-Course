package lambdas.mass;

import java.util.HashMap;
import java.util.Map;

public class Capitais {

    public static void main(String[] args) {

        Map<String, String> cidades = new HashMap<>();

        cidades.put("Brasil", "Brasilia");
        cidades.put("Dinamarca", "Copenhague");
        cidades.put("Argentina", "Bueno Aires");


        System.out.println(cidades.keySet());

    }

}
