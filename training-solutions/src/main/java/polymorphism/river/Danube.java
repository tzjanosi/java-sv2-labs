package polymorphism.river;

import java.util.Arrays;
import java.util.List;

public class Danube extends River{
    private List<String> capitals;

    public Danube(String name, int length, List<String> capitals) {
        super(name, length);
        this.capitals = capitals;
    }

    public List<String> getCapitals() {
        return capitals;
    }

    public static void main(String[] args) {
        Water water=new Danube("Duna",1750, Arrays.asList("Wien","Budapest"));
        River river=new Danube("Duna",1750, Arrays.asList("Wien","Budapest"));
        Danube danube=new Danube("Duna",1750, Arrays.asList("Wien","Budapest"));
        System.out.println("Danube's capitals: "+danube.getCapitals().toString());
        System.out.println("River's name: "+river.getName()+", rivers length: "+river.getLength()+" km");
        System.out.println("There is no method for water!");
    }
}
