package interfaceextends.robots;

import java.util.ArrayList;
import java.util.List;

public class AstroBoy implements FlyableRobot{
    private Point position;
    private int angle;
    private List<Point> path=new ArrayList<>();
    public final static long ALTITUDE = 5;

    public AstroBoy(Point position) {
        this.position = position;
    }

    public void walkTo(Point position){
        this.position=position;
        path.add(position);
    }
    public void flyTo(Point position){
        moveTo(position);
    }
    public void liftTo(long altitude){
        moveTo(new Point(position.getX(), position.getY(), altitude));
    }
    public void moveTo(Point position){
        walkTo(position);
    }
    public void fastMoveTo(Point position) {
        liftTo(ALTITUDE);
        flyTo(new Point(position.getX(), position.getY(), ALTITUDE));
        liftTo(position.getZ());
    }
    public void rotate(int angle){
        this.angle=angle;
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

    public long getAltitude() {
        return position.getZ();
    }
}
