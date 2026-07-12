package desafio_4;

import desafio_4.modelos.Produto;
import desafio_4.modelos.Servico;

public class PrincipalProdServ {

    public static void main(String[] args) {
        
        double precoBaseProduto = 100.0;
        double qtdeProduto = 120;

        double precoBaseServico = 15000.0;

        // Criando instância de Produto
        Produto produto = new Produto(precoBaseProduto, qtdeProduto);

        // Criando instância de Servico
        Servico servico = new Servico(precoBaseServico);

        // Calculando preço total do produto
        double precoTotalProduto = produto.calcularPrecoTotal();
        System.out.println("Preço total do produto: " + precoTotalProduto);

        // Calculando preço total do serviço
        double precoTotalServico = servico.calcularPrecoTotal();
        System.out.println("Preço total do serviço: " + precoTotalServico);
        
        }

}
