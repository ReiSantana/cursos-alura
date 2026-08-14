package br.com.alura.screenmatch.desafios.desafio_2.exercicio_1;

import com.google.gson.Gson;

public class Principal {

    public static void main(String[] args) {

        String json = """
                {
                    "nome": "Fulano de Tal",
                    "idade": 36,
                    "cidade": "Quixeramobim/CE"
                }
                """;

        Gson gson = new Gson();

        PessoaImutavel pessoa1 = gson.fromJson(json, PessoaImutavel.class);

        System.out.println(pessoa1);

        Pessoa pessoa2 = new Pessoa(pessoa1);
        System.out.println("Pessoa convertida: " + pessoa2);

    }

}
