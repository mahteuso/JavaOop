package javabasico.classesabstratas.dominio;

public abstract class Funcionario {
    protected String name;
    protected double wage;

    public Funcionario(String name, double wage) {
        this.name = name;
        this.wage = wage;
    }
    public abstract double bonus();
}
