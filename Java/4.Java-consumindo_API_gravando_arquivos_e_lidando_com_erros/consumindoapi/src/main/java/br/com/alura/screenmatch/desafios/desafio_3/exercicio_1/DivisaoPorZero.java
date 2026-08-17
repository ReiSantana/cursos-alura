package br.com.alura.screenmatch.desafios.desafio_3.exercicio_1;

import java.util.Scanner;

public class DivisaoPorZero {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double resultado;

        System.out.println("Digite o dividendo: ");
        var dividendo = entrada.nextInt();

        System.out.println("Digite o divisor: ");
        var divisor = entrada.nextInt();

        try {
            resultado = dividendo / divisor;
            System.out.println("Resultado da divisão: " + resultado);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
        }
        entrada.close();

    }

}
