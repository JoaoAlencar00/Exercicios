package br.com.exercicios.exercios.alura.modelo;

public class Aluno {
    private String nome;
    private int idade;
    public String estudando;

    public String getEstudando() {
        return estudando;
    }

    public void setEstudando(String estudando) {
        this.estudando = estudando;
    }

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
}
