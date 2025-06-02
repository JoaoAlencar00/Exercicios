package br.com.exercicios.interface_praticar.Vendavel;

public interface Vendavel {
    double precoTotalProduto(double desconto, double quantidadeComprada);
    double precoTotalServico(double desconto, double valor);
}
