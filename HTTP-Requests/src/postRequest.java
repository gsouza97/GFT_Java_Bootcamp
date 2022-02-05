import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Path;
import java.time.Duration;

public class postRequest {

    public static final String URL_POST = "https://jsonplaceholder.typicode.com/posts";
    public static final String FILE_JSON = "/home/jm/IdeaProjects/HttpExample/pedido.json";

    public static void main(String[] args) {
        // Criando o cliente
        HttpClient cliente = HttpClient.newHttpClient();

        // Criando a requisição
        HttpRequest request = HttpRequest.newBuilder()
                .POST(HttpRequest.BodyPublishers.ofFile(Path.of(FILE_JSON)))
                .timeout(Duration.ofSeconds(10))
                .uri(URI.create(URL_POST))
                .build();

        // Enviando uma solicitação
        cliente.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenAccept(System.out::println)
                .join();

    }
}
