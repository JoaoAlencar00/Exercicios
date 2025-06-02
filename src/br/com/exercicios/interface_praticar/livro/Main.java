package br.com.exercicios.interface_praticar.livro;

public class Main {
    public static void main(String[] args) {
        Calculavel livro = new Livro();
        Calculavel produtoFisico = new ProdutoFisico();

        System.out.printf("Preço final do Livro é: R$ %.2f%n", livro.calcularPrecoFinal(60.00, 10.00, 5.00));
        System.out.printf("Preço final do Produto físico é: R$ %.2f%n", produtoFisico.calcularPrecoFinal(80.00, 10.00, 5.00));

    }
}
