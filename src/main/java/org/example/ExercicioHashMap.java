package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioHashMap {

    public static void main(String[] args) {

       /* 1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
    inteiro e depois use get para mostrar a idade de uma delas.*/

        HashMap<String, Integer> idades = new HashMap<>();

        idades.put("Ana", 25);
        idades.put("Natasha", 37);
        idades.put("Pedro", 38);

        System.out.println(idades.values());
        System.out.println(idades.get("Ana"));

          /*  2. Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
    imprima, e depois faça put de "café" DE NOVO com valor 7.50.
    Imprima outra vez e veja o que aconteceu com o tamanho.*/


        HashMap<String, Double> precos = new HashMap<>();

        precos.put("Café", 5.00);
        System.out.println(precos);
        System.out.println(precos.size());
        precos.put("Café", 7.50);
        System.out.println(precos);
        System.out.println(precos.size());

/*3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
    dentro de um if para mostrar o telefone de alguém que está na agenda
    e de alguém que não está.*/

        Scanner sc = new Scanner(System.in);

        HashMap<String, Integer> agenda = new HashMap<>();

        agenda.put("Natasha", 985590643);
        agenda.put("Pedro", 985590644);

        System.out.println("Digite o nome da pessoa que deseja ver o telefone: ");
        String agenda1 = sc.nextLine();

        if (agenda.containsKey(agenda1)){
            System.out.println(agenda.get(agenda1));
        } else {
            System.out.println("Este nome não esta na lista");
        }

           /* 4. Crie um HashMap de estoque (produto -> quantidade) com dois itens.
    Use getOrDefault para mostrar a quantidade de um produto que existe
    e de um que não existe (devolvendo 0). Depois tente com get normal
    no que não existe e compare.*/

        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Parafuso", 10);
        estoque.put("Broca", 5);

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Digite o nome do produto: ");
        String nome4 = sc1.nextLine();

        System.out.println(estoque.getOrDefault(nome4, 0));
        System.out.println(estoque.get(nome4));

         /*   5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
    Remova uma delas e imprima de novo.*/

        HashMap<String, Integer> listagem = new HashMap<>(Map.of("Natasha", 10, "Julia", 9, "José", 8));

        System.out.println(listagem);
        System.out.println(listagem.size());
        System.out.println(listagem.remove("José"));
        System.out.println(listagem.size());

    }
}