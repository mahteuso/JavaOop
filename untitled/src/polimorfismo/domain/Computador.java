package polimorfismo.domain;

public class Computador extends Produto {
    public static final double TAXA_IMPOSTO = 0.35;
    public Computador(String name, double value) {
        super(name, value);
    }

    @Override
    public double calculoDoImposto() {
        return this.value * TAXA_IMPOSTO;
    }
}
