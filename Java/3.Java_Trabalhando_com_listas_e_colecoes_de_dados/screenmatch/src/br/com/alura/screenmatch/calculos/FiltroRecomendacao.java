package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtra(Classificavel classificavel) {

        if (classificavel.getClassificacao() >= 4) {
            System.out.println("Está entre os preferidos do momento");
        } else if (classificavel.getClassificacao() == 3) {
            System.out.println("Está bem avaliado");
        } else {
            System.out.println("Está na média");
        }

    }

}
