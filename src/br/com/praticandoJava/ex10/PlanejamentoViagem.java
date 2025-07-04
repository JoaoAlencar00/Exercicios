package br.com.praticandoJava.ex10;

public class PlanejamentoViagem {
    public static void main(String[] args) {
        double consumoMedio = 40;
        double capacidadeTanque = 16.1;
        double combustivelAtual = 7;
        double distanciaViagem = 200;

        double autonomiaMaxima = consumoMedio * capacidadeTanque;
        double autonomiaAtual = consumoMedio * combustivelAtual;

        System.out.printf("Autonomia máxima do veículo: %.1f km%n", autonomiaMaxima);
        System.out.printf("Autonomia atual: %.1f km%n", autonomiaAtual);

        if (autonomiaAtual >= distanciaViagem) {
            System.out.println("Você conseguirá completar a viagem sem precisar abastecer.");
        } else {
            System.out.println("Atenção! Você precisara abastecer antes de concluir a viagem.");
        }
    }
}
