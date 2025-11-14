package exercicios.aula2.aplicativo_mensagens;

public class WhatsApp extends Mensagem {
    private String numero;

    public WhatsApp(String numero) {
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        System.out.println("Enviando mensagem via WHATSAPP para " + numero + ": " + mensagem);
    }
}
