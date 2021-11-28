package methodpass.troopers;

import java.util.ArrayList;
import java.util.List;

public class HeadQuarter {
    private List<Trooper> troopers=new ArrayList<>();

    public void addTrooper(Trooper trooper){
        if (trooper==null){
            throw new IllegalArgumentException("We need a trooper to add!");
        }
        troopers.add(trooper);
    }

    public void moveTrooperByName(String name, Position target){
        if (target==null){
            throw new IllegalArgumentException("We need a position to go!");
        }
        moveTrooper(findTrooperByName(name),target);
    }
    public void moveClosestTrooper(Position target){
        if (target==null){
            throw new IllegalArgumentException("We need a position to go!");
        }
        moveTrooper(findClosestTrooper(target),target);
    }

    private void moveTrooper(Trooper trooper, Position target) {
        trooper.changePosition(target);
    }

    private Trooper findTrooperByName(String name){
        for(Trooper trooper:troopers){
            if(name.equals(trooper.getName())){
                return trooper;
            }
        }
        throw new IllegalArgumentException("No trooper found with this name: "+name+"!");
    }

    private Trooper findClosestTrooper(Position target){
        if(troopers.size()==0){
            throw new IllegalArgumentException("No trooper to command!");
        }

        Trooper winner=troopers.get(0);
        double minDistance=winner.distanceFrom(target);
        for(Trooper trooper:troopers){
            if(trooper.distanceFrom(target)<minDistance){
                winner=trooper;
                minDistance=winner.distanceFrom(target);
            }
        }
        return winner;
    }

    public List<Trooper> getTroopers() {
        return troopers;
    }
}
