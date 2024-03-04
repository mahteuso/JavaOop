package javabasico.cursojava.Sobrecarregametodos.executavel;

import javabasico.cursojava.Sobrecarregametodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Naruto", "Shounen", 39);

        System.out.println("Anime type: "+anime.getType()+"\nEpisodes: "+anime.getEpisode());

        System.out.println(anime.toString());
    }
}
