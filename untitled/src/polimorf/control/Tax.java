package polimorf.control;

import polimorf.domain.Computer;
import polimorf.domain.Desk;
import polimorf.domain.Product;

public class Tax {
    public static double valueTax(Product product){
        return product.calculateTax();
    }

    public static double finalPrice(Product product){
        return product.finalPrice();
    }

    public static String getWarranty(Product product){
        if (product instanceof Desk){
            return ((Desk) product).getWarranty();
        } else if (product instanceof Computer){
            return ((Computer) product).getWarranty();
        }
        return "There is no warranty for this product";
    }
}
