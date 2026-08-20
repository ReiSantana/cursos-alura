package br.com.alura.screenmatch.desafios.desafio_4.exercicio_3;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class tituloParaGson {

    public static void main(String[] args) {
        Titulo titulo = new Titulo("O Senhor dos Anéis", 2001);
        titulo.setIncluidoNoPlano(true);
        titulo.avalia(8.5);
        titulo.avalia(9.0);
        titulo.avalia(7.5);
        titulo.avalia(9.5);
        titulo.avalia(8.0);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(titulo);

        System.out.println(json);

    }

}
