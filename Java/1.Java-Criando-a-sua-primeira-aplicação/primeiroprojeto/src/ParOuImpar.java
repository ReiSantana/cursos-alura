import java.util.InputMismatchException;
import java.util.Scanner;

public class ParOuImpar {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int numero = 0;
    int divisor = 2;
    int resto;
    String mensagem;

    inicioLoop:
    while (true) {

      System.out.println("------------------------------------------------------------");
      System.out.println("Digite um número (0 para sair): ");   
      try {
        numero = leitura.nextInt();
        if (numero == 0) {
          break;
        }
      } catch (InputMismatchException e) {
          System.out.println("Entrada inválida - tente novamente");
          leitura.nextLine();
          continue inicioLoop;
      }

      mensagem = "O número " + numero + " é ";
      resto = numero % divisor;

      if (resto == 0) {
        mensagem = mensagem + "par";
      } else {
        mensagem = mensagem + "ímpar";
      }

      System.out.println(mensagem);

    }

    leitura.close();
    mensagem = """
               ------------------------------------------------------------
                 Aplicação finalizada
               ------------------------------------------------------------
               """;
    System.out.println(mensagem);

  }

}
