import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        System.out.println("**---------------------------------------------**");
        Filme meuFilme = new Filme();
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1972);
        meuFilme.setDuracaoEmMinutos(175);

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        System.out.println("**---------------------------------------------**");
        // Testando a classe Serie
        Serie minhaSerie = new Serie();
        minhaSerie.setNome("Breaking Bad");
        minhaSerie.setAnoDeLancamento(2008);
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

        System.out.println("**---------------------------------------------**");
        Filme outroFilme = new Filme();
        outroFilme.setNome("A Ilha do Medo");
        outroFilme.setAnoDeLancamento(1972);
        outroFilme.setDuracaoEmMinutos(120);
        outroFilme.avalia(9.5);
        outroFilme.avalia(10);
        outroFilme.avalia(10);

        outroFilme.exibeFichaTecnica();

        System.out.println("**----------------------------------------------------------------------------------------**");

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        System.out.println("Tempo total (com \"" + meuFilme.getNome() + "\"): " + calculadora.getTempoTotal() + " minutos");

        calculadora.inclui(minhaSerie);
        System.out.println("Tempo total (com \"" + minhaSerie.getNome() + "\"): " + calculadora.getTempoTotal() + " minutos");

        calculadora.inclui(outroFilme);
        System.out.println("Tempo total (com \"" + outroFilme.getNome() + "\"): " + calculadora.getTempoTotal() + " minutos");


    }
}
