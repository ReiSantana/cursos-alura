package br.com.alura.screenmatch.desafios.desafio_4.exercicio_1;

import java.util.ArrayList;
import java.util.Collections;

public class OrdenaNumeros {

    public static void main(String[] args) {
        
        ArrayList<Integer> listaDeNumeros = new ArrayList<>();

        listaDeNumeros.add(132);
        listaDeNumeros.add(12);
        listaDeNumeros.add(826);
        listaDeNumeros.add(25);
        listaDeNumeros.add(50);
        listaDeNumeros.add(36);

        System.out.println("Lista sem ordenação: " + listaDeNumeros);

        Collections.sort(listaDeNumeros);

        System.out.println("Lista ordenada: " + listaDeNumeros);

    }

}
