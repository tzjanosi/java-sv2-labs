package methodpass.troopers;

public class Position {
    private final int posX;
    private final int posY;

    public Position(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public double distanceFrom(Position anotherPosition){
        return(Math.sqrt(Math.pow(posX -anotherPosition.getPosX(),2)+Math.pow(posY -anotherPosition.getPosY(),2)));
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
}
