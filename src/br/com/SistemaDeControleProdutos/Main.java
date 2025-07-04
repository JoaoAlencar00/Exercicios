package br.com.SistemaDeControleProdutos;

public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Caneca", 100.00, 10);

        produto.exibirDetalhes();

        produto.adicionarEstoque(3);

        produto.removerEstoque(1);
    }
}
