package aula22_10;

public class Main {

    public static void main(String[] args) {
       /* Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        Pagamento pagamento = new PayPalAdapter();

        pagamento.pagar(); */

       /* ManhaFacade manhaFacade = new ManhaFacade();

        manhaFacade.acordar();*/

        Acai acai1 = new Granola(new AcaiSimples());
        System.out.println(acai1.getDescricao());
        System.out.printf("Preço: R$ %.2f\n", acai1.getPreco());

        System.out.println();

        Acai acai2 = new Morango(new Granola(new AcaiSimples()));
        System.out.println(acai2.getDescricao());
        System.out.printf("Preço: R$ %.2f\n", acai2.getPreco());

    }
}
