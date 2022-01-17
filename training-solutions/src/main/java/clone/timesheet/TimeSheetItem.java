package clone.timesheet;

import java.time.LocalDateTime;
import java.time.chrono.ChronoLocalDateTime;

public class TimeSheetItem {
    private String employee;
    private String project;
    private LocalDateTime from;
    private LocalDateTime to;

    public TimeSheetItem(String employee, String project, LocalDateTime from, LocalDateTime to) {
        this.employee = employee;
        this.project = project;
        this.from = from;
        this.to = to;
    }

    public TimeSheetItem(TimeSheetItem anotherTimeSheetItem) {
        this.employee = anotherTimeSheetItem.employee;
        this.project = anotherTimeSheetItem.project;
        this.from = LocalDateTime.of(anotherTimeSheetItem.from.getYear(),anotherTimeSheetItem.from.getMonth(),anotherTimeSheetItem.from.getDayOfMonth(),anotherTimeSheetItem.from.getHour(),anotherTimeSheetItem.from.getMinute());
        this.to = LocalDateTime.of(anotherTimeSheetItem.to.getYear(),anotherTimeSheetItem.to.getMonth(),anotherTimeSheetItem.to.getDayOfMonth(),anotherTimeSheetItem.to.getHour(),anotherTimeSheetItem.to.getMinute());
    }
    public TimeSheetItem copyWithDifferentEmployee(TimeSheetItem timeSheetItem, String newEmployee){
        TimeSheetItem newItem=new TimeSheetItem(timeSheetItem);
        newItem.setEmployee(newEmployee);
        return newItem;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getEmployee() {
        return employee;
    }

    public String getProject() {
        return project;
    }

    public LocalDateTime getFrom() {
        return from;
    }

    public LocalDateTime getTo() {
        return to;
    }
}
