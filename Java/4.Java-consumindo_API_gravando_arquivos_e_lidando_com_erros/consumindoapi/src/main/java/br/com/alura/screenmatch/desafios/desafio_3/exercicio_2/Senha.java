package br.com.alura.screenmatch.desafios.desafio_3.exercicio_2;

import java.util.Scanner;

public class Senha {

    public static void main(String[] args) {

        Scanner leTeclado = new Scanner(System.in);
        System.out.println("Digite a senha:");

        var senha = leTeclado.nextLine();
        leTeclado.close();

        try {
            validarSenha(senha);
            System.out.println("Senha válida!");
        } catch (ExcecaoTamanhoSenha e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    private static void validarSenha(String senha) {
        if (senha.length() < 8) {
            throw new ExcecaoTamanhoSenha("A senha deve ter pelo menos 8 caracteres.");
        }
    }


}
