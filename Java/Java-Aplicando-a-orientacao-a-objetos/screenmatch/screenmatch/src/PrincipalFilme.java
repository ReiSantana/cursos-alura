public class PrincipalFilme {
    public static void main(String[] args) {
        Filme meuFilme = new Filme();
        meuFilme.nome = "O Poderoso Chefão";
        meuFilme.anoDeLancamento = 1972;
        meuFilme.duracaoEmMinutos = 175;

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        meuFilme.exibeFichaTecnica();

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());

    }
}
