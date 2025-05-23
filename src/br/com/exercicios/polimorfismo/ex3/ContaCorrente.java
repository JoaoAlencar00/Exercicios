package br.com.exercicios.polimorfismo.ex3;

public class ContaCorrente extends ContaBancaria{
    public void cobrarTarifaMensal (){
        double tarifa = 10.0;
        if (getSaldo() >= tarifa) {
            setSaldo(getSaldo() - tarifa);
        }
    }

    @Override
    public void setSaldo(double saldo) {
        super.setSaldo(saldo);
    }

    @Override
    public double consultarSaldo() {
        return super.consultarSaldo();
    }
}
