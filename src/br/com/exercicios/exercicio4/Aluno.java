package br.com.exercicios.exercicio4;

public class Aluno {
    private String nome;
    private double notas;

    public String getNome() {
        return nome;
    }

    public double getNotas() {
        return notas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNotas(double notas, int i, int i1, int i2) {
        this.notas = notas;
    }
    void calcularMedia(double nota){
        notas = (nota * 4)/4;
    }
}
