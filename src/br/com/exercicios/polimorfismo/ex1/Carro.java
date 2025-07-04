package br.com.exercicios.polimorfismo.ex1;

public class Carro {
    private String nomeDoModelo;
    private double[] precos = new double[3];

    public String getNomeDoModelo() {
        return nomeDoModelo;
    }

    public void setNomeDoModelo(String nomeDoModelo) {
        this.nomeDoModelo = nomeDoModelo;
    }

    public double[] getPrecos() {
        return precos;
    }
    public void setPrecos(double preco1,  double preco2,double preco3) {
        this.precos[0] = preco1;
        this.precos[1] = preco2;
        this.precos[2] = preco3;
    }

    public double getMenorPreco() {
        double menor = precos[0];
        for (double preco : precos) {
            if (preco < menor) {
                menor = preco;
            }
        }
        return menor;
    }

    public double getMaiorPreco() {
        double maior = precos[0];
        for (double preco : precos) {
            if (preco > maior) {
                maior = preco;
            }
        }
        return maior;
    }
    public void exibe() {
        System.out.println("Modelo: " + nomeDoModelo);
        System.out.println("Preços: ");
        for (double preco : precos) {
            System.out.println("- R$ " + preco);
        }
        System.out.println("Menor preço: R$ " + getMenorPreco());
        System.out.println("Maior preço: R$ " + getMaiorPreco());
    }
}


