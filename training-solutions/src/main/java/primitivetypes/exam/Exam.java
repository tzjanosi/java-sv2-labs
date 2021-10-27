package primitivetypes.exam;

import computer.Hardware;

import java.util.ArrayList;
import java.util.List;

public class Exam {
    private List<Person> people = new ArrayList<>();

    public List<Person> getPeople() {
        return people;
    }
    public void addPerson(Person person){
        people.add(person);
    }

    @Override
    public String toString() {
        return "Exam{" +
                "people=" + people +
                '}';
    }
}
