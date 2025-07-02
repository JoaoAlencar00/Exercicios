package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaTriangulo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro lado:");
        int lado1 = entrada.nextInt();
        System.out.println("Digite o segundo lado:");
        int lado2 = entrada.nextInt();
        System.out.println("Digite o terceiro lado:");
        int lado3 = entrada.nextInt();

        if (lado1 + lado2 > lado3) {
            System.out.println("Pode formar um triangulo");
        } else {
            System.out.println("Nao pode formar um triangulo");
        }
        entrada.close();
    }
}
