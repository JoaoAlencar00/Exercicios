package br.com.exercicios.polimorfismo.ex4;
//superclasse
public class NumerosPrimos {
    private int numerosPrimos;

    public int getNumerosPrimos() {
        return numerosPrimos;
    }

    public void setNumerosPrimos(int numerosPrimos) {
        this.numerosPrimos = numerosPrimos;
    }

    public boolean verificarPrimalidade(int numero) {
            if (numero <= 1) {
                System.out.println(" não é primo");
                return false;
            }

            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    return false;
                }
            }
        return false;
    }

    //arrumar essa lógica
        public void listarPrimos(int limite) {
        for (int i = 2; i <= limite; i++) {
            boolean ehPrimo = true; // aqui assumimos que o numero i é primo

            // laço para verificar se i tem divisores além de 1 e ele mesmo
            for (int j = 2;j < i; j++) {
                if (i % j == 0) { //o i é divisivel por j ?
                    ehPrimo = false;
                    break;
                }
            }

            if (ehPrimo) {
                System.out.println(i+ " É primo");
            }
        }
    }
}



