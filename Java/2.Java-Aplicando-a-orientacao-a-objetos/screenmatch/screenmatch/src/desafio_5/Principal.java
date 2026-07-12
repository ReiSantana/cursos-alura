package desafio_5;

import desafio_5.modelos.MinhasPreferidas;
import desafio_5.modelos.Musica;
import desafio_5.modelos.Podcast;

public class Principal {

    public static void main(String[] args) {
        
        System.out.print("\033c"); // limpa o terminal

        Musica minhaMusica = new Musica();
        minhaMusica.setTipo("Música");
        minhaMusica.setTitulo("Forever Young");
        minhaMusica.setArtista("Alphaville");
        minhaMusica.setAlbum("Forever Young");

        for (int i = 0; i < 100001; i++) {
            minhaMusica.reproduz();
        }

        for (int i = 0; i < 10; i++) {
            minhaMusica.curte();
        }

        System.out.println("------------------------------------------------------------\n");
        System.out.println("Tipo: " + minhaMusica.getTipo());
        System.out.println("Título: " + minhaMusica.getTitulo());
        System.out.println("Artista: " + minhaMusica.getArtista());
        System.out.println("Album: " + minhaMusica.getAlbum());
        System.out.println("Total de reproduções: " + minhaMusica.getTotalReproducoes());
        System.out.println("Total de curtidas: " + minhaMusica.getTotalCurtidas());
        System.out.println("Classificação: " + minhaMusica.getClassificacao());

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTipo("Podcast");
        meuPodcast.setTitulo("A Grande Fúria do Mundo");
        meuPodcast.setApresentador("Pedro Mota Cortella e Mario Sergio Cortella");
        meuPodcast.setEpisodio("Opinião sobre tudo");

        for (int i = 0; i < 500; i++) {
            meuPodcast.reproduz();
        }

        for (int i = 0; i < 100; i++) {
            meuPodcast.curte();
        }

        System.out.println("\n------------------------------------------------------------\n");
        System.out.println("Tipo: " + meuPodcast.getTipo());
        System.out.println("Título: " + meuPodcast.getTitulo());
        System.out.println("Apresentador: " + meuPodcast.getApresentador());
        System.out.println("Total de reproduções: " + meuPodcast.getTotalReproducoes());
        System.out.println("Total de curtidas: " + meuPodcast.getTotalCurtidas());
        System.out.println("Classificação: " + meuPodcast.getClassificacao());

        System.out.println("\n---------------------------------------------------------------------------");
        MinhasPreferidas minhasPreferidas = new MinhasPreferidas();
        minhasPreferidas.inclui(minhaMusica);
        minhasPreferidas.inclui(meuPodcast);
        System.out.println("---------------------------------------------------------------------------\n");


    }

}
