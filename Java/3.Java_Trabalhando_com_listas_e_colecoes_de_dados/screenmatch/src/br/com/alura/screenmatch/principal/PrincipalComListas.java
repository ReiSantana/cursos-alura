import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class PrincipalComListas {
    public static void main(String[] args) {
            
        Filme meuFilme = new Filme("O Poderoso Chefão", 1972);
        Filme outroFilme = new Filme("A Ilha do Medo", 1972);
        var filmeDoPaulo = new Filme("Dogville", 2003);
        Serie minhaSerie = new Serie("Breaking Bad", 2008);

        ArrayList<Titulo> lista = new ArrayList<>();

        lista.add(filmeDoPaulo);
        filmeDoPaulo.avalia(10);

        lista.add(meuFilme);
        meuFilme.avalia(9);

        lista.add(outroFilme);
        outroFilme.avalia(7);

        lista.add(minhaSerie);

        for (Titulo item : lista) {
            System.out.println(item.getNome());
            // Filme filme = (Filme) item; // tratando o item como um filme
            if (item instanceof Filme filme) { // pergunta se o objeto é um filme e já atribui um nome "filme" para a referência a ele
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Ewan McGregor");
        buscaPorArtista.add("Sofia Loren");
        buscaPorArtista.add("Marcello Mastroianni");
        buscaPorArtista.add("Grande Otelo");
        buscaPorArtista.add("Tonia Carrero");
        buscaPorArtista.add("Gloria Menezes");
        buscaPorArtista.add("Dina Sfat");

        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        //Apresentando a lista de Filmes
        System.out.println("Lista de títulos:");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista de títulos depois da ordenação:");
        System.out.println(lista);

        //ordenando pelo ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando pelo ano de lançamento");
        System.out.println(lista);
    }

}
