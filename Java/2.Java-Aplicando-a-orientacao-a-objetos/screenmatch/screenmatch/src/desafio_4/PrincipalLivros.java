package desafio_4;

import desafio_4.modelos.LivroEletronico;
import desafio_4.modelos.LivroFisico;

public class PrincipalLivros {

    public static void main(String[] args) {

        double precoBase = 85.0;
        double porcDesconto = 15;
        double valorFrete = 9.99;

        LivroFisico livroFisico = new LivroFisico(precoBase, valorFrete);
        double precoFinalLivroFisico = livroFisico.calcularPrecoFinal();
        System.out.println("Preços do livro físico: base = " + precoBase + ", final = " + precoFinalLivroFisico);

        LivroEletronico livroEletronico = new LivroEletronico(precoBase, porcDesconto);
        double precoFinalLivroEletronico = livroEletronico.calcularPrecoFinal();
        System.out.println("Preços do livro eletrônico: base = " + precoBase + ", final = " + precoFinalLivroEletronico);
    }

}
