package inner_class;

public class Restaurant {
    //instance fields - data spesifik retoran
    private String restaurantName;
    private String address;
    private String phone;

    //static fields - data umum
    private static int totalRestaurant = 0;

    public Restaurant(String restaurantName, String address, String phone) {
        //1. perbaikan: gunakan 'restaurantName' sesuai nama parameter
        this.restaurantName = restaurantName;
        this.address = address;
        this.phone = phone;
        totalRestaurant++;
        System.out.println("Restaurant " + restaurantName + " created!");
    }

    public void displayRestaurantInfo() {
        System.out.println("Nama    : " + restaurantName);
        System.out.println("Alamat  : " + address);
        System.out.println("Telepon : " + phone);
    }

    //method helper untuk membuat objek inner class Order
    public Order createOrder(String customerName) {
        return new Order(customerName);
    }

    //inner class dimulai di sini
    public class Order {
        private String customerName;
        private String[] items;
        private int[] quantities;
        private double totalPrice;

        //2. perbaikan: hapus kata 'class' pada constructor
        //3. perbaikan: masukkan constructor dan method ke dalam kurung kurawal Order
        public Order(String customerName) {
            this.customerName = customerName;
            this.items = new String[10];
            this.quantities = new int[10];
            this.totalPrice = 0.0;
        }

        public void addItem(String item, int quantity, double price) {
            for (int i = 0; i < items.length; i++) {
                if (items[i] == null) {
                    items[i] = item;
                    quantities[i] = quantity;
                    totalPrice += quantity * price;
                    break;
                }
            }
        }

        public void displayOrder() {
            System.out.println("\n=== ORDER DETAIL ===");
            System.out.println("Restaurant: " + restaurantName);
            System.out.println("Address: " + address);
            System.out.println("Phone: " + phone);
            System.out.println("Customer: " + customerName);
            System.out.println("Total Restaurant: " + totalRestaurant);

            System.out.println("\n--- Items Ordered ---");
            for (int i = 0; i < items.length; i++) {
                if (items[i] != null) {
                    System.out.println("- " + items[i] + " x" + quantities[i]);
                }
            }

            System.out.println("====================");
            System.out.println("TOTAL: Rp " + totalPrice);
            System.out.println("Thank you for ordering from " + restaurantName + "!");
        }

        //method untuk proses order
        public void processOrder() {
            System.out.println("Processing order for " + customerName + " at " + restaurantName);
            System.out.println("Contact: " + phone);
            System.out.println("Delivery to provided address...");
        }
    }
}
