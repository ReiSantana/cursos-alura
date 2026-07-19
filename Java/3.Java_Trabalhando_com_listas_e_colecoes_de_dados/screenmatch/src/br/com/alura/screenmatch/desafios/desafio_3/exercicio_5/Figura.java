package br.com.alura.screenmatch.desafios.desafio_3.exercicio_5;

public class Figura {

    private String nome;

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return this.nome;
    }

    public String toString() {
        return this.getNome();
    }

}
