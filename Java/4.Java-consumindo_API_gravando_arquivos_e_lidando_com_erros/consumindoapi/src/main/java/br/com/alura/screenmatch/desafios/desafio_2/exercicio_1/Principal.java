package br.com.alura.screenmatch.desafios.desafio_2.exercicio_1;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import br.com.alura.screenmatch.desafios.desafio_2.exercicio_1.PessoaImutavel;

public class Principal {

    public static void main(String[] args) {

        String json = """
                {
                    "nome": "Fulano de Tal",
                    "idade": 36,
                    "cidade": "Quixeramobim/CE"
                }
                """;

        Gson gson = new GsonBuilder()
                    .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                    .create();

        PessoaImutavel pessoa1 = gson.fromJson(json, PessoaImutavel.class);

        System.out.println(pessoa1);

    }

}
