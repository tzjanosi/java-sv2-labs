package introexceptionthrowjunit4;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private List<Integer> notesList=new ArrayList<>();

    public void addNote(int note){
        if(note<1 || 5<note) {
            throw new IllegalArgumentException("Note must be between 1 and 5!");
        }
        notesList.add(note);
    }

    public List<Integer> getNotesList() {
        return notesList;
    }
}
