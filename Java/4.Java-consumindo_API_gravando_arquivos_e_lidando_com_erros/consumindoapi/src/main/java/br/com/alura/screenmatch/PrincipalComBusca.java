package br.com.alura.screenmatch;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class PrincipalComBusca {

    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        var nome = scanner.nextLine();

        String endereco = "http://www.omdbapi.com/?apikey=4030f774&t=" + nome.replace(" ", "+");

        try {
            HttpClient client = HttpClient.newHttpClient();

            //HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?apikey=4030f774&t=" + nome)).build();
            HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
            HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

            String json = response.body();
            System.out.println("JSON recebido: " + json);

            Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

            TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
            System.out.println(meuTituloOmdb);

            Titulo meuTitulo = new Titulo(meuTituloOmdb);
            System.out.println("Titulo convertido: " + meuTitulo);
        } catch (NumberFormatException e) {
            System.out.println("Erro de conversão de número: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento inválido: " + e.getMessage());
        } catch (ErroDeConversaoDeAnoException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        } finally {
            System.out.println("Execução finalizada.");
        }

        scanner.close();

    }

}
