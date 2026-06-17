public class Main {

    static String[] cores = { "Vermelho", "Verde", "Azul" };

    public static void main(String[] args) {

        System.out.println("=== Desenhando 9 círculos ===\n");

        for (int i = 1; i <= 9; i++) {
            String cor = cores[i % 3]; // alterna entre as 3 cores
            Circulo c = FabricaCirculo.getCirculo(cor);
            c.desenhar(i * 10, i * 5, i);
        }

        System.out.println("\n=== Resultado ===");
        System.out.println("Círculos desenhados : 9");
        System.out.println("Objetos criados     : " + FabricaCirculo.totalCriados());
        System.out.println("Economia            : " + (9 - FabricaCirculo.totalCriados()) + " objetos a menos na memória");
    }
}
