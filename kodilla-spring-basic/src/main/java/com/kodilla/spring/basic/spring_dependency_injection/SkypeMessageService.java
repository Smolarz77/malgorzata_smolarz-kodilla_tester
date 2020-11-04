package com.kodilla.spring.basic.spring_dependency_injection;
import org.springframework.stereotype.Component;



//Aby obiekt klasy SkypeMessageService stał się beanem i został umieszczony w kontenerze, Spring musi dostać jasne polecenie: stwórz beana.
// Jednym ze sposobów wskazania klasy jako beana jest dodanie adnotacji @Component nad klasą:
@Component
public class SkypeMessageService {

    public String send(String message, String receiver) {
        return "Sending [" + message + "] to: " + receiver + " using Skype";
    }
}