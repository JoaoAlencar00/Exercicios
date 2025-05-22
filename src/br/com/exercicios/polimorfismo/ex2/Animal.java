package br.com.exercicios.polimorfismo;

public class Animal {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void emitirSom(){
        System.out.println(nome + " Fez um som");
    }
}
