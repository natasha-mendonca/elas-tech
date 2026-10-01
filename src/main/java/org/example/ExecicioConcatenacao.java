package org.example;

public class ExecicioConcatenacao {
    public static void main(String[] args) {
        /*1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."*/

        String nome = "Natasha";
        String cidade = "Blumenau";
        int idade = 37;

        System.out.println("Olá meu nome é " + nome + " moro em " + cidade + " e tenho " + idade +  " anos.");


        /*2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4).
         Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"*/

        String produto = "Caneca";
        double preco = 12.50;
        int quantidade = 4;

        System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + (quantidade * preco) + "." );

        /*3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim:
         "A soma de 15 e 4 é igual a 19."*/

        int numero1 = 2;
        int numero2 = 18;

        System.out.println("A soma de " + numero1 + " e " + numero2 + " é igual a " + (numero1 + numero2) + ".");

    }
}
