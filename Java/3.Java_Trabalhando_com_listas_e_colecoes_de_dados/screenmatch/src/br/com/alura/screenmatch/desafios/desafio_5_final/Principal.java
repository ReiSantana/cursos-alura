package br.com.alura.screenmatch.desafios.desafio_5_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import br.com.alura.screenmatch.desafios.desafio_5_final.calculos.NumeroPorExtenso;
import br.com.alura.screenmatch.desafios.desafio_5_final.modelos.CartaoDeCredito;
import br.com.alura.screenmatch.desafios.desafio_5_final.modelos.Compra;

public class Principal {

    public static void main(String[] args) {

        Scanner leituraDados = new Scanner(System.in);

        int limiteCartao;

        while (true) {
            System.out.println("Informe o limite do cartão: ");
            limiteCartao = Integer.parseInt(leituraDados.nextLine());

            if (limiteCartao == 0) {
                System.out.println("Limite do cartão deve ser maior que zero");
            } else {
                break;
            }
        }

        CartaoDeCredito cartao = new CartaoDeCredito(limiteCartao);
        System.out.println("Limite informado: " + limiteCartao + " (" +
                            NumeroPorExtenso.converter((int) limiteCartao) + " Reais)");
        System.out.println("---------------------------------------------------------------------");

        List<Compra> listaDeCompras = new ArrayList<>();
        String descricaoCompra;
        double valorCompra;

        while (true) {

            System.out.println("Informe a descrição da compra (ou digite SAIR): ");
            descricaoCompra = leituraDados.nextLine();

            if (descricaoCompra.equalsIgnoreCase("SAIR")) {
                break;
            }

            System.out.println("Informe o valor da compra: ");
            valorCompra = Double.parseDouble(leituraDados.nextLine());

            if (cartao.debitaCompra(valorCompra)) {

                listaDeCompras.add(new Compra(descricaoCompra, valorCompra));

                if (cartao.getSaldoCartao() == 0) {
                    System.out.println("Limite do cartão atingido");
                    break;
                }
            }

        }

        System.out.println("----------------------------------------------------------");
        if (listaDeCompras.size() > 0) {

            Collections.sort(listaDeCompras);

            System.out.println("Itens comprados:");
            for (Compra compra : listaDeCompras) {
                System.out.println(compra);
            }
        } else {
            System.out.println("Não há itens na lista de compras");
        }
        System.out.println("----------------------------------------------------------");

        System.out.println("Saldo do cartão: " + cartao.getSaldoCartao() + " (" +
                            NumeroPorExtenso.converter((int) cartao.getSaldoCartao()) + " Reais)");
        System.out.println("----------------------------------------------------------");

        leituraDados.close();

    }

}
