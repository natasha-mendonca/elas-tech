package org.example;

public class ContadorVisitas {

    private static ContadorVisitas instancia;

    private int total = 0;

    private ContadorVisitas(){

    }
    public static ContadorVisitas getInstancia() {
        if (instancia == null) {
            instancia = new ContadorVisitas();
        }
        return instancia;
    }

    public void registrarVisita(){
        total ++;
    }

    public int getTotal(){
        return total;
    }

    public static void main (String[] args) {
        ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
        ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

        pagina1.registrarVisita();
        pagina1.registrarVisita();
        pagina2.registrarVisita();


        System.out.println("Total de visitas: " + pagina1.getTotal());

    }
}
