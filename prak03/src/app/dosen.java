package app;

public class dosen extends karyawan {
    private String NIDN;

    public dosen(String var1, String var2, String var3) {
        super(var1, var2);
        this.NIDN = var3;
    }

    public void setNIDN(String var1)    {
        this.NIDN = var1;
    }

    public void getNIDN()   {
        System.out.println("NIDN: " + this.NIDN);
    }

    public void absenPagi() {
        System.out.println(this.nama + ": absen pagi");
    }

    public void mengajar()  {
        System.out.println(this.nama + ": sedang mengajar");
    }

    public void absenPulang()   {
        System.out.println(this.nama + ": absen pulang");
    }

    public void getInfo()   {
        System.out.println("Kode Karyawan: " + this.kodeKaryawan);
        System.out.println("Nama: " + this.nama);
        System.out.println("NIDN: " + this.NIDN);
    }
}