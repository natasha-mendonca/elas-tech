package org.example;

public class Utilidades {

    static void
    saudar(String nome) {
        System.out.println("Bem vinda " + nome);
    }

    static void
    dobro(int numero){
            System.out.println("O dobro de " + numero + " é " + (numero * 2));
        }

    static void
    calcularMedia(double n1, double n2){
        System.out.println("A média das notas é: " + ((n1+n2))/2);
    }

    static boolean
    ehMaiorDeIdade (int idade) {
        return idade >= 18;
    }
    }


    /*Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.*/