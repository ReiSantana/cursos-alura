import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Scanner;

public class PrincipalComBusca {

    public static void main(String[] args) throws java.io.IOException, InterruptedException {
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do filme:");
        var nome = scanner.nextLine();

        String endereco = "http://www.omdbapi.com/?apikey=4030f774&t=" + nome;

        HttpClient client = HttpClient.newHttpClient();

        //HttpRequest request = HttpRequest.newBuilder().uri(URI.create("http://www.omdbapi.com/?apikey=4030f774&t=" + nome)).build();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create(endereco)).build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());

        System.out.println(response.body());
    
    }

}
