package desafio_4.modelos;

import desafio_4.calculos.Vendavel;

public class Servico implements Vendavel {

    private double precoBase;
    private double desc1000 = 10;
    private double desc10000 = 20;
    private double desc100000 = 30;

    public Servico(double precoBase) {
        this.precoBase = precoBase;
    }

    @Override
    public double calcularPrecoTotal() {

        double vlrPreco1000 = 1000.0;
        double vlrPreco10000 = 10000.0;
        double vlrPreco100000 = 100000.0;
        double porcentagemDesconto = 0;


        if (this.precoBase <= 0) {
            throw new IllegalArgumentException("Valor do serviço inválido");
        }

        if (this.precoBase >= vlrPreco1000 && this.precoBase < vlrPreco10000) {
            porcentagemDesconto = desc1000;
        } else if (this.precoBase >= vlrPreco10000 && this.precoBase < vlrPreco100000) {
            porcentagemDesconto = desc10000;
        } else if (this.precoBase >= vlrPreco100000) {
            porcentagemDesconto = desc100000;
        }

        return precoBase * (1 - porcentagemDesconto / 100.0);
    }

}
