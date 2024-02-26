package classesabstratas.dominio;

public class Desenvolvedor extends Funcionario{

    protected String cargo;

    public Desenvolvedor(String name, double wage, String cargo) {
        super(name, wage);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    @Override
    public double bonus() {
        return this.wage = wage * 0.05;
    }

    @Override
    public String toString() {
        return "Desenvolvedor{" +
                "cargo='" + cargo + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
