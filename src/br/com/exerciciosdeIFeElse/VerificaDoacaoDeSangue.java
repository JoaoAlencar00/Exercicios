package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaDoacaoDeSangue {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe sua idade: ");
        int idade = entrada.nextInt();
        System.out.println("Informe seu peso: (em kg) ");
        int peso = entrada.nextInt();

        if (idade >= 18 && idade <= 65 && peso >= 50) {
            System.out.println("O doador é compativel");
        } else {
            System.out.println("O doador não é compatível.");
        }
        entrada.close();
    }
}
