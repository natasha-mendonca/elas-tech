package Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Collections {
    public static void main(String[] args) {

        /*ArrayList<String> lista = new ArrayList<>();
        /*- Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.

        lista.add("Natasha");
        lista.add("Pedro");
        lista.add("José");

        System.out.println((lista.size()));
        System.out.println(lista);
    }
}

/*- Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.

        ArrayList<String> listaFrutas = new ArrayList<>(List.of("Banana", "Morango", "Uva", "Tangerina"));

        System.out.println(listaFrutas.get(0));
        System.out.println(listaFrutas.get(3));
        System.out.println((listaFrutas.size()));

    }
} */

/*- Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.

        ArrayList<String> listaNomes = new ArrayList<>(List.of("Natasha", "Pedro", "José", "Júlia"));

        System.out.println(listaNomes);
        System.out.println(listaNomes.set(1, "Mendonca"));
        System.out.println(listaNomes);

/*- Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.

        ArrayList<String> listaCidades = new ArrayList<>(List.of("Teresópolis", "Blumenau", "Arraial do Cabo", "Marataizes"));

        System.out.println(listaCidades.remove(1));
        System.out.println(listaCidades.size());


/*- Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)

        ArrayList<String> listaNomes1 = new ArrayList<>(List.of("Natasha", "Pedro", "José", "Júlia", "Vera", "Egydio"));

        for (int i = 0; i< listaNomes1.size(); i ++){
            System.out.println((i + " : " + listaNomes1.get(i)));
        }

/*Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.*/


        ArrayList<String> listaNomes2 = new ArrayList<>(List.of("Banana", "Morango", "Laranja", "Pera", "Abacaxi"));

        Scanner sc = new Scanner(System.in);
        String nome;

        System.out.println("Digite um nome que consta na lista: ");
        nome = sc.nextLine();

        if (listaNomes2.contains(nome)) {
            int posicao = listaNomes2.indexOf(nome) + 1;
            System.out.println("O nome esta na lista, na posição " + posicao + ".");
        } else {
            System.out.println("Esse nome não consta na lista");
        }


/*Referência:

nomes.add("Carla");          // adiciona no fim
nomes.get(0);                // pega pela posição
nomes.size();                // quantos tem
nomes.set(0, "Zoe");         // troca o valor da posição
nomes.remove(1);             // remove pela posição
nomes.contains("Ana");       // true ou false
nomes.indexOf("Bia");        // em que posição está
nomes.isEmpty();             // true se está vazia*/

    }
}