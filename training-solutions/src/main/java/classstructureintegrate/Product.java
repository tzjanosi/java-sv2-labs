package classstructureintegrate;

public class Product {
    String name;
    int price;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
    public void increasePrice(int amount) {
        this.price += amount;
    }
    public void decreasePrice(int amount) {
        this.price -= amount;
    }
    public String report() {
        return "The price of "+name+" is "+price+"!";
    }

    public String getName() {
        return name;
    }
}
