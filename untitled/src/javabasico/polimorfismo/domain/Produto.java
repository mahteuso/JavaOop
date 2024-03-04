package javabasico.polimorfismo.domain;

public abstract class Produto implements CalcularImposto{
    protected String name;
    protected double value;

    public Produto(String name, double value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public double getValue() {
        return value;
    }
}
