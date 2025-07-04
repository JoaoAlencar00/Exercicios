package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaDiaUtil {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o dia da semana ");
        String dia = scanner.nextLine();
        scanner.close();

        if (dia.equalsIgnoreCase("Segunda") || dia.equalsIgnoreCase("Terça") || dia.equalsIgnoreCase("Quarta")
                || dia.equalsIgnoreCase("Quinta") || dia.equalsIgnoreCase("Sexta")) {
            System.out.printf("%s é dia útil", dia);
        } else {
            System.out.printf("%s não é dia útil", dia);
            }
        }
    }
