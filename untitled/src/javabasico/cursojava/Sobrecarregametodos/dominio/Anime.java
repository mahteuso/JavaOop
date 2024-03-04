package javabasico.cursojava.Sobrecarregametodos.dominio;

import java.util.Arrays;

public class Anime {
    private String type;
    private int episodes;
    private String title;

    //Sobrecarga de métodos usando construtor
    public Anime(String title, String type){
        this.title = title;
        this.type = type;
    }

    public Anime(String title, String type, int episodes){
        this(title, type);
        this.episodes = episodes;
    }


    public void setType(String type){
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public int getEpisode(){
        return episodes;
    }

    public void setEpisode(int episodes) {
        this.episodes = episodes;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Anime{" +
                "type='" + type + '\'' +
                ", episodes=" + episodes +
                ", title='" + title + '\'' +
                '}';
    }
}
