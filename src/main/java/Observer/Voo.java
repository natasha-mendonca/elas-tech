package Observer;

import java.util.ArrayList;

public class Voo {

    private ArrayList<ObservadorVoo> observadorVoos = new ArrayList<>();
    private String voo;

    public void adcionarObservador (ObservadorVoo o){
        this.observadorVoos.add(observadorVoos);
    }

    public void mudarStatus (String status){

    }
}
