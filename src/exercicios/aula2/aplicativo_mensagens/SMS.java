package exercicios.aula2.aplicativo_mensagens;

public class SMS extends Mensagem{
    private String numero;

    public SMS(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando SMS para " + numero + ": " + mensagem);
    }
}
