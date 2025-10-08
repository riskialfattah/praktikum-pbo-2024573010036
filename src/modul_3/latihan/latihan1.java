package modul_3.latihan;

public class latihan1 {
    public static void main(String[] args) {
        int[] nilaiUjian = {75, 88, 65, 92, 70, 80, 95, 60, 85, 78}; // 10 siswa
        int totalNilai = 0;
        int tertinggi = nilaiUjian[0];
        int terendah = nilaiUjian[0];

        // Hitung total dan cari tertinggi/terendah
        for (int nilai : nilaiUjian) {
            totalNilai += nilai;
            if (nilai > tertinggi) {
                tertinggi = nilai;
            }
            if (nilai < terendah) {
                terendah = nilai;
            }
        }

        double rataRata = (double) totalNilai / nilaiUjian.length;

        System.out.printf("Rata-rata nilai ujian: %.2f\n", rataRata);
        System.out.println("Nilai Tertinggi: " + tertinggi);
        System.out.println("Nilai Terendah: " + terendah);
    }
}