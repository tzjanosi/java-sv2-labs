package controliteration.day;

import java.util.ArrayList;
import java.util.List;

public class Day {
    private List<Hour> hoursOfDay= new ArrayList<>();

    public void setDayPeriod(){
        for(Hour item:hoursOfDay){
            if(item.getHourNumber()>6 && item.getHourNumber()<22){
                item.setPeriod(DayPeriod.DAYTIME);
            }
            else{
                item.setPeriod(DayPeriod.NIGHTTIME);
            }
        }
    }

    public void addHour(Hour hour){
        hoursOfDay.add(hour);
    }

    public List<Hour> getHoursOfDay() {
        return hoursOfDay;
    }

    public static void main(String[] args) {
        Day day=new Day();
        Hour hour=new Hour(1);
        day.addHour(hour);
        hour=new Hour(6);
        day.addHour(hour);
        hour=new Hour(12);
        day.addHour(hour);
        hour=new Hour(17);
        day.addHour(hour);
        hour=new Hour(21);
        day.addHour(hour);
        hour=new Hour(23);
        day.addHour(hour);
        hour=new Hour(0);
        day.addHour(hour);
        day.setDayPeriod();

        System.out.println(day.getHoursOfDay());

    }
}
