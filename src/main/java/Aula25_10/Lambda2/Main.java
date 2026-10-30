package Aula25_10.Lambda2;

import Aula25_10.Lambda3.Calculo;

public class Main {
    public static void main(String[] args) {

        Impressora impressoraMaiusculo = (texto) -> System.out.println(texto.toUpperCase());

        Impressora impressoraMinusculo = (texto -> System.out.println(texto.toLowerCase()));

        impressoraMinusculo.imprimir("Boa noite!");
        impressoraMaiusculo.imprimir("Boa noite");

    }
}
