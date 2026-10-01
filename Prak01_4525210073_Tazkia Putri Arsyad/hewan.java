class hewan    {
    String color;
    String storage;

    public void berjalan() {System.out.println(" Anjing warna " + this.color + " berjalan. ");}
    public void jalan() {System.out.println(" Kucing warna " + this.color + " jalan. ");}
    public void terbang() {System.out.println(" Burung warna " + this.color + " terbang. ");}
    
    public static void main(String[] args)  {
        hewan hWhite = new hewan();
        hewan hBlack = new hewan();
        hewan hBlue = new hewan();
        
        hWhite.color = "White";
        hBlack.color = "Black";
        hBlue.color = "Blue";

        hWhite.storage = "64GB";
        hBlack.storage = "128GB";
        hBlue.storage = "512GB";

        System.out.println();
        hBlue.terbang();
        hBlack.jalan();
        hWhite.berjalan();
        System.out.println();
    }
}