package modul_5.praktikum_3;

import java.util.Scanner;

public class ProductTest {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);

        System.out.println("SISTEM MANAJEMEN PRODUK");

        // Membuat produk dengan PIN
        Product laptop = new Product("Laptop ASUS", 8500000, 15, "1234");
        Product mouse = new Product("Mouse Logitech", 150000, 50, "1234");

        System.out.println("\n--- PRODUK BERHASIL DIBUAT---");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        // TEST READ-ONLY PROPERTIES
        System.out.println("\n--- TEST READ-ONLY PROPERTIES ---");
        System.out.println("Product ID (read-only): " + laptop.getProductId());
        System.out.println("Created At (read-only): " + laptop.getCreatedAt());
        // laptop.productId = "P-001"; // Ini TIDAK BISA diubah setelah dibuat
        System.out.println("✓ Properti ini tidak bisa diubah setelah dibuat");

        // TEST READ-WRITE PROPERTIES
        System.out.println("\n--- TEST READ-WRITE PROPERTIES ---");

        // Test 1: Ubah harga tanpa PIN (akan gagal)
        System.out.println("\n1. Mencoba ubah harga dengan PIN salah:");
        mouse.setHarga(160000, "0000"); // PIN salah

        // Test 2: Ubah harga dengan PIN benar
        System.out.println("\n2. Ubah harga dengan PIN benar:");
        mouse.setHarga(165000, "1234");

        // Test 3: Ubah nama
        System.out.println("\n3. Ubah nama produk:");
        laptop.setNama("Laptop ASUS ROG", "1234");

        // Test 4: Ubah stok
        System.out.println("\n4. Ubah stok:");
        laptop.setStok(10, "1234");

        // TEST WRITE-ONLY PROPERTY
        System.out.println("\n--- TEST WRITE-ONLY PROPERTY (PIN) ---");
        // System.out.println(laptop.adminPin); // ERROR (Tidak ada getter)
        System.out.println("Hanya bisa diubah dengan validasi PIN lama:");
        System.out.println("Coba ganti PIN (gagal):");
        laptop.changeAdminPin("0000", "9999"); // Akan gagal

        System.out.println("\nCoba ganti PIN (sukses):");
        laptop.changeAdminPin("1234", "5678");

        // TEST COMPUTED PROPERTIES
        System.out.println("\n--- TEST COMPUTED PROPERTIES ---");
        System.out.printf("Total Nilai Laptop : Rp %.2f%n", laptop.getTotalNilai());
        System.out.println("Status Stok Laptop : " + laptop.getStatusStok());
        System.out.printf("Total Nilai Mouse  : Rp %.2f%n", mouse.getTotalNilai());
        System.out.println("Status Stok Mouse  : " + mouse.getStatusStok());


        // TEST BUSINESS METHODS
        System.out.println("\n--- TEST BUSINESS METHODS ---");

        System.out.println("\n1. Tambah stok laptop:");
        laptop.tambahStok(10, "5678"); // PIN sudah diubah

        System.out.println("\n2. Kurangi stok mouse (penjualan):");
        mouse.kurangiStok(45);

        System.out.println("\n3. Kurangi stok mouse lagi (stok akan menipis):");
        mouse.kurangiStok(4);

        System.out.println("\n4. Coba kurangi stok lebih dari tersedia:");
        mouse.kurangiStok(10);

        // TAMPILKAN INFO AKHIR
        System.out.println("\n--- INFORMASI PRODUK SETELAH UPDATE ---");
        laptop.tampilkanInfo();
        mouse.tampilkanInfo();

        // RINGKASAN ENCAPSULATION
        System.out.println("\n--- RINGKASAN ENCAPSULATION ---");
        System.out.println("---------------------------------");
        System.out.println("✓ READ-ONLY     : productId, createdAt      ");
        System.out.println("  (getter✔, setter✘)  (tidak bisa diubah)       ");
        System.out.println();
        System.out.println("✓ READ-WRITE    : nama, harga, stok         ");
        System.out.println("  (getter✔, setter✔)  (dengan validasi)         ");
        System.out.println();
        System.out.println("✓ WRITE-ONLY    : adminPin                  ");
        System.out.println("  (getter✘, setter✔)  (tidak bisa dibaca)       ");
        System.out.println();
        System.out.println("✓ COMPUTED      : totalNilai, statusStok  ");
        System.out.println("  (getter✔, setter✘)  (dihitung otomatis)       ");
        System.out.println("---------------------------------");
    }
}
