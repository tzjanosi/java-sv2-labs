package optional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class TrainingCompany {
    private List<Course> coursesList=new ArrayList<>();

    public TrainingCompany(List<Course> coursesList) {
        this.coursesList = coursesList;
    }

    String getNameOfCourseWithGivenLevel(Level level){
        Optional<String> optional = Optional.empty();
        for(int i=0; i< coursesList.size() && optional.isEmpty(); i++){
            Course course=coursesList.get(i);
            if(course.matchLevel(level)){
                optional=Optional.of(course.getName());
            }
        }
        String output = optional.orElse("Sorry, there is no course at this level.");
        return output;
    }

    int getPriceOfCourseWithGivenNameAndLevel(String name, Level level){
        Optional<Integer> optional = Optional.empty();
        for(int i=0; i< coursesList.size() && optional.isEmpty(); i++){
            Course course=coursesList.get(i);
            if(course.matchNameAndLevel(name, level)){
                optional=Optional.of(course.getPrice());
            }
        }
        int output = optional.orElseThrow(() -> new IllegalArgumentException("No such course."));
        return output;
    }

    Course getCheaperCourse(int maxPrice){
        Optional<Course> optional = Optional.empty();
        for(int i=0; i< coursesList.size() && optional.isEmpty(); i++){
            Course course=coursesList.get(i);
            if(course.isCheaperOrEqualThan(maxPrice)){
                optional=Optional.of(course);
            }
        }
        Course output = optional.orElseThrow(() -> new IllegalArgumentException("No such course."));
        return output;
    }

}
