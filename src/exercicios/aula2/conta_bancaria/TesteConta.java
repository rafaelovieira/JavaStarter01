package exercicios.aula2.conta_bancaria;

public class TesteConta {
    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente("001", "João", 400.0, 2.5);
        ContaPoupanca cp = new ContaPoupanca("002", "Maria", 200.0, 0.5);

        cc.exibirSaldo();
        cc.sacar(100);
        cc.exibirSaldo();

        cp.exibirSaldo();
        cp.aplicarJurosMensais();
        cp.exibirSaldo();
    }
}
