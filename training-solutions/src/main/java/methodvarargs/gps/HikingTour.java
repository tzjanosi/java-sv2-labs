package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {
    private List<FieldPoint> fieldPoints=new ArrayList<>();

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog){
        if(timeOfLogging==null){
            throw new IllegalArgumentException("Missing data: timeOfLogging!");
        }
        for(FieldPoint fieldPoint:fieldPointsToLog){
            fieldPoint.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(fieldPoint);
        }
    }

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }
}
