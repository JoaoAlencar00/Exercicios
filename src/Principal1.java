public class Principal1 {
    public static void main(String[] args) {
        Carro meuCarro = new Carro(); //instanciar
        meuCarro.modelo = "Honda";
        meuCarro.ano = 2011;
        meuCarro.cor = "Vermelho-vinho";

        meuCarro.exibirFichaTecnica();
        int idade = meuCarro.calcularIdade();
        System.out.println("A idade calculada do carro é: " + meuCarro.calcularIdade());
    }
}

