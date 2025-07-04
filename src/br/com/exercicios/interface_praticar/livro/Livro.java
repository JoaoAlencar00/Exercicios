package br.com.exercicios.interface_praticar.livro;

public class Livro extends Produto implements Calculavel {
    private String autor;

    public Livro(double preco, String autor) {
        super(preco);
        this.autor = autor;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.9;
    }
}
