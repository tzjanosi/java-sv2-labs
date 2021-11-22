package introexceptionwritefile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Birthday {
    private List<String> dataList=new ArrayList<>();

    public static void main(String[] args) {
        Birthday birthday=new Birthday();
        birthday.userInput();
        birthday.writeOut("src/main/java/introexceptionwritefile/birthdays.txt");
        }

    public void writeOut(String pathString){
        try {
            Files.write(Paths.get(pathString), dataList);
        }
        catch(IOException ioe) {
            ioe.printStackTrace();
        }

    }
    public void userInput(){
        Scanner scanner = new Scanner(System.in);
        String inputFromUser="";
        StringBuilder nameAndDateBirth= new StringBuilder();

        System.out.println("Type in the number of records:");
        int numberOfRecords = scanner.nextInt();
        scanner.nextLine();
        for(int i=0; i<numberOfRecords; i++){
            nameAndDateBirth=new StringBuilder();
            System.out.println("Type in a name:");
            inputFromUser = scanner.nextLine();
            nameAndDateBirth.append(inputFromUser);
            nameAndDateBirth.append(": ");
            System.out.println("Type in the date of birth:");
            inputFromUser = scanner.nextLine();
            nameAndDateBirth.append(inputFromUser);
            dataList.add(nameAndDateBirth.toString());
        }
    }
}
