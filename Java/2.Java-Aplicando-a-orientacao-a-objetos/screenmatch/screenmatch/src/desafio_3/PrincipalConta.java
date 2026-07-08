package desafio_3;

public class PrincipalConta {

    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.depositar(1000.0);
        contaCorrente.setLimite(500.0);

        System.out.println("Saldo inicial: " + contaCorrente.getSaldo());
        System.out.println("Limite: " + contaCorrente.getLimite());

        contaCorrente.cobrarTaxaManutencao();
        System.out.println("Saldo após cobrança da taxa: " + contaCorrente.getSaldo());

        contaCorrente.sacar(1200.0);
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());

        contaCorrente.sacar(400.0);
        System.out.println("Saldo após saque: " + contaCorrente.getSaldo());
    }
    

}
