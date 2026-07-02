import java.util.Random;
import java.util.Scanner;

public class Adivinhe {

  public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);
    int qtdeInformada = 0;
    int numeroInformado = 0;
    boolean acertou = false;
    int numeroGerado = new Random().nextInt(100);

    while (qtdeInformada < 10 && numeroInformado != -1) {

      System.out.println("Adivinhe o número (entre 0 e 100) ou digite -1 para sair");
      numeroInformado = leitura.nextInt();
      qtdeInformada++;

      if (numeroInformado == -1) {
        break;
      }

      if (numeroGerado > numeroInformado) {
        System.out.println("O número gerado é maior que o número informado");
      } else {
          if (numeroGerado < numeroInformado) {
            System.out.println("O número gerado é menor que o número informado");
          } else {
            System.out.println("Você acertou!");
            acertou = true;
            break;
          }
      }

    }

    leitura.close();
    String mensagem = "O número gerado era " + numeroGerado;

    if (acertou) {
      System.out.println(mensagem + " e você acertou em " + qtdeInformada + " tentativas");
    } else {
      if (qtdeInformada > 0) {
        System.out.println(mensagem + " e você tentou " + qtdeInformada + " vezes sem acerto");
      } else {
        System.out.println("Nenhum número informado");
      }
    }

  }

}
