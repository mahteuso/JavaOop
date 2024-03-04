package javabasico.cursojava.executavel;

import javabasico.cursojava.dominio.Calculadora;
import javabasico.cursojava.dominio.Professor;

public class Calculando {
    public static void main(String[] args) {
        Calculadora calcula = new Calculadora();

        int[] values = {1,2,3,4,5,6,7,8,9};
        int result = calcula.somaArray(values);
        System.out.println(result);
        System.out.println("--------------------");
        System.out.println(calcula.somarArgs(2,3,4,5,6));

        System.out.println("-----------------");
        Professor prof1 = new Professor("Mateus");
        Double[] salariosTrimestre = {1000.0, 3000.0, 6000.0};
        prof1.setWage(salariosTrimestre);
        System.out.println(prof1.getMediaSalario());
        System.out.println("--------------");
        System.out.println(prof1.toString());

    }
}
