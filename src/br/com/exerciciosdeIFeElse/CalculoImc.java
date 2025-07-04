package br.com.exercicios;

import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite sua altura: ");
        double altura = entrada.nextDouble();
        System.out.println("Digite seu peso: ");
        double peso = entrada.nextDouble();

        double imc = peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if ( imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if ( imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obsidade Grau 1");
        } else if (imc <= 39.9) {
            System.out.println("Obsidade Grau 2 (severa!)");
        } else {
            System.out.println("Obsidade 3 (Mórbida)");
        }
        entrada.close();
    }
}