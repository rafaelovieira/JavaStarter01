package resolucao_sistema_vendas;

public class VendaAvista extends Venda {
    private double valor;
    private double percentualDesconto;

    public VendaAvista(double valor, double percentualDesconto) {
        this.valor = valor;
        this.percentualDesconto = percentualDesconto;
    }

    @Override
    public double calcularTotal() {
        double desconto = valor * (percentualDesconto / 100);
        return valor - desconto;
    }
}
