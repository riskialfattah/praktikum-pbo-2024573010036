package modul_3.latihan;

public class latihan2 {
    public static void main(String[] args) {
        String[] mataPelajaran = {"Matematika", "Fisika", "Biologi", "Kimia"};
        String[] namaSiswa = {"Andi", "Budi", "Sinta"};
        int[][] nilai = {
                {90, 85, 78, 92},
                {88, 95, 90, 80},
                {75, 80, 88, 95}
        };

        // --- Fitur 1: Mata Pelajaran dengan Nilai Tertinggi untuk Setiap Siswa ---
        System.out.println("--- Mata Pelajaran Nilai Tertinggi Setiap Siswa ---");
        for (int i = 0; i < nilai.length; i++) {
            int nilaiTertinggi = -1;
            String mapelTertinggi = "";
            for (int j = 0; j < nilai[i].length; j++) {
                if (nilai[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilai[i][j];
                    mapelTertinggi = mataPelajaran[j];
                }
            }
            System.out.println(namaSiswa[i] + ": " + mapelTertinggi + " (" + nilaiTertinggi + ")");
        }

        System.out.println("\n" + "--- Rata-rata Nilai Setiap Mata Pelajaran ---");
        // --- Fitur 2: Hitung Rata-rata Nilai untuk Setiap Mata Pelajaran ---
        for (int j = 0; j < mataPelajaran.length; j++) {
            int totalNilaiMapel = 0;
            for (int i = 0; i < namaSiswa.length; i++) {
                totalNilaiMapel += nilai[i][j];
            }
            double rataRataMapel = (double) totalNilaiMapel / namaSiswa.length;
            System.out.printf("Rata-rata %s: %.2f\n", mataPelajaran[j], rataRataMapel);
        }
    }
}