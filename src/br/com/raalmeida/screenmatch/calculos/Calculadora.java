package br.com.raalmeida.screenmatch.calculos;

import br.com.raalmeida.screenmatch.modelos.Titulo;

public class Calculadora {
    private int tempoTotal;

    public int dobro(int numero) {
        return numero * 2;
    }

    public int getTempoTotal(){
        return tempoTotal;
    }

    public void inclui(Titulo titulo){
        System.out.println("Adicionando duracao em minutos de " + titulo);
        tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
