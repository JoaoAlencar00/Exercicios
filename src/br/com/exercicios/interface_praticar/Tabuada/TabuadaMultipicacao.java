package br.com.exercicios.interface_praticar.Tabuada;

public class TabuadaMultipicacao implements Tabuada{
    @Override
    public int mostrarTabuada(int numero) {
        for (int i = 1; i <= 10; i++){
            int result = numero * i;
            System.out.println(numero + " x " + i + " = " + result);
        }
        return numero;
    }
}
