package app;

public class main {
    public static void main(String[] args) throws Exception {
        karyawan Ridho = new karyawan("12345", "Ridho");
        Ridho.getInfo();
        Ridho.absenPagi();
        Ridho.kerja();
        Ridho.absenPulang();

        System.out.println();

        karyawan Melan = new karyawan("12346", "Melan");
        Melan.getInfo();
        Melan.absenPagi();
        Melan.kerja();
        Melan.absenPulang();

        System.out.println();

        dosen Andiani = new dosen("23455", "Andiani", "332211");
        Andiani.getInfo();
        Andiani.absenPagi();
        Andiani.kerja();
        Andiani.absenPulang();

        System.out.println();

        dosen Ionia = new dosen("23456", "Ionia", "332212");
        Ionia.getInfo();
        Ionia.absenPagi();
        Ionia.kerja();
        Ionia.absenPulang();
    }
}