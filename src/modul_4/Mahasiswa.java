package modul_4;

public class Mahasiswa {

    // Atribut/Field (private untuk enkapsulasi)
    private String nama;
    private String nim;
    private String jurusan;

    // Konstruktor dengan parameter
    public Mahasiswa(String nama, String npm, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = npm; // Catatan: Parameter 'npm' dimasukkan ke field 'nim'
        this.jurusan = jurusan;
    }

    // Metode Getter
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJurusan() {
        return jurusan;
    }
}