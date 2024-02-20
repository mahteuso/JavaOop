package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class alunoDisciplinasNotas {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Mateus", "Laranjeira");
        aluno1.setAge(43);
        aluno1.setcpfNumber("123456789-09");
        Disciplina disciplina1 = new Disciplina();
        disciplina1.setDisciplina("Banco de dados");
        disciplina1.setNota(8.2);

        Disciplina disciplina2 = new Disciplina();
        disciplina2.setDisciplina("Java");
        disciplina2.setNota(9.5);
        aluno1.getDisciplinas().add(disciplina1);
        aluno1.getDisciplinas().add(disciplina2);


        System.out.println(aluno1.getDisciplinas());
        for (Disciplina disciplin : aluno1.getDisciplinas()) {
            System.out.println(disciplin.getNota());
        }
    }
}
