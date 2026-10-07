package org.example;

import java.util.Scanner;

public class TratamentoExcecao {
    public static void main(String[] args) {
        /*1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        Scanner sc = new Scanner(System.in);

        int numero1;
        int numero2;

        System.out.println("Digite um número inteiro: ");
        numero1 = sc.nextInt();


        System.out.println("Digite outro número inteiro: ");
        numero2 = sc.nextInt();


        try {
            System.out.println("A divisão do " + numero1 + " pelo " + numero2 + " é igual a " + (numero1 / numero2));

        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir por 0.");
        }*/


        /*2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.

        Scanner sc = new Scanner(System.in);

        int[] notas = {10, 8, 9, 7, 6};
        int posicao;

        System.out.println("Digite a posição da nota que deseja ver: ");
        posicao = sc.nextInt ();

        try {
            System.out.println("A nota que corresponde a essa posição é: " + notas[posicao]);
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("Posição inválida, esta lista tem 5 posições a começar pelo 0.");
        } */

        /*3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.*/

        /*Scanner sc = new Scanner(System.in);

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();*/

    }
}

