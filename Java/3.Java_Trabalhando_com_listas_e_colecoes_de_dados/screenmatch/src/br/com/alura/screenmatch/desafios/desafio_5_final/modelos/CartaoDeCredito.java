package br.com.alura.screenmatch.desafios.desafio_5_final.modelos;

public class CartaoDeCredito {

    private double limiteCartao;
    private double saldoCartao;

    public CartaoDeCredito (double limiteCartao) {
        this.limiteCartao = limiteCartao;
        this.saldoCartao = limiteCartao;
    }

    public double getLimiteCartao() {
        return limiteCartao;
    }
    public void setLimiteCartao(double limiteCartao) {
        this.limiteCartao = limiteCartao;
    }
    public double getSaldoCartao() {
        return saldoCartao;
    }

    public void setSaldoCartao(double saldoCartao) {
        this.saldoCartao = saldoCartao;
    }

    public boolean debitaCompra(double valorCompra) {
        if (valorCompra <= 0) {
            System.out.println(
                    "Valor da transação deve ser maior que zero - operação não efetivada");
            System.out.println(
                    "-----------------------------------------------------------------------------------------");
            return false;
        }
        if (valorCompra > this.saldoCartao) {
            System.out.println("Valor da transação é maior que limite do cartão (" + this.saldoCartao + ") - operação não efetivada");
            System.out.println("-----------------------------------------------------------------------------------------");
            return false;
        }
        
        this.saldoCartao -= valorCompra;
        System.out.println("Transação efetivada com sucesso. Saldo do Cartão: " + this.saldoCartao);
        System.out.println("-----------------------------------------------------------------------------------------");
        return true;

    }
    
}
