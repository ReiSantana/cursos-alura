import java.util.InputMismatchException;
import java.util.Scanner;

public class PositivoNegativo {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int numeroInformado = 0;
    String mensagem;

    inicioLoop:
    while (true) {

      System.out.println("Digite um número (0 para sair):");
      try {
        numeroInformado = leitura.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("o número informado é inválido - tente novamente");
        leitura.nextLine();
        continue inicioLoop;
      }

      if (numeroInformado == 0) {
        break;
      }

      if (numeroInformado > 0) {
        System.out.println("O número informado é positivo");
      } else {
        System.out.println("O número informado é negativo");
      }
      System.out.println("* -----------------------------");
    }

    leitura.close();
    mensagem = """
               * -----------------------------
                Aplicação finalizada
               * -----------------------------
               """;
    System.out.println(mensagem);

  }
}
