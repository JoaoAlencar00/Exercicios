package br.com.exercicios.exercios.alura.modelo;

public class Principal2 {
    public static void main(String[] args) {
        Aluno eu = new Aluno();
        eu.setNome("João");
        eu.setIdade(20);
        eu.setEstudando("Estudando");

    System.out.println("Meu nome é " +eu.getNome()+ ", tenho " +eu.getIdade()+ " anos. Atualmente " +eu.getEstudando()+ " JAVA com POO ");
    }
}
