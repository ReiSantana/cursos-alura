package desafio;
public class Musica {

    String titulo;
    String artista;
    int anoLancamento;
    double somaDasAvaliacoes;
    int numAvaliacoes;
    
    void exibeFicha() {
        System.out.println("Dados da Música");
        System.out.println("Título: " + titulo);
        System.out.println("Artista: " + artista);
        System.out.println("Ano do lançamento: " + anoLancamento);

        if (numAvaliacoes > 0) {
            System.out.println("Média das avaliações (" + numAvaliacoes + "): " + pegaMedia());
        } else {
            System.out.println("A música ainda não possui avaliações");
        }
    }

    void avaliaMusica (double nota) {

        somaDasAvaliacoes += nota;
        numAvaliacoes++;
   
    }

    double pegaMedia() {
        double media = somaDasAvaliacoes / numAvaliacoes;
        return media;
    }

}
