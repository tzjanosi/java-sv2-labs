package introconstructors;
import java.time.*;
import java.util.Scanner;

public class CyclingTour {
    private String description;
    private LocalDate startTime;
    private int numberOfPeople;
    private double kms;

    public CyclingTour(String description, LocalDate startTime) {
        this.description = description;
        this.startTime = startTime;
    }

    public String getDescription() {
        return description;
    }

    public LocalDate getStartTime() {
        return startTime;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public double getKms() {
        return kms;
    }
    public void registerPerson(int person){
        numberOfPeople+=person;
    }
    public void ride(double km){
        kms+=km;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the description of the tour:");
        String description=scanner.nextLine();

        System.out.println("Type in the year for the tour:");
        int year=scanner.nextInt();
        System.out.println("Type in the month for the tour:");
        int month=scanner.nextInt();
        System.out.println("Type in the day for the tour:");
        int day=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters
        LocalDate startTime = LocalDate.of(year, month, day);

        CyclingTour cyclingTour=new CyclingTour(description,startTime);
        System.out.println("The description of the tour: "+cyclingTour.getDescription());
        System.out.println("The starting date of the tour: "+cyclingTour.getStartTime());
        System.out.println("The number of participants on the tour: "+cyclingTour.getNumberOfPeople());
        System.out.println("The number length of the tour: "+cyclingTour.getKms());
        System.out.println();
        cyclingTour.registerPerson(5);
        cyclingTour.ride(10.3);
        System.out.println("The updated information on the tour");
        System.out.println("The description of the tour: "+cyclingTour.getDescription());
        System.out.println("The starting date of the tour: "+cyclingTour.getStartTime());
        System.out.println("The number of participants on the tour: "+cyclingTour.getNumberOfPeople());
        System.out.println("The number length of the tour: "+cyclingTour.getKms());

    }
}
