package br.com.exercicios;

import java.util.Scanner;

public class VerificaNumero {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        if (numero1 >= numero2) {
            System.out.println("Erro: o primeiro número deve ser menor que o segundo.");
            return;
        }

        System.out.print("Você quer ver os números pares ou ímpares? ");
        String escolha = scanner.next().toLowerCase();

        if (!escolha.equals("par") && !escolha.equals("impar")) {
            System.out.println("Escolha inválida. Digite 'par' ou 'impar'.");
            return;
        }

        System.out.println("\nAnálise de " + escolha + " entre " + numero1 + " e " + numero2 + ":");

        for (int i = numero1; i <= numero2; i++) {
            if (escolha.equals("par") && i % 2 == 0) {
                System.out.println(i + " é par");
            } else if (escolha.equals("impar") && i % 2 != 0) {
                System.out.println(i + " é impar");
            }
        }

        System.out.println("\nOrdem decrescente:");
        for (int i = numero2; i >= numero1; i--) {
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
