package br.com.alura.screenmatch.desafio_2;

import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {

    LocalDate dataValidade;

    public ProdutoPerecivel(String nome, double preco, double quantidade, LocalDate dataValidade) {
        super(nome, preco, quantidade);
        this.dataValidade = dataValidade;
    }

}
