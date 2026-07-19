package br.com.alura.screenmatch.desafios.desafio_3.exercicio_5;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Principal {

    public static void main(String[] args) {
        
        Scanner entradaUsuario = new Scanner(System.in);
        System.out.println("Informe o valor do raio do círculo 1: ");
        Circulo circulo1 = new Circulo("circulo1", entradaUsuario.nextDouble());
        System.out.println("Informe o valor do raio do círculo 2: ");
        Circulo circulo2 = new Circulo("circulo2", entradaUsuario.nextDouble());
        System.out.println("Informe o valor do raio do círculo 3: ");
        Circulo circulo3 = new Circulo("circulo3", entradaUsuario.nextDouble());
        System.out.println("Informe o valor do lado do quadrado 1: ");
        Quadrado quadrado1 = new Quadrado("quadrado1", entradaUsuario.nextDouble());
        System.out.println("Informe o valor do lado do quadrado 2: ");
        Quadrado quadrado2 = new Quadrado("quadrado2", entradaUsuario.nextDouble());

        ArrayList<Forma> listaFiguras = new ArrayList<>();
        listaFiguras.add(quadrado1);
        listaFiguras.add(circulo1);
        listaFiguras.add(quadrado2);
        listaFiguras.add(circulo2);
        listaFiguras.add(circulo3);

        listaFiguras.sort(Comparator.comparing(f -> f.getClass().getSimpleName()));
        //listaFiguras.sort(Comparator.comparing(f -> f.getClass().getName()));

        //listaFiguras.forEach(figura -> System.out.println(figura.getClass().getTypeName() + "/" + figura.toString()));

        // Aqui a saída será do tipo "A área do Circulo "circulo1" é 9.999999"
        listaFiguras.forEach(figura -> System.out.println("A área do " +
                                                            figura.getClass().getSimpleName() +
                                                            " \"" +
                                                            figura.toString() +
                                                            "\" é " +
                                                            figura.calcularArea()));

/*
        String tipoFigura;
        for (Forma figura : listaFiguras) {

            if (figura instanceof Circulo) {
                tipoFigura = "Círculo";
            } else if (figura instanceof Quadrado) {
                tipoFigura = "Quadrado";
            } else {
                tipoFigura = "Tipo desconhecido";
            }

            System.out.println("A área do " + tipoFigura + " \"" + figura.toString() + "\" é " + figura.calcularArea());
        }
*/

        entradaUsuario.close();
        
    }
}
