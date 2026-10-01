class iPhone    {
    String color;
    String storage;

    public void nyala() {System.out.println(" iPhone warna " + this.color + " menyala. ");}
    public void mati() {System.out.println(" iPhone warna " + this.color + " mati. ");}
    public void berdering() {System.out.println(" iPhone warna " + this.color + " berdering. ");}
    public void videoCall() {System.out.println(" iPhone warna " + this.color + " videoCall. ");}

    public static void main(String[] args)  {
        iPhone iGold = new iPhone();
        iPhone iGreen = new iPhone();
        iPhone iGrey = new iPhone();
        iPhone iDarkGrey = new iPhone();
        
        iGold.color = "Gold";
        iGreen.color = "Green";
        iGrey.color = "Grey";
        iDarkGrey.color = "Dark Grey";

        iGold.storage = "64GB";
        iGreen.storage = "128GB";
        iGrey.storage = "512GB";
        iDarkGrey.storage = "64GB";

        System.out.println();
        iGreen.berdering();
        iDarkGrey.mati();
        iGold.nyala();
        System.out.println();
    }
}