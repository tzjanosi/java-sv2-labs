package conventions;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Type in the type of the car:");
        String carType=scanner.nextLine();

        System.out.println("Type in the car's engine type:");
        String engineType=scanner.nextLine();

        System.out.println("Type in the door's number for the car:");
        int doors=scanner.nextInt();

        System.out.println("Type in the maximal allowed number of persons for the car:");
        int persons=scanner.nextInt();
        scanner.nextLine(); // Dummy for the new line characters

        Car car = new Car(carType, engineType, doors, persons);


        System.out.println("The var is registered with the following data:");
        System.out.println(" - Car type: "+car.getCarType());
        System.out.println(" - Engine type: "+car.getEngineType());
        System.out.println(" - Door's number: "+car.getDoors());
        System.out.println(" - Maximum allowed persons: "+car.getPersons());


        System.out.println();
        System.out.println("Type in the type of the car:");
        carType=scanner.nextLine();
        car.setCarType(carType);

        System.out.println("Type in the car's model name:");
        String modelName=scanner.nextLine();
        car.addModelName(modelName);

        System.out.println("Type in the car's engine type:");
        engineType=scanner.nextLine();
        car.setEngineType(engineType);

        System.out.println("Type in the door's number for the car:");
        doors=scanner.nextInt();
        car.setDoors(doors);

        System.out.println("Type in the maximal allowed number of persons for the car:");
        persons=scanner.nextInt();
        car.setPersons(persons);

        System.out.println("The var is registered with the following data:");
        System.out.println(" - Car type: "+car.getCarType());
        System.out.println(" - Engine type: "+car.getEngineType());
        System.out.println(" - Door's number: "+car.getDoors());
        System.out.println(" - Maximum allowed persons: "+car.getPersons());
    }
}
