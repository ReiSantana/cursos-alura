package desafio_2;

public class PrincipalAluno {
    public static void main(String[] args) {

        Aluno aluno1 = new Aluno();

        aluno1.setNome("Fulano da Silva Sauro");

        aluno1.setNota1(7.5);
        aluno1.setNota2(8.0);
        aluno1.setNota3(7.5);

        System.out.println(String.format("A média das notas do aluno %s é %.2f", aluno1.getNome(), aluno1.calcularMedia()));

    }

}
