package exercicios.aula2.gerenciamento_produto;

public class Loja {
    public static void main(String[] args) {
        Produto p1 = new Produto("Café Expresso", 8.50, 10);
        Produto p2 = new Produto("Cappuccino", 12.00, 5);

        p1.exibirInformacoes();
        p2.exibirInformacoes();

        p1.adicionarEstoque(5);
        p1.exibirInformacoes();

        p2.removerEstoque(2);
        p2.exibirInformacoes();
    }
}
