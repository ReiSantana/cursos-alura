import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculaArea {
  public static void main (String[] args) {

    Scanner leitura = new Scanner(System.in);
    int itemEscolhido = 0;
    double ladoQuadrado;
    double areaQuadrado;
    double raioCirculo;
    double areaCirculo;
    String mensagem = "";

    inicioLoop:
    while (true) {

      System.out.println("* ----------------------------------------------------------");
      System.out.println("""
                         ------------ M E N U ------------
                         1. Calcular área do quadrado")
                         2. Calcular área do círculo")
                         Escolha uma opção (0 para sair):
                         """
                        );   
      try {
        itemEscolhido = leitura.nextInt();
        if (itemEscolhido == 0) {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida - tente novamente");
        leitura.nextLine();
        continue inicioLoop;
      }

      switch (itemEscolhido) {

        case 1:
          System.out.println("--> Informe a medida do lado do quadrado:");
          ladoQuadrado = leitura.nextDouble();
          areaQuadrado = Math.pow(ladoQuadrado, 2);
          mensagem = "A área do quadrado é " + areaQuadrado;
          break;

        case 2:
          System.out.println("--> Informe o raio do círculo:");
          raioCirculo = leitura.nextDouble();
          areaCirculo = Math.PI * Math.pow(raioCirculo, 2);
          mensagem = "A área do círculo é " + areaCirculo;
          break;

        default:
          System.out.println("Opção inválida - tente novamente");
          leitura.nextLine();
          continue inicioLoop;

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
