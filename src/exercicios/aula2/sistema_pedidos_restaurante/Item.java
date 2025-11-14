package exercicios.aula2.sistema_pedidos_restaurante;

public class Item {
    private String descricao;
    private int quantidade;
    private double precoUnitario;

    public Item(String descricao, int quantidade, double precoUnitario) {
        this.descricao = descricao;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public double calcularTotal() {
        return quantidade * precoUnitario;
    }

    public void exibirItem() {
        System.out.println("- " + descricao);
        System.out.println("  Quantidade: " + quantidade);
        System.out.println("  Preço unitário: R$ " + precoUnitario);
        System.out.println("  Total do item: R$ " + calcularTotal());
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
}
