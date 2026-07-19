package br.com.alura.screenmatch.desafios.desafio_3.exercicio_2;

public class Principal {

    public static void main(String[] args) {
        
        Cachorro rex = new Cachorro("Canis lupus", "Rex");

        Animal animal = (Animal) rex;

        System.out.println(animal.getNome());
        System.out.println(rex.late());

    }

}
