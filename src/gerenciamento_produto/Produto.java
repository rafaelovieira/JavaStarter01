package gerenciamento_produto;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;

    public Produto(String nome, double preco, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void detalhesProduto() {
        System.out.println("====================");
        System.out.println("Produto: " + nome);
        System.out.println("Preço: R$" + preco);
        System.out.println("Quantidade em estoque: " + quantidadeEstoque);
        System.out.println("Valor total em estoque: R$" + valorEstoque());
        System.out.println("====================");
    }

    public void adicionarEstoque(int qtd) {
        this.quantidadeEstoque += qtd;
        System.out.println("Foi adicionado " + qtd + " unidades ao estoque.");
    }

    public void removerEstoque(int qtd) {
        if (qtd <= quantidadeEstoque) {
            this.quantidadeEstoque -= qtd;
            System.out.println("Foi retirado " + qtd + " unidades do estoque.");
        } else {
            System.out.println("Quantidade insulficiente, o estoque consta apenas " + quantidadeEstoque + " unidades!");
        }

    }

    public double valorEstoque() {
        return preco * quantidadeEstoque;
    }

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


}
