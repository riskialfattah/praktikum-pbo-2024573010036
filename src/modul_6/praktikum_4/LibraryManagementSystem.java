package modul_6.praktikum_4;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagementSystem {
    static ArrayList<LibraryItem> libraryItems = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();
        int choice;
        do {
            displayMenu();
            System.out.print("Pilih menu (1-7): ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    displayAllItems();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    borrowItem();
                    break;
                case 4:
                    returnItem();
                    break;
                case 5:
                    displayAvailableItems();
                    break;
                case 6:
                    displayBorrowedItems();
                    break;
                case 7:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
            System.out.println();
        } while (choice != 7);
    }

    private static void displayMenu() {
        System.out.println("--- SISTEM MANAJEMEN PERPUSTAKAAN ---");
        System.out.println("1. Tampilkan Semua Item");
        System.out.println("2. Tambah Item Baru");
        System.out.println("3. Pinjam Item");
        System.out.println("4. Kembalikan Item");
        System.out.println("5. Tampilkan Item Tersedia");
        System.out.println("6. Tampilkan Item Dipinjam");
        System.out.println("7. Keluar");
    }

    private static void initializeData() {
        libraryItems.add(new Book("B001", "The Lord of the Rings", 1954, "J.R.R. Tolkien",
                "978-0618640157", 1178));
        libraryItems.add(new Book("B002", "Harry Potter and the Sorcerer's Stone", 1997, "J.K. Rowling",
                "978-0590353427", 309));
        libraryItems.add(new DVD("D001", "Inception", 2010, "Christopher Nolan",
                148, "Sci-Fi"));
        libraryItems.add(new Magazine("M001", "National Geographic", 2023,
                "National Geographic Society", 202305, "Sains"));
    }

    private static void displayAllItems() {
        System.out.println("\n--- DAFTAR SEMUA ITEM ---");
        if (libraryItems.isEmpty()) {
            System.out.println("Belum ada item di perpustakaan.");
        } else {
            for (LibraryItem item : libraryItems) {
                item.displayInfo();
            }
        }
    }

    private static void displayAvailableItems() {
        System.out.println("\n--- DAFTAR ITEM TERSEDIA ---");
        boolean found = false;
        for (LibraryItem item : libraryItems) {
            if (item.isAvailable()) {
                item.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Semua item sedang dipinjam.");
        }
    }

    private static void displayBorrowedItems() {
        System.out.println("\n--- DAFTAR ITEM DIPINJAM ---");
        boolean found = false;
        for (LibraryItem item : libraryItems) {
            if (!item.isAvailable()) {
                item.displayInfo();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Tidak ada item yang sedang dipinjam.");
        }
    }

    private static LibraryItem findItemById(String itemId) {
        for (LibraryItem item : libraryItems) {
            if (item.getItemId().equalsIgnoreCase(itemId)) {
                return item;
            }
        }
        return null;
    }

    private static void borrowItem() {
        System.out.println("\n--- PINJAM ITEM ---");
        System.out.print("Masukkan ID item yang akan dipinjam: ");
        String itemId = scanner.nextLine();
        LibraryItem item = findItemById(itemId);

        if (item != null) {
            item.borrowItem();
        } else {
            System.out.println("Item dengan ID " + itemId + " tidak ditemukan.");
        }
    }

    private static void returnItem() {
        System.out.println("\n--- KEMBALIKAN ITEM ---");
        System.out.print("Masukkan ID item yang akan dikembalikan: ");
        String itemId = scanner.nextLine();
        LibraryItem item = findItemById(itemId);

        if (item != null) {
            item.returnItem();
        } else {
            System.out.println("Item dengan ID " + itemId + " tidak ditemukan.");
        }
    }

    private static void addItem() {
        System.out.println("\n--- TAMBAH ITEM BARU ---");
        System.out.println("Pilih tipe item (1: Buku, 2: DVD, 3: Majalah): ");
        int type = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Masukkan ID (misal B003): ");
        String itemId = scanner.nextLine();
        System.out.print("Masukkan Judul: ");
        String title = scanner.nextLine();
        System.out.print("Masukkan Tahun: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        switch (type) {
            case 1: // Buku
                System.out.print("Masukkan Penulis: ");
                String author = scanner.nextLine();
                System.out.print("Masukkan ISBN: ");
                String isbn = scanner.nextLine();
                System.out.print("Masukkan Jumlah Halaman: ");
                int pages = scanner.nextInt();
                scanner.nextLine();
                libraryItems.add(new Book(itemId, title, year, author, isbn, pages));
                break;
            case 2: // DVD
                System.out.print("Masukkan Sutradara: ");
                String director = scanner.nextLine();
                System.out.print("Masukkan Durasi (menit): ");
                int duration = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Genre: ");
                String genre = scanner.nextLine();
                libraryItems.add(new DVD(itemId, title, year, director, duration, genre));
                break;
            case 3: // Majalah
                System.out.print("Masukkan Penerbit: ");
                String publisher = scanner.nextLine();
                System.out.print("Masukkan Nomor Edisi: ");
                int issue = scanner.nextInt();
                scanner.nextLine();
                System.out.print("Masukkan Kategori: ");
                String category = scanner.nextLine();
                libraryItems.add(new Magazine(itemId, title, year, publisher, issue, category));
                break;
            default:
                System.out.println("Tipe item tidak valid.");
                return;
        }
        System.out.println("Item baru berhasil ditambahkan.");
    }
}