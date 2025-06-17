package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class EntradaDoUsuario {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Oi " + nome);

        System.out.println("Digite sua idade: ");
        int idade = entrada.nextInt();

        System.out.println(nome + " sua idade é " + idade + " anos");

        System.out.println("Digite seu saldo: ");
        double saldo = entrada.nextDouble();

        System.out.println("seu saldo: " + saldo);

        entrada.close();
    }
}
