
public class Musica {
    String titulo;
    String artista;
    int anoDeLancamento;
    double somaDasAvaliacoes;
    int numDeAvaliacoes;

    void exibirFichaTecnica(){
        System.out.println(titulo);
        System.out.println(artista);
        System.out.println(anoDeLancamento);
        System.out.println(somaDasAvaliacoes);
        System.out.println(numDeAvaliacoes);
    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        numDeAvaliacoes++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / numDeAvaliacoes;
    }
}

