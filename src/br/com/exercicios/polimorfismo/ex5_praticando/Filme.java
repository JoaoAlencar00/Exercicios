package br.com.exercicios.polimorfismo.ex5_praticando;
//classe filha
public class Filme extends Titulo {
    private String diretor;

    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public Filme(String nome, int ano, String diretor) {
        super(nome, ano);
        this.diretor = diretor;

    }
    @Override
    public void exibeFichaTecnica(){
        super.exibeFichaTecnica();
        System.out.println("Diretor: " +diretor);
        System.out.println("Tipo: Filme ");
    }
}
