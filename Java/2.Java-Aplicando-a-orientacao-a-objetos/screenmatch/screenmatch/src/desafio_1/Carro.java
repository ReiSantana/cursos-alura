package desafio_1;

import java.time.LocalDate;

public class Carro {

    String marca;
    String modelo;
    int    ano;
    String cor;
    int    cilindrada;
    
    void exibeFichaTecnica() {
        System.out.println("---------- Dados do Veículo ----------");
        System.out.println("Marca     : " + marca);
        System.out.println("Modelo    : " + modelo);
        System.out.println("Cilindrada: " + cilindrada + " cm³");
        System.out.println("Ano       : " + ano);
        System.out.println("Idade     : " + pegaIdade() + " anos");
    }

    double pegaIdade() {
        double idade = LocalDate.now().getYear() - ano;
        return idade;
    }

}
