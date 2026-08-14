package br.com.alura.screenmatch.desafios.desafio_2.exercicio_1;

public class Pessoa {

    private String nome;
    private int idade;
    private String cidade;

    public Pessoa(String nome, int idade, String cidade) {
        this.nome = nome;
        this.idade = idade;
        this.cidade = cidade;
    }

    public Pessoa(PessoaImutavel pessoa1) {
        this.nome = pessoa1.nome();
        this.idade = Integer.valueOf(pessoa1.idade());
        this.cidade = pessoa1.cidade();
    }

    public String toString() {
        return "Nome: " + nome + " (" + idade + " anos)" +
                " - Cidade: " + cidade;
    }
    
}
