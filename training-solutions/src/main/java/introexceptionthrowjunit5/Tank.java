package introexceptionthrowjunit5;

public class Tank {
    private int angle;

    public void modifyAngle(int angleNumber){
        int newAngle=angle+angleNumber;
        if(newAngle<-80 || 80<newAngle) {
            throw new IllegalArgumentException("The target position should be between -80 and 80 degree!");
        }
        angle=angleNumber;
    }
    public int getAngle() {
        return angle;
    }
}

