package modul_1.tipe_data;

public class data_diri {
    public static void main(String[] args) {

        String nim, nama, alamat, agama, jurusan, prodi;
        int tahunLahir, umur;
        double tinggiBadan;
        boolean statusMahasiswa;
        char jenisKelamin;

        nim = "2024573010036";
        nama = "Riski Al Fatah";
        alamat = "Keude Krueng Geukueh";
        tahunLahir = 2006;
        umur = 19;
        agama = "Islam";
        jenisKelamin = 'L';
        jurusan = "Teknologi Informasi dan Komputer";
        prodi = "Teknik Informatika";
        tinggiBadan = 173.5;
        statusMahasiswa = true;

        System.out.println("NIM             : " + nim);
        System.out.println("Nama            : " + nama);
        System.out.println("Alamat          : " + alamat);
        System.out.println("Tahun Lahir     : " + tahunLahir);
        System.out.println("Umur            : " + umur + " tahun");
        System.out.println("Agama           : " + agama);
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Jurusan         : " + jurusan);
        System.out.println("Program Studi   : " + prodi);
        System.out.println("Tinggi Badan    : " + tinggiBadan + " cm");
        System.out.println("Status Mahasiswa: " + statusMahasiswa);
    }
}
