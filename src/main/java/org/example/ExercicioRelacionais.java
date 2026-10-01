package org.example;

public class ExercicioRelacionais {
    public static void main(String[] args){

/*1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes,
a primeira é maior, a primeira é menor para quando:
- a = 10, b = 3
- a = 3, b = 10
- a = 5, b = 5*/

        int notaAluna1 = 10;
        int notaAluna2 = 3;

        System.out.println("São iguais? " + (notaAluna1 == notaAluna2));
        System.out.println("São diferentes? " + (notaAluna1 != notaAluna2));
        System.out.println("A primeira é maior? " + (notaAluna1 > notaAluna2));
        System.out.println("A primeira é menor? " + (notaAluna1 < notaAluna2));

        int notaAluna3 = 3;
        int notaAluna4 = 10;

        System.out.println("São iguais? " + (notaAluna3 == notaAluna4));
        System.out.println("São diferentes? " + (notaAluna3 != notaAluna4));
        System.out.println("A primeira é maior? " + (notaAluna3 > notaAluna4));
        System.out.println("A primeira é menor? " + (notaAluna3 < notaAluna4));

        int notaAluna5 = 5;
        int notaAluna6 = 5;

        System.out.println("São iguais? " + (notaAluna5 == notaAluna6));
        System.out.println("São diferentes? " + (notaAluna5 != notaAluna6));
        System.out.println("A primeira é maior? " + (notaAluna5 > notaAluna6));
        System.out.println("A primeira é menor? " + (notaAluna5 < notaAluna6));


/*2- Exiba na tela  a == b, sendo a = 10 e b 3.*/

        int a = 10;
        int b = 3;

        System.out.println(a == b);

/*3- Exiba na tela a != b, sendo a = 10 e b = 3.*/

        int a1 = 10;
        int b1 = 3;

        System.out.println(a1 != b1);

/*4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo*/

        boolean chovendo = true;

        System.out.println(!chovendo);

    }

}
