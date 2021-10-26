package dogs;

import java.util.ArrayList;
import java.util.List;

public class Kennel {
    public static void main(String[] args) {
        List<Dog> dogs = new ArrayList<>();
        Dog dog1=new Dog("Blöki", 10, "Fekete-Fehér");
        Dog dog2=new Dog("Morzsi", 8, "Zsemle");
        Dog dog3=new Dog("Bukfenc", 12, "Mindenszinű");
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        System.out.println(dogs);

        Dog dog4=dog1;
        dog4.setColour("Szürke");

        System.out.println(dogs);
        Dog dog5=new Dog("Csipesz", 1, "Fekete");

        System.out.println(dog5);
        dog5=dogs.get(0);

        System.out.println(dog5);
        dogs.add(dog5);
        System.out.println(dogs);

        Dog dog6=dog4;
        dog6.setColour("Fehér");
        System.out.println(dogs);

        List<Dog> dogs2 = dogs;
        Dog dog7=dog4;
        dog7.setColour("Terepszínű");
        System.out.println(dogs2);

        dog2.setColour("Barna");
        System.out.println(dogs2);

        dog2=null;
        System.out.println(dogs2);

        Dog dog8=dog4;
        dog8=null;
        System.out.println(dogs2);

        Dog dog9=dog1;
        dog9.setColour("Piszkosfehér");
        System.out.println(dogs2);

        System.out.println("Azt hiszem tudtam követni.");

    }
}
