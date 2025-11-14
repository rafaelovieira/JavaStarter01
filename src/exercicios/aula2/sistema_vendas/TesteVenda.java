package exercicios.aula2.sistema_vendas;

public class TesteVenda {
    public static void main(String[] args) {

        Venda vendaAvista = new VendaAvista(100.0, 10);

        Venda vendaParcelada = new VendaParcelada(100.0, 3, 2);

        System.out.println("Total Venda à vista R$: " + vendaAvista.calcularTotal());
        System.out.println("Total Venda parcelada R$: " + vendaParcelada.calcularTotal());
    }
}
