package meetingrooms;

import java.util.Scanner;

public class MeetingRoomController {
    private Office office=new Office();
    private Scanner scanner = new Scanner(System.in);

    public void printMenu(){
        printVerticalSeparator(2);
        System.out.println("1. Tárgyaló rögzítése\n" +
                "2. Tárgyalók sorrendben\n" +
                "3. Tárgyalók visszafele sorrendben\n" +
                "4. Minden második tárgyaló\n" +
                "5. Területek\n" +
                "6. Keresés pontos név alapján\n" +
                "7. Keresés névtöredék alapján\n" +
                "8. Keresés terület alapján\n" +
                "9. Kilépés");
    }
    public void runMenu(){
        String inputFromUser;
        int chosenMenu;
        do{
            printMenu();
            inputFromUser = scanner.nextLine();
            chosenMenu=createMenuNumberFromInput(inputFromUser);
            subMenu(chosenMenu);
        }
        while(chosenMenu!=9);
    }

    private void subMenu(int chosenMenu) {
        switch(chosenMenu) {
            case 1:
                subMenu1();
                break;
            case 2:
                office.printNames();
                break;
            case 3:
                office.printNamesReverse();
                break;
            case 4:
                office.printEvenNames();
                break;
            case 5:
                office.printAreas();
                break;
            case 6:
                subMenu6();
                break;
            case 7:
                subMenu7();
                break;
            case 8:
                subMenu8();
                break;
        }
    }

    private void subMenu1() {
        printVerticalSeparator(1);
        System.out.println("Tárgyaló rögzítése!");
        System.out.println("Tárgyaló neve:");
        String name = scanner.nextLine();
        System.out.println("Tárgyaló hossza:");
        int length = scanner.nextInt();
        System.out.println("Tárgyaló szélessége:");
        int width = scanner.nextInt();
        scanner.nextLine();

        MeetingRoom meetingRoom=new MeetingRoom(name, length, width);
        office.addMeetingRoom(meetingRoom);
    }
    private void subMenu6() {
        printVerticalSeparator(1);
        System.out.println("Keresés pontos név alapján!");
        System.out.println("Írd be a keresendő nevet:");
        String name = scanner.nextLine();

        office.printMeetingRoomsWithName(name);
    }
    private void subMenu7() {
        printVerticalSeparator(1);
        System.out.println("Keresés névtöredék alapján!");
        System.out.println("Írd be a keresendő sztringet:");
        String part = scanner.nextLine();

        office.printMeetingRoomsContains(part);
    }
    private void subMenu8() {
        printVerticalSeparator(1);
        System.out.println("Tárgyaló keresése terület alapján!");
        System.out.println("Írde be a minimális területet:");
        int area = scanner.nextInt();
        scanner.nextLine();

        office.printAreasLargerThan(area);
    }

    private void printVerticalSeparator(int repeat) {
        System.out.println();
        for(int i=1;i<=repeat;i++) {
            System.out.println("-----------------------------------------------------------------------------------");
        }
    }

    private int createMenuNumberFromInput(String inputFromUser) {
        StringBuilder onlyDigits = new StringBuilder();
        for (int i = 0; i < inputFromUser.length(); i++) {
            if (Character.isDigit(inputFromUser.charAt(i))) {
                onlyDigits.append(inputFromUser.charAt(i));
            }
        }
        if(!onlyDigits.isEmpty()){
            int inputNumber=Integer.parseInt(onlyDigits.toString());
            if(0<inputNumber&&inputNumber<10) {
                return inputNumber;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        MeetingRoomController meetingRoomController=new MeetingRoomController();
        meetingRoomController.runMenu();
    }
}
