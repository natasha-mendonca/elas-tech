package Aula25_10.Lambda3;

public class Main {
    public static void main(String[] args) {
        Calculo soma = (a,b) -> a + b;
        Calculo multiplicacao = (a,b) -> a * b;
        Calculo maiorQue = (a,b) ->Math.max(a,b);

        System.out.println(soma.calculo(10,10));
        System.out.println(multiplicacao.calculo(10,10));
        System.out.println(maiorQue.calculo(10,9));
    }
}
