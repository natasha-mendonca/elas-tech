package Aula25_10.Lambda5;

public class Main {
    static void mostrarResultado(Operacao op, int valor){
        System.out.println(op.aplicar(valor));
    }

    public static void main(String[] args) {

        mostrarResultado((valor) -> valor*2, 5);
    }
}
