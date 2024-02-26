package classesabstratas.dominio;

public class Gerente extends Funcionario{
    protected String cargo;

    public Gerente(String name, double wage, String cargo) {
        super(name, wage);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public double bonus() {
       return this.wage = wage * 0.10;
    }

    @Override
    public String toString() {
        return "Gerente{" +
                "cargo='" + cargo + '\'' +
                ", name='" + name + '\'' +
                ", wage=" + wage +
                '}';
    }
}
