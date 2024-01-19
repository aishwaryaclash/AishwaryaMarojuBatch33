package objectcomparision;
import java.lang.Comparable;
public class Product implements Comparable<Product> {

    private double weight;
    private double price;
    private int id;


    public int getId() {
        return id;
    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public Product(double price) {
        this.price = price;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Product o) {
        if (this.price > o.price) return 1;
        else if (this.price < o.price) return -1;
        return 0;
    }

    public static void main(String args[])
    {
        Product p1=new Product(1500d);
        Product p2=new Product(500d);
        int result=p1.compareTo(p2);
        if(result>0)
        {
            System.out.println("Product 1 is expensive than product 2");

        }
        else if(result<0)
        {
            System.out.println("Product 1 is cheaper than Product 2");
        }
        else
        {
            System.out.println("Product 1 and 2 have same expense");
        }
    }
}

