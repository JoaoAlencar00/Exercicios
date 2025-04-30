package br.com.exercicios.exercicio3;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Caderno");
        produto.setPreco(100.0);
        produto.aplicarDesconto(20);

        System.out.println("Nome: " +produto.getNome()+ "Preço: " +produto.getPreco());
    }
}
