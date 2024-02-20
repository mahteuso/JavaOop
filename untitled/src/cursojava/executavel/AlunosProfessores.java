package cursojava.executavel;

import cursojava.dominio.Estudante;

public class AlunosProfessores {
    public static void main(String[] args){
        Estudante student1 = new Estudante("Mateus Laranjeira");
        student1.setAge(34);
        student1.setSex('M');
        student1.imprimiEstudante();

    }
}
