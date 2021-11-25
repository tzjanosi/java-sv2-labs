package algorithmsfilter.zoo;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animalList;

    public Zoo(List<Animal> animalList) {
        this.animalList = animalList;
    }

    public List<Animal> getAnimalsWithNumberOfLegsGiven(int numberOfLegs){
        List<Animal> filteredAnimalList=new ArrayList<>();
        for(Animal animal:animalList){
            if(animal.getNumberOfLegs()==numberOfLegs){
                filteredAnimalList.add(animal);
            }
        }
        return filteredAnimalList;
    }

    public List<Animal> getAnimalList() {
        return animalList;
    }
    public void addAnimal(Animal animal){
        animalList.add(animal);
    }
}
