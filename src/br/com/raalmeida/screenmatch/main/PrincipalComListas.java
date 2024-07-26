package br.com.raalmeida.screenmatch.main;

import br.com.raalmeida.screenmatch.modelos.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("Carros", 2006);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2009);
        outroFilme.avalia(4);
        var filmeDoJoao = new Filme("Shrek", 1999);
        filmeDoJoao.avalia(10);
        var filmeDaMaria = new Filme("50 tons de cinza", 2015);
        filmeDaMaria.avalia(5);
        Serie lost = new Serie("Lost", 2000);

        ArrayList<Titulo> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(meuFilme);
        listaDeTitulos.add(filmeDoJoao);
        listaDeTitulos.add(outroFilme);
        listaDeTitulos.add(lost);

        listaDeTitulos.forEach(System.out::println);
        for (Titulo item : listaDeTitulos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme) System.out.println("Classificação: " + filme.getClassificacao());
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Rafael");
        buscaPorArtista.add("Emerson");
        buscaPorArtista.add("Alef");
        buscaPorArtista.add("Jailton");

        Collections.sort(buscaPorArtista);
        System.out.println(buscaPorArtista);

        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);

        listaDeTitulos.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(listaDeTitulos);


    }
}
