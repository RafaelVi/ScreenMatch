package br.com.raalmeida.screenmatch.extras;

public class Produto {

    private double preco;
    private String nome;

    public Produto(int preco, String nome) {
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
