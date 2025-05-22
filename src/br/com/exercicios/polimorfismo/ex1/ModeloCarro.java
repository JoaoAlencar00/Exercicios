package br.com.exercicios.polimorfismo;

public class ModeloCarro extends Carro{

    public ModeloCarro(String nome, double preco1, double preco2, double preco3) {
        setNomeDoModelo("Honda Civic");
        super.setPrecos(preco1,preco2,preco3);
    }

    @Override
    public void exibe(){
    super.exibe();
    }
}
