package collectionsqueue;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class ToDoList {
    private List<ToDo> todos;

    public ToDoList(List<ToDo> todos) {
        this.todos = todos;
    }

    public Deque<ToDo> getTodosInUrgencyOrder(){
        Deque<ToDo> orderedToDoList=new LinkedList<>();
        for(ToDo toDo:todos){
            if(toDo.isUrgent()){
                orderedToDoList.push(toDo);
            }
            else{
                orderedToDoList.add(toDo);
            }
        }
        return orderedToDoList;
    }

    public static void main(String[] args) {
        List<ToDo> toDoList = new ArrayList<>();
        toDoList.add(new ToDo("Virágöntözés", false));
        toDoList.add(new ToDo("Kutyaetetés", true));
        toDoList.add(new ToDo("Kivitelezőt felhívni", true));
        toDoList.add(new ToDo("Kuka", false));
        toDoList.add(new ToDo("Bevásárolni", false));
        toDoList.add(new ToDo("Fürdetés", true));
        System.out.println(toDoList);

        ToDoList todoList=new ToDoList(toDoList);
        System.out.println();
        System.out.println("Rendezve");
        System.out.println(todoList.getTodosInUrgencyOrder());
        System.out.println();
        System.out.println("pop() eredménye:");
        System.out.println(todoList.getTodosInUrgencyOrder().pop());

    }

}
