package org.example;

public class Arrays {
    public static void main(String[] args) {

        /*1 — Crie um array com os nomes de 5 pessoas. Mostre o primeiro, o terceiro e o último.

    String[] nomes = {"Natasha", "Pedro", "Júlia", "José", "Margot"};

    System.out.println("O primeiro nome é: " + nomes[0] + ", o terceiro nome é: " + nomes[2] + ", o último nome é: " + nomes[4]);

    }

        /*2 — Crie um array com as notas {8, 6, 10, 7, 9}. Usando um laço, mostre todas, uma por linha, assim: "Nota 1: 8".*/

        int[] notas = {8, 6, 10, 7, 9};

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Nota " + i + ": " + notas[i]);

        }



           /* 3 — Com o mesmo array de notas, calcule e mostre a soma e a média.

4 — Peça 5 números para a pessoa, guarde num array, e depois mostre todos de trás pra frente.

            Referência:
    int[]
            notas = {8, 6, 10, 7, 9};
    int[] notas = new int[5]
•for(int i = 0; i
            < notas.length;
    i++){

        System.out.println(notas[i]);

    }*/
    }
}
