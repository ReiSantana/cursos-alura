import java.util.InputMismatchException;
import java.util.Scanner;

public class Tabuada {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int numero = 0;
    int resultado;
    String erro = "";
    String mensagem = "Tabuada do ";

    inicioLoop:
    while (true) {

      erro = "";
      System.out.println("------------------------------------------------------------");
      System.out.println("Digite um número (0 para sair): ");   
      try {
        numero = leitura.nextInt();
        if (numero == 0) {
          break;
        }
        if (numero > 10) {
          throw new InputMismatchException(erro = " (maior que 10)");
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida" + erro + " - tente novamente");
        leitura.nextLine();
        continue inicioLoop;
      }

      System.out.println(mensagem + numero);
      for (int i = 1; i < 11; i++) {
        resultado = numero * i;
        System.out.println(numero + " x " + i + " = " + resultado);
      }

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
