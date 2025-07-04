package br.com.exercicios.polimorfismo.ex4;

public class VerificadorPrimo extends NumerosPrimos {
    public void verificaSeEhPrimo(int numero){
        if(verificarPrimalidade(numero)){
            System.out.println(numero+ " é primo");
        } else {
            System.out.println(numero+ " Não é primo");
        }
    }
}
