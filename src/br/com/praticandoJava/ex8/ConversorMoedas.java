package br.com.praticandoJava.ex8;

public class ConversorMoedas {
    public static void main(String[] args) {
        double valorReais = 451.50;
        double taxaCambio = 5.25;

        double valorDolares = valorReais / taxaCambio;
        System.out.println("Você tem R$" +valorReais
                +" e quer converter esse valor para dólares. "
                +"O valor em dólares é: US$" + valorDolares);
    }
}
