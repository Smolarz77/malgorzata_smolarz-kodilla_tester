package exception.homework;

public class WarehouseApp {
    public static void main(String[] args) {
        //W metodzie main dodaj kilka zamówień do hurtowni przy pomocy metody addOrder(),

        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        warehouse.addOrder(new Order("4"));
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));

// a następnie spróbuj wyszukać jakieś nieistniejące zamówienie. Przygotuj odpowiednią obsługę błędów.
        try {
            System.out.println(warehouse.getOrder("2").getNumber());
        } catch (OrderDoesntExistException e) {
            System.out.println("Sorry, this order does not exist.");
        } finally {
            System.out.println("Thank you for using our system");
        }
    }}