package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

public class Universitario {
    private String name;
    private int registration;


    private List<Materia> materiaList = new ArrayList<>();

    public void setMateriaList(List<Materia> materia) {
        this.materiaList = materia;
    }

    public List<Materia> getMateriaList() {
        return materiaList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegistration() {
        return registration;
    }

    public void setRegistration(int registration) {
        this.registration = registration;
    }


    @Override
    public String toString() {
        return "Universitario{" +
                "name='" + name + '\'' +
                ", registration=" + registration +
                '}';
    }

    public Universitario(String nameStudent, int registrationStudent) {
        name = nameStudent;
        registration = registrationStudent;
    }

    public Double getMedia() {
        return (materiaList.getLast().getNote1() + materiaList.getLast().getNote2() + materiaList.getLast().getNote3()) / 3;
    }
}
