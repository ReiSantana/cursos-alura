package desafio_1;
public class PrincipalCalculadora {

  public static void main(String[] args) {

    Calculadora calc = new Calculadora();
    double numeroADobrar = 26;
    double resultado;

    resultado = calc.retornaDobro(numeroADobrar);

    System.out.println(String.format("O dobro de %f é %f", numeroADobrar, resultado));
    
  }

}
