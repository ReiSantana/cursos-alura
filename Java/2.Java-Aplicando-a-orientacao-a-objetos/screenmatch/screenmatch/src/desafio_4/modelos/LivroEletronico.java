package desafio_4.modelos;

import desafio_4.calculos.Calculavel;

public class LivroEletronico implements Calculavel {

    private double precoBase;
    private double porcDesconto;

    public LivroEletronico(double precoBase, double porcDesconto) {
        this.precoBase = precoBase;
        this.porcDesconto = porcDesconto;
    }

    @Override
    public double calcularPrecoFinal() {
        return precoBase - (precoBase * porcDesconto / 100);
    }

}
