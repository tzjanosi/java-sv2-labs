package enumtype.firstenum;

import java.util.ArrayList;
import java.util.List;

public class FirstEnumMain {
    public static void main(String[] args) {
        List<String> continentList = new ArrayList<>();

        for(Continent continent:Continent.values()){
                System.out.println(continent);
            continentList.add(continent.name());
            }
        System.out.println(continentList);
    }
}
