package Interface;

public class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println(mensagem);
    }

}
