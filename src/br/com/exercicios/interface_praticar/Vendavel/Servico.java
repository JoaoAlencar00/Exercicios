package br.com.exercicios.interface_praticar.Vendavel;

public class Servico implements Vendavel{
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double precoTotalProduto(double desconto, double quantidadeComprada) {
        return 0;
    }

    @Override
    public double precoTotalServico(double desconto, double valor) {
        return valor - desconto;
    }
}
