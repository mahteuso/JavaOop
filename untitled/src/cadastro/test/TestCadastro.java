package cadastro.test;

import cadastro.domain.Aluno;
import cadastro.domain.Disciplina;

public class TestCadastro {
    public static void main(String[] args) {
        Aluno aluno01 = new Aluno("Rogério Hoffart");
        Aluno aluno02 = new Aluno("Mateus Lar");
        Aluno aluno03 = new Aluno("Marco Ma");

        Disciplina disciplina = new Disciplina("Java");

        disciplina.setAlunos(aluno01);
        disciplina.setAlunos(aluno02);
        disciplina.setAlunos(aluno03);

        for (Aluno aluno : disciplina.getAlunos()){
            aluno.setDisciplinas(disciplina);
            aluno.getAlunoDiscipplina();
        }

    }
}
