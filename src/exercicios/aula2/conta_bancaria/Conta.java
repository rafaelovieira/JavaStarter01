package exercicios.aula2.conta_bancaria;

public class Conta {
    protected String numero;
    protected String titular;
    protected double saldo;
    protected String tipoConta;

    public Conta(String numero, String titular, double saldoInicial, String tipoConta) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldoInicial;
        this.tipoConta = tipoConta;
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void exibirSaldo() {
        System.out.println("Conta "+ tipoConta);
        System.out.println("Conta: " + numero + " | Titular: " + titular);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("--------------------------");
    }
}
