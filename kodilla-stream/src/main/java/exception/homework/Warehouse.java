package exception.homework;
import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    //Klasę Warehouse, która będzie przechowywała kolekcję zamówień.
    private List<Order> orders;
    public Warehouse() {

        this.orders = new ArrayList<>();
    }
    //Napisz metody addOrder(Order order) –dodającą zamówienie do kolekcji
   public void addOrder(Order order) {
       orders.add(order);
   }

    // metodę Order getOrder(String number), która wyszuka w kolekcji zamówienie o podanym numerze (użyj Stream) i je zwróci.
    public Order getOrder(String number)throws OrderDoesntExistException {
        Order ord = orders
                .stream()
                .filter(f-> f.getNumber().equals(number))
                .findFirst().orElseThrow(() -> new OrderDoesntExistException());
                return ord;

    }}
// W przypadku braku zamówienia w kolekcji rzuć wyjątkiem stworzonym w kroku pierwszym.

