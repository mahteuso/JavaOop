package polimorfismo.domain;

public class Mesa extends Produto{
    public static final double TAXA_IMPOSTO = 0.45;

    public Mesa(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculoDoImposto() {
        return this.value * TAXA_IMPOSTO;
    }
}
