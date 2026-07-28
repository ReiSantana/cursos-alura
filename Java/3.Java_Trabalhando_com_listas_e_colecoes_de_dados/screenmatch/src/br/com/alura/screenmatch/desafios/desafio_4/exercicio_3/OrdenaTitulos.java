package br.com.alura.screenmatch.desafios.desafio_4.exercicio_3;

import java.util.ArrayList;
import java.util.Collections;

import br.com.alura.screenmatch.desafios.desafio_4.exercicio_2.Titulo;

public class OrdenaTitulos {
    public static void main(String[] args) {

        ArrayList<Titulo> listaDeLivros = new ArrayList<Titulo>();

        Titulo titulo1 = new Titulo("O Hobbit");
        Titulo titulo2 = new Titulo("A Sociedade do Anel");
        Titulo titulo3 = new Titulo("As Duas Torres");
        Titulo titulo4 = new Titulo("O Retorno do Rei");
        Titulo titulo5 = new Titulo("O Morro dos Ventos Uivantes");

        listaDeLivros.add(titulo1);
        listaDeLivros.add(titulo2);
        listaDeLivros.add(titulo3);
        listaDeLivros.add(titulo4);
        listaDeLivros.add(titulo5);

        System.out.println("Lista não ordenada: " + listaDeLivros);

        Collections.sort(listaDeLivros);

        System.out.println("Lista ordenada: " + listaDeLivros);

    }

}
