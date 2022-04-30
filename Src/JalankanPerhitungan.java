package Src;

import Model.Perhitungan;

public class JalankanPerhitungan {

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);
        String judul = s.PrintJudul("Judul Menggunakan Interface");
        System.out.println(judul);
        System.out.println();

        int hasiltambah = s.HitungTambah(4, 6);
        System.out.println("Hasil Tambah");
        System.out.println(hasiltambah);
        System.out.println();

        int hasilkali = s.HitungKali(4, 6);
        System.out.println("Hasil Kali");
        System.out.println(hasilkali);
    }
}