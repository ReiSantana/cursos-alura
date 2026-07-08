package desafio_3;

public class PrincipalCarro {

    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setModelo("Fusca");
        carro.definirPrecos(10000, 12000, 15000);

        System.out.println("---------------------------------------------------------------------");
        System.out.println("Informações do veículo:");
          carro.exibeInformacoes();

        ModeloCarro modeloCarro = new ModeloCarro();
        modeloCarro.setModelo("Civic");
        modeloCarro.setMarca("Honda");
        modeloCarro.setCor("Prata");
        modeloCarro.definirPrecos(80000, 85000, 90000);
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Informações do veículo:");
        System.out.println("Marca: " + modeloCarro.getMarca());
        modeloCarro.exibeInformacoes();

    }

}
