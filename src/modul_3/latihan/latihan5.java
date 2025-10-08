package modul_3.latihan;

public class latihan5 {

    // --- Fitur 1: Menghitung Jumlah Konsonan ---
    public static int hitungKonsonan(String teks) {
        String teksBersih = teks.toLowerCase().replaceAll("[^a-z]", "");
        int konsonanCount = 0;

        for (char c : teksBersih.toCharArray()) {
            if (c != 'a' && c != 'e' && c != 'i' && c != 'o' && c != 'u') {
                konsonanCount++;
            }
        }
        return konsonanCount;
    }

    // --- Fitur 2: Mengubah String menjadi Pascal Case ---
    public static String toPascalCase(String teks) {
        if (teks == null || teks.isEmpty()) {
            return "";
        }

        String[] words = teks.toLowerCase().split("\\s+");
        StringBuilder pascalCase = new StringBuilder();

        for (String word : words) {
            if (!word.isEmpty()) {
                // Kapitalisasi huruf pertama dan gabungkan sisanya
                pascalCase.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1));
            }
        }
        return pascalCase.toString();
    }

    public static void main(String[] args) {
        String kalimat = "Selamat belajar Java 17!";
        System.out.println("Kalimat: " + kalimat);

        // Test Fitur 1
        System.out.println("Jumlah Konsonan: " + hitungKonsonan(kalimat));

        // Test Fitur 2
        String teksPascal = toPascalCase("belajar pemrograman java lanjutan");
        System.out.println("Pascal Case: " + teksPascal); // Output: BelajarPemrogramanJavaLanjutan
    }
}