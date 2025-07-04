package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class VerificaNumeroEmIntervalo {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor do emprestimo: ");
        double valor = scanner.nextDouble();

        if (valor >= 1000 && valor <= 5000){
            System.out.printf("O valor %s, é permitido para emprestimo", valor);
        } else {
            System.out.printf("O valor %s, não está dentro do intervalo permitido para emprestimo.",valor);
        }
    }
}
