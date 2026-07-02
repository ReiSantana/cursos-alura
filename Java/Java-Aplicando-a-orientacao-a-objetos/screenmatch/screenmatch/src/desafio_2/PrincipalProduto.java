package desafio_2;

public class PrincipalProduto {
    public static void main(String[] args) {

        Produto meuProduto = new Produto();
        meuProduto.setNome("Produto XYZ");
        meuProduto.setPreco(1234.56);

        System.out.println("Produto: " + meuProduto.getNome());
        System.out.println("Preço: " + meuProduto.getPreco());

        double porcentagem = 15;

        System.out.println(String.format("Novo valor do produto com desconto de %.2f%% = %.2f", porcentagem, meuProduto.aplicaDesconto(porcentagem)));

    }

}
