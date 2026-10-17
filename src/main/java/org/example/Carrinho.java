package org.example;

public class Carrinho {

    private static Carrinho instancia;

    private int quantidadeItens = 0;

    private Carrinho() {
    }

    public static Carrinho getInstancia() {
        if (instancia == null) {
            instancia = new Carrinho();
        }
        return instancia;
    }
    public void adicionarItem () {
        quantidadeItens++;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public static void main (String[] args) {
        Carrinho telaProdutos = Carrinho.getInstancia();
        Carrinho telaPromocoes = Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho: " + telaProdutos.getQuantidadeItens());
    }
}
