package Interface;

public class Moto implements Veiculo {

    @Override
    public void ligar(){
        System.out.println("Ligando a moto!");
    }
    public void acelerar() {
        System.out.println("Acelerando a moto!");
    }
}
