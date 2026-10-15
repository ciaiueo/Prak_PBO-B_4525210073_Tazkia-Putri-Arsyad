package static_class;

public class VendingMachine {
    //static fields -data mesin yang sama untuk semua
    private static String machineBrand = "JavaVend";
    private static int totalMachines = 0;
    private static final int MAX_ITEMS = 10;

    //instance fields - data spesifik mesin
    private String location;
    private int machineId;

    //constructor VendingMachine (otomatis menambah total mesin dan mengatur ID)
    public VendingMachine(String location) {
        this.location = location;
        totalMachines++;
        this.machineId = totalMachines;
    }

    //method untuk menampilkan informasi mesin
    public void displayMachineInfo() {
        System.out.println("Vending Machine ID: " + machineId);
        System.out.println("Location: " + location);
        System.out.println("Brand: " + machineBrand);
        System.out.println("Total Machines: " + totalMachines);
    }

    //method untuk simulasi pembelian produk di mesin ini
    public void buyProduct(Product product, int quantity) {
        System.out.println("==== Vending Machine #" + machineId + " at " + location + " ====");
        System.out.println("Buying " + quantity + " x " + product.getName());
        System.out.println("Total: Rp " + (product.getPrice() * quantity));
        System.out.println("Thank you for your using " + machineBrand + "!");
    }

    //static nested class: Product
    public static class Product {
        private String name;
        private int price;
        private static int totalProducts = 0;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
            totalProducts++;
        }

        public void displayProductInfo() {
            System.out.println("Product: " + name);
            System.out.println("Price: Rp " + price);
            System.out.println("Brand: " + machineBrand);
            System.out.println("Max Items: " + MAX_ITEMS);
            System.out.println(); //baris kosong agar rapih sesuai output
        }

        //getter dan method static tambahan untuk diakses dari luar
        public String getName() {
            return name;
        }

        public int getPrice() {
            return price;
        }

        public static int getTotalProducts() {
            return totalProducts;
        }
    }
}