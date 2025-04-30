/* Crie uma
classe Carro
com atributos
modelo,ano,
cor e
métodos para
exibir a
ficha técnica
e calcular
a idade do carro .*/

public class Carro {
    String modelo;
    int ano;
    String cor;

    void exibirFichaTecnica() {
        System.out.println("modelo: " + modelo);
        System.out.println("ano: " + ano);
        System.out.println("cor: " + cor);
    }

    int calcularIdade() {
        int anoAtual = 2025;
        return anoAtual - ano;
    }
}



