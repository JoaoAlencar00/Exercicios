package br.com.exercicios.polimorfismo.ex4;

public class Main {
    public static void main(String[] args) {
        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificaSeEhPrimo(10);

        GeradorPrimo gerar = new GeradorPrimo();
        int proximoPrimo = gerar.gerarProximoPrimo(12);
        System.out.println("Proximo primo é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
