package interfacedefaultmethods.cloth;

public interface Square {
    default int getNumberOfSides() {
        return 4;
    }
    default double getLengthOfDiagonal(){
        return Math.sqrt(2)*getSide();
    }
    default double getPerimeter(){
        return getNumberOfSides()*getSide();
    }
    default double getArea(){
        return Math.pow(getSide(),2);
    }
    double getSide();
}
