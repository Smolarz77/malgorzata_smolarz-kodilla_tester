package homework;
//Klasę TaskManager z metodą main, w której przy pomocy Stream oraz operacji filtrowania i transformacji utworzona zostanie
// lista List<LocalDate> zawierająca daty deadline wszystkich zadań, których data deadline jeszcze nie upłynęła.

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {  //metoda main
        List<LocalDate> deadlines = TaskRepository.getTask()
                .stream()
                .filter(k -> k.getDeadline().isAfter(LocalDate.now()))
                .map(Task::getDeadline)
                .collect(Collectors.toList());
        System.out.println(deadlines);

    }


}