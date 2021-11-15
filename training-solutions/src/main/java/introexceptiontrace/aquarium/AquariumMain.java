package introexceptiontrace.aquarium;

public class AquariumMain {
    public static void main(String[] args) {
        Fish fish1= new Fish("Bálna", "Kék");
        Fish fish2= new Fish("Guppi", "Szivárvány");
        Fish fish3= new Fish("Keszeg", "Ezüst");
        Aquarium aquarium=new Aquarium();
        aquarium.addFish(fish1);
        aquarium.addFish(fish2);
        aquarium.addFish(fish3);
        System.out.println(aquarium.getNumberOfFish());
    }
}
