package polimorf.domain;

public class Desk extends Product {
    public static final double TAX_PERCENT = 0.45;

    public Desk(String name, double value) {
        super(name, value);
    }

    @Override
    public double finalPrice() {
        return this.value + this.calculateTax();
    }

    @Override
    public double calculateTax() {
        return this.value * TAX_PERCENT;
    }

    public String getWarranty(){
        return "Two years warranty";
    }
}
