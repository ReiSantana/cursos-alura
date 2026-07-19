package br.com.alura.screenmatch.desafios.desafio_3.exercicio_6;

import java.util.ArrayList;

public class Principal {

    public static void main(String[] args) {
        
        ContaBancaria conta1 = new ContaBancaria(10, 8936.24);
        ContaBancaria conta2 = new ContaBancaria(20, 118936.24);
        ContaBancaria conta3 = new ContaBancaria(30, 200936.24);
        ContaBancaria conta4 = new ContaBancaria(40, 38936.24);
        ContaBancaria conta5 = new ContaBancaria(50, 28936.24);
        ContaBancaria conta6 = new ContaBancaria(60, 6.24);

        ArrayList<ContaBancaria> listaDeContas = new ArrayList<>();

        listaDeContas.add(conta1);
        listaDeContas.add(conta2);
        listaDeContas.add(conta3);
        listaDeContas.add(conta4);
        listaDeContas.add(conta5);
        listaDeContas.add(conta6);

        System.out.println("Número de contas na lista: " + listaDeContas.size());

        int indiceConta = 0;
        int indiceMaior = 0;
        for (ContaBancaria contaBancaria : listaDeContas) {
            indiceConta = listaDeContas.indexOf(contaBancaria);
            /*
            System.out.println("índice atual: " + indiceConta + " | conta: " + listaDeContas.get(indiceConta).getNumero() +
                                " | saldo: " + listaDeContas.get(indiceConta).getSaldo());
            */
            if (indiceConta > 0
                    && listaDeContas.get(indiceConta).getSaldo() > listaDeContas.get(indiceMaior).getSaldo()) {
                indiceMaior = indiceConta;
            }

        }

        var numConta = listaDeContas.get(indiceMaior).getNumero();
        var saldoConta = listaDeContas.get(indiceMaior).getSaldo();
        System.out.println("O maior saldo é o da conta de número " + numConta + " no valor de " + saldoConta);


        // ou
        ContaBancaria contaMaiorSaldo = listaDeContas.get(0);
        for (ContaBancaria conta : listaDeContas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;
            }
        }
        System.out.println("Conta com o maior saldo - Número: " + contaMaiorSaldo.getNumero() +
                ", Saldo: " + contaMaiorSaldo.getSaldo());

    }

}
