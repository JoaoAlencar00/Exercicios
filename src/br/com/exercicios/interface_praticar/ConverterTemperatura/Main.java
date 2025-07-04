package br.com.exercicios.interface_praticar.ConverterTemperatura;
//F = Frio;
//C = Calor;

public class Main {
    public static void main(String[] args) {
        ConversorTemperatura converter = new ConversorTemperaturaPadrao();

        double farenheit = converter.celsiusParaFahrenheit(20);
        double celsius = converter.fahrenheitParaCelsius(68);

        System.out.printf("20°C em Fahrenheit = %.2f°F\n", converter.celsiusParaFahrenheit(20));
        System.out.printf("68°F em Celsius = %.2f°C\n", converter.fahrenheitParaCelsius(68));
    }
}
