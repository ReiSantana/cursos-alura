package desafio_4.modelos;

import desafio_4.calculos.Tabuada;

public class TabuadaMultiplicacao implements Tabuada {

    private int numero;

    public TabuadaMultiplicacao(int numero) {
        this.numero = numero;
    }

    @Override
    public int calcularTabuada() {
        int resultado = 0;
        for (int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
        return resultado;
    }

}
