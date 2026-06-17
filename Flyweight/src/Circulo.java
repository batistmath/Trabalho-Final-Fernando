// FLYWEIGHT — objeto compartilhado, a cor não muda
public class Circulo {

    private String cor; // estado intrínseco (compartilhado)

    public Circulo(String cor) {
        this.cor = cor;
        System.out.println(">> Criando objeto Circulo de cor: " + cor);
    }

    // x, y, raio são estado extrínseco (chegam de fora, mudam a cada chamada)
    public void desenhar(int x, int y, int raio) {
        System.out.println("Circulo [" + cor + "] em (" + x + ", " + y + ") raio=" + raio);
    }
}
