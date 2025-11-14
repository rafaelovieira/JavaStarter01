package exercicios.aula2.aplicativo_mensagens;

public class TesteMensagem {
    public static void main(String[] args) {
        Mensagem email = new Email("higor@email.com");
        Mensagem sms = new SMS("83 99999-8888");
        Mensagem whatsapp = new WhatsApp("83 98888-7777");

        Notificador notificador = new Notificador();

        notificador.enviarMensagem(email, "Sua tarefa foi enviada!");
        notificador.enviarMensagem(sms, "Seu código está funcionando!");
        notificador.enviarMensagem(whatsapp, "Parabéns, você aprendeu POO!");
    }
}
