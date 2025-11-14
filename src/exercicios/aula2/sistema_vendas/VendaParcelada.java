package exercicios.aula2.sistema_vendas;

public class VendaParcelada extends Venda{
    private int quantidadeParcelas;
    private double jurosMensal;
    private double valorBase;

    public VendaParcelada(double valorBase, int quantidadeParcelas, double jurosMensal) {
        this.quantidadeParcelas = quantidadeParcelas;
        this.jurosMensal = jurosMensal;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularTotal() {
        double jurosTotal = valorBase * (jurosMensal / 100) * quantidadeParcelas;
        return valorBase + jurosTotal;
    }
}
