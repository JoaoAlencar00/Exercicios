package br.com.exerciciosdeIFeElse;

import java.util.Scanner;

public class EstudarHoje {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe seu nome");
        var name = scanner.next();
        System.out.println("Vai estudar hoje ? (s/n)");
        var study = scanner.next().equalsIgnoreCase("s");

        if (study) {
            System.out.printf("%s voce vai estudar hoje ? %s\n", name, study);
        } else {
            System.out.printf("%s, Você pode descansar então.", name);
        }
    }
}
