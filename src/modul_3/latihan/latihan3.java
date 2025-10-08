package modul_3.latihan;

public class latihan3 {

    // Method untuk operasi pangkat (x^y)
    public static double hitungPangkat(double basis, double eksponen) {
        return Math.pow(basis, eksponen);
    }

    // Method untuk operasi akar kuadrat (sqrt(x))
    public static double hitungAkarKuadrat(double bilangan) {
        if (bilangan < 0) {
            System.out.println("Peringatan: Tidak bisa menghitung akar bilangan negatif.");
            return Double.NaN; // Not a Number
        }
        return Math.sqrt(bilangan);
    }

    // Method untuk validasi operasi pembagian dengan nol
    public static double bagiDenganValidasi(double pembilang, double penyebut) {
        if (penyebut == 0) {
            System.out.println("Kesalahan: Pembagian dengan nol tidak diizinkan.");
            return Double.NaN;
        }
        return pembilang / penyebut;
    }

    public static void main(String[] args) {
        System.out.println("Pangkat (2^3): " + hitungPangkat(2, 3));
        System.out.println("Akar Kuadrat (25): " + hitungAkarKuadrat(25));
        System.out.println("Pembagian (10/2): " + bagiDenganValidasi(10, 2));
        System.out.println("Pembagian (10/0): " + bagiDenganValidasi(10, 0));
    }
}