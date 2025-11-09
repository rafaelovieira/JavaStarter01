package encapsulamento;

public class Main {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Café Soluvel", 100.0);
        cafe.exibirCafe();
        cafe.setTemperatura(50.0);
        cafe.setTipo("Café forte");
        cafe.exibirCafe();

    }
}
