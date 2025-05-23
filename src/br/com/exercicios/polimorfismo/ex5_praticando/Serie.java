package br.com.exercicios.polimorfismo.ex5_praticando;
//classe filha
public class Serie extends Titulo{
    private int temporadas;

    public Serie(int temporadas, String nome, int ano) {
        super(nome,ano);
        this.temporadas = temporadas;
    }
    @Override
    public void exibeFichaTecnica(){
        super.exibeFichaTecnica();
        System.out.println("Tipo: Serie");
        System.out.println("Temporadas: " +temporadas);
    }
}
