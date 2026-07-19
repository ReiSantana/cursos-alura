package br.com.alura.screenmatch.desafios.desafio_2;

import java.time.LocalDate;
import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {

        ArrayList<Produto> listaDeProdutos = new ArrayList<>();

        Produto produto1 = new Produto("Cerveja", 12, 36);
        Produto produto2 = new Produto("Vinho", 46, 12);
        Produto produto3 = new Produto("Cachaça", 35, 18);
        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);

        System.out.println("Tamanho da lista de produtos: " + listaDeProdutos.size());
        System.out.println("Segundo item da lista: " + listaDeProdutos.get(1).getNome());

        System.out.println("Todos os produtos na lista: " + listaDeProdutos);

        ProdutoPerecivel produto4 = new ProdutoPerecivel("Farinha", 4.69, 8, LocalDate.of(2027, 5, 8));

        System.out.println("Produto: " + produto4.getNome() + " / Preço (R$): " + produto4.getPreco() + " / Qtde.: " + produto4.getQuantidade());
    }

}
