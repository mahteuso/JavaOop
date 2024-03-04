package javabasico.polimorf.test;

import javabasico.polimorf.domain.Computer;
import javabasico.polimorf.domain.Desk;
import javabasico.polimorf.domain.Product;

public class PolimorfTest01 {
    public static void main(String[] args) {
        Product product1 = new Computer("Asus \"i9\"", 6000);
        Product product2 = new Desk("Iron table", 3000);

        Computer pc = new Computer("New cpmuter", 7000);

        System.out.println("----------------------------------------");
        System.out.println("Name of product: " + product1.getName());
        System.out.println("Value of product: " + product1.getValue());
        System.out.println("Product tax: $" + product1.calculateTax());
        System.out.println("Final price of  the product: $" + product1.finalPrice());
        System.out.println(product1.getWarranty());
        System.out.println("----------------------------------------");
        System.out.println("Name of product: " + product2.getName());
        System.out.println("Value of product: " + product2.getValue());
        System.out.println("Product tax: $" + product2.calculateTax());
        System.out.println("Final price of the product: $" + product2.finalPrice());
        System.out.println(product2.getWarranty());
        System.out.println("----------------------------------------");
        System.out.println(pc.getWarranty());
    }
}
