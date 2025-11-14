package exercicios.aula2.sistema_pedidos_restaurante;

public class Pedido {
    private int numeroPedido;
    private String dataPedido;
    private Item item;

    public Pedido(int numeroPedido,  String dataPedido, Item item) {
        this.numeroPedido = numeroPedido;
        this.dataPedido = dataPedido;
        this.item = item;
    }

    public void adicionarItem(Item item) {
        this.item = item;
    }

    public double calcularTotalPedido() {
        return item.getPrecoUnitario() * item.getQuantidade();
    }

    public void exibirResumo() {
        System.out.println("Pedido nº " + numeroPedido);
        System.out.println("Data: " + dataPedido);
        System.out.println("Item do pedido:");

        System.out.println("Total do pedido: R$ " + calcularTotalPedido());
        System.out.println("---------------------------------------");
    }
}
