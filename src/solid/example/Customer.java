package solid.example;

public class Customer {

    private String customerName;
    private double billAmount;
    public DiscountType dtype;

    //constructor for Customer
    public Customer(String customerName, double billAmount, DiscountType dtype) {
        this.customerName = customerName;
        this.billAmount = billAmount;
        this.dtype = dtype;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getBillAmount() {
        return billAmount - (billAmount * dtype.type());
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }
    
    public double getDiscountType() {
      return dtype.type();
    }
    
    public void setDiscountType(DiscountType dt){
        dtype = dt;
    }
    
    @Override
    public String toString() {
        return "Customer{"
                + "customerName='" + customerName + '\''
                + ", billAmount=" + billAmount
                + ", discountType=" + dtype
                + '}';
    }
}
