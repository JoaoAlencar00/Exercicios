package br.com.exercicios.exercicio1;

public class ContaBancaria {
    private double numeroConta;
    private double saldo;
    public String titular;

    public void setNumeroConta(double numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular(String joãoPaulo) {
        return titular;
    }
    public void setTitular(String titular){
         this.titular = titular;
    }
}
