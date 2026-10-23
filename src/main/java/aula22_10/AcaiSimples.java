package aula22_10;

public class AcaiSimples implements Acai{

    public String getDescricao(){
        return "Acai Simples";
    }

    @Override
    public double getPreco() {
        return 12.00;
    }
}
