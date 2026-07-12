package desafio_4;

import desafio_4.modelos.ConversorMoeda;

public class PrincipalConversorMoeda {

    public static void main(String[] args) {
        ConversorMoeda conversor = new ConversorMoeda();
        double valorEmDolar = 100.0;
        double valorEmReal = conversor.converterDolarParaReal(valorEmDolar);
        System.out.println("Valor em dólares: " + valorEmDolar);
        System.out.println("Valor em reais: " + valorEmReal);
    }


}
