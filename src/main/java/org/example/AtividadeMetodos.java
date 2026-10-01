package org.example;

import java.util.Scanner;

public class AtividadeMetodos {

    /*1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.*/

    static void mostrarBoasVindas() {
        System.out.println("Bem-vinda ao curso de Java!");
    };

    public static void main(String[] args){
        mostrarBoasVindas();
        Utilidades.saudar("Natasha");
        Utilidades.saudar("Pedro");
        Utilidades.saudar("Júlia");
        Utilidades.dobro(5);

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua primeira nota: ");
        double n1 = sc.nextDouble();
        sc.nextLine();
        System.out.println("Digite sua segunda nota: ");
        double n2 = sc.nextDouble();
        sc.nextLine();

        Utilidades.calcularMedia(n1, n2);

        System.out.println("Qual a sua idade? ");
        int idade = sc.nextInt();

        if (Utilidades.ehMaiorDeIdade(idade)) {
            System.out.println("Você é maior de idade.");
        }
            else {
                System.out.println("Você é menor de idade.");
            }
        }
        }



