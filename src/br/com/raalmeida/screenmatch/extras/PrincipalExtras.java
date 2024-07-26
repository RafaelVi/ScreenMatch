package br.com.raalmeida.screenmatch.extras;

import java.util.ArrayList;

public class PrincipalExtras {
    public static void main(String[] args) {
        Animal animal = new Cachorro();
        animal.nome = "Rex";

        if (animal instanceof Cachorro) {
            Cachorro cachorro = (Cachorro) animal;
            cachorro.latir();
            System.out.println(cachorro.nome);
            // Agora você pode usar o objeto 'cachorro' como um Cachorro.
        } else {
            System.out.println("O objeto não é um Cachorro.");
        }

        Produto produto = new Produto(30,"Arroz");
        Produto produto2 = new Produto(20,"Feijão");
        Produto produto3 = new Produto(7,"Chocolate");
        Produto produto4 = new Produto(12,"Leite");

        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        double precoMedio = 0;

        for(Produto produto1 : produtos){
            precoMedio += produto1.getPreco();
        }
        precoMedio = Math.round(precoMedio / produtos.size());
        System.out.println("Preço médio: " + precoMedio);

        Circulo circulo = new Circulo(10);
        Circulo circulo2 = new Circulo(25);
        Quadrado quadrado = new Quadrado(25);
        Quadrado quadrado2 = new Quadrado(137);
        ArrayList<Forma> listaDeFormas = new ArrayList<>();
        listaDeFormas.add(circulo);
        listaDeFormas.add(circulo2);
        listaDeFormas.add(quadrado);
        listaDeFormas.add(quadrado2);

        listaDeFormas.forEach(Forma::calcularArea);



    }
}
