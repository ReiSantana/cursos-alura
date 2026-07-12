package desafio_4.modelos;

import desafio_4.calculos.ConversaoFinanceira;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public double converterDolarParaReal(double valor) {
        return valor * 5.0; // Exemplo de taxa de conversão fixa
    }

}
