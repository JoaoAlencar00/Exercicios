package br.com.exercicios.polimorfismo.ex5_praticando;

public class Catalogo {

    public static void imprimirFicha(Titulo titulo) {
        titulo.exibeFichaTecnica();
        System.out.println("----------------");
    }

    public static void main(String[] args) {
        Titulo filme = new Filme("Velozes", 2011, "Novatec");
        Titulo serie = new Serie(5, "Prision break", 2011);

        imprimirFicha(filme);
        imprimirFicha(serie);
    }
}
