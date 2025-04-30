public class Principal {
    public static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.titulo = "Californican";
        minhaMusica.artista = "lala";
        minhaMusica.anoDeLancamento = 1999;

        minhaMusica.exibirFichaTecnica();

        minhaMusica.avalia(4);
        minhaMusica.avalia(8);
        minhaMusica.avalia(12);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println(mediaAvaliacoes);
    }
}
