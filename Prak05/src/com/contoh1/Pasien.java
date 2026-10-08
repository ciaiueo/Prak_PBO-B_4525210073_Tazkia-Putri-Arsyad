package com.contoh1;

import java.util.ArrayList;

public class Pasien {
    private String nama;

    private ArrayList<Dokter> daftarDokter = new ArrayList<>();

    public Pasien(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void tambahDokter(Dokter d) {
        if (!daftarDokter.contains(d)) {
            daftarDokter.add(d);
            d.tambahPasien( this);
        }
    }

    public void tampilkanDokter() {
        System.out.println("Dokter yang menangani " + nama + ":");
        for (Dokter d : daftarDokter) {
            System.out.println("_ " + d.getNama());
        }
    }
}