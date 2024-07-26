package br.com.raalmeida.screenmatch.extras;

public class Quadrado implements Forma{
    int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    @Override
    public void calcularArea() {
        System.out.println("Area do quadrado:" + lado * lado);
    }
}
