package cursojava.associacao.test;

import cursojava.associacao.domain.Jogador;
import cursojava.associacao.domain.Time;

public class Associacao {
    public static void main(String[] args) {
        Jogador jogador01 = new Jogador("Romário");
        Jogador jogador02 = new Jogador("Pelé");
        Jogador jogador03 = new Jogador("Zico");

        Time time = new Time("Seleção Brasileira");

        time.setJogadores(jogador01);
        time.setJogadores(jogador02);
        time.setJogadores(jogador03);

        for (Jogador jogador : time.getJogadores()) {
            jogador.setTime(time);
            jogador.printJogador();
        }
    }
}
