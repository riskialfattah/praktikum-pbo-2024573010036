package modul_3;

import java.util.Scanner;

public class TextProcessing {

    public static void prosesDataMahasiswa(String data) {
        System.out.println("==================================");

        // Memisahkan data berdasarkan koma
        String[] dataMahasiswa = data.split(",");

        // Menampilkan data
        System.out.println("// Data Awal (Jumlah Mahasiswa: " + dataMahasiswa.length + ")");
        for (int i = 0; i < dataMahasiswa.length; i++) {
            System.out.print(dataMahasiswa.length + " "); // Mengulang dataMahasiswa.length
            // Modifikasi: Baris di modul terlihat seperti
            // System.out.print(i + 1 + ". " + dataMahasiswa[i] + " ");
            // Kita ikuti persis yang tertulis di gambar, meski kodenya kurang lengkap:
            System.out.println((i + 1) + ". " + dataMahasiswa[i] + " ");
        }

        // Analisis data
        System.out.println("\n=== ANALISIS DATA ===");
        System.out.println("Jumlah mahasiswa: " + dataMahasiswa.length);

        // Cari nama terpanjang dan terpendek
        String namaTerpanjang = dataMahasiswa[0];
        String namaTerpendek = dataMahasiswa[0];

        for (String nama : dataMahasiswa) {
            if (nama.length() > namaTerpanjang.length()) {
                namaTerpanjang = nama;
            }
            if (nama.length() < namaTerpendek.length()) {
                namaTerpendek = nama;
            }
        }

        System.out.println("Nama terpanjang: " + namaTerpanjang + " (" + namaTerpanjang.length() + " karakter)");
        System.out.println("Nama terpendek: " + namaTerpendek + " (" + namaTerpendek.length() + " karakter)");

        // Mengurutkan nama secara alfabetik (Bubble Sort untuk String)
        String[] namaUrut = dataMahasiswa.clone();
        for (int i = 0; i < namaUrut.length - 1; i++) {
            for (int j = 0; j < namaUrut.length - 1 - i; j++) {
                // Bandingkan case-insensitive
                if (namaUrut[j].compareToIgnoreCase(namaUrut[j + 1]) > 0) {
                    // Tukar posisi
                    String temp = namaUrut[j];
                    namaUrut[j] = namaUrut[j + 1];
                    namaUrut[j + 1] = temp;
                }
            }
        }

        System.out.println("\nNama mahasiswa (urutan alfabetik):");
        for (int i = 0; i < namaUrut.length; i++) {
            System.out.println((i + 1) + ". " + namaUrut[i]);
        }
    }

    public static void tampilkanFormatNama(String nama) {
        // Panggil semua fungsi format
        String namaFormatted = formatTitleCase(nama);
        String initial = formatKataInitial(nama);
        String username = buatUsername(nama);

        System.out.println("\n=== FORMAT NAMA ===");
        System.out.println("Nama lengkap: " + nama);
        System.out.println("Title Case: " + namaFormatted);
        System.out.println("Initial: " + initial);
        System.out.println("Username: " + username);
    }

    // Fungsi untuk mengubah string menjadi Title Case
    public static String formatTitleCase(String teks) {
        String[] kata = teks.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                // Kapitalisasi huruf pertama dan gabungkan sisanya
                result.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        // Menghilangkan spasi ekstra di akhir
        return result.toString().trim();
    }

    // Fungsi untuk mendapatkan initial (huruf depan setiap kata)
    public static String formatKataInitial(String teks) {
        String[] kata = teks.split("\\s+");
        StringBuilder initial = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                // Ambil huruf pertama dan kapitalisasi
                initial.append(Character.toUpperCase(k.charAt(0)));
            }
        }
        return initial.toString();
    }

    // Fungsi untuk membuat username
    public static String buatUsername(String nama) {
        // Mengubah ke lowercase, ganti spasi jadi titik, hilangkan non-alphanumeric (selain a-z, 0-9, dan titik)
        return nama.toLowerCase().replaceAll("\\s+", ".").replaceAll("[^a-z0-9.]", "");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=== PENGOLAHAN DATA TEKS ===");

        // Input Data
        System.out.print("Masukkan nama-nama mahasiswa (dipisahkan dengan koma): ");
        String dataNama = input.nextLine();

        // Input Nama untuk Diformat
        System.out.print("Masukkan satu nama untuk format: ");
        String namaFormat = input.nextLine();

        // Proses Data Massal
        prosesDataMahasiswa(dataNama);

        // Format Nama
        tampilkanFormatNama(namaFormat);

        input.close();
    }
}