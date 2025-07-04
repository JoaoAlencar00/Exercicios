package br.com.exercicios.interface_praticar.ConverterTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{

    @Override
    public double celsiusParaFahrenheit(double c) {
        return (c * 9/5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius(double f) {
        return (f - 32) * 5 / 9;
    }
}
