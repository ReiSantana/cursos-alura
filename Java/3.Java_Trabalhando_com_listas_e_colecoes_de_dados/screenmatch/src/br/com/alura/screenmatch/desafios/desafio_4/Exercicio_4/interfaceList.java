package br.com.alura.screenmatch.desafios.desafio_4.exercicio_4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class interfaceList {

    public static void main(String[] args) {
        
        List<String> listaArrayList = new ArrayList<>();

        listaArrayList.add("nome 5");
        listaArrayList.add("nome 7");
        listaArrayList.add("nome 2");
        listaArrayList.add("nome 4");

        List<String> listaLinkedList = new LinkedList<>();

        listaLinkedList.add("nome 6");
        listaLinkedList.add("nome 1");
        listaLinkedList.add("nome 3");
        listaLinkedList.add("nome 8");

        System.out.println("Lista \"ArrayList\": " + listaArrayList);
        System.out.println("Lista \"LinkedList\": " + listaLinkedList);

    }

}
