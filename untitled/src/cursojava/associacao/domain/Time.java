package cursojava.associacao.domain;

import java.util.ArrayList;
import java.util.List;

public class Time {
    private String name;

    private List<Jogador> jogadores = new ArrayList<>();


    public void setJogadores(Jogador jogador) {
        this.jogadores.add(jogador);
    }

    public List<Jogador> getJogadores() {
        return jogadores;
    }

    public Time(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
