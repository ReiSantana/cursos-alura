package br.com.alura.screenmatch.desafio_1;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        Pessoa pessoa1 = new Pessoa("Fulana", 28);

        listaDePessoas.add(pessoa1);
        // ou 
        // listaDePessoas.add(new Pessoa("Alice", 30));

        Pessoa pessoa2 = new Pessoa("Beltrano", 25);
        Pessoa pessoa3 = new Pessoa("Ciclano", 35);

        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira pessoa na lista: " + listaDePessoas.get(0));
        System.out.println("Todas as pessoas da lista: " + listaDePessoas);
        System.out.println("********************************************");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }

    }

}
