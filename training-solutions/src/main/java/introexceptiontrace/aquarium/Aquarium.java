package introexceptiontrace.aquarium;
import java.util.List;

public class Aquarium {
    private List<Fish> ornamentalFish;

    public List<Fish> getOrnamentalFish() {
        return ornamentalFish;
    }

    public void addFish(Fish fish) {
        System.out.println("Nem példányosítottuk az ornamentalFish-t. Ezért az értéke null.");
        System.out.println("null-ra nem lehet meghívni az add() metódust.");
        ornamentalFish.add(fish);
    }

    public int getNumberOfFish() {
        return ornamentalFish.size();
    }
}
