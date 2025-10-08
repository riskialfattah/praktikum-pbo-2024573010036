package modul_3.latihan;

import java.util.Arrays;

public class latihan4 {

    // --- Fitur 1: Mencari Nilai Tertentu ---
    public static int cariNilai(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Mengembalikan indeks jika ditemukan
            }
        }
        return -1; // Mengembalikan -1 jika tidak ditemukan
    }

    // --- Fitur 2: Menghitung Median dari Array yang Sudah Diurutkan ---
    public static double hitungMedian(int[] arr) {
        // Asumsi array sudah diurutkan (sesuai permintaan modul)
        int n = arr.length;
        if (n % 2 == 1) {
            // Jumlah ganjil: ambil nilai tengah
            return arr[n / 2];
        } else {
            // Jumlah genap: rata-rata dua nilai tengah
            int mid1 = arr[n / 2 - 1];
            int mid2 = arr[n / 2];
            return (double) (mid1 + mid2) / 2;
        }
    }

    public static void main(String[] args) {
        int[] dataGanjil = {10, 20, 30, 40, 50}; // Sudah diurutkan
        int[] dataGenap = {10, 20, 30, 40, 50, 60}; // Sudah diurutkan

        // Test Fitur 1
        int target = 40;
        int indeks = cariNilai(dataGanjil, target);
        System.out.println("Mencari " + target + " di array ganjil: " +
                (indeks != -1 ? "Ditemukan pada indeks " + indeks : "Tidak ditemukan"));

        // Test Fitur 2
        System.out.println("Array Ganjil: " + Arrays.toString(dataGanjil) +
                ", Median: " + hitungMedian(dataGanjil));
        System.out.println("Array Genap: " + Arrays.toString(dataGenap) +
                ", Median: " + hitungMedian(dataGenap));
    }
}