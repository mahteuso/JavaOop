package cursojava.executavel;

import cursojava.classes.Aluno;

public class FirstClassJava {
    public static void main(String[] args) {
        Aluno mateus = new Aluno("Mateus", " Laranjeira");
        System.out.println(mateus.getName());
        mateus.setName("Mateus", " Silva");
        System.out.println(mateus.getName());
        mateus.setAge(43);
        mateus.setcpfNumber("298.383.528-61");
        System.out.println("Name: " + mateus.getName() + " Age: " + mateus.getAge() + " CPF: " + mateus.getCpfNumber());

        mateus.setNota1(10);
        mateus.setNota2(5.7);
        mateus.setNota3(8.2);
        mateus.setNota4(7.1);
        System.out.println("O aluno: " + mateus.getName() + " recebeu uma média de: " + mateus.getMediaNota() + mateus.getAprovacao());
    }
}
