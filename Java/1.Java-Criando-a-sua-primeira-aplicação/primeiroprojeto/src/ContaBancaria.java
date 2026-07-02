import java.util.Scanner;
import java.util.InputMismatchException;

public class ContaBancaria {

  public static void main(String[] args) {
        
    Scanner lerEntrada = new Scanner(System.in);
    String nomeCliente = "Pafúncio";
    double saldoAtual = 4500;
    String mensagem;
    int itemMenu;


    inicioLoop:
    while (true) {

      String menu = """
                    \n------------------------------------------------------------
                    *
                    * *** Olá, %s! Esta é a sua conta bancária
                    *
                    ------------------------------------------------------------
                    1. Consultar saldo
                    2. Receber valor
                    3. Transferir valor
                    4. Sair
                    """.formatted(nomeCliente);

      System.out.println(menu);

      try {
        System.out.println("Escolha uma opção do menu: ");   
        itemMenu = lerEntrada.nextInt();
        if (itemMenu == 4) {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Entrada inválida - tente novamente");
        continue inicioLoop;
      }

      switch (itemMenu) {

        case 1: mostraSaldo(saldoAtual);
                break;

        case 2: saldoAtual = efetuaDeposito(lerEntrada, saldoAtual);
                break;

        case 3: saldoAtual = efetuaTransferencia(lerEntrada, saldoAtual);
                break;

        default:
          System.out.println("Opção inválida - tente novamente");
          lerEntrada.nextLine();
          continue inicioLoop;
      }
    }

    lerEntrada.close();
    mensagem = """
               ------------------------------------------------------------
                 Aplicação finalizada
               ------------------------------------------------------------
               """;
    System.out.println(mensagem);

  }

  public static void mostraSaldo(double saldoAtual) {
    String msgSaldo = String.format("O saldo atual é %.2f", saldoAtual);
    System.out.println(msgSaldo);
  }

  public static double efetuaDeposito(Scanner lerEntrada, double saldoAtual) {
    double valorDeposito;
  
    inicioLoop:
    while (true) {
      System.out.println("Informe o valor do depósito (0 para sair): ");
      try {
        valorDeposito = lerEntrada.nextDouble();
        if (valorDeposito != 0) {
          saldoAtual += valorDeposito;
        } else {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Valor do depósito inválido - tente novamente");
        lerEntrada.nextLine();
        continue inicioLoop;
      }

      String msgSaldo = String.format("O valor do depósito é %.2f", valorDeposito);
      msgSaldo = String.format(msgSaldo + " / O saldo final é %.2f", saldoAtual);
      System.out.println(msgSaldo);
    }
      return saldoAtual;

  }

  public static double efetuaTransferencia(Scanner lerEntrada, double saldoAtual) {
    double valorTransfer;
  
    inicioLoop:
    while (true) {
      System.out.println("Informe o valor a transferir (0 para sair): ");
      try {
        valorTransfer = lerEntrada.nextDouble();
        if (valorTransfer != 0) {
          if (valorTransfer > saldoAtual) {
            System.out.println("Saldo insuficiente para a transferência - tente novamente");
            continue inicioLoop;
          }
          saldoAtual -= valorTransfer;
        } else {
          break;
        }
      } catch (InputMismatchException e) {
        System.out.println("Valor da transferência inválido - tente novamente");
        lerEntrada.nextLine();
        continue inicioLoop;
      }

      String msgSaldo = String.format("O valor da transferência é %.2f", valorTransfer);
      msgSaldo = String.format(msgSaldo + " / O saldo final é %.2f", saldoAtual);
      System.out.println(msgSaldo);

    }
      return saldoAtual;
  }

}
