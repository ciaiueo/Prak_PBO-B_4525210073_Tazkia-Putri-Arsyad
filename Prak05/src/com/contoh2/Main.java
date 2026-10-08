package com.contoh2;

public class Main {
    public static void main(String[] args) {
        Pengajar p1 = new Pengajar("Pak Agus");
        Pengajar p2 = new Pengajar("Bu Lestari");

        Jurusan ti = new Jurusan("Teknik Informatika");
        ti.tambahPengajar(p1);
        ti.tambahPengajar(p2);
        ti.tampilkan();

        ti = null;
        System.out.println(p1.getNama() + " masih ada.");
    }
}