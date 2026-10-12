package POO;

public class Professora extends Pessoa {

    String disciplina;
    String aluna;
    Double nota;

    void lancarNota() {
        System.out.println("Flora lançou nota " + nota +  " para " + aluna);
    }
@Override
    void apresentar(){
        System.out.println("Oi, sou Flora e ensino " + disciplina);
}
}
