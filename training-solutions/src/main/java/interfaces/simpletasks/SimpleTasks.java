package interfaces.simpletasks;

import java.util.ArrayList;
import java.util.List;

public class SimpleTasks implements Runnable{
    private List<String> tasks=new ArrayList<>();

    public SimpleTasks(List<String> tasks) {
        this.tasks = tasks;
    }
    private boolean nextStep(){
        tasks.remove(tasks.size()-1);
        return(!tasks.isEmpty());
    }

    @Override
    public void run() {
        if(!tasks.isEmpty()){
            boolean notEmpty;
            do{
                notEmpty=nextStep();
            }
            while(notEmpty);
        }
    }

    public List<String> getTasks() {
        return tasks;
    }
}
