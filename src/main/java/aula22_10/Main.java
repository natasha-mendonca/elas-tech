package aula22_10;

public class Main {

    public static void main(String[] args) {
       /* Animal cachorro = AnimalFactory.getAnimal("cachorro");
        Animal gato = AnimalFactory.getAnimal("gato");

        cachorro.emitirSom();
        gato.emitirSom();

        Pagamento pagamento = new PayPalAdapter();

        pagamento.pagar(); */

        ManhaFacade manhaFacade = new ManhaFacade();

        manhaFacade.acordar();

    }
}
