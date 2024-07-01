package entities;

public class product {
    private String name;
    private int quantity;
    private double price;

    public product (String name, int quantity, double price){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }


    public  double totalvalueInstock() {
        return  price * quantity;
    }

    public  void addProducts(int quantity){
        this.quantity += quantity;
    }
    public  void  removeProducts(int quantity){
        this.quantity -= quantity;
    }
    public String toString (){
        return name
                + ", $ "
                +String.format("%.2f", price)
                + ", "
                +quantity
                 + " units, Total: $ "
                + String.format("%.2f", totalvalueInstock());

    }

}
