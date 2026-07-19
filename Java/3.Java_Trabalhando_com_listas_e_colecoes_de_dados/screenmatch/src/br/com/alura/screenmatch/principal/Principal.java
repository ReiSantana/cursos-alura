
import java.util.ArrayList;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        FiltroRecomendacao filtro = new FiltroRecomendacao();

        System.out.println("**---------------------------------------------**");
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();
        System.out.println("Classificação do filme \"" + meuFilme.getNome() + "\": ");
        filtro.filtra(meuFilme);

        System.out.println("**---------------------------------------------**");
        // Testando a classe Serie
        Serie minhaSerie = new Serie("Breaking Bad", 2008);
        minhaSerie.setIncluidoNoPlano(true);
        minhaSerie.setAtiva(true);
        minhaSerie.setTemporadas(5);
        minhaSerie.setEpisodiosPorTemporada(62);
        minhaSerie.setMinutosPorEpisodio(47);

        minhaSerie.avalia(9);
        minhaSerie.avalia(10);
        minhaSerie.avalia(8);
        minhaSerie.avalia(7);

        minhaSerie.exibeFichaTecnica();
        Episodio episodio1 = new Episodio("Pilot", 2008);
        episodio1.setNumero(1);
        episodio1.setSerie(minhaSerie);
        episodio1.setTotalVisualizacoes(300);
        System.out.println("Classificação do episódio \"" + episodio1.getNome() + "\": ");
        filtro.filtra(episodio1);

        System.out.println("**---------------------------------------------**");
        Filme outroFilme = new Filme("A Ilha do Medo", 1972);
        outroFilme.setDuracaoEmMinutos(120);
        outroFilme.avalia(9.5);
        outroFilme.avalia(10);
        outroFilme.avalia(10);

        outroFilme.exibeFichaTecnica();

        System.out.println(
                "**----------------------------------------------------------------------------------------**");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        System.out.println(
                "Tempo total (com \"" + meuFilme.getNome() + "\"): " + calculadora.getTempoTotal() + " minutos");

        calculadora.inclui(minhaSerie);
        System.out.println(
                "Tempo total (com \"" + minhaSerie.getNome() + "\"): " + calculadora.getTempoTotal() + " minutos");

        calculadora.inclui(outroFilme);
        System.out.println(
                        "Tempo total (com \"" + outroFilme.getNome() + "\"): " + calculadora.getTempoTotal()
                                        + " minutos");


        // Aqui começou o curso de Listas e Coleções de Dados
        var filmeDoPaulo = new Filme("Dogville", 2003);
        filmeDoPaulo.setDuracaoEmMinutos(178);
        filmeDoPaulo.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoPaulo);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.get(0).getNome());
        System.out.println("Todos os filmes da lista: " + listaDeFilmes);
        // Substituindo o toString() da classe Filme para exibir apenas o nome do filme
        System.out.println("Todos os filmes da lista (usando toString() sobrescrito): " + listaDeFilmes);

        //********************************************************************
        /*
        System.out.println("Todos os filmes da lista (usando for):");
        for (Filme filme : listaDeFilmes) {
                System.out.println(filme.getNome());
        }
        System.out.println("Todos os filmes da lista (usando forEach):");
        listaDeFilmes.forEach(filme -> System.out.println(filme.getNome()));
        System.out.println("Todos os filmes da lista (usando forEach e method reference):");
        listaDeFilmes.forEach(System.out::println);
        System.out.println("Todos os filmes da lista (usando forEach e method reference para exibir apenas o nome):");
        listaDeFilmes.forEach(filme -> System.out.println(filme.getNome()));
        */





    }
}
