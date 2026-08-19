package br.com.alura.screenmatch;

import java.io.FileWriter;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.modelos.Titulo;
import br.com.alura.screenmatch.modelos.TituloOmdb;

public class GravaJson {
    public static void main(String[] args) {

        String apiOMDB = "http://www.omdbapi.com/?apikey=4030f774";
        Scanner leTeclado = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();

        while (!busca.equalsIgnoreCase("sair")) {
            System.out.println("--------------------------------------------------------------------");
            System.out.print("Digite o nome do filme que deseja buscar (ou 'sair' para encerrar): ");
            busca = leTeclado.nextLine();

            if (busca.equalsIgnoreCase("sair")) {
                System.out.println("Encerrando o programa.");
                break;
            }

            while (busca.trim().isEmpty()) {
                System.out.print("O nome do filme não pode ser vazio. Digite novamente: ");
                busca = leTeclado.nextLine();
            }

            String endereco = apiOMDB + "&t=" + busca.replace(" ", "+");

            try {
                HttpClient client = HttpClient.newHttpClient();

                HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
                HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

                String json = response.body();
                if (json.contains("\"Response\":\"False\"")) {
                    System.out.println("Filme não encontrado. Verifique o nome e tente novamente.");
                    continue;
                }

                System.out.println("JSON recebido: " + json);

                Gson gson = new GsonBuilder()
                        .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .create();

                TituloOmdb meuTituloOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(meuTituloOmdb);

                Titulo meuTitulo = new Titulo(meuTituloOmdb);
                System.out.println("Titulo convertido: " + meuTitulo);
                titulos.add(meuTitulo);
                
            } catch (NumberFormatException e) {
                System.out.println("Erro de conversão de número: " + e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("Argumento inválido: " + e.getMessage());
            } catch (ErroDeConversaoDeAnoException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
            } finally {
                System.out.println(".");
            }
        }

        leTeclado.close();

        FileWriter escrita = null;
        try {
            escrita = new FileWriter("titulos.txt", StandardCharsets.UTF_8, true);
            for (Titulo titulo : titulos) {
                escrita.write(titulo.toString());
                escrita.write("\n");
            }
        } catch (Exception e) {
            System.out.println("Ocorreu um erro ao gravar no arquivo: " + e.getMessage());
        } finally {
            if (escrita != null) {
                try {
                    escrita.close();
                } catch (Exception e) {
                    System.out.println("Ocorreu um erro ao fechar o arquivo: " + e.getMessage());
                }
            }
        }
    }

}
