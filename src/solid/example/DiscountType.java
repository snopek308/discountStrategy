
package solid.example;

public interface DiscountType {
    
    double type();
    
}


class Sale implements DiscountType {

    public double type() {
        return 0.1;
    }
    
}

class Discount implements DiscountType {

    public double type() {
        return 0.5;
    }
    
}

class Liquidation implements DiscountType {

    public double type() {
        return 0.75;
    }
    
}


 