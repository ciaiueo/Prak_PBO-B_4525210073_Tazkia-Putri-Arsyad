package com.univ;

public class mahasiswa {
    //properti
    private String npm;
    private String namaDepan;
    private String namaBelakang;
    private String Prodi;
    private String tanggalLahir;
    private String alamat;
    private int umur;

    //constructor
    public mahasiswa(String npm, String namaDepan, String namaBelakang, String Prodi, String tanggalLahir, String alamat, int umur)   {
        this.npm = npm;
        this.namaDepan = namaDepan;
        this.namaBelakang = namaBelakang;
        this.tanggalLahir = tanggalLahir;
        this.Prodi = Prodi;
        this.alamat = alamat;
        this.umur = umur;
    }

    //Getter dan Setter
    public String getnpm()  {
        return npm;
    }

    public void setnpm(String npm)  {
        this.npm = npm;
    }

    public String getnamaDepan()    {
        return namaDepan;
    }

    public void setnamaDepan(String namaDepan)  {
        this.namaDepan = namaDepan;
    }

    public String getnamaBelakang() {
        return namaBelakang;
    }

    public void setnamaBelakang(String namaBelakang)    {
        this.namaBelakang = namaBelakang;
    }

    public String getProdi()    {
        return Prodi;
    }

    public void setProdi(String Prodi)  {
        this.Prodi = Prodi;
    }

    public String gettanggalLahir() {
        return tanggalLahir;
    }

    public void settanggalLahir(String tanggalLahir)    {
        this.tanggalLahir = tanggalLahir;
    }

    public String getalamat()   {
        return alamat;
    }

    public void setalamat(String alamat)    {
        this.alamat = alamat;
    }

    public int getumur()    {
        return umur;
    }

    public void setumur(int umur)   {
        this.umur = umur;
    }

    //method tambahan
    public void belajar()   {
        System.out.println(namaDepan + "Sedang Belajar");
    }

    public void ujian() {
        System.out.println(namaDepan + " Sedang Ujian");
    }

    //method untuk menampilkan informasi
    public void displayInfo()   {
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NPM     : " + npm);
        System.out.println("Nama Depan      : " + namaDepan);
        System.out.println("Nama Belakang   : " + namaBelakang);
        System.out.println("Program Studi   : " + Prodi);
        System.out.println("Tanggal Lahir   : " + tanggalLahir);
        System.out.println("Alamat  : " + alamat);
        System.out.println("Umur    : " + umur);
        System.out.println();
    }
}
