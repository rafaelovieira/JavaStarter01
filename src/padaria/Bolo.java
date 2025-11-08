package padaria;

public class Bolo {
    String sabor;
    int tamanho;
    double preco;

    public Bolo(String sabor, int tamanho, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public void exibirDetalhes(){
        System.out.println("Bolo de sabor:" + sabor + " tamanho: " + tamanho + " preco: " + preco);
    }
}
