package br.com.praticandoJava.ex9;

public class VerificaIdade {
    public static void main(String[] args) {
        int idade = 17;

        String mensagem;

        if (idade >= 18) {
            mensagem = "Você é maior de idade.";
        } else {
            mensagem = "Você é menor de idade.";
        }
        System.out.println(mensagem);
    }
}
