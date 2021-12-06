package interfacerules;

public class Equator implements Name, Length{
    private static final String name="Equator";
    private static final int length=40075;

    @Override
    public double getLength() {
        return (double)length;
    }

    @Override
    public String getName() {
        return name;
    }
}
