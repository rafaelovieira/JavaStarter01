package sorvete;

public class Sorvete {
    String sabor;
    double preco;
    int tamanho;
    String fabricante;
    boolean estoque;

    public Sorvete(String sabor, double preco, int tamanho, String fabricante, boolean estoque){
        this.sabor = sabor;
        this.preco = preco;
        this.tamanho = tamanho;
        this.fabricante = fabricante;
        this.estoque = estoque;
    }

    public void exibirSorvete(){
        System.out.println("Sorvete sabor " +sabor+ " preco: " + preco + " fabricante: " + fabricante + " estoque disponivel: " + estoque);
    }
}
