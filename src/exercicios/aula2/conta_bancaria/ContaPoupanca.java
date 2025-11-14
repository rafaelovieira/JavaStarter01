package exercicios.aula2.conta_bancaria;

public class ContaPoupanca extends Conta {
    private double taxaJuros;

    public ContaPoupanca(String numero, String titular, double saldoInicial, double taxaJuros) {
        super(numero, titular, saldoInicial, "Poupança");
        this.taxaJuros = taxaJuros;
    }

    public void aplicarJurosMensais() {
        double rendimento = saldo * (taxaJuros / 100);
        saldo += rendimento;
        System.out.println("Juros aplicados: R$ " + rendimento);
    }
}
