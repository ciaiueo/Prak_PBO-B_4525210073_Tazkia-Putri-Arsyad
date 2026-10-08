package com.contoh2;

import java.util.ArrayList;

public class Jurusan {
    private String nama;

    private ArrayList<Pengajar> daftarPengajar = new ArrayList<>();

    public Jurusan(String nama) {
        this.nama = nama;
    }

    public void tambahPengajar(Pengajar p) {
        daftarPengajar.add(p);
    }

    public void tampilkan() {
        System.out.println("Jurusan " + nama);
        for (Pengajar p : daftarPengajar) {
            System.out.println("_ " + p.getNama());
        }
    }
}