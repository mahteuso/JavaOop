package javabasico.cadastro.domain;

public class Aluno {
    private String nome;
    private Disciplina disciplinas;

    public Aluno(String nome){
        this.nome = nome;
    }

    public void getAlunoDiscipplina() {
        System.out.println("Nome: " + this.nome + " Disciplina: "+this.disciplinas);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDisciplinas(Disciplina discplina) {
        this.disciplinas = discplina;
    }

    public String getDisciplina() {
        return this.disciplinas.getNome();
    }


}
