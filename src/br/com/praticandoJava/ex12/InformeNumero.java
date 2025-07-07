package br.com.exercicios;

import java.util.Scanner;

public class InformeNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe um numero: ");
        int numero = scanner.nextInt();

        int contadorValidos = 0;
        while (true) {
            System.out.println("Informe outro número: ");
            int outroNumero = scanner.nextInt();
            if (outroNumero < numero) {
                System.out.println("Número ignorado. Menor que o número inicial.");
                continue;
            }
            if (outroNumero % numero != 0) {
                System.out.println("Número não é divisível. Encerrando.");
                break;
            }
            contadorValidos++;
            System.out.println("Numero válido: " + outroNumero);
        }
        System.out.println("Total de numeros válidos: " + contadorValidos);
    }
}
