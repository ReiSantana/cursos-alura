package br.com.alura.screenmatch.desafios.desafio_3.exercicio_1;

import java.util.ArrayList;

public class IterarLista {

    public static void main(String[] args) {
        
        ArrayList<String> estilos = new ArrayList<>();

        estilos.add("Rock'n'roll");
        estilos.add("Sertanejo");
        estilos.add("Clássica");
        estilos.add("MPB");
        estilos.add("Samba");
        estilos.add("Funk");
        estilos.add("Jazz");
        estilos.add("Eletrônica");

        for (String estilo : estilos) {
            System.out.println(estilo);
        }

    }

}
