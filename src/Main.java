import br.com.musicas.one.musicas;

public class Main {
    public static void main(String[] args) {

        System.out.printf("-=-=-=-==--=- ONE Music -=-=-=-==--=-");
        System.out.println("""
                
                            *** MENU ***
                            1.Ouvir Música
                            2.Listar bandas
                            3.Adicionar música
                            4.Sair
                """);

        musicas Artista01 = new musicas();
                Artista01.setArtista("Artista01");
                Artista01.setAlbum("Album01");
                Artista01.setNomeMusica("Musica01");

                System.out.println("Artista: " + Artista01.getArtista());
                System.out.println("Album: " + Artista01.getAlbum());
                System.out.println("Musica: " + Artista01.getNomeMusica());

    }
}