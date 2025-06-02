package br.com.exercicios.interface_praticar.sistemaPagamento;

import java.util.ArrayList;

public class ProcessadorPagamento{
    public static void main(String[] args) {
        ArrayList<Double> lista = new ArrayList<>(); // Create an ArrayList object
        lista.add(100.00);
        lista.add(250.50);

        Pagamento credito = new CartaoCredito();
        Pagamento boleto = new Boleto();

        for(double valor : lista){
            credito.pagar(valor);
            boleto.pagar(valor);
        }
    }
}
