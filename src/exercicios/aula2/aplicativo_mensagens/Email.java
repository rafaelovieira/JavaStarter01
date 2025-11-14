package exercicios.aula2.aplicativo_mensagens;

public class Email extends Mensagem{
    private String enderecoEmail;

    public Email(String enderecoEmail) {
        this.enderecoEmail = enderecoEmail;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando EMAIL para " + enderecoEmail + ": " + mensagem);
    }
}
