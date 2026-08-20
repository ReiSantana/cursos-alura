package br.com.alura.screenmatch.desafios.desafio_4.exercicio_4;

public class Veiculo {

    private String marca;
    private String modelo;
    private int ano;
    private String idChassi;
    private int potencia;

    public Veiculo(String marca, String modelo, int ano, String idChassi, int potencia) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.idChassi = idChassi;
        this.potencia = potencia;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public String getIdChassi() {
        return idChassi;
    }

    public int getPotencia() {
        return potencia;
    }

}
