package introexceptionfirstexception;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mi a vásárló neve?");
        String name = scanner.nextLine();
        System.out.println("Mi a film címe?");
        String movie = scanner.nextLine();
        System.out.println("Hány jegyet vásárol (maximum 20)?");
        int numberOfTickets = scanner.nextInt();
        numberOfTickets=numberOfTickets>20?20:numberOfTickets;
        System.out.println("Melyik sorba (maximum 15)?");
        int row = scanner.nextInt();
        row=row>15?15:row;

        StringBuilder sb = new StringBuilder("Lefoglalt helyek: ");
        for(int i=1;i<=numberOfTickets; i++){
            sb.append(row+". sor "+i+". szék");
            if(i<numberOfTickets) {
                sb.append(", ");
            }
        }

        System.out.println("A mozijegy.hu rendszerben vásárolt jegyek adatai a következők: \n" +
                "Vásárló neve: "+name+"\n" +
                "Film címe: "+movie);
        System.out.println(sb.toString());
        System.out.println("Jó szórakozást!");

    }
}
