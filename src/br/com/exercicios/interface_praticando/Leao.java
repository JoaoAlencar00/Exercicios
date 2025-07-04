package br.com.exercicios.interface_praticando;

public class Leao implements Animal {
    private String nome;

    public Leao(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerSom(){
        System.out.println(nome+ " Rugido");
    }

    public void correu(){
        System.out.println(nome+ " Correu rapido");
    }
}
