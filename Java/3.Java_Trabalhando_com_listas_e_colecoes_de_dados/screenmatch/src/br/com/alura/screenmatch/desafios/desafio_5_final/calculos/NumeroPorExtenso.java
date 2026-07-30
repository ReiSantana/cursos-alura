package br.com.alura.screenmatch.desafios.desafio_5_final.calculos;

//Obs.: esta classe só trabalha com números até o valor de 9.999

public class NumeroPorExtenso {

    public static String converter(int n) {
        if (n == 0) return "zero";

        String[] unidades = { "", "um", "dois", "três", "quatro", "cinco", "seis", "sete", "oito", "nove", 
                              "dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove" };
        String[] dezenas = { "", "", "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa" };
        String[] centenas = { "", "cem", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos" };
        String[] milhares = { "", "mil", "dois mil", "três mil", "quatro mil", "cinco mil", "seis mil", "sete mil", "oito mil", "nove mil" };

        if (n == 100) return "cem";

        if (n < 20) {
            return unidades[n];
        } else if (n < 100) {
            int d = n / 10;
            int u = n % 10;
            return dezenas[d] + (u != 0 ? " e " + unidades[u] : "");
        } else if (n < 1000) {
            int c = n / 100;
            int resto = n % 100;
            return centenas[c] + (resto != 0 ? " e " + converter(resto) : "");
        } else if (n < 10000) {
            int m = n / 1000;
            int resto = n % 1000;
            return milhares[m] + (resto != 0 ? " e " + converter(resto) : "");
        }

        return "Número fora do limite";
    }

}
