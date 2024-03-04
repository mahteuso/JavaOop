package javabasico.cursojava.classes;

import java.util.Objects;

public class Materia {
    private String name;
    private Double note1;
    private Double note2;
    private Double note3;


    public void setName(String nameStudent) {
        this.name = nameStudent;
    }

    public String getName() {
        return name;
    }

    public Double getNote1() {
        return note1;
    }

    public void setNote1(Double note1) {
        this.note1 = note1;
    }

    public Double getNote2() {
        return note2;
    }

    public void setNote2(Double note2) {
        this.note2 = note2;
    }

    public Double getNote3() {
        return note3;
    }

    public void setNote3(Double note3) {
        this.note3 = note3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Materia materia = (Materia) o;
        return Objects.equals(name, materia.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "name='" + name + '\'' +
                ", note1=" + note1 +
                ", note2=" + note2 +
                ", note3=" + note3 +
                '}';
    }

}
