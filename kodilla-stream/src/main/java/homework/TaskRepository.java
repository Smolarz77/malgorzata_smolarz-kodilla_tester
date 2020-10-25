package homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

//Klasę TaskRepository z metodą statyczną List<Task> getTasks() zwracającą listę kilku przykładowych zadań
public class TaskRepository {
    public static List<Task> getTask(){
        List<Task>tasks = new ArrayList<>();
        tasks.add(new Task ("go shopping", LocalDate.now(), LocalDate.of(2020,9,26)));
        tasks.add(new Task("visit a doctor", LocalDate.now(), LocalDate.of(2020,10,15)));
        tasks.add(new Task("call Annie", LocalDate.now(), LocalDate.of(2020,12,18)));
        tasks.add(new Task("wash car", LocalDate.now(), LocalDate.of(2021,1,15)));
        return tasks;


    }

}
