package packages.namemain;

import packages.firstname.FirstName;
import packages.lastname.LastName;
import packages.prefix.Prefix;

public class NameMain {
    public static void main(String[] args) {
        Prefix prefix=new Prefix("Dr.");
        LastName lastName=new LastName("Kotász");
        FirstName firstName=new FirstName("József");
        System.out.println("A teljes név pedig: "+prefix.getPre()+" "+lastName.getLast()+" "+firstName.getFirst());
    }
}
