public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;
        System.out.println("Ano de lançamento: " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double media = (9.8 + 6.3 + notaDoFilme) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = "Filme de aventura com galã dos anos 80";
        System.out.println("Sinopse: " + sinopse);

        sinopse = """
                  Filme Top Gun: Maverick
                  Filme de aventura com galã dos anos 80
                  Muito bom!
                  Ano de lançamento: 
                  """ + anoDeLancamento;
        System.out.println("Sinopse: " + sinopse);
        if (incluidoNoPlano) {
            System.out.println("Este filme está incluído no seu plano.");
        }

        int classificacao;
        //fazendo a conversão entre tipos de dados (cast)
        classificacao = (int) (media / 2);
        System.out.println("estrelas = " + classificacao);


        String texto = "a minha idade é ";
        int idade = 17;
        System.out.println(texto + idade);

    }
}