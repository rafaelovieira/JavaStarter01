package resolucao_sistema_vendas;

public class Caixa {
    public static void main(String[] args) {
        Venda vendaAvista = new VendaAvista(10.99,15.0);
        Venda vendaParcelada = new VendaParcelada(10.99, 5.0);

        System.out.println("Total da Venda a Vista: R$" + vendaAvista.calcularTotal());
        System.out.println("Total da Venda Parcelada: R$" + vendaParcelada.calcularTotal());

    }
}
