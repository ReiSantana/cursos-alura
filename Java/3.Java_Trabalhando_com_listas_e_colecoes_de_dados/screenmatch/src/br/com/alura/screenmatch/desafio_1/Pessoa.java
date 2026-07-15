package br.com.alura.screenmatch.desafio_1;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    @Override
    public String toString() {
        return "Pessoa: " + this.nome + " (" + this.idade + ")";
    }

}
