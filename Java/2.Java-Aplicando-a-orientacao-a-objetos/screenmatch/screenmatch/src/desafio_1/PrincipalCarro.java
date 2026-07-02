package desafio_1;

public class PrincipalCarro {

    public static void main(String[] args) {

        Carro meuCarro  = new Carro();
        meuCarro.marca  = "Romi";
        meuCarro.modelo = "Romi-Isetta";
        meuCarro.cor    = "Branco e amarelo-limão";
        meuCarro.ano    = 1961;
        meuCarro.cilindrada = 298;

        System.out.println("---------------------------------------");
        meuCarro.exibeFichaTecnica();
        System.out.println("---------------------------------------");
    }

}
