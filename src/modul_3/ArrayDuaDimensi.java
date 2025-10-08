package modul_3;

import java.util.Scanner;

public class ArrayDuaDimensi {
    public static void main(String[] args) {
        // Inisialisasi Scanner untuk input
        Scanner input = new Scanner(System.in);

        // Langkah 1: Deklarasi array 2D untuk nilai siswa (3 siswa, 4 mata pelajaran)
        int[][] nilaiSiswa = new int[3][4];
        String[] namaSiswa = {"Fatah", "Riski", "All"};
        // Perhatikan: Mata pelajaran di gambar berbeda dengan respons sebelumnya. Kita ikuti gambar.
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};

        // Langkah 2: Input nilai
        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < 3; i++) {
            System.out.println("Input nilai untuk " + namaSiswa[i] + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print(mataPelajaran[j] + ": ");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Tutup scanner setelah selesai input
        input.close();

        // Langkah 3: Menampilkan data dalam bentuk tabel
        System.out.println("=== TABEL NILAI SISWA ===");

        // Header Tabel
        System.out.printf("%-12s", "Nama");
        for (String mapel : mataPelajaran) {
            // Mencetak 7 karakter pertama dari nama mapel, diratakan ke kiri 8 kolom
            System.out.printf("%-8s", mapel.substring(0, Math.min(7, mapel.length())));
        }
        System.out.println("Rata-rata"); // Kolom tambahan Rata-rata

        // Isi Tabel
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-12s", namaSiswa[i]); // Cetak nama siswa
            int total = 0;

            for (int j = 0; j < 4; j++) {
                System.out.printf("%-8d", nilaiSiswa[i][j]); // Cetak nilai
                total += nilaiSiswa[i][j];
            }

            // Hitung dan cetak rata-rata per siswa
            double rataRata = total / 4.0;
            System.out.printf("%.2f\n", rataRata);
        }
    }
}