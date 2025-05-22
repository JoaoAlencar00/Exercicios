package br.com.exercicios.polimorfismo;

public class Cachorro extends Animal {
    public String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void emitirSom(){
        System.out.println(nome + " latiu");
    }

    public void abanarRabo(){
        System.out.println(nome + " fez som de rabo abanado");
    }
}
