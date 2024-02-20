package cursojava.executavel;

import cursojava.classes.Disciplina;
import cursojava.classes.Materia;
import cursojava.classes.Universitario;
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
        System.out.println(disc1);
        System.out.println(student1);
        student1.getMateriaList().add(disc1);
        System.out.println(student1.getMateriaList());
        int tamanho = student1.getMateriaList().size();
        System.out.println(tamanho);
        System.out.println("---------------------");
        for (Materia mat : student1.getMateriaList()){
            System.out.println(mat.getName());
        }

        System.out.println("Student: "+student1.getName()+ " \nRegistration: "+student1.getRegistration());




    }
}