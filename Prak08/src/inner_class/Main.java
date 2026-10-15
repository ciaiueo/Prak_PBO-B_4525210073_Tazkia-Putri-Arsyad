package inner_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== RESTAURANT ORDER SYSTEM ===");

        //buat restaurant
        Restaurant pizzaHut = new Restaurant("Pizza Hut", "Jl. Raya No. 123", "08123456789");
        Restaurant KFC = new Restaurant("KFC", "Jl. Sudirman No. 456", "08198765432");

        pizzaHut.displayRestaurantInfo();
        KFC.displayRestaurantInfo();

        Restaurant.Order order1 = pizzaHut.createOrder("John Doe");
    }
}