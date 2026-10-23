package aula22_10;

public class AnimalFactory {

    public static Animal getAnimal (String tipo) {
        if (tipo.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }
        else if (tipo.equalsIgnoreCase("gato")) {
            return new Gato();
        }
        return null;
    }
}
