package exercicios.aula2.sistema_vendas;

public class VendaAvista extends Venda {
    private double percentualDesconto;
    private double valorBase;

    public VendaAvista(double valorBase, double percentualDesconto) {
        this.percentualDesconto = percentualDesconto;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularTotal() {
        double desconto = valorBase * (percentualDesconto / 100);
        return valorBase - desconto;
    }
}
