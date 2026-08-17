package br.com.alura.screenmatch.desafios.desafio_3.exercicio_2;

public class ExcecaoTamanhoSenha extends RuntimeException {

    private String mensagem;

    public ExcecaoTamanhoSenha(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
