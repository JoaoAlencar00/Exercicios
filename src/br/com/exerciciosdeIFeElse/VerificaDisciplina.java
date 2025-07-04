package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaDisciplina {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a nota do estudante: ");
        String entrada = scanner.nextLine();              // Lê como texto
        entrada = entrada.replace(",", ".");              // Troca vírgula por ponto
        double media = Double.parseDouble(entrada);       // Converte para double

        if (media >= 7.0) {
            System.out.println("O estudante teve média " + media +  " e foi aprovado.");
        } else if (media >= 5.0) {
            System.out.println("O estudante teve média " + media +  " e está de recuperação.");
        } else {
            System.out.println("O estudante teve média " + media +  " e foi reprovado!");
        }
        scanner.close();
    }
}
