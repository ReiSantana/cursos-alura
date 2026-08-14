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

    public Pessoa(PessoaImutavel vPessoa) {
        this.nome = vPessoa.nome();
        this.idade = Integer.valueOf(vPessoa.idade());
        this.cidade = vPessoa.cidade();
    }

    public String toString() {
        return "Nome: " + nome + " (" + idade + ")" +
                " - Cidade: " + cidade;
    }
    
}
