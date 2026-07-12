package desafio_5.modelos;

public class Musica extends Audio {
    private String album;
    private String artista;
    private int genero;

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getGenero() {
        return genero;
    }

    public void setGenero(int genero) {
        this.genero = genero;
    }

    @Override
    public int getClassificacao() {
        int nota = 0;
        if (this.getTotalReproducoes() > 100000) {
            nota = 10;
        } else {
            nota = 7;
        } 
        return nota;
    }

}
