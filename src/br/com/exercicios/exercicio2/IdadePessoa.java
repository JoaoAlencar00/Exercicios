package br.com.exercicios.exercicio2;

public class IdadePessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    void verificarIdade(int idade){
        if(idade >= 18){
            System.out.println("Você é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");
        }
    }
}
