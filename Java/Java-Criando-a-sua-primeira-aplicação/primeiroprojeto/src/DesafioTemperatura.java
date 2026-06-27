public class DesafioTemperatura {

  public static void main(String[] args) {
    double temperaturaCelsius = 12.5;
    double temperaturaFarenheit = (temperaturaCelsius * 1.8) + 32;

    String mensagem = String.format("A temperatura de %.2f graus Celsius equivale a %.2f graus Farenheit", temperaturaCelsius, temperaturaFarenheit);
  
    System.out.println(mensagem);

    int temperaturaFarenheitInteira = (int) temperaturaFarenheit;

    System.out.println("A temperatura Fahrenheit inteira é: " + temperaturaFarenheitInteira + " graus");
  }
}
