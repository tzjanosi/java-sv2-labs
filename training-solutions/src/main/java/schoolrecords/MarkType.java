package schoolrecords;

public enum MarkType {
    A(5, "excellent"), B(4, "very good"), C(3, "improvement needed"), D(2, "close fail"), F(1, "fail");
    private int value;
    private String evaluation;

    MarkType(int value, String evaluation) {
        this.value = value;
        this.evaluation = evaluation;
    }

    public int getValue() {
        return value;
    }

    public String getEvaluation() {
        return evaluation;
    }
}
