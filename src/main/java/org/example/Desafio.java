package org.example;

import java.util.Scanner;

class Aluna {
    String nome;
    double nota;
    double nota2;
    double media;
    boolean passou;
}

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;

        menu: while (true) {
            System.out.println("Deseja iniciar? Pressione 1 para continuar ou 2 para sair.");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Vamos continuar...");

                    Aluna aluna = new Aluna();

                    System.out.println("Digite a primeira nota: ");
                    aluna.nota = sc.nextDouble();

                    System.out.println("Digite a segunda nota: ");
                    aluna.nota2 = sc.nextDouble();

                    aluna.media = (aluna.nota + aluna.nota2) / 2;
                    sc.nextLine();

                    System.out.println("Qual nome da aluna?");
                    aluna.nome = sc.nextLine();

                    if(aluna.media >= 6) { aluna.passou = true;}
                        else { aluna.passou = false;}

                        System.out.printf("O nome da aluna é %s, sua primeira nota foi %.1f, sua segunda nota foi %.1f, e a sua média foi %.1f. Aluna aprovada: %b.", aluna.nome, aluna.nota, aluna.nota2, aluna.media, aluna.passou );

                    break;

                case 2:
                    System.out.println("Até a próxima");
                    break menu;
                default:
                    System.out.println("Opção inválida");
                    break;
            }

        }
    }
}
