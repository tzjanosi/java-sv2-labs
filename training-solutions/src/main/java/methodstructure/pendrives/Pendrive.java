package methodstructure.pendrives;

public class Pendrive {
    private String name;
    private int capacity;
    private int price;
    private double pricePerCapacity;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
        this.pricePerCapacity = (double) price/(double) capacity;
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    public double getPricePerCapacity() {
        return pricePerCapacity;
    }
    public boolean isCheaperThan(Pendrive other){
        return(this.getPrice()<other.getPrice());
    }
    public int comparePricePerCapacity(Pendrive other){
        int comparedPricePerCapacity;
        double delta=0.0001;
        if(Math.abs(this.getPricePerCapacity()-other.getPricePerCapacity())<delta){
            return 0;
        }
        else if(this.getPricePerCapacity()>other.getPricePerCapacity()){
            return 1;
        }
        else{
            return -1;
        }

    }

    public void risePrice(int percent){
        price*=(1.0+((double) percent/100.0));
    }

    @Override
    public String toString() {
        return "name='" + name +
                "', capacity=" + capacity +
                ", price=" + price;
    }
}
