package modul_5.praktikum_2;

public class Mahasiswa {
    // Atribut
    private String npm;
    private String nama;
    private String jurusan;
    private double ipk;
    private int semester;
    private boolean aktif;

    // Constructor
    public Mahasiswa(String npm, String nama, String jurusan) {
        this.npm = npm;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = 0.0;
        this.semester = 1;
        this.aktif = true;
    }

    // Getter Methods
    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public double getIpk() {
        return ipk;
    }

    public int getSemester() {
        return semester;
    }

    // Menggunakan awalan 'is' prefix
    public boolean isAktif() {
        return aktif;
    }


    // Setter Methods
    // Note: NPM readonly (tidak ada setter)

    public void setNama(String nama) {
        // Validasi: nama tidak boleh kosong
        if (nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
            return;
        }

        // Validasi: Nama hanya huruf dan spasi
        if (!nama.matches("[a-zA-Z .']+")) {
            System.out.println("Error: Nama hanya boleh berisi huruf dan spasi!");
            return;
        }

        this.nama = nama;
        System.out.println("✓ Nama berhasil diubah menjadi: " + nama);
    }

    public void setJurusan(String jurusan) {
        // Validasi: Jurusan tidak boleh kosong
        if (jurusan.trim().isEmpty()) {
            System.out.println("Error: Jurusan tidak boleh kosong!");
            return;
        }

        this.jurusan = jurusan;
        System.out.println("✓ Jurusan berhasil diubah menjadi: " + jurusan);
    }

    public void setIpk(double ipk) {
        // Validasi: IPK harus valid (0.0 - 4.0)
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("Error: IPK harus antara 0.0 - 4.0!");
            return;
        }

        this.ipk = ipk;
        System.out.printf("✓ IPK berhasil diubah menjadi: %.2f%n", ipk);

        // Cek status akademik berdasarkan IPK
        cekStatusAkademik();
    }

    public void setSemester(int semester) {
        // Validasi: Semester harus positif
        if (semester < 1 || semester > 14) {
            System.out.println("Error: Semester harus antara 1 - 14!");
            return;
        }

        this.semester = semester;
        System.out.println("✓ Semester berhasil diubah menjadi: " + semester);
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
        System.out.println("✓ Status berhasil diubah menjadi: " + (aktif ? "Aktif" : "Tidak Aktif"));
        System.out.println("Status Mahasiswa: " + getStatus());
    }


    // Private Method (Helper)
    private void cekStatusAkademik() {
        if (ipk < 2.0) {
            System.out.println("! Peringatan: IPK di bawah standar!");
        } else if (ipk > 3.5) {
            System.out.println("★ Excellent! IPK sangat baik!");
        }
    }


    // Public Method
    public String getPredikat() {
        if (ipk >= 3.5) return "Cum Laude";
        else if (ipk >= 3.0) return "Sangat Memuaskan";
        else if (ipk >= 2.5) return "Memuaskan";
        else if (ipk >= 2.0) return "Cukup";
        else return "Kurang";
    }

    public String getStatus() {
        return this.aktif ? "Aktif" : "Tidak Aktif";
    }

    public void tampilkanInfo() {
        System.out.println("===== INFORMASI MAHASISWA =====");
        System.out.println("NPM       : " + npm);
        System.out.println("Nama      : " + nama);
        System.out.println("Jurusan   : " + jurusan);
        System.out.printf("IPK       : %.2f (%s)%n", ipk, getPredikat());
        System.out.println("Semester  : " + semester);
        System.out.println("Status    : " + (aktif ? "Aktif" : "Tidak AktIF"));
        System.out.println("===============================");
    }
}
