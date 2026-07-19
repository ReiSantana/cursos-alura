package br.com.alura.screenmatch.desafios.desafio_3.exercicio_3;

import br.com.alura.screenmatch.desafios.desafio_3.exercicio_2.Animal;
import br.com.alura.screenmatch.desafios.desafio_3.exercicio_2.Cachorro;

public class InstanceOf {

    public static void main(String[] args) {
        
        Cachorro rex = new Cachorro("Canis lupus", "Rex");

        Animal animal = (Animal) rex;

        if (animal instanceof Animal) {
            System.out.println(rex.getNome() + " é um animal");
        }
    }

}
