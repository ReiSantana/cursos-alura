import java.util.InputMismatchException;
import java.util.Scanner;

public class ComparaNumeros {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int primeiroNumero = 0;
    int segundoNumero = 0;
    String mensagem;

    inicioLoop:
    while (true) {

      System.out.println("* ----------------------------------------------------------");
      System.out.println("Digite os números a comparar (0 nos dois para sair):");
      try {
        primeiroNumero = leitura.nextInt();
        segundoNumero = leitura.nextInt();
      } catch (InputMismatchException e) {
        System.out.println("um dos números informados é inválido - tente novamente");
        leitura.nextLine();
        continue inicioLoop;
      }

      if (primeiroNumero == 0 && segundoNumero == 0) {
        break;
      }

      if (primeiroNumero == segundoNumero) {
        mensagem = "Os números são iguais";
      } else {
        mensagem = "Os números são diferentes e ";
        if (primeiroNumero > segundoNumero) {
          mensagem = mensagem + "o primeiro é maior que o segundo";
        } else {
             mensagem = mensagem + "o segundo é maior que o primeiro";
        }
      }
      System.out.println(mensagem);
    }

    leitura.close();
    mensagem = """
               * ----------------------------------------------------------
                 Aplicação finalizada
               * ----------------------------------------------------------
               """;
    System.out.println(mensagem);

  }
}