package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class C3PO implements MovableRobot{
    private Point position;
    private int angle;
    private List<Point> path=new ArrayList<>();

    public C3PO(Point position) {
        this.position = position;
    }

    public void moveTo(Point position){
        walkTo(position);
    }
    public void fastMoveTo(Point position){
        walkTo(position);
    }
    public void rotate(int angle){
        this.angle=angle;
    }
    private void walkTo(Point position){
        this.position=position;
        path.add(position);
    }

    @Override
    public List<Point> getPath() {
        return path;
    }

    public Point getPosition() {
        return position;
    }

    public int getAngle() {
        return angle;
    }
}
