package br.com.alura.screenmatch.desafios.desafio_3.exercicio_5;

public class Quadrado extends Figura implements Forma {

    private double ladoQuadrado;

    public Quadrado(String nome, double lado) {
        super.setNome(nome);
        this.ladoQuadrado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.ladoQuadrado, 2);
    }

    public double getLado() {
        return this.ladoQuadrado;
    }

    public String getNome() {
        return super.getNome();
    }

}
