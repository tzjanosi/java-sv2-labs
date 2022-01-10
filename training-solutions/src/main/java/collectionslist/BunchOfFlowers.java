package collectionslist;

import java.util.LinkedList;
import java.util.List;

public class BunchOfFlowers {
    private List<String> flowers=new LinkedList<>();

    public void addFlower(String flower){
        flowers.add(flower);
    }

    public void addFlowerInTheMiddle(String flower){
        int numberOfFlowers=flowers.size();
        if(numberOfFlowers%2==0) {
            insertOneFlowerInTheMiddle(flower);
        }
        else{
            insertTwoFlowersInTheMiddle(flower);
        }
    }

    private void insertTwoFlowersInTheMiddle(String flower) {
        flowers.add(((flowers.size()+1) / 2), flower);
        flowers.add((flowers.size() / 2)-1, flower);
    }

    private void insertOneFlowerInTheMiddle(String flower) {
        flowers.add((flowers.size() / 2), flower);
    }

    public List<String> getBunch() {
        return flowers;
    }
}
