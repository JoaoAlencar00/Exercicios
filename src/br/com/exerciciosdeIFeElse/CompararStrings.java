package br.com.exerciciosdeIFeElse;

public class CompararStrings {
    public static void main(String[] args) {
        String nome = "João";
        if (nome.equalsIgnoreCase("João")) { //para ignorar maiuscula e minuscula.
            System.out.println("ola, João");
        } else {
            System.out.println("digite um nome valido!");
        }
    }
}
