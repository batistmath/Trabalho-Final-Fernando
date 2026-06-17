import java.util.HashMap;

// FÁBRICA — guarda os círculos já criados, evita criar de novo
public class FabricaCirculo {

    private static HashMap<String, Circulo> cache = new HashMap<>();

    public static Circulo getCirculo(String cor) {
        if (!cache.containsKey(cor)) {
            cache.put(cor, new Circulo(cor));
        }
        return cache.get(cor); // retorna o existente
    }

    public static int totalCriados() {
        return cache.size();
    }
}
