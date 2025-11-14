package exercicios.aula2.gerenciamento_produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    // Construtor
    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Métodos para encapsulamento (getters e setters)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    // Método para exibir informações do produto
    public void exibirInformacoes() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$ " + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$ " + calcularValorTotal());
        System.out.println("----------------------------");
    }

    // Método para adicionar produtos ao estoque
    public void adicionarEstoque(int quantidade) {
        quantidadeEstoque += quantidade;
        System.out.println(quantidade + " unidades adicionadas ao estoque.");
    }

    // Método para remover produtos do estoque
    public void removerEstoque(int quantidade) {
        if (quantidade <= quantidadeEstoque) {
            quantidadeEstoque -= quantidade;
            System.out.println(quantidade + " unidades removidas do estoque.");
        } else {
            System.out.println("Estoque insuficiente!");
        }
    }

    // Método para calcular o valor total em estoque
    public double calcularValorTotal() {
        return preco * quantidadeEstoque;
    }
}
