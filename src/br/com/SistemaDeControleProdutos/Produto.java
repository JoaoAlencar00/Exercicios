package br.com.SistemaDeControleProdutos;
// resolver 
public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirDetalhes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Preço: " + this.preco);
        System.out.println("Quantidade: " + this.quantidade);
    }

    public void adicionarEstoque(int quantidade){
        this.quantidade += quantidade;
        System.out.println("adicionado ao estoque: " + quantidade);
    }

    public void removerEstoque(int quantidade){
        if(quantidade > this.quantidade){
            System.out.println("Erro: quantidade a remover maior que o estoque atual.");
            return;
        }
        this.quantidade -= quantidade;
        System.out.println("Estoque atualizado: " + this.quantidade);
    }
}
