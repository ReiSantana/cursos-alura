package desafio_3;

public class Carro {
    
    private String modelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public String getModelo() {
        return modelo;
    }
    public void definirPrecos(double precoAno1, double precoAno2, double precoAno3) {
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public double getPrecoAno1() {
        return precoAno1;
    }
    public void setPrecoAno1(double precoAno1) {
        this.precoAno1 = precoAno1;
    }
    public double getPrecoAno2() {
        return precoAno2;
    }
    public void setPrecoAno2(double precoAno2) {
        this.precoAno2 = precoAno2;
    }
    public double getPrecoAno3() {
        return precoAno3;
    }

    public void setPrecoAno3(double precoAno3) {
        this.precoAno3 = precoAno3;
    }

    private double pegaMenorPreco() {
        double menorPreco = precoAno1;
        if (precoAno2 < menorPreco) {
            menorPreco = precoAno2;
        }
        if (precoAno3 < menorPreco) {
            menorPreco = precoAno3;
        }
        return menorPreco;
    }

    private double pegaMaiorPreco() {
        double maiorPreco = precoAno1;
        if (precoAno2 > maiorPreco) {
            maiorPreco = precoAno2;
        }
        if (precoAno3 > maiorPreco) {
            maiorPreco = precoAno3;
        }
        return maiorPreco;
    }

    private double menorPrecoUsandoMath() {
        return Math.min(precoAno1, Math.min(precoAno2, precoAno3));
    }

    private double maiorPrecoUsandoMath() {
        return Math.max(precoAno1, Math.max(precoAno2, precoAno3));
    }

    private double calculaMediaPreco() {
        return (precoAno1 + precoAno2 + precoAno3) / 3;
    }

    public void exibeInformacoes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Preço do 1º ano: R$" + precoAno1);
        System.out.println("Preço do 2º ano: R$" + precoAno2);
        System.out.println("Preço do 3º ano: R$" + precoAno3);
        System.out.println("Menor preço: R$" + pegaMenorPreco());
        System.out.println("Menor preço using Math: R$" + menorPrecoUsandoMath());
        System.out.println("Maior preço: R$" + pegaMaiorPreco());
        System.out.println("Maior preço using Math: R$" + maiorPrecoUsandoMath());
        System.out.println("Média de preços: R$" + calculaMediaPreco());
    }

}
