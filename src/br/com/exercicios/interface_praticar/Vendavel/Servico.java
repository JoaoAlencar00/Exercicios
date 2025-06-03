package br.com.exercicios.interface_praticar.Vendavel;

public class Servico implements Vendavel{
    private String descricao;
    private double precoHora;

    public Servico(String descricao, double precoHora) {
        this.descricao = descricao;
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(int desconto) {
        precoHora -= precoHora * (desconto / 100.0);
    }
}
