package cursojava.modificadorestatico.dominio;

public class Anime {
    private String name;
    private static int[] episodios;

    static {
        System.out.println("Dentro do bloco de inicialização de classe");
        episodios = new int[20];
        for (int i = 0; i < episodios.length; i++) {
            episodios[i] = i + 1;
        }
    }

    public Anime() {

        for (int episodio : Anime.episodios){
            System.out.println("Episódio: "+episodio);
        }
        System.out.println("--------------------------");
    }
}
