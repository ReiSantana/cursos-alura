package desafio_4.modelos;

import desafio_4.calculos.Vendavel;

public class Produto implements Vendavel {

    private double precoBase;
    private double qtdeProduto;

    public Produto(double precoBase, double qtdeProduto) {
        this.precoBase = precoBase;
        this.qtdeProduto = qtdeProduto;
    }

    @Override
    public double calcularPrecoTotal() {

        int Qtde10 = 0;
        int Qtde50 = 10;
        int qtde100 = 20;
        int qtde500 = 30;
        int qtde1000 = 50;
        int porcentagemDesconto = 0;

        if (qtdeProduto <= 0) {
            throw new IllegalArgumentException("Quantidade de produtos inválida");
        } else if (precoBase <= 0) {
            throw new IllegalArgumentException("Preço base do produto inválido");
        } else if (qtdeProduto >= 10 && qtdeProduto < 50) {
            porcentagemDesconto = Qtde10;
        } else if (qtdeProduto >= 50 && qtdeProduto < 100) {
            porcentagemDesconto = Qtde50;
        } else if (qtdeProduto >= 100 && qtdeProduto < 500) {
            porcentagemDesconto = qtde100;
        } else if (qtdeProduto >= 500 && qtdeProduto < 1000) {
            porcentagemDesconto = qtde500;
        } else if (qtdeProduto >= 1000) {
            porcentagemDesconto = qtde1000;
        }
        return precoBase * qtdeProduto * (1 - porcentagemDesconto / 100.0);
    }

}
