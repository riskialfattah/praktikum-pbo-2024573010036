package modul_4;

import java.util.Arrays;

public class KartuRencanaStudi {

    private Mahasiswa mahasiswa;
    private Matakuliah[] daftarMatakuliah;
    private int jumlahMatkul;
    private final int maxMatkul;
    private final int MAX_SKS = 24; // Batas SKS maksimal yang ditambahkan

    public KartuRencanaStudi(Mahasiswa mahasiswa, int maxMatkul) {
        this.mahasiswa = mahasiswa;
        this.maxMatkul = maxMatkul;
        this.daftarMatakuliah = new Matakuliah[maxMatkul];
        this.jumlahMatkul = 0;
    }

    // ... Metode yang tidak dimodifikasi ...

    // Menambah mata kuliah ke KRS (MODIFIKASI: Tambah Validasi SKS)
    public boolean tambahMatakuliah(Matakuliah matkul) {
        if (jumlahMatkul < maxMatkul) {
            int totalSKSBaru = hitungTotalSKS() + matkul.getSks();

            // VALIDASI SKS
            if (totalSKSBaru > MAX_SKS) {
                System.out.println("\nNote: Gagal menambahkan! Total SKS akan melebihi batas " + MAX_SKS + " SKS.");
                return false;
            }

            daftarMatakuliah[jumlahMatkul] = matkul;
            jumlahMatkul++;
            System.out.println("\nNote: Mata Kuliah \"" + matkul.getNama() + "\" Berhasil ditambahkan. Total SKS sekarang: " + totalSKSBaru);
            return true;
        } else {
            System.out.println("\nNote: KRS sudah penuh! Maksimal " + maxMatkul + " mata kuliah.");
            return false;
        }
    }

    // Menghitung total SKS
    public int hitungTotalSKS() {
        int totalSKS = 0;
        for (int i = 0; i < jumlahMatkul; i++) {
            totalSKS += daftarMatakuliah[i].getSks();
        }
        return totalSKS;
    }

    // Menghitung IPK
    public double hitungIPK() {
        if (jumlahMatkul == 0) return 0.0;

        double totalBobot = 0.0;
        int totalSKS = 0;

        for (int i = 0; i < jumlahMatkul; i++) {
            Matakuliah mk = daftarMatakuliah[i];
            totalBobot += mk.getBobotNilai() * mk.getSks();
            totalSKS += mk.getSks();
        }

        return totalSKS > 0 ? totalBobot / totalSKS : 0.0;
    }

    // Mencari mata kuliah berdasarkan kode
    public Matakuliah getMatakuliahByKode(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                return daftarMatakuliah[i];
            }
        }
        return null;
    }

    // FITUR BARU: Menghapus mata kuliah dari KRS
    public boolean hapusMatakuliah(String kode) {
        for (int i = 0; i < jumlahMatkul; i++) {
            if (daftarMatakuliah[i].getKode().equalsIgnoreCase(kode)) {
                String namaMK = daftarMatakuliah[i].getNama();

                // Geser semua elemen setelah index i ke kiri
                for (int j = i; j < jumlahMatkul - 1; j++) {
                    daftarMatakuliah[j] = daftarMatakuliah[j + 1];
                }

                // Set elemen terakhir ke null dan kurangi jumlahMatkul
                daftarMatakuliah[jumlahMatkul - 1] = null;
                jumlahMatkul--;

                System.out.println("\nNote: Mata Kuliah \"" + namaMK + "\" Berhasil dihapus.");
                return true;
            }
        }
        System.out.println("\nNote: Gagal menghapus. Mata Kuliah dengan kode " + kode + " tidak ditemukan.");
        return false;
    }

    // FITUR BARU: Menampilkan Mata Kuliah Terbaik
    public void tampilkanTerbaikTerburuk(boolean terbaik) {
        if (jumlahMatkul == 0) {
            System.out.println("\nTidak ada mata kuliah yang diambil.");
            return;
        }

        Matakuliah mkTerpilih = daftarMatakuliah[0];

        for (int i = 1; i < jumlahMatkul; i++) {
            Matakuliah currentMk = daftarMatakuliah[i];

            // Logika untuk Nilai Terbaik
            if (terbaik) {
                if (currentMk.getNilai() > mkTerpilih.getNilai()) {
                    mkTerpilih = currentMk;
                }
                // Logika untuk Nilai Terburuk
            } else {
                if (currentMk.getNilai() < mkTerpilih.getNilai()) {
                    mkTerpilih = currentMk;
                }
            }
        }

        System.out.println("\n************************************************************");
        System.out.println("****** NILAI " + (terbaik ? "TERBAIK" : "TERBURUK") + " DITEMUKAN                 ******");
        System.out.println("------------------------------------------------------------");
        System.out.println("* KODE | NAMA MATA KULIAH                  | SKS | NILAI(%) *");
        System.out.println("------------------------------------------------------------");
        mkTerpilih.tampilkanInfo();
        System.out.println("************************************************************");
    }

    // Menampilkan KRS
    public void tampilkanKRS() {
        // ... (Kode sama seperti sebelumnya) ...
        System.out.println("************************************************************");
        System.out.println("****** KARTU RENCANA STUDI (KRS)             ******");
        System.out.println("************************************************************");
        System.out.println("* Nama Mahasiswa    : " + mahasiswa.getNama());
        System.out.println("* NIM               : " + mahasiswa.getNim());
        System.out.println("* Jurusan           : " + mahasiswa.getJurusan());
        System.out.println("------------------------------------------------------------");
        System.out.println("| KODE | NAMA MATA KULIAH                  | SKS | NILAI(%) |");
        System.out.println("------------------------------------------------------------");

        if (jumlahMatkul == 0) {
            System.out.println("| Belum ada mata kuliah yang diambil.");
        } else {
            for (int i = 0; i < jumlahMatkul; i++) {
                daftarMatakuliah[i].tampilkanInfo();
            }
        }

        System.out.println("------------------------------------------------------------");
        System.out.printf("* Total SKS : %d | IPK : %.2f\n", hitungTotalSKS(), hitungIPK());
        System.out.println("************************************************************\n");
    }
}