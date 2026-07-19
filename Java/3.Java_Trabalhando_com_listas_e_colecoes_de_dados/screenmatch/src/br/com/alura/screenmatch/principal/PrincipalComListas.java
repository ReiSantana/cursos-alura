import java.util.ArrayList;

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

    }

}
