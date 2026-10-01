package org.example;

public class ExercicioAritmeticos {
    public static void main(String[] args) {
        /*0- Rode esse código:
        System.out.println("2 + 2 = " + 2 + 2);.
        Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));
        Explique em um comentário por que deram resultados diferentes.*/

        /*Na primeira frase é feito somente a concatenacao dos numeros, ja na segunda frase é feita a operacao de soma.*/

        /*1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e
        mostre na tela: soma, subtração, multiplicação, divisão e resto.*/

        int numeroA = 10;
        int numeroB = 3;

        System.out.println("A soma de " + numeroA + " e " + numeroB + " é " + (numeroA + numeroB) + ".");
        System.out.println("A subtração de " + numeroA + " e " + numeroB + " é " + (numeroA - numeroB) + ".");
        System.out.println("A multiplicação de " + numeroA + " e " + numeroB + " é " + (numeroA * numeroB) + ".");
        System.out.println("A divisão de " + numeroA + " e " + numeroB + " é " + (numeroA / numeroB) + ".");
        System.out.println("O resto da divisão do " + numeroA + " e " + numeroB + " é " + (numeroA % numeroB) + ".");


        /*2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e
        mostre na tela: soma, subtração, multiplicação, divisão e resto.*/

        double numeroC = 22.90;
        double numeroD = 2.06;

        System.out.println("A soma de " + numeroC + " e " + numeroD + " é " + (numeroC + numeroD) + ".");
        System.out.println("A subtração de " + numeroC + " e " + numeroD + " é " + (numeroC - numeroD) + ".");
        System.out.println("A multiplicação de " + numeroC + " e " + numeroD + " é " + (numeroC * numeroD) + ".");
        System.out.println("A divisão de " + numeroC + " e " + numeroD + " é " + (numeroC / numeroD) + ".");
        System.out.println("O resto da divisão do " + numeroC + " e " + numeroD + " é " + (numeroC % numeroD) + ".");


        /*3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.*/

        double nota1 = 8;
        double nota2 = 6;
        double nota3 = 10;

        System.out.println("A soma das notas é " + (nota1 + nota2 + nota3) + ".");
        System.out.println("A média das notas é " + (nota1 + nota2 + nota3)/3 + ".");

        /*4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.*/

        double a = 3;
        double b = 4;
        double c = 5;

        System.out.println((a + b * c));

        /*5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.*/

        double a1 = 3;
        double b1 = 4;
        double c1 = 5;

        System.out.println(((a1 + b1) * c));

        /*Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.
          Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.*/

        double segundos = 3785;
        double minutos = segundos/60;

        System.out.println("3785 segundos representam " + minutos + " minutos e " + (minutos%60) + " segundos.");

    }
}
