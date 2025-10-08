package modul_3.latihan;

public class latihan6 {

    // --- Fitur 1: Menghasilkan Email Address berdasarkan Nama ---
    public static String generateEmail(String namaLengkap) {
        if (namaLengkap == null || namaLengkap.trim().isEmpty()) {
            return "Nama tidak valid.";
        }
        // Ubah nama menjadi huruf kecil dan ganti spasi dengan titik
        String emailPart = namaLengkap.toLowerCase().trim().replaceAll("\\s+", ".");
        return emailPart + "@corp.com";
    }

    // --- Fitur 2: Memvalidasi Format Nama ---
    public static boolean isValidName(String nama) {
        if (nama == null || nama.trim().isEmpty()) {
            return false;
        }
        // Cek apakah mengandung angka atau karakter khusus (selain spasi dan huruf)
        // [a-zA-Z\s] artinya hanya huruf (besar/kecil) dan spasi yang diizinkan
        return nama.matches("^[a-zA-Z\\s]+$");
    }

    public static void main(String[] args) {
        String nama1 = "Mohammad Rauf";
        String nama2 = "Budi 123 Santoso!";

        // Test Fitur 1
        System.out.println("Email untuk '" + nama1 + "': " + generateEmail(nama1));

        // Test Fitur 2
        System.out.println("Validasi nama '" + nama1 + "': " + isValidName(nama1));
        System.out.println("Validasi nama '" + nama2 + "': " + isValidName(nama2));
    }
}