package javabasico.cursojava.executavel;

import javabasico.cursojava.classes.Disciplina;
import javabasico.cursojava.classes.Materia;
import javabasico.cursojava.classes.Universitario;
import org.w3c.dom.ls.LSOutput;

import java.util.List;

public class UniversidadeDisciplinas {
    public static void main(String[] args){
        Universitario student1 = new Universitario("Mateus Laranjeira", 1234);
        Materia disc1 = new Materia();
        disc1.setNote1(5.0);
        disc1.setNote2(10.0);
        disc1.setNote3(7.5);
        disc1.setName("Java");

        student1.getMateriaList().add(disc1);

        for (Materia discipline : student1.getMateriaList()){
            System.out.println(discipline.toString());
        }
        System.out.println("Student: "+student1.getName()+ " \nRegistration: "+student1.getRegistration());




    }
}
