package br.com.exercicios.polimorfismo.ex2;

public class Gato extends Animal {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " Fez miau");
    }
    public void arranharMoveis(){
            System.out.println(nome + " fez Som de arranhões");
        }
}
