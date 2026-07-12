package desafio_4.modelos;

import desafio_4.calculos.Calculavel;

public class LivroFisico implements Calculavel {

    private double precoBase;
    private double valorFrete;

    public LivroFisico(double precoBase, double valorFrete) {
        this.precoBase = precoBase;
        this.valorFrete = valorFrete;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase + valorFrete;
    }

}
