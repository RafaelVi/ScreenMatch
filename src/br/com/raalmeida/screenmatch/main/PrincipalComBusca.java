package br.com.raalmeida.screenmatch.main;

import br.com.raalmeida.screenmatch.modelos.Titulo;
import br.com.raalmeida.screenmatch.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner in = new Scanner(System.in);
        System.out.println("qual o filme");
        String filme = in.next();
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("https://www.omdbapi.com/?t="+ String.join("+", filme) + "&apikey=e943e54"))
                .build();
        System.out.println(request.uri());

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .create();
        TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
        System.out.println(meuTituloOmdb);
        try {
            System.out.println("Titulo convertido");
            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            meuTitulo.exibeFichaTecnica();
        } catch (NumberFormatException e){
            System.out.println("Aconteceu um erro: ");
            System.out.println(e.getMessage());
        }

        System.out.println("O programa foi encerrado corretamente");


    }
}
