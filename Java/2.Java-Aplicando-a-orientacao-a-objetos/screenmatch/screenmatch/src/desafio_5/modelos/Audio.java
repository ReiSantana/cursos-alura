package desafio_5.modelos;

public class Audio {
    private String titulo;
    private String tipo;
    private int totalCurtidas;
    private int totalReproducoes;
    private int classificacao;

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void curte() {
        this.totalCurtidas++;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public void reproduz() {
        this.totalReproducoes++;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

}
