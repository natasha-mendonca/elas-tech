package Aula25_10.Lambda1;

public class Main {
    public static void main(String[] args) {
        Saudacao saudacao = () -> System.out.println("oi");/* variavel do tipo da minha interface = (parametros) *Como na interface nao tem parametro, passa () vazio* Nesse caso eu estou dizendo, sempre que chamar saudacao imprima oi. Aqui eu estou criando um metodo e nao dizendo imprima oi. Só vai imprimir quando eu chamar o metodo.*/

        saudacao.executar();
    }

}
