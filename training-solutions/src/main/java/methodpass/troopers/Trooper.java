package methodpass.troopers;

public class Trooper {
    private String name;
    private Position position;

    public Trooper(String name) {
        if (name.isBlank()){
            throw new IllegalArgumentException("Name cannot be empty!");
        }
        this.name = name;
        position=new Position(0,0);
    }

    public double distanceFrom(Position anotherPosition){
        return(position.distanceFrom(anotherPosition));
    }

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }
    public void changePosition(Position target){
        position=target;
    }
}
