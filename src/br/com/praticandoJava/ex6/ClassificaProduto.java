package br.com.praticandoJava.ex6;

public class ClassificaProduto {
    public static void main(String[] args) {
        double preco = 150.00;

        String categoriaPreco;

        if (preco <= 50.00) {
            categoriaPreco = "Econômico";
        } else if (preco > 50.00 && preco <= 200.00) {
            categoriaPreco = "Intermediário";
        } else {
            categoriaPreco = "Premium";
        }
        System.out.println("Categoria do produto: " + categoriaPreco);
    }
}
