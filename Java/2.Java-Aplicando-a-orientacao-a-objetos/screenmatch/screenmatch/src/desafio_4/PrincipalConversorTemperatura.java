package desafio_4;

import desafio_4.modelos.ConversorTemperaturaPadrao;

public class PrincipalConversorTemperatura {

    public static void main(String[] args) {

        double temperaturaCelsius = 34.5;
        double temperaturaFahrenheit = 77.0;

        ConversorTemperaturaPadrao conversor = new ConversorTemperaturaPadrao(temperaturaCelsius, temperaturaFahrenheit);

        double resultadoCelsiusParaFahrenheit = conversor.celsiusParaFahrenheit();
        double resultadoFahrenheitParaCelsius = conversor.fahrenheitParaCelsius();

        System.out.println(temperaturaCelsius + " °C é equivalente a " + resultadoCelsiusParaFahrenheit + " °F");
        System.out.println(temperaturaFahrenheit + " °F é equivalente a " + resultadoFahrenheitParaCelsius + " °C");
    }
}
