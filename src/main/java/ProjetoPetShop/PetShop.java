package ProjetoPetShop;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashSet;
import java.util.ArrayDeque;
import java.util.ArrayList;

public class PetShop {

    static void mostraFicha (Pet pet) {
        System.out.println("Nome: " + pet.nome);
    }
    static void mostrarFicha (Pet pet, String titulo){
        System.out.println(titulo);
        System.out.println("Nome: " + pet.nome);
        System.out.println("Especie: " + pet.especie);
        System.out.printf("Peso: %.1f kg\n ", + pet.peso);
        System.out.println("Porte: " + pet.porte);

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int opcao = -1;
        int total = 0;

        Pet[] pets = new Pet[5];

        ArrayDeque<String> fila = new ArrayDeque<>();

        ArrayList<Servico> servicos = new ArrayList<>();
        servicos.add(new Banho());
        servicos.add(new Tosa());
        servicos.add(new Consulta());

        while (opcao != 0) {
            System.out.println(" \n === PETSHOP === ");
            System.out.println("1 - Cadastrar Pet");
            System.out.println("2 - Listar Pets");
            System.out.println("3 - Buscar Pet");
            System.out.println("4 - Listar espécies");
            System.out.println("5 - Entrar na fila de banho");
            System.out.println("6 - Atender próximo da fila");
            System.out.println("7 - Executar serviço");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine();


                switch (opcao) {

                    case 1:
                        Pet pet = new Pet();
                        System.out.print("Qual o nome do seu pet? ");
                        pet.nome = sc.nextLine();
                        System.out.print("Qual a espécie do seu pet? ");
                        pet.especie = sc.nextLine();
                        System.out.print("Qual peso do seu pet? ");
                        pet.peso = sc.nextDouble();
                        pet.porte = pet.definirPorte();

                        System.out.println("\n=== FICHA DO PET ===");
                        System.out.println("Nome: " + pet.nome);
                        System.out.println("Espécie: " + pet.especie);
                        System.out.printf("Peso: %.1f kg\n", pet.peso);
                        System.out.println("Porte: " + pet.porte);

                        pets[total] = pet;
                        total++;

                        System.out.print("Pet cadastrado! Agora são " + total + " pet (s).");

                        break;

                    case 2:
                        if (total >= 1) {
                            System.out.println("\n --- PETS CADASTRADOS --- ");
                            for (int i = 0; i < total; i++) {
                                System.out.printf("%s (%s) - %.1f kg - Porte %s\n", pets[i].nome, pets[i].especie, pets[i].peso, pets[i].porte);
                            }
                        } else {
                            System.out.println("Nenhum pet cadastrado.");
                        }
                        break;

                    case 3:
                        System.out.print("Qual pet você procura? ");
                        String petProcurado = sc.nextLine();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(petProcurado)) {
                                System.out.printf("Pet encontrado:%s (%s) - %.1f kg\n", pets[i].nome, pets[i].especie, pets[i].peso);
                                achou = true;
                            }
                        }
                        if (!achou) {
                            System.out.println("Não encontrado.");
                        }

                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i]. especie);
                        }
                        System.out.println("\n === ESPECIES CADASTRADAS === ");

                        for (String especie : especies) {
                            System.out.println("- " + especie);
                        }
                        System.out.println("Total de especies diferentes: " + especies.size());

                        break;

                    case 5:
                        System.out.println("Nome do pet para entrar na fila: ");
                        String nomeFila = sc.nextLine();

                        fila.add(nomeFila);

                        System.out.println(nomeFila + " entrou na fila");
                        System.out.println("Fila agora " + fila);

                        break;

                    case 6:
                        if (fila.isEmpty()) {
                            System.out.println("A fila está vazia.");
                        }  else {
                                System.out.println("Próximo da fila " + fila.peek());
                                String atendido = fila.poll();
                                System.out.println("Atendendo " + atendido + " ...");
                                System.out.println("Fila agora " + fila);
                            }
                        break;

                    case 7:
                        System.out.println("Nome do pet: " );
                        String nomePet = sc.nextLine();

                        for (Servico servico : servicos) {
                            servico.executar(nomePet);
                        }

                    case 0:
                        System.out.println("Até logo!");

                        break;

                    default:
                        System.out.println("Opção inválida");

                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números");
                sc.nextLine();
            }
        }
    }
    }
