package br.com.alura.screenmatch.desafios.desafio_2.exercicio_3;

import com.google.gson.Gson;

record Editora(String nome, String cidade) {}

public class Principal {

    public static void main (String[] args) {

        String json = """
                {
                    "titulo": "O Senhor dos Anéis",
                    "autor": "J.R.R. Tolkien",
                    "editora": {
                        "nome": "HarperCollins",
                        "cidade": "Nova Iorque"
                    }
                }
                """;

        Gson gson = new Gson();

        Livro livro = gson.fromJson(json, Livro.class);

        System.out.println("Objeto Livro: " + livro); 

    }

}
