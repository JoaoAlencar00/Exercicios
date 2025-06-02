package br.com.exercicios.interface_praticar.conversor;

public class DolarParaReal {
    public static void main(String[] args) {
        ConversaoFinanceira conversaoMoeda = new ConversorMoeda();
        System.out.println("R$" + String.format("%.2f", conversaoMoeda.converterDolarParaReal(100)) + " Convertido em Reais");
    }
}
