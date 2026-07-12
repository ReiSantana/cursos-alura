package desafio_5.modelos;

public class MinhasPreferidas {

    public void inclui(Audio audio) {

        String tipo = "";
        String inicioFrase = "";
        String complemento = "";
        String fraseSucesso = "";

        tipo = audio.getTipo().toLowerCase();

        if (audio.getTipo().equals("Música")) {
            inicioFrase = "A " + tipo + " \"" + audio.getTitulo() + "\"";
            complemento = " é uma da";
            fraseSucesso = "A " + tipo + " \"" + audio.getTitulo();
        } else if (audio.getTipo().equals("Podcast")) {
            inicioFrase = "O " + tipo + " \"" + audio.getTitulo() + "\"";
            complemento = " é um do";
            fraseSucesso = "O " + tipo + " \"" + audio.getTitulo();
        }

        if (audio.getClassificacao() >= 9) {
            System.out.println(fraseSucesso + "\" é sucesso absoluto!");
        } else {
            System.out.println(inicioFrase + complemento + "s que todo mundo está curtindo");
        }
    }


}
