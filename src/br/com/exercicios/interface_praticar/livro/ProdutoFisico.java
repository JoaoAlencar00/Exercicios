package br.com.exercicios.interface_praticar.livro;

public class ProdutoFisico extends Produto implements Calculavel {

    public ProdutoFisico(double preco) {
        super(preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 1.05;
    }
}
