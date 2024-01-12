public class Product {
    private double price;
    void setPrice(double price)
    {
        this.price=price;
    }
    double getPrice()
    {
        return price;

    }
    double getPrice(double quantity)
    {
        return price*quantity;
    }
    public static void main(String args[])
    {
        Product q=new Product();
        q.setPrice(50031d);
        double r=q.getPrice();
        System.out.println("The price of Quantity of product q is :"+r);
        Product p=new Product();
        p.setPrice(2400d);

        double priceOfProduct=p.getPrice(24.5d);
        System.out.println("The price of the quantity of product p is :"+priceOfProduct);

    }
}
