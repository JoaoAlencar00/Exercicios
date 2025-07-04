package br.com.exercicios.interface_praticar.livro;

public class Main {
    public static void main(String[] args) {
        Calculavel livro = new Livro(100.0, "Autor Exemplo");
        Calculavel produtoFisico = new ProdutoFisico(200.0);

        System.out.println(livro.calcularPrecoFinal());         // Deve imprimir 90.0
        System.out.println(produtoFisico.calcularPrecoFinal()); // Deve imprimir 210.0
    }
}
