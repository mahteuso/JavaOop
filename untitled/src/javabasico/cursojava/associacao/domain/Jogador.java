package javabasico.cursojava.associacao.domain;

public class Jogador {
    private String name;
    private Time time;

    public Jogador(String name){
        this.name = name;
    }

    public void setTime(Time time){
        this.time = time;
    }
    public void printJogador(){
        System.out.println("O jogador: "+this.name+ " Joga no(a): "+this.time.getName());
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
