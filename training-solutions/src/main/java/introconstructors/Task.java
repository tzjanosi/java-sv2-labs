package introconstructors;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Task {
    private String title;
    private String description;
    private LocalDateTime startDateTime;
    private int duration;

    public Task(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void start(){
        startDateTime = LocalDateTime.now();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ha mi nemm írunk, akkor is van default constructor.");
        System.out.println("Így néz ki: public Task() {}");
        System.out.println();
        System.out.println("Miután megírtuk a constructort az lesz a default helyett.");
        System.out.println("Egy konstruktor lesz, amit írtunk.");
        System.out.println();

        System.out.println("Type in the title of the task:");
        String title=scanner.nextLine();
        System.out.println("Type in the description of the task:");
        String description=scanner.nextLine();
        Task task=new Task(title, description);
        System.out.println("Type in the duration of the task (in minutes):");
        int duration=scanner.nextInt();
        task.setDuration(duration);
        task.start();

        System.out.println();
        System.out.println("The title of the task:"+task.getTitle());
        System.out.println("The description of the task:"+task.getDescription());
        System.out.println("The duration of the task:"+task.getDuration());
        System.out.println("The start date and time of the task:"+task.getStartDateTime());

    }

}
