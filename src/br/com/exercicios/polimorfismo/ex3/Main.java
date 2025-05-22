package br.com.exercicios.exercios.alura.modelo;

public class Main {
    public static void main(String[] args) {
        ContaCorrente minhaConta = new ContaCorrente(); //instancia
        minhaConta.setSaldo(1200);
        minhaConta.depositar(10);
        minhaConta.sacar(100);
        minhaConta.cobrarTarifaMensal();
        System.out.println("minha conta tem: R$ " +minhaConta.consultarSaldo());

    }
}
