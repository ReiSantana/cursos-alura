package desafio;

public class PrincipalMusica {
    public static void main(String[] args) {

        Musica musica1 = new Musica();
        musica1.titulo = "Eu não sou cachorro, não!";
        musica1.artista = "Waldick Soriano";
        musica1.anoLancamento = 1972;
        
        System.out.println("---------------------------------------");
        musica1.exibeFicha();
        System.out.println("---------------------------------------");

        musica1.avaliaMusica(7);
        musica1.avaliaMusica(6.5);
        musica1.avaliaMusica(9);
        musica1.avaliaMusica(2);
        musica1.avaliaMusica(8.5);
        musica1.exibeFicha();
    }

}
