package desafio_4;

import desafio_4.modelos.CalculadoraSalaRetangular;

public class PrincipalCalculadoraSalaRetangular {

    public static void main(String[] args) {
        double largura = 5.0;
        double comprimento = 10.0;

        CalculadoraSalaRetangular calculadora = new CalculadoraSalaRetangular(largura, comprimento);

        double area = calculadora.calcularArea();
        double perimetro = calculadora.calcularPerimetro();

        System.out.println("Calculadora de Sala Retangular --> Largura: " + largura + ", Comprimento: " + comprimento);
        System.out.println("Área da sala retangular: " + area);
        System.out.println("Perímetro da sala retangular: " + perimetro);
    }

}
