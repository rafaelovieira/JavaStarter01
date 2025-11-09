package polimorfismo;

public class Main {
    public static void main(String[] args) {
        Bebida bebidaCafe = new Cafe();
        Bebida bebidaCha = new Cha();
        bebidaCafe.preparar();
        bebidaCha.preparar();

    }
}
