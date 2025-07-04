package br.com.praticandoJava.ex6;

import java.util.Scanner;

public class VerificaPermissao {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o codigo de acesso: ");
        int codigo = scanner.nextInt();
        System.out.println("Digite o nivel de permissao: ");
        int permissao = scanner.nextInt();
        if (codigo == 2023 && permissao >=1 && permissao <=3) {
            System.out.println("Acesso permitido. Bem vindo ao sistema!");
        } else {
            System.out.println("código incorreto, nível de permissão inválido ou ambos");
        }
        scanner.close();
    }
}
