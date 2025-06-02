package br.com.exercicios.interface_praticar.Vendavel;

public class Produto implements Vendavel {
    private String nome;

    @Override
    public double precoTotalServico(double desconto, double valor) {
        return 0;
    }

    @Override
    public double precoTotalProduto(double desconto, double quantidadeComprada) {
        return quantidadeComprada - desconto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
