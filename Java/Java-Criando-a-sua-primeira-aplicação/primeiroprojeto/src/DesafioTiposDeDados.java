public class DesafioTiposDeDados {
  public static void main(String[] args) {

    /************************************************************************ */
    //exercício 1
    double nota1 = 8.7;
    double nota2 = 7.8;
    System.out.println("A média das notas é: " + ((nota1 + nota2) / 2));

    /************************************************************************ */
    //exercício 2
    double tipoDouble = 8.75;
    int tipoInt = (int) tipoDouble;
    System.out.println(String.format("O casting de %f para tipo inteiro resultou em %d", tipoDouble, tipoInt));

    /************************************************************************ */
    //exercício 3
    char letra = 'é';
    String palavra = " continuação da coisa...";
    System.out.println(letra + palavra);

    /************************************************************************ */
    //exercício 4
    double precoProduto = 12.56;
    int qtde = 5;
    double valorTotal = precoProduto * qtde;
    System.out.println(String.format("Valor total = %.2f", valorTotal));

    /************************************************************************ */
    //exercício 5
    double valorEmDolares = 500.36;
    double cotacaoReais = 4.94;
    double valorEmReais = valorEmDolares * cotacaoReais;
    System.out.println(String.format("O valor de %.2f dólares equivale a %.2f Reais", valorEmDolares, valorEmReais));

    /************************************************************************ */
    //exercício 6
    double precoOriginal = 800.25;
    double percentualDesconto = 10;
    double valorDesconto = precoOriginal * percentualDesconto / 100;
    double valorFinal = precoOriginal - valorDesconto;
    System.out.println(String.format("O valor do produto era R$%.2f. Com desconto de %.2f porcento, baixou para R$%.2f", precoOriginal, percentualDesconto, valorFinal));



  }

}
