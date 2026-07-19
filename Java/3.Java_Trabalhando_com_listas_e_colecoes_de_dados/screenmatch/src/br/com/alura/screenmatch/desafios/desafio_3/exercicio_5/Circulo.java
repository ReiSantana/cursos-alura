package br.com.alura.screenmatch.desafios.desafio_3.exercicio_5;

public class Circulo extends Figura implements Forma {

    private double raioCirculo;

    public Circulo(String nome, double raio) {
        super.setNome(nome);
        this.raioCirculo = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (Math.pow(this.raioCirculo, 2));
    }

    public double getRaio() {
        return this.raioCirculo;
    }

}
