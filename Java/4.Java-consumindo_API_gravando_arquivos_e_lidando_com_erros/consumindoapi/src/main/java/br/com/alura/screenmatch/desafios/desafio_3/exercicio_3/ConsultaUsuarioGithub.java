package br.com.alura.screenmatch.desafios.desafio_3.exercicio_3;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class ConsultaUsuarioGithub {

    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Digite o nome de usuário do GitHub: ");
        String usuario = leTeclado.nextLine();
        leTeclado.close();

        String endereco = "https://api.github.com/users/" + usuario;

        try {

            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .header("Accept", "application/vnd.github.v3+json")
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            if (response.statusCode() == 404) {
                throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
            }

            String json = response.body();
            System.out.println(json);

            // Adicione aqui o código para processar o JSON e exibir as informações desejadas
        } catch (IOException | InterruptedException e) {
            System.out.println("Opss… Houve um erro durante a consulta à API do GitHub.");
            e.printStackTrace();
        } catch (ErroConsultaGitHubException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String consultarUsuarioGithub(String usuario) {

        if (usuario.equals(usuario)) {
            return "Informações do usuário " + usuario + ":";
        } else {
            throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
        }
    }

}
