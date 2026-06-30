public class Filme {
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        // double notaMedia = somaDasAvaliacoes / totalDeAvaliacoes;
        // ou
        double notaMedia = pegaMedia();
        System.out.println(String.format("Média das avaliações (%d): %.2f", totalDeAvaliacoes, notaMedia));
    }

    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        double media = somaDasAvaliacoes / totalDeAvaliacoes;
        return media;
    }
}
