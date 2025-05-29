package br.com.exercicios.interface_praticar.app_streaming;

public class CalculadoraImposto {
    private double totalImposto = 0;

    public void calcularImposto(Tributavel item){
        totalImposto += item.getValorImposto();
    }

    public double getTotalImposto(){
        return totalImposto;
    }
}
