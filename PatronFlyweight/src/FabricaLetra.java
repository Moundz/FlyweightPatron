import java.util.HashMap;
import java.util.Map;

public class FabricaLetra {
    private static final Map<String, FlyweightLetra> pool = new HashMap<>();

    public static FlyweightLetra obtenerFlyweight(String caracter) {
        pool.putIfAbsent(caracter, new LetraConcreta(caracter));
        return pool.get(caracter);
    }

}
