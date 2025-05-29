package br.com.exercicios.interface_praticar.app_streaming;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CalculadoraImposto calcular = new CalculadoraImposto();//soma o imposto de todos os apps

        List<AppStreaming> apps = List.of( //Cria uma lista com 3 apps de streaming
        new AppStreaming("Netflix", 39.90),
        new AppStreaming("Disney", 27.90),
        new AppStreaming("Prime Video", 19.90)
        );

        for (AppStreaming app : apps){  //calcula o imposto de cada app
            calcular.calcularImposto(app);
        }
        System.out.println("Total de imposto sobre os apps: R$ " + String.format("%.2f", calcular.getTotalImposto()));
    }
}
