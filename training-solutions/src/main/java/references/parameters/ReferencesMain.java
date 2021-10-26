package references.parameters;

public class ReferencesMain {
    public static void main(String[] args) {
        Person person1=new Person("Barna Gábor",1980);
        Person person2=new Person("Fehér Virág",1982);
        Person person3=new Person("Szerda Piros",1984);
        person1=person3;
        person2=person1;
        person2.setName("Görög Gabi");
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);

        int number1=24;
        int number2=number1;
        number2++;
        System.out.println("number1="+number1);
        System.out.println("number2="+number2);

        Person person4=new Person("Uj Topánka",1986);
        person3=person4;

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
        System.out.println(person4);


    }
}
