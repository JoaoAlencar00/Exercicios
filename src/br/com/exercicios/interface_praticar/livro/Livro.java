package br.com.exercicios.interface_praticar.livro;

public class Livro implements Calculavel{

    @Override
    public double calcularPrecoFinal(double valor, double desconto, double taxaAdicional) {
        return valor + desconto + taxaAdicional;
    }
}
