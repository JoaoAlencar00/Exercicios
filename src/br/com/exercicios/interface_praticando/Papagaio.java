package br.com.exercicios.interface_praticando;

public class Papagaio implements Animal {
    private String nome;

    public Papagaio(String nome) {
        this.nome = nome;
    }

    @Override
    public void fazerSom(){
        System.out.println(nome+ " Oi, voce esta aprendendo interface ? ");
    }

    public void fazerBarulho(){
        System.out.println(nome+ " Falou bastante");
    }
}
