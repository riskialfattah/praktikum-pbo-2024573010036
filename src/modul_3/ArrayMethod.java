package modul_3;

import java.util.Scanner;

public class ArrayMethod {

    // Method untuk input array
    public static int[] inputArray(int ukuran) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[ukuran];

        System.out.println("Masukkan " + ukuran + " angka:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }
        // Perhatian: Dalam praktikum sederhana, Scanner bisa tidak ditutup.
        // Namun, jika Anda menggunakan IDE modern, mungkin akan muncul peringatan.
        // Kita tidak akan menutupnya di sini agar sesuai persis dengan modul.
        return array;
    }

    // Method untuk menampilkan array
    public static void tampilkanArray(int[] array) {
        System.out.print("Array: [");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // Method untuk mencari nilai maksimum
    public static int cariMaksimum(int[] array) {
        int maks = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maks) {
                maks = array[i];
            }
        }
        return maks;
    }

    // Method untuk mencari nilai minimum
    public static int cariMinimum(int[] array) {
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // Method untuk menghitung rata-rata
    public static double hitungRataRata(int[] array) {
        int total = 0;
        for (int nilai : array) {
            total += nilai;
        }
        return (double) total / array.length;
    }

    // Method untuk mengurutkan array (Bubble Sort)
    public static int[] urutkanArray(int[] array) {
        // Membuat copy array agar array asli tidak berubah (immutable)
        int[] arrayBaru = array.clone();

        for (int i = 0; i < arrayBaru.length - 1; i++) {
            for (int j = 0; j < arrayBaru.length - 1 - i; j++) {
                if (arrayBaru[j] > arrayBaru[j + 1]) {
                    // Tukar posisi
                    int temp = arrayBaru[j];
                    arrayBaru[j] = arrayBaru[j + 1];
                    arrayBaru[j + 1] = temp;
                }
            }
        }
        return arrayBaru;
    }

    public static void main(String[] args) {
        System.out.println("=== PROGRAM ANALISIS ARRAY ===");

        // Memanggil inputArray (5 adalah ukuran array yang akan diinput)
        int[] data = inputArray(5);

        System.out.println("\n=== HASIL ANALISIS ===");

        // Menampilkan array yang diinput
        tampilkanArray(data);

        // Menghitung dan menampilkan hasil analisis dasar
        System.out.println("Nilai Maksimum: " + cariMaksimum(data));
        System.out.println("Nilai Minimum: " + cariMinimum(data));
        System.out.printf("Rata-rata: %.2f\n", hitungRataRata(data));

        // Mengurutkan dan menampilkan array yang sudah diurutkan
        int[] dataUrut = urutkanArray(data);
        System.out.print("Array setelah diurutkan: ");
        tampilkanArray(dataUrut);
    }
}