package javabasico.cursojava.dominio;

import javax.swing.*;
import java.util.Arrays;

public class Professor {
    protected String name;
    protected Double[] wage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double[] getWage() {
        return wage;
    }

    public void setWage(Double[] wage) {
        this.wage = wage;
    }

    public Professor(String nameProfessor){
        name = nameProfessor;
    }

    public Double getMediaSalario(){
        Double soma = 0.0;
        Double media;
        for (int i = 0; i < this.getWage().length; i++) {
            soma += this.getWage()[i];
        }
        System.out.println(soma);
        media = soma / this.getWage().length;
        return media;
    }

    @Override
    public String toString() {
        return "Professor{" +
                "name='" + name + '\'' +
                ", wage=" + Arrays.toString(wage) +
                '}';
    }
}
