package collectionsset;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PhysicalEducation {
    public Set<Integer> getOrderInLessons(List<Student> studentList){
        TreeSet<Integer> orderedList=new TreeSet<>();
        for(Student student:studentList){
            orderedList.add(student.getHeightIncm());
        }
        return orderedList;
    }

    public static void main(String[] args) {
        List<Student> studentsList = new ArrayList<>();
        studentsList.add(new Student("Fehér Virág", 151));
        studentsList.add(new Student("Hosszú Gábor", 172));
        studentsList.add(new Student("Barna Béla", 134));
        studentsList.add(new Student("Bordő Olivér", 140));
        studentsList.add(new Student("Piros Piros", 129));
        studentsList.add(new Student("Vágó Péter", 159));

        PhysicalEducation physicalEducation = new PhysicalEducation();
        System.out.println(physicalEducation.getOrderInLessons(studentsList));
    }
}
