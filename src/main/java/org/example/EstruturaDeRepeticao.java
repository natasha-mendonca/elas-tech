package org.example;

public class EstruturaDeRepeticao {
    public static void main(String[] args) {
        /*1 - Mostre os números de 1 a 30, um por linha, usando for.

        for (int i = 1; i <= 30; i++) {
            System.out.println(i);
        }

    /*2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".

        for (int i = 10; i >=1; i--) {
            System.out.println(i);
        }
        System.out.println("Fim");

/*3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.

        int i = 1;
        while (i <=30) {
            System.out.println(i);
            i++;
        }

/*4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.*/

        int tab = 5;
        for (int i = 1; i<=10; i++) {
            System.out.println(i * tab);
        }
    }
}