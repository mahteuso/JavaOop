package cadastro.domain;

import java.util.ArrayList;
import java.util.List;

public class Disciplina {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Disciplina(String nome) {
        this.nome = nome;
    }

    public void setAlunos(Aluno aluno) {
        this.alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
