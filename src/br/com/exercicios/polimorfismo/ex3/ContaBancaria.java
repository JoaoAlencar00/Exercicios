package br.com.exercicios.polimorfismo.ex3;

public class ContaBancaria {
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
        }
    }

    public void sacar(double valor){
        if(valor > 0 && saldo >= valor) {
            saldo -= valor;
        }
    }

    public double consultarSaldo(){
        return saldo;
    }
}
