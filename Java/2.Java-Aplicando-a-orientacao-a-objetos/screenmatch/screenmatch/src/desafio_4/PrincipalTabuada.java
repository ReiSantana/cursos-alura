package desafio_4;

import desafio_4.modelos.TabuadaMultiplicacao;

public class PrincipalTabuada {
    
    public static void main(String[] args) {
        int numero = 5; // Número para calcular a tabuada
        TabuadaMultiplicacao tabuada = new TabuadaMultiplicacao(numero);
        System.out.println("Tabuada de multiplicação do número " + numero + ":");
        tabuada.calcularTabuada();
    }

}
