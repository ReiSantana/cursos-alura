package br.com.alura.screenmatch.desafios.desafio_4.exercicio_4;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class veiculoParaGson {

    public static void main(String[] args) {
        Veiculo meuVeiculo = new Veiculo("Lexus", "LX400", 2001, "ABC123", 400);

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(meuVeiculo);

        System.out.println(json);

    }

}
