package br.com.alura.screenmatch.desafios.desafio_3.exercicio_4;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        Produto produto1 = new Produto("produto1", 12345.6);
        Produto produto2 = new Produto("produto2", 23456.7);
        Produto produto3 = new Produto("produto3", 34567.8);
        Produto produto4 = new Produto("produto4", 45678.9);

        ArrayList<Produto> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto1);
        listaProdutos.add(produto2);
        listaProdutos.add(produto3);
        listaProdutos.add(produto4);

        double totalProdutos = 0;
        for (Produto produto : listaProdutos) {
            totalProdutos += produto.getPrecoProduto();
        }

        double precoMedio = totalProdutos / listaProdutos.size();
        System.out.println("Preço médio dos produtos da lista: " + precoMedio);

    }

}
