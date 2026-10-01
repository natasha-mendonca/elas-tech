package org.example;

import java.util.Scanner;

public class AtividadeStrings {
    public static void main(String[] args) {

        /*1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).*/
        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Me informe seu nome completo");
        nome = sc.nextLine();

        int totalLetras = nome.length();
        System.out.println("O seu nome tem " + totalLetras + " caracteres");


        /*2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.*/

        System.out.println("Nome em maiúsculo: " + nome.toUpperCase());

        System.out.println("Nome em minúsculo: " + nome.toLowerCase());


        /*3 — Peça o nome da pessoa e mostre a primeira letra dele.*/

        System.out.println("A primeira letra do seu nome é: " + nome.charAt(0));

        /*4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.

            Digite uma frase: Estou aprendendo Java
            Digite uma palavra: Java
            A palavra aparece na frase? true */

        String frase, palavra;

        System.out.println("Escreva uma frase");
        frase = sc.nextLine();
        System.out.println("Escreva uma palavra");
        palavra = sc.nextLine();

        System.out.println("A palavra " + palavra + " existe na frase? " + frase.contains(palavra));


        /*5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.*/

        String nomeMinusculo;
        String nomeMaiusculo;

        System.out.println("Me informe seu nome minusculo ");
        nomeMinusculo = sc.nextLine();
        System.out.println("Me informe seu nome maiusculo ");
        nomeMaiusculo = sc.nextLine(); }}

        /*System.out.println("Os nomes são iguais? " + (nomeMinusculo.equalsIgnoreCase(nomeMaiusculo));

    }
}

/*Referência:

String nome = "Maria Silva";
nome.length();                 // 11
nome.toUpperCase();            // MARIA SILVA
nome.toLowerCase();            // maria silva
nome.contains("Silva");        // true
nome.charAt(0);                // M
nome.substring(0, 5);          // Maria
nome.replace("Silva","Souza"); // Maria Souza
"  oi
".trim();               // "oi"
nome.equals("maria silva");           // false
nome.equalsIgnoreCase("maria silva"); // true*/

