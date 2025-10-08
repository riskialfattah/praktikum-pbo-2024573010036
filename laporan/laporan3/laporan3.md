# Laporan Modul 4: Pengenalan Object Oriented Programming
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** [Riski Al Fatah]  
**NIM:** [2024573010036]  
**Kelas:** [TI.2E]

---

## Pendahuluan
Modul ini dirancang untuk memberikan pemahaman dasar tentang pemrograman berorientasi objek menggunakan Java melalui praktikum langsung. Setiap praktikum dilengkapi dengan teori dasar dan langkah-langkah implementasi yang detail.

---
## Teori Dasar
Objek-Oriented Programming (OOP) adalah paradigma pemrograman yang menggunakan “objek” - struktur data yang berisi data, dalam bentuk field, sering kali dikenal sebagai atribut; dan kode, dalam bentuk prosedur, sering kali dikenal sebagai metode.

Inti dari OOP adalah mendesain software dengan membagi masalah menjadi serangkaian objek yang saling berinteraksi. Ini bertentangan dengan pemrograman prosedural, yang fokus pada fungsi/prosedur dalam memproses data. OOP memungkinkan kita untuk membuat kode yang lebih modular, reusable, dan mudah di-maintain.

#### Konsep Dasar OOP:
+ Class: Template atau blueprint untuk membuat object
+ Object: Instance dari sebuah class
+ Attribute/Field: Variabel yang dimiliki oleh class
+ Method: Function yang dimiliki oleh class
+ Constructor: Method khusus untuk inisialisasi object
  
#### Prinsip OOP:
+ Encapsulation: Menyembunyikan detail implementasi
+ Inheritance: Pewarisan sifat dari class parent
+ Polymorphism: Kemampuan object untuk memiliki banyak bentuk
+ Abstraction: Menyederhanakan kompleksitas dengan menyembunyikan detail

---

## Class dan Objek
kelas adalah konsep abstrak yang mendefinisikan set atribut dan metode yang akan dimiliki oleh object. Kelas menyediakan struktur atau template yang menentukan bagaimana sebuah object harus dibuat. Kelas akan menentukan jenis atribut dan metode apa yang akan dimiliki oleh object, tetapi tidak menentukan nilai dari atribut itu sendiri untuk object tertentu.

Object adalah inti dari pemrograman berorientasi objek. Setiap object memiliki dua karakteristik utama, yaitu:

Object, dalam konteks pemrograman OOP, adalah sebuah entitas yang memiliki karakteristik dan perilaku. Kelas, di sisi lain, merupakan blueprint atau cetakan untuk membuat object. Kalau kamu bandingkan dengan dunia nyata, kamu bisa menganggap kelas sebagai rencana desain bangunan, sedangkan object adalah bangunan yang sesungguhnya telah dibangun berdasarkan desain tersebut.

### Praktikum : Dasar Class dan Object
Contoh Program yang mengikuti modul:
1. Class Mahasiswa
![teks yang ingin ditampilkan](gambar/Mahasiswa.png)
2. Class Matakuliah
![teks yang ingin ditampilkan](gambar/Matakuliah.png)
![teks yang ingin ditampilkan](gambar/Matakuliah1.png)
![teks yang ingin ditampilkan](gambar/Matakuliah2.png)
3. Class KartuRencanaStudi
![teks yang ingin ditampilkan](gambar/KRS.png)
![teks yang ingin ditampilkan](gambar/KRS1.png)
![teks yang ingin ditampilkan](gambar/KRS2.png)
![teks yang ingin ditampilkan](gambar/KRS3.png)
4. Class Main
![teks yang ingin ditampilkan](gambar/Main.png)
![teks yang ingin ditampilkan](gambar/Main1.png)
![teks yang ingin ditampilkan](gambar/Main2.png)
![teks yang ingin ditampilkan](gambar/Main3.png)
![teks yang ingin ditampilkan](gambar/Main4.png)
OutPut:
![teks yang ingin ditampilkan](gambar/1.png)
![teks yang ingin ditampilkan](gambar/2.png)
![teks yang ingin ditampilkan](gambar/3.png)
![teks yang ingin ditampilkan](gambar/4.png)
![teks yang ingin ditampilkan](gambar/5.png)

#### Modifikasi Contoh Program
Untuk Class Mahasiswa masih sama yang berbeda hanya class KartuRencanaStudi.java dan Class Main.java
1. Untuk Class KartuRencanaStudi ini dimodifikasi untuk menambahkan fitur Hapus Mata Kuliah dan Tampilkan Nilai Terbaik/Terburuk, serta validasi SKS di metode tambahMatakuliah. Batas SKS Maksimal saya tetapkan 24 SKS. Contoh inputnya seperti ini:
![teks yang ingin ditampilkan](gambar/baru.png)
![teks yang ingin ditampilkan](gambar/baru1.png)
![teks yang ingin ditampilkan](gambar/baru2.png)
![teks yang ingin ditampilkan](gambar/baru3.png)
![teks yang ingin ditampilkan](gambar/baru4.png)
![teks yang ingin ditampilkan](gambar/baru5.png)
![teks yang ingin ditampilkan](gambar/baru6.png)
2. Dan untuk Main.java seperti ini: <br>
Untuk Class KartuRencanaStudi ini dimodifikasi untuk menambahkan fitur Hapus Mata Kuliah dan Tampilkan Nilai Terbaik/Terburuk, serta validasi SKS di metode tambahMatakuliah. Batas SKS Maksimal saya tetapkan 24 SKS. Contoh inputnya seperti ini:
![teks yang ingin ditampilkan](gambar/sama.png)
![teks yang ingin ditampilkan](gambar/sama1.png)
![teks yang ingin ditampilkan](gambar/sama2.png)
![teks yang ingin ditampilkan](gambar/sama3.png)
![teks yang ingin ditampilkan](gambar/sama4.png)
![teks yang ingin ditampilkan](gambar/sama5.png)
![teks yang ingin ditampilkan](gambar/sama6.png)
Contoh OutPut:
![teks yang ingin ditampilkan](gambar/siap.png)
![teks yang ingin ditampilkan](gambar/siap1.png)
![teks yang ingin ditampilkan](gambar/siap2.png)
![teks yang ingin ditampilkan](gambar/siap3.png)
![teks yang ingin ditampilkan](gambar/siap4.png)
![teks yang ingin ditampilkan](gambar/siap5.png)
![teks yang ingin ditampilkan](gambar/siap6.png)

### Analisis Program Kartu Rencana Studi (KRS)

Program ini merupakan aplikasi berbasis Java yang mengelola **Kartu Rencana Studi (KRS)** mahasiswa. Program memungkinkan pengguna untuk menambah mata kuliah, menginput nilai, menampilkan KRS, menghapus mata kuliah, dan melihat nilai terbaik atau terburuk dari mata kuliah yang diambil.

#### Fitur Utama:
1. **Input Data Mahasiswa**:
    - Mengambil input nama mahasiswa, NIM, dan jurusan untuk membuat objek `Mahasiswa`.

2. **Menu KRS**:
    - Program menampilkan menu dengan opsi untuk:
        - Menambah mata kuliah.
        - Menginput nilai mata kuliah.
        - Menampilkan KRS.
        - Menghapus mata kuliah.
        - Menampilkan nilai terbaik atau terburuk.
        - Keluar dari program.

3. **Tambah Mata Kuliah**:
    - Mengambil input kode mata kuliah, nama mata kuliah, dan jumlah SKS, kemudian menambahkannya ke dalam KRS.

4. **Input Nilai Mata Kuliah**:
    - Mencari mata kuliah berdasarkan kode, kemudian input nilai (0-100) untuk mata kuliah yang ditemukan.

5. **Tampilkan KRS**:
    - Menampilkan daftar mata kuliah yang diambil mahasiswa beserta SKS dan nilai masing-masing mata kuliah.

6. **Hapus Mata Kuliah**:
    - Menghapus mata kuliah berdasarkan kode mata kuliah yang diberikan.

7. **Tampilkan Nilai Terbaik/Terburuk**:
    - Menampilkan mata kuliah dengan nilai terbaik atau terburuk, sesuai pilihan pengguna.

8. **Keluar**:
    - Menghentikan eksekusi program.

#### Alur Program:
1. Program dimulai dengan meminta input data mahasiswa (nama, NIM, dan jurusan).
2. Program kemudian menampilkan menu untuk interaksi pengguna.
3. Pengguna dapat memilih berbagai opsi melalui menu:
    - Menambah mata kuliah dengan mengisi kode mata kuliah, nama, dan SKS.
    - Menginput nilai untuk mata kuliah yang sudah ada.
    - Menampilkan KRS yang berisi daftar mata kuliah, SKS, dan nilai.
    - Menghapus mata kuliah berdasarkan kode.
    - Melihat nilai terbaik atau terburuk.
4. Program akan terus berjalan hingga pengguna memilih untuk keluar.

## Kesimpulan
Program Kartu Rencana Studi (KRS) ini berhasil mengimplementasikan konsep Object-Oriented Programming dengan baik, dengan fitur-fitur seperti menambah, menghapus mata kuliah, serta menginput nilai dan menampilkan KRS. Dengan penambahan validasi SKS dan fitur baru untuk menampilkan nilai terbaik atau terburuk, program ini menjadi lebih fungsional dan mudah digunakan. Modifikasi yang dilakukan pada Class KartuRencanaStudi dan Class Main menjadikan program lebih dinamis, memungkinkan pengguna untuk mengelola mata kuliah dengan lebih fleksibel. Pemrograman berorientasi objek membantu dalam pembuatan aplikasi yang lebih terstruktur dan modular, meningkatkan pemeliharaan dan pengembangan lebih lanjut.