package javabasico.classesabstratas.test;

import javabasico.classesabstratas.dominio.Desenvolvedor;
import javabasico.classesabstratas.dominio.Gerente;

public class FucnionarioTest01 {
    public static void main(String[] args) {
        Gerente funcionario01 =new Gerente("Mateus Laranjeira", 3000, "Gerente");
        System.out.println(funcionario01);
        System.out.println(funcionario01.getCargo()+ " Ganhou um bonus de: R$"+funcionario01.bonus());

        System.out.println("-------------------------------------------------------------------------");
        Desenvolvedor funcionario02 = new Desenvolvedor("Marco MAria", 5000, "Programador Backend");
        System.out.println(funcionario02);
        System.out.println(funcionario02.getCargo()+ " Ganhou um bonus de: R$"+funcionario02.bonus());


    }
}
