package br.com.exercicios.interface_praticando;

public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Leao("Leão");
        if (meuAnimal instanceof Leao) {
        Leao meuLeao = (Leao) meuAnimal;
        meuLeao.correu();
}
        Animal animal = new Papagaio("Papagaio");
        if (animal instanceof Papagaio){
        Papagaio meuPapagaio = (Papagaio) animal;
        meuPapagaio.fazerBarulho();
        }
    }
}
