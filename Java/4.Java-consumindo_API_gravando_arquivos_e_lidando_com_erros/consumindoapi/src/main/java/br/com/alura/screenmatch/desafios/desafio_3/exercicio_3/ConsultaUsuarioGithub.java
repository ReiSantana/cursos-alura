package br.com.alura.screenmatch.desafios.desafio_3.exercicio_3;

import java.util.Scanner;

public class ConsultaUsuarioGithub {

    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);
        System.out.print("Digite o nome de usuário do GitHub: ");
        String usuario = leTeclado.nextLine();
        leTeclado.close();

        try {
            String resultado = consultarUsuarioGithub(usuario);
            System.out.println("Resultado da consulta: " + resultado);
        } catch (ErroConsultaGitHubException e) {
            System.out.println("Erro na consulta ao GitHub: " + e.getMessage());
        }
    }

    private static String consultarUsuarioGithub(String usuario) {

        if (usuario.equals(usuario)) {
            return "Informações do usuário " + usuario + ":";
        } else {
            throw new ErroConsultaGitHubException("Usuário não encontrado no GitHub.");
        }
    }

}
