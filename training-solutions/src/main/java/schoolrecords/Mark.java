package schoolrecords;

public class Mark {
    private MarkType markType;
    private Subject subject;
    private Tutor tutor;
    private Exceptionhandler exceptionhandler=new Exceptionhandler();

    public Mark(MarkType markType, Subject subject, Tutor tutor) {
        checkWhetherSubjectAndTutorValid(subject,tutor);
        this.markType = markType;
        this.subject = subject;
        this.tutor = tutor;
    }


    public Mark(String markType, Subject subject, Tutor tutor) {
        checkWhetherSubjectAndTutorValid(subject,tutor);
        this.markType = getMarkTypeFromString(markType);
        this.subject = subject;
        this.tutor = tutor;
    }

    private void checkWhetherSubjectAndTutorValid(Subject subject, Tutor tutor) {
        exceptionhandler.set(subject,new NullPointerException("Both subject and tutor must be provided!"));
        exceptionhandler.isParameterNull();
        exceptionhandler.set(tutor,new NullPointerException("Both subject and tutor must be provided!"));
        exceptionhandler.isParameterNull();
    }

    private MarkType getMarkTypeFromString(String evaluation){
        exceptionhandler.set(evaluation,new IllegalArgumentException("No subject was given for getMarkTypeFromString method."));
        exceptionhandler.isStringEmpty();
        MarkType[] markTypes = MarkType.values();
        for(MarkType markType:markTypes){
            if(evaluation.equals(markType.getEvaluation())){
                return markType;
            }
        }
        throw new IllegalArgumentException("Wrong evaluation for getMarkTypeFromString method:"+evaluation);
    }

    public String getSubjectAndMark() {
        return subject.getSubjectName()+": "+toString();
    }

    @Override
    public String toString() {
        return markType.getEvaluation()+"("+markType.getValue()+")";
    }

    public MarkType getMarkType() {
        return markType;
    }

    public Subject getSubject() {
        return subject;
    }

    public Tutor getTutor() {
        return tutor;
    }
}
