package com.univ;

public class main {
    public static void main(String[] args)  {

        mahasiswa tazkia = new mahasiswa(
            "4525210073",
            "Tazkia",
            "Putri",
            "Teknik Informatika",
            "05 November 2006",
            "Bogor",
            19
        );

        tazkia.displayInfo();

        tazkia.ujian();
    }
}