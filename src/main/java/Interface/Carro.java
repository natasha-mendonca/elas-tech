package Interface;

public class Carro implements Veiculo{

    @Override
    public void ligar() {
        System.out.println("Ligando o carro!");
    }
    public void acelerar() {
        System.out.println("Acelerando o carro!");
    }
}
