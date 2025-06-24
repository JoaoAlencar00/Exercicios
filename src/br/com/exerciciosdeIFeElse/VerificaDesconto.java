package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaDesconto {
    public static void main(String[] args) {
      Scanner entrada = new Scanner(System.in);
      double desconto = 0.10;
      System.out.println("Digite o valor da compra:");
        double valor = entrada.nextDouble();
        valor = valor - (valor * desconto);
        if (valor >= 100) {
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: R$" + valor);
        } else {
            System.out.println("Nenhum desconto aplicado.");
            System.out.println("Valor total: R$" + valor);
        }
        entrada.close();
    }
}
