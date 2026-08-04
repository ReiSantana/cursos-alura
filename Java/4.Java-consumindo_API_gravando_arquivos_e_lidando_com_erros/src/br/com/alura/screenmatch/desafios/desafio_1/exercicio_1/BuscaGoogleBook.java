package br.com.alura.screenmatch.desafios.desafio_1.exercicio_1;

import java.io.IOException;
import java.net.URI;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class BuscaGoogleBook {

    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do livro:");
        var nomeLivro = scanner.nextLine();

        String chave = "CHAVE_FICARÁ_AQUI";
        String endereco = "https://www.googleapis.com/books/v1/volumes?q=" + nomeLivro + "&key=" + chave;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();

    }
}
