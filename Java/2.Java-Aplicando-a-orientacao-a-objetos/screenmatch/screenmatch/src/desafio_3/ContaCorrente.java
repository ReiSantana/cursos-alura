package desafio_3;

public class ContaCorrente extends ContaBancaria {

    private double limite;

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public double getLimite() {
        return limite;
    }

    public void cobrarTaxaManutencao() {
        double taxa = 10.0; // Valor da taxa de manutenção
        if (getSaldo() >= taxa) {
            sacar(taxa);
            System.out.println("Taxa de manutenção cobrada: " + taxa);
        } else {
            System.out.println("Saldo insuficiente para cobrar a taxa de manutenção.");
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor <= getSaldo() + limite) {
            super.sacar(valor);
        } else {
            System.out.println("Saldo insuficiente, incluindo o limite.");
        }
    }

}
