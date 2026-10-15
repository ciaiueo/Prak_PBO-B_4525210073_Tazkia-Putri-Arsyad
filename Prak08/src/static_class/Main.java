package static_class;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== VENDING MACHINE DEMO ===");

        //1. membuat object dari static nested class Product
        VendingMachine.Product p1 = new VendingMachine.Product("Chips", 5000);
        VendingMachine.Product p2 = new VendingMachine.Product("Soda", 7000);
        VendingMachine.Product p3 = new VendingMachine.Product("Chocolate", 6000);

        System.out.println("=== PRODUCT INFO ===");
        p1.displayProductInfo();
        p2.displayProductInfo();

        System.out.println("Total products created: " + VendingMachine.Product.getTotalProducts());
        System.out.println();

        //2. membuat object dari outer class VendingMachine
        VendingMachine vm1 = new VendingMachine("Mall A");
        VendingMachine vm2 = new VendingMachine("Mall B");

        System.out.println("=== VENDING MACHINE INFO ===");
        vm1.displayMachineInfo();
        vm2.displayMachineInfo();
        System.out.println();

        //3. Simulasi pembelian produk di vending machine
        vm1.buyProduct(p1, 2);
        vm2.buyProduct(p2, 1);
        vm1.buyProduct(p3, 1);
    }
}