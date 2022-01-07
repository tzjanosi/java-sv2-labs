package collectionsequalshash;

import java.util.Objects;

public class Person {
    private String name;
    private int age;
    private String TAJ;

    public Person(String name, int age, String TAJ) {
        this.name = name;
        this.age = age;
        this.TAJ = TAJ;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(TAJ, person.TAJ);
    }

    @Override
    public int hashCode() {
        return Objects.hash(TAJ);
    }

    public String hashReport(){
        return name+"'s hash: "+Integer.toString(hashCode());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getTAJ() {
        return TAJ;
    }

    public static void main(String[] args) {
        Person person1=new Person("Barna Árpád",35,"133 456 789");
        Person person2=new Person("Fehér Rózsa",30,"133 456 789");

        System.out.println("does person1 equals person2?  "+person1.equals(person2));
        System.out.println(person1.hashReport());
        System.out.println(person2.hashReport());
    }
}
