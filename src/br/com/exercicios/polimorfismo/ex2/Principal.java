package br.com.exercicios.polimorfismo;

public class Principal {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        Cachorro cachorro = new Cachorro();
        Gato gato = new Gato();

        myAnimal.setNome("Pinguin");
        myAnimal.emitirSom();
        cachorro.setNome("Nike");
        cachorro.emitirSom();
        cachorro.abanarRabo();
        gato.setNome("Rosky");
        gato.emitirSom();
        gato.arranharMoveis();
    }
}
