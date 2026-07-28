package br.com.alura.screenmatch.desafios.desafio_4.exercicio_2;

public class Titulo implements Comparable<Titulo> {

    private String nome;

    public Titulo (String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Livro: " + this.getNome();
    }

}
