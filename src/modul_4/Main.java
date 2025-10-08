package modul_4;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Objek Scanner untuk input
        Scanner input = new Scanner(System.in);

        System.out.println("************************************************************");
        System.out.println("****** SISTEM KARTU RENCANA STUDI (KRS)      ******");
        System.out.println("************************************************************");

        // Input data mahasiswa
        System.out.println("// Input data mahasiswa");
        System.out.print("Masukkan Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        // Membuat object KRS (maksimal 10 mata kuliah)
        KartuRencanaStudi krs = new KartuRencanaStudi(mhs, 10);

        // Menu running
        boolean running = true;

        while (running) {
            System.out.println("************************************************************");
            System.out.println("****** MENU KRS                              ******");
            System.out.println("************************************************************");
            System.out.println("* 1. Tambah Mata Kuliah                                    *");
            System.out.println("* 2. Input Nilai Mata Kuliah                               *");
            System.out.println("* 3. Tampilkan KRS (Lengkap)                               *");
            System.out.println("* 4. Hapus Mata Kuliah                       (NEW)         *");
            System.out.println("* 5. Tampilkan Nilai Terbaik/Terburuk        (NEW)         *");
            System.out.println("* 6. Keluar                                                *");
            System.out.println("************************************************************");
            System.out.print("Pilih menu: ");

            // Menggunakan nextLine() lalu parsing ke int untuk menghindari masalah newline
            String pilihanStr = input.nextLine();
            int pilihan;
            try {
                pilihan = Integer.parseInt(pilihanStr);
            } catch (NumberFormatException e) {
                pilihan = -1; // Pilihan tidak valid
            }

            switch (pilihan) {
                case 1:
                    // Tambah mata kuliah
                    System.out.println("\n************************************************************");
                    System.out.println("****** TAMBAH MATA KULIAH                          ******");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();

                    System.out.print("Jumlah SKS: ");
                    int sks = -1;
                    try {
                        sks = Integer.parseInt(input.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println("Input SKS tidak valid.");
                        break;
                    }

                    Matakuliah mk = new Matakuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    // Input nilai
                    System.out.println("\n************************************************************");
                    System.out.println("****** INPUT NILAI                                 ******");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Masukkan Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    Matakuliah mkCari = krs.getMatakuliahByKode(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Input Nilai (0-100): ");
                        double nilai = -1.0;
                        try {
                            nilai = Double.parseDouble(input.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Input Nilai tidak valid.");
                            break;
                        }

                        mkCari.setNilai(nilai);
                        System.out.println("Nilai berhasil diinput!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 3:
                    // Tampilkan KRS
                    krs.tampilkanKRS();
                    break;

                case 4:
                    // Hapus Mata Kuliah (NEW)
                    System.out.println("\n************************************************************");
                    System.out.println("****** HAPUS MATA KULIAH                           ******");
                    System.out.println("------------------------------------------------------------");
                    System.out.print("Masukkan Kode Mata Kuliah yang akan dihapus: ");
                    String kodeHapus = input.nextLine();
                    krs.hapusMatakuliah(kodeHapus);
                    break;

                case 5:
                    // Tampilkan Nilai Terbaik/Terburuk (NEW)
                    System.out.println("\n************************************************************");
                    System.out.println("****** TAMPILKAN NILAI                             ******");
                    System.out.println("------------------------------------------------------------");
                    System.out.println("1. Nilai Terbaik");
                    System.out.println("2. Nilai Terburuk");
                    System.out.print("Pilih opsi: ");

                    String opsiStr = input.nextLine();
                    int opsi;
                    try {
                        opsi = Integer.parseInt(opsiStr);
                    } catch (NumberFormatException e) {
                        opsi = -1;
                    }

                    if (opsi == 1) {
                        krs.tampilkanTerbaikTerburuk(true); // true untuk terbaik
                    } else if (opsi == 2) {
                        krs.tampilkanTerbaikTerburuk(false); // false untuk terburuk
                    } else {
                        System.out.println("Opsi tidak valid!");
                    }
                    break;

                case 6:
                    // Keluar
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }

        // Menutup scanner setelah loop selesai
        input.close();
    }
}