package br.com.exercicios.interface_praticar.Vendavel;

public class Produto implements Vendavel {
    private String nome;
    private double precoUnitario;

    // Construtor e outros métodos

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(int desconto) {
        precoUnitario -= precoUnitario * (desconto / 100.0);
    }
}

