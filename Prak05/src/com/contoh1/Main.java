package com.contoh1;

public class Main {
    public static void main(String[] args) {
        Dokter andi = new Dokter("Andi");
        Dokter sari = new Dokter("Sari");
        Pasien budi = new Pasien("Budi");
        Pasien dina = new Pasien("Dina");

        andi.tambahPasien(budi);
        andi.tambahPasien(dina);
        sari.tambahPasien(budi);

        andi.periksa(budi);
        andi.tampilkanPasien();
        budi.tampilkanDokter();
    }
}