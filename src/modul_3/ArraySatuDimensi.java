package modul_3;

import java.util.Arrays;

public class ArraySatuDimensi {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array
        int[] nilaiSiswa = {85, 92, 78, 95, 88};

        // Menampilkan elemen array
        System.out.println("Nilai Siswa: " + Arrays.toString(nilaiSiswa));

        // Akses elemen
        System.out.println("Nilai siswa ke-3 (indeks 2): " + nilaiSiswa[2]);

        // --- Modifikasi: Fitur Pencarian Nilai Tertinggi dan Terendah ---
        int nilaiTertinggi = nilaiSiswa[0];
        int nilaiTerendah = nilaiSiswa[0];

        for (int nilai : nilaiSiswa) {
            if (nilai > nilaiTertinggi) {
                nilaiTertinggi = nilai;
            }
            if (nilai < nilaiTerendah) {
                nilaiTerendah = nilai;
            }
        }

        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
    }
}