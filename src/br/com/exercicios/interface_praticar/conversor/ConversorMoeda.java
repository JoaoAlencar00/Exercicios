package br.com.exercicios.interface_praticar.conversor;

public class ConversorMoeda implements ConversaoFinanceira{
    private double valorDoDolar = 5.25;

    @Override
    public double converterDolarParaReal(double valor){
        return valor * getValorDoDolar();
    }

    public double getValorDoDolar() {
        return valorDoDolar;
    }

    public void setValorDoDolar(double valorDoDolar) {
        this.valorDoDolar = valorDoDolar;
    }
}

