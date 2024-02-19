package cursojava.executavel;

import cursojava.classes.Aluno;

import javax.swing.*;

public class FirstClassJava {
    public static void main(String[] args) {

        String firstName = JOptionPane.showInputDialog("Entre com o primeiro nome do aluno");
        String lastName = JOptionPane.showInputDialog("Entre com o ultimo nome");
        String age = JOptionPane.showInputDialog("Entre com a idade do aluno");
        String CPF = JOptionPane.showInputDialog("Entre com o cpf do aluno");
        Aluno mateus = new Aluno(firstName, lastName);
        mateus.setAge(Integer.parseInt(age));
        mateus.setcpfNumber(CPF);
        System.out.println("Name: " + mateus.getName() + " Age: " + mateus.getAge() + " CPF: " + mateus.getCpfNumber());

        String nota1 = JOptionPane.showInputDialog("Entre com a nota da primeira prova:");
        String nota2 = JOptionPane.showInputDialog("Entre com a nota da segunda prova:");
        String nota3 = JOptionPane.showInputDialog("Entre com a nota da terceira prova:");
        String nota4 = JOptionPane.showInputDialog("Entre com a nota da quarta prova:");
        mateus.setNota1(Double.parseDouble(nota1));
        mateus.setNota2(Double.parseDouble(nota2));
        mateus.setNota3(Double.parseDouble(nota3));
        mateus.setNota4(Double.parseDouble(nota4));
        System.out.println("O aluno: " + mateus.getName() + " recebeu uma média de: " + mateus.getMediaNota() + mateus.getAprovacao());
    }
}
