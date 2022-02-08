package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {
    private List<Activity> activitiesList;

    public Activities(List<Activity> activitiesList) {
        this.activitiesList = activitiesList;
    }

    public long numberOfTrackActivities(){
//        long numberOfTrackActivities=0;
//        for(Activity activity:activitiesList){
//            if(activity.getClass().getName()=="activity.ActivityWithTrack"){
//                numberOfTrackActivities++;
//            }
//        }
//        return numberOfTrackActivities;
        return activitiesList.stream()
                .filter(activity -> activity.getClass().getName().equals("activity.ActivityWithTrack"))
                .count();

    }
    public long numberOfWithoutTrackActivities(){
//        long numberOfWithoutTrackActivities=0;
//        for(Activity activity:activitiesList){
//            if(activity.getClass().getName()=="activity.ActivityWithoutTrack"){
//                numberOfWithoutTrackActivities++;
//            }
//        }
//        return numberOfWithoutTrackActivities;
        return activitiesList.stream()
                .filter(activity -> activity.getClass().getName().equals("activity.ActivityWithoutTrack"))
                .count();
    }

    public List<Report> distancesByTypes(){
        List<Report> result=new ArrayList<>();
        double distance;
        for (ActivityType activityType : ActivityType.values()) {
            distance = activitiesList.stream()
                    .filter(activity -> activity.getType()==activityType)
                    .mapToDouble(activity -> activity.getDistance())
                    .sum();
            result.add(new Report(activityType,distance));
        }
        return result;
    }
}
