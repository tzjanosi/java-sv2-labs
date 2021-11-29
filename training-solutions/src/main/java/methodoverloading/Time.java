package methodoverloading;

public class Time {
    private int timeInSeconds;
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int timeInSeconds) {
        this.timeInSeconds = timeInSeconds;
        setHoursMinutesSeconds(timeInSeconds);
    }

    private void setHoursMinutesSeconds(int timeInSeconds) {
        seconds=timeInSeconds%60;
        int remainTimeInSeconds=timeInSeconds-seconds;
        minutes=(remainTimeInSeconds%3600)/60;
        remainTimeInSeconds-=60*minutes;
        hours=remainTimeInSeconds/3600;
    }

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        timeInSeconds=3600*hours+60*minutes+seconds;
    }

    public boolean isEqual(Time time){
        return timeInSeconds==time.getTimeInSeconds();
    }
    public boolean isEqual(int hours, int minutes, int seconds){
        Time time=new Time(hours, minutes, seconds);
        return isEqual(time);
    }
    public boolean isEarlier(Time time){
        return timeInSeconds<time.getTimeInSeconds();
    }
    public boolean isEarlier(int hours, int minutes, int seconds){
        Time time=new Time(hours, minutes, seconds);
        return isEarlier(time);
    }

    public int getTimeInSeconds() {
        return timeInSeconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
