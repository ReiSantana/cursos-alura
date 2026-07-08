package desafio_3;

public class PrincipalAnimal {
    
    public static void main(String[] args) {
        AnimalCachorro cachorro = new AnimalCachorro();
        cachorro.nome_especie = "Canis lupus familiaris";
        cachorro.nome_animal = "Rex";
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Informações do animal:");
        System.out.println("Espécie: " + cachorro.nome_especie);
        System.out.println("Nome: " + cachorro.nome_animal);
        cachorro.emitirSom();
        cachorro.abanarRabo();

        AnimalGato gato = new AnimalGato();
        gato.nome_especie = "Felis catus";
        gato.nome_animal = "Mimi";
        System.out.println("---------------------------------------------------------------------");
        System.out.println("Informações do animal:");
        System.out.println("Espécie: " + gato.nome_especie);
        System.out.println("Nome: " + gato.nome_animal);
        gato.emitirSom();
        gato.arranhar();
    }
}
