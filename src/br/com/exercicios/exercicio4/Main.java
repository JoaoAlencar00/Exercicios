package br.com.exercicios.exercicio4;

public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("João Paulo");
        aluno.setNotas(10, 10, 10, 10);
        aluno.calcularMedia(aluno.getNotas());

        System.out.println("Nome: " +aluno.getNome()
                + ", Notas: " +aluno.getNotas());
    }
}
