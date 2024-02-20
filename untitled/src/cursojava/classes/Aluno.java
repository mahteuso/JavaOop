package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String name;
    private int age;
    private String cpfNumber;

    private double nota1;
    private double nota2;
    private double nota3;
    private double nota4;

    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();

    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public Aluno(String firstName, String lastName) {
        name = firstName + lastName;
    }

    public void setName(String firstName, String lastName) {
        this.name = firstName + lastName;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setcpfNumber(String cpfNumber) {
        this.cpfNumber = cpfNumber;
    }

    public String getCpfNumber() {
        return cpfNumber;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota1() {
        return nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public double getNota3() {
        return nota3;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double getNota4() {
        return nota4;
    }

    public void setNota4(double nota4) {
        this.nota4 = nota4;
    }

    public double getMediaNota() {
        return (nota1 + nota2 + nota3 + nota4) / 4;
    }

    public String getAprovacao(){
        double media = this.getMediaNota();
        if (media > 5){
            return " O aluno está aprovado";
        }
        else{
            return " O aluno está reprovado";
        }
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", cpfNumber='" + cpfNumber + '\'' +
                ", nota1=" + nota1 +
                ", nota2=" + nota2 +
                ", nota3=" + nota3 +
                ", nota4=" + nota4 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(name, aluno.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
