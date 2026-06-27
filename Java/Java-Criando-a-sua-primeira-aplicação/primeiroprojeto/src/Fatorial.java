import java.util.InputMismatchException;
import java.util.Scanner;

public class Fatorial {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int numero = 0;
    double resultado;
    String mensagem = "Fatorial do número ";

    inicioLoop:
    while (true) {

      System.out.println("------------------------------------------------------------");
      System.out.println("Digite um número (0 para sair, lembrando que 0! = 1): ");   
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

      resultado = 1;
      for (int i = 1; i <= numero; i++) {
        resultado *= i;
        if (Double.isInfinite(resultado)) {
          System.out.println("O cálculo resultou em infinito!");
          leitura.nextLine();
          continue inicioLoop;
        }
      }
      System.out.println(String.format("Fatorial do número %d = %f", numero, resultado));
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
