package desafio_5.modelos;

public class Podcast extends Audio {

    private String apresentador;
    private String episodio;
    
    public String getApresentador() {
        return apresentador;
    }

    public void setApresentador(String apresentador) {
        this.apresentador = apresentador;
    }

    public String getEpisodio() {
        return episodio;
    }

    public void setEpisodio(String episodio) {
        this.episodio = episodio;
    }

    @Override
    public int getClassificacao() {
        int nota = 0;
        if (this.getTotalCurtidas() > 500) {
            nota = 10;
        } else if (this.getTotalCurtidas() > 300) {
            nota = 8;
        } else if (this.getTotalCurtidas() > 100) {
            nota = 6;
        } else {
            nota = 4;
        }
        return nota;
    }

}
