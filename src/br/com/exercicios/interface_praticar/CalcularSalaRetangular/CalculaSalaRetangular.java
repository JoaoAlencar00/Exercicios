package br.com.exercicios.interface_praticar.CalcularSalaRetangular;

public class CalculaSalaRetangular implements CalculoGeometrico{
    @Override
    public double calcularArea(double altura, double base) {
        return base * altura;
    }

    @Override
    public double calcularPerimetro(double largura, double base) {
        return 2 * (base + largura);
    }
}
