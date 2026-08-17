package br.com.alura.screenmatch.desafios.desafio_3.exercicio_3;

public class ErroConsultaGitHubException extends RuntimeException {

    private String mensagem;

    public ErroConsultaGitHubException(String mensagem) {
        this.mensagem = mensagem;
    }

    @Override
    public String getMessage() {
        return this.mensagem;
    }

}
