package resolucao_gerenciamento_produto;

public class Loja {
    public static void main(String[] args) {
        Produto p[] = new Produto[3];

        p[0] = new Produto("Notebook", 2000, 3);
        p[1] = new Produto("Teclado", 150, 5);
        p[2] = new Produto("Mouse", 59.99, 10);

        p[0].detalhesProduto();
        p[0].adicionarEstoque(4);
        p[0].detalhesProduto();
    }
}
