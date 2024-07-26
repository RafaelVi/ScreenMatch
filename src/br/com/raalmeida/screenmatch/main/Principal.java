package br.com.raalmeida.screenmatch.main;

import br.com.raalmeida.screenmatch.calculos.Calculadora;
import br.com.raalmeida.screenmatch.calculos.FiltroRecomendacao;
import br.com.raalmeida.screenmatch.modelos.*;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Carros", 2006);
        meuFilme.setDuracaoEmMinutos(137);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(2);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.getTotalDeAvaliacoes());
        System.out.println(meuFilme.mediaAvaliacoes());

        /*meuFilme.somaDasAvaliacoes = 10;
        meuFilme.totalDasAvaliacoes = 1; Não é possivel por ser metodos privados*/

        Calculadora calc = new Calculadora();
        System.out.println(calc.dobro(10));

        Serie lost = new Serie("Lost", 2000);
        lost.setAtiva(true);
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(45);
        System.out.println(lost.getDuracaoEmMinutos());
        lost.exibeFichaTecnica();

        calc.inclui(meuFilme);
        System.out.println(calc.getTempoTotal());

        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.setDuracaoEmMinutos(302);
        calc.inclui(outroFilme);
        calc.inclui(lost);
        System.out.println(calc.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);

        var filmeDoJoao = new Filme("Shrek", 1999);
        filmeDoJoao.setDuracaoEmMinutos(190);
        filmeDoJoao.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(filmeDoJoao);
        listaDeFilmes.add(outroFilme);

        System.out.println(listaDeFilmes.size());
        System.out.println(listaDeFilmes);
        System.out.println(listaDeFilmes.get(2).toString());

        var filmeDaMaria = new Filme("50 tons de cinza", 2015);
        filmeDaMaria.setDuracaoEmMinutos(125);
        filmeDaMaria.avalia(3);

        listaDeFilmes.add(filmeDaMaria);






    }

}