package br.com.exercicios.polimorfismo.ex5_praticando;
//classe mae
public class Titulo {
    private String nome;
    private int ano;

    public Titulo(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome: " +nome);
        System.out.println("Ano: " +ano);
    }
}
