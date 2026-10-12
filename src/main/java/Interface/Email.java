package Interface;

public class Email implements Notificacao{

    public void enviar (String mensagem) {
        System.out.println(mensagem);
    }
}
