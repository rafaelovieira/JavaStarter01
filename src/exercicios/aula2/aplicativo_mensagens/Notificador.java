package exercicios.aula2.aplicativo_mensagens;

public class Notificador {

    //Classe que Demonstra Polimorfismo

    public void enviarMensagem(Mensagem msg, String texto) {
        msg.enviar(texto); // Polimorfismo
    }
}
