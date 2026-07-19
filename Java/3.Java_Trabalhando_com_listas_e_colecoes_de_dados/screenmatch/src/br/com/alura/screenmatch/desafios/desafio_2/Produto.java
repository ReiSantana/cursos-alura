package br.com.alura.screenmatch.desafios.desafio_2;

public class Produto {

    private String nome;
    private double preco;
    private double quantidade;

    public Produto(String nome, double preco, double quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return this.nome + " (Preço: " + this.preco + " | Quantidade: " + this.quantidade + ")";
    }

}
