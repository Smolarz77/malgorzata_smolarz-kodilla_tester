package exception.homework;
import org.junit.Test;

import static org.junit.Assert.*;
//Twoim zadaniem jest napisanie testu do tej klasy, który sprawdzi, czy wyjątek jest poprawnie rzucany.

public class WarehouseTestSuite {

    @Test(expected = OrderDoesntExistException.class)
    //aby poinformować JUnit, że rzucenie wyjątku jest sytuacją poprawną, której właśnie oczekujemy.
    // Wystarczy do adnotacji @Test dodać informację o tym, że test powinien oczekiwać wyjątku podanej klasy:

    public void testGetOrder_withException() throws OrderDoesntExistException {
        // given
        Warehouse warehouse = new Warehouse();
        // when
      warehouse.getOrder("2");

    }
}