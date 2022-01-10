package collectionsqueue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Vaccination {
    public Queue<Integer> getVaccinationOrder(List<Person> people){
        Queue<Integer> agesForVaccination=new PriorityQueue<>();
        for(Person person:people){
            int age=person.getAge();
            if(notTooOldAdult(age)){
                agesForVaccination.add(age);
            }
        }
        return agesForVaccination;
    }

    private boolean notTooOldAdult(int age) {
        if(18<=age && age<=65){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        List<Person> peopleList = new ArrayList<>();
        peopleList.add(new Person("Fehér Virág", 51));
        peopleList.add(new Person("Hosszú Gábor", 72));
        peopleList.add(new Person("Barna Béla", 34));
        peopleList.add(new Person("Bordő Olivér", 40));
        peopleList.add(new Person("Piros Piros", 29));
        peopleList.add(new Person("Vágó Péter", 59));
        peopleList.add(new Person("Kovács Emil", 17));
        Vaccination vaccination=new Vaccination();
        Queue<Integer> agesForVaccination=vaccination.getVaccinationOrder(peopleList);
        System.out.println(agesForVaccination);
        System.out.println();
        System.out.println("A poll() eredménye a listán:");
        System.out.println(agesForVaccination.poll());
    }

}
