package br.com.exercicios.interface_praticar.CalcularSalaRetangular;

public class Main {
    public static void main(String[] args) {
        CalculoGeometrico calculoDaSala = new CalculaSalaRetangular();

        double altura = 2.0;
        double largura = 3.0;

        double area = calculoDaSala.calcularArea(altura, largura);
        double perimetro = calculoDaSala.calcularPerimetro(altura, largura);

        System.out.println("Calculo da Area é: " + area);
        System.out.println("Calculo do Perimetro é: " + perimetro);
    }
}
