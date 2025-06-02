package br.com.exercicios.interface_praticar.Vendavel;

public class Main {
    public static void main(String[] args) {
        Vendavel produto = new Produto();
        Vendavel servico = new Servico();

        System.out.printf("Preço total do produto: R$ %.2f com desconto aplicado de 10%%%n", produto.precoTotalProduto(10.00, 1000.00));
        System.out.printf("Preço total do serviço: R$ %.2f com desconto aplicado de 10%%%n", servico.precoTotalServico(10.00, 250.00));

    }
}
