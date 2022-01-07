package collectionsequalshash;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RegistryCourt {
    public static void main(String[] args) {
        List<Company> companiesList=new ArrayList<>(Arrays.asList(new Company("LifeResort","1-02-666982"),new Company("Odacsap","1-02-486351"),new Company("KékOsztriga","1-02-596141")));
        companiesList.add(new Company("Vörös Madár","1-01-193485"));

        System.out.println("Does it contains Odacsap? "+companiesList.contains(new Company("Odacsap","1-02-486351")));
        System.out.println("Does it contains Kék Osztriga? "+companiesList.contains(new Company("Kék Osztriga","1-02-596141")));
    }
}
