package br.com.alura.screenmatch.desafios.desafio_3.exercicio_6;

public class ContaBancaria {

    private int numeroConta;
    private double saldo;

    public ContaBancaria(int numero, double saldo) {
        this.numeroConta = numero;
        this.saldo = saldo;
    }

    public void setNumero(int numero) {
        this.numeroConta = numero;
    }
    
    public int getNumero() {
        return this.numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        saldo -= valor;
    }

}
