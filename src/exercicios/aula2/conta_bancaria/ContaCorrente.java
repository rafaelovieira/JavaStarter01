package exercicios.aula2.conta_bancaria;

public class ContaCorrente extends Conta {
    private double taxaOperacao;

    public ContaCorrente(String numero, String titular, double saldoInicial, double taxaOperacao) {
        super(numero, titular, saldoInicial, "Corrente");
        this.taxaOperacao = taxaOperacao;
    }

    @Override
    public void sacar(double valor) {
        double valorTotal = valor + taxaOperacao;

        if (valorTotal <= saldo) {
            saldo -= valorTotal;
            System.out.println("Saque: R$ " + valor + " | Taxa: R$ " + taxaOperacao);
        } else {
            System.out.println("Saldo insuficiente para saque + taxa!");
        }
    }
}
