package br.com.alura.screenmatch.desafios.desafio_4.exercicio_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class interfaceList {

    public static void main(String[] args) {

        List<String> listaPolimorfica;
        
        listaPolimorfica = new ArrayList<>();

        listaPolimorfica.add("nome 5");
        listaPolimorfica.add("nome 7");
        listaPolimorfica.add("nome 2");
        listaPolimorfica.add("nome 4");
        System.out.println("Lista \"ArrayList\": " + listaPolimorfica);

        listaPolimorfica = new LinkedList<>();

        listaPolimorfica.add("nome 6");
        listaPolimorfica.add("nome 1");
        listaPolimorfica.add("nome 3");
        listaPolimorfica.add("nome 8");
        System.out.println("Lista \"LinkedList\": " + listaPolimorfica);

    }

}
