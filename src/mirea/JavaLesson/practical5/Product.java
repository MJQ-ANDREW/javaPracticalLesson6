package mirea.JavaLesson.practical5;

public class Product implements Priceable{
    private double price;
    public Product(double price){
        this.price = price;
    }
    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                '}';
    }
}
