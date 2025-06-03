package br.com.exercicios.interface_praticar.Vendavel;

public class Main {
    public static void main(String[] args) {
        Vendavel produto = new Produto("lapis", 2.00);
        Vendavel servico = new Servico("Web", 100.00);

        System.out.println(produto.calcularPrecoTotal(10));
        System.out.println(servico.calcularPrecoTotal(1));
    }
}
