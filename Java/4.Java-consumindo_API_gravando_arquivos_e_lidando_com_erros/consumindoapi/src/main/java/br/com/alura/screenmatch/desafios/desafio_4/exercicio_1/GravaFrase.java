package br.com.alura.screenmatch.desafios.desafio_4.exercicio_1;

import java.io.File;

public class GravaFrase {

    public static void main(String[] args) {
        String frase = "Conteúdo a ser gravado no arquivo.";
        String arquivo = "C:\\Users\\reisa\\cursos\\cursos-alura\\Java\\4.Java-consumindo_API_gravando_arquivos_e_lidando_com_erros\\consumindoapi\\src\\main\\java\\br\\com\\alura\\screenmatch\\desafios\\desafio_4\\exercicio_1\\frase.txt";

        try {
            GravaArquivo.gravar(frase, arquivo);
            System.out.println("Frase gravada com sucesso no arquivo: " + arquivo);
        } catch (Exception e) {
            System.out.println("Erro ao gravar a frase: " + e.getMessage());
        }
    }

    private static class GravaArquivo {
        public static void gravar(String conteudo, String nomeArquivo) throws Exception {
            // Simulação de gravação em arquivo
            if (conteudo == null || nomeArquivo == null) {
                throw new Exception("Conteúdo ou nome do arquivo não podem ser nulos.");
            }
            File arquivo = new File(nomeArquivo);
            // Aqui você poderia implementar a lógica real de gravação em arquivo
            java.io.FileWriter fileWriter = new java.io.FileWriter(arquivo);
            fileWriter.write(conteudo);
            fileWriter.close();
        }
    }

}
