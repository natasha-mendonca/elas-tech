package Aula25_10.Lambda4;

public class Main {
    static void  repetirAcao (Acao acao){
        acao.executar();
        acao.executar();
    }

    public static void main(String[] args) {
        repetirAcao(() -> System.out.println("Oi"));
    }
}
