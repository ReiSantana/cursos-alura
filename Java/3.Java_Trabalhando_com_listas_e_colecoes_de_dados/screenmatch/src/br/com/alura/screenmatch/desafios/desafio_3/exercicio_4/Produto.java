package br.com.alura.screenmatch.desafios.desafio_3.exercicio_4;

public class Produto {

    private String nomeProduto;
    private double precoProduto;

    public Produto(String nomeProduto, double precoProduto) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
    }
    
    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public double getPrecoProduto() {
        return this.precoProduto;
    }

}
