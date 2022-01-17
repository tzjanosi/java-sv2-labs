package collectionsclass;

public class ExamResult implements Comparable<ExamResult>{
    private String name;
    private int points;

    public ExamResult(String name, int points) {
        this.name = name;
        this.points = points;
    }

    @Override
    public int compareTo(ExamResult o) {
        return o.points-points;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }
}
