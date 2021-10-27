package primitivetypes.exam;

import java.time.LocalDate;
import java.util.Scanner;

public class ExamRegistration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the name:");
        String name=scanner.nextLine();
        System.out.println("Type in the year of birth:");
        int year=Integer.parseInt(scanner.nextLine());
        System.out.println("Type in the month of birth:");
        int month=Integer.parseInt(scanner.nextLine());
        System.out.println("Type in the day of birth:");
        int day=Integer.parseInt(scanner.nextLine());
        LocalDate dateOfBirth=LocalDate.of(year, month, day);
        System.out.println("Type in the ZIP Code:");
        int zipCode=Integer.parseInt(scanner.nextLine());
        System.out.println("Type in the ranking:");
        double ranking=Double.parseDouble(scanner.nextLine());

        Person person= new Person(name, dateOfBirth, zipCode, ranking);
        Exam exam=new Exam();
        exam.addPerson(person);
        System.out.println(exam.toString());



    }
}
