package desafio_4.modelos;

import desafio_4.calculos.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {

    private double temperaturaCelsius;
    private double temperaturaFahrenheit;

    public ConversorTemperaturaPadrao(double temperaturaCelsius, double temperaturaFahrenheit) {
        this.temperaturaCelsius = temperaturaCelsius;
        this.temperaturaFahrenheit = temperaturaFahrenheit;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (this.temperaturaCelsius * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (this.temperaturaFahrenheit - 32) * 5/9;
    }
}   
