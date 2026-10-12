package POO;

public class Gerente extends Funcionario implements Notificavel, Exportavel{

    void aprovarFerias (String quem) {
        System.out.println("Hoje eu preciso aprovar as férias do " + quem);
    }

    public void notificar (String mensagem){
        System.out.println(mensagem);
        }
    public void exportar () {
        System.out.println("Bora exportar.");
        }

    }

