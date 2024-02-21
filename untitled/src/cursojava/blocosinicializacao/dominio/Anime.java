package cursojava.blocosinicializacao.dominio;

public class Anime {
    private String name;
    private int[] episodios = {1,2,3,4,5,6,7,8};

    public Anime() {

        for (int episodio : this.episodios){
            System.out.println("Episódio: "+episodio);
        }
    }
}
