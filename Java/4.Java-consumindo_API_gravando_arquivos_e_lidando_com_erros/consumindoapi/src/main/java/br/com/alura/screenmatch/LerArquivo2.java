package br.com.alura.screenmatch;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LerArquivo2 {
    public static void main(String[] args) {
        try {
            Scanner leTeclado = new Scanner(System.in);
            System.out.println("Digite o nome do arquivo que deseja ler:");
            String fileName = leTeclado.nextLine();
            leTeclado.close();

            File arquivo = new File(fileName);
            Scanner scanner = new Scanner(arquivo);

            System.out.println("----------------------------------------------------");
            System.out.println("Conteúdo do arquivo " + fileName + ":");
            while (scanner.hasNextLine()) {
                String linha = scanner.nextLine();
                System.out.println(linha);
            }
            System.out.println("----------------------------------------------------");

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado!");
        }
    }
}
