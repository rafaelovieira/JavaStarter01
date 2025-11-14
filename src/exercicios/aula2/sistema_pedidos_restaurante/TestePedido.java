package exercicios.aula2.sistema_pedidos_restaurante;

public class TestePedido {
    public static void main(String[] args) {

        Item item1 = new Item("Café Expresso", 2, 5.50);
        Item item2 = new Item("Pão de Queijo", 3, 4.00);
        Item item3 = new Item("Suco de Laranja", 1, 7.50);

        Pedido pedidoJoao = new Pedido(101, "13/11/2025", item1);
        Pedido pedidoMaria = new Pedido(102, "10/11/2025", item2);
        Pedido pedidoJose = new Pedido(103, "01/12/2025", item3);

        pedidoJoao.exibirResumo();
        pedidoMaria.exibirResumo();
        pedidoJose.exibirResumo();
    }
}
