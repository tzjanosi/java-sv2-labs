package nameconcat;

import java.util.Scanner;

public class NameMain {
    public boolean titleContains(String str){
        for (Title title : Title.values()) {
            if (title.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type in the title");
        for(Title title:Title.values()){
            System.out.print(title.valueOf(title.name())+"., ");
        }
        System.out.print(" or empty:\n");
        String titleStr=scanner.nextLine();
        String title=titleStr.substring(0, titleStr.length() - 1);


        System.out.println("Type in the family name:");
        String familyName=scanner.nextLine();

        System.out.println("Type in the middle name or leave it empty:");
        String middleName=scanner.nextLine();

        System.out.println("Type in the given name:");
        String givenName=scanner.nextLine();

        NameMain nameMain=new NameMain();

        Name name;
        if(nameMain.titleContains(title)){
            name=new Name(familyName, middleName, givenName, Title.valueOf(title));

        }
        else{
            name=new Name(familyName, middleName, givenName);
        }
        System.out.println("Hungarían style: "+ name.concatNameHungarianStyle());
        System.out.println("Western style: "+ name.concatNameWesternStyle());
    }
}
