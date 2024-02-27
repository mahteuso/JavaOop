package polimorf.domain;

public class Computer extends Product{

    public static final double TAX_PERCENT = 0.35;
    public Computer(String name, double value) {
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
        return "6 months warranty";
    }
}
