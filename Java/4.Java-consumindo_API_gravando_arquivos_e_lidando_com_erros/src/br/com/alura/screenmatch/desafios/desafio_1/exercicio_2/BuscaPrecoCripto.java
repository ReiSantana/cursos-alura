package br.com.alura.screenmatch.desafios.desafio_1.exercicio_2;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class BuscaPrecoCripto {

    public static void main(String[] args) throws java.io.IOException, InterruptedException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a id da Cripto a pesquisar (ex: bitcoin):");
        System.out.println("Para pesquisar mais de uma cripto, separe as ids com vírgula (ex: bitcoin,ethereum):");
        var idCripto = scanner.nextLine();

        var endereco = "https://api.coingecko.com/api/v3/simple/price?ids=" + idCripto + "&vs_currencies=brl";

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());

        scanner.close();

    }

}
