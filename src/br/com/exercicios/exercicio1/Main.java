package br.com.exercicios.exercicio1;

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta(999999999);
        conta.setSaldo(10000.0);
        conta.getTitular("João Paulo");

        System.out.println("O numero de conta é " +conta.getNumeroConta()
                + ", com saldo " +conta.getSaldo()
                + ", Nome: " +conta.getTitular("João Paulo"));
    }
}
