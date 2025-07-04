package br.com.exercicios.interface_praticar.sistemaPagamento;

public class Boleto implements Pagamento {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Boleto Bancário.");
    }
}
