# Laporan Modul 5: Enkapsulasi
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** Riski Al Fatah  
**NIM:** 2024573010036  
**Kelas:** TI.2E

---

## Abstrak
Laporan praktikum ini (Modul 5) membahas pilar fundamental Enkapsulasi dalam Pemrograman Berorientasi Objek (OOP). Tujuan utamanya adalah untuk memahami dan mengimplementasikan mekanisme perlindungan data (data protection) dan penyembunyian implementasi (data hiding) melalui access modifier dan metode getter/setter. Metodologi yang digunakan adalah melalui tiga studi kasus praktikum: (1) Uji coba Access Modifier (private, public, protected, default) pada kelas Person untuk membuktikan bagaimana akses langsung ke anggota private dicegah oleh compiler. (2) Implementasi Getter dan Setter pada kelas Mahasiswa untuk menyediakan akses baca-tulis yang terkontrol, sekaligus menerapkan validasi data pada setter (misalnya, validasi IPK dan Nama). (3) Penerapan konsep properti Read-Only, Write-Only, dan Computed, serta validasi keamanan berbasis PIN pada kelas Product. Hasil dari praktikum ini secara kolektif mendemonstrasikan bahwa enkapsulasi bukan hanya menyembunyikan data, tetapi secara aktif melindunginya, memastikan integritas data, dan meningkatkan modularitas serta keamanan kode.
## Pendahuluan
Encapsulation (Enkapsulasi) adalah salah satu prinsip fundamental dalam Object-Oriented Programming (OOP) yang membungkus data (attributes) dan method yang bekerja pada data tersebut dalam satu unit (class), serta menyembunyikan detail implementasi internal dari dunia luar.  

---
#### Tujuan Encapsulation
1. Data Protection - Melindungi data dari akses dan modifikasi yang tidak sah.
2. Data Validation - Memastikan data yang masuk valid sebelum disimpan.
3. Flexibility - Mudah mengubah implementasi internal tanpa mempengaruhi kode luar.
4. Maintainability - Kode lebih mudah dipelihara dan di-debug.
5. Modularity - Membuat kode lebih modular dan terorganisir
   
#### Prinsip Utama
![teks yang ingin ditampilkan](gambar/prinsip.png)

#### Access Modifier:
Access modifier menentukan tingkat akses terhadap class, attributes, dan methods. Java memiliki 4 jenis access modifier:
![teks yang ingin ditampilkan](gambar/a.png)

---

### Praktikum 1: Memahami Access Modifier
Contoh Program yang mengikuti modul:
1. Class Person
   ![teks yang ingin ditampilkan](gambar/person.png)
   ![teks yang ingin ditampilkan](gambar/person1.png)
2. Class AccessModifierTest
   ![teks yang ingin ditampilkan](gambar/yg1.png)
   ![teks yang ingin ditampilkan](gambar/ke4.png)
Contoh Output:
   ![teks yang ingin ditampilkan](gambar/ke3.png)
Analisa:
1. Analisis Class Person.java

File ini adalah blueprint atau cetakan untuk membuat objek Person.
Tujuan: Mendefinisikan struktur data (atribut) dan perilaku (method) dari sebuah Person.

Package: modul_5.praktikum_1

Atribut (Fields)
Class ini mendefinisikan 5 atribut dengan modifier yang berbeda:

private String nama;

Private: Hanya bisa diakses (dibaca/ditulis) dari dalam class Person ini saja.

private int umur;

Private: Sama seperti nama.

String alamat;

Default (Package-Private): Tidak ada modifier tertulis. Bisa diakses oleh class lain selama masih dalam package yang sama (modul_5.praktikum_1).

protected String telepon;

Protected: Bisa diakses oleh class dalam package yang sama DAN oleh subclass (turunan) di package yang berbeda.

public String email;

Public: Bisa diakses dari mana saja, tanpa batasan.

Methods
public Person(String nama, int umur)

Constructor Public: Digunakan untuk membuat instance/objek baru dari Person.

public void tampilkanInfo()

Method Public: Bisa dipanggil dari mana saja. Method ini valid karena dia berada di dalam class Person sehingga berhak mengakses anggota private (nama, umur).

private void metodePribadi()

Method Private: Hanya bisa dipanggil dari dalam class Person itu sendiri.

public void panggilMetodePribadi()

Method Public: Digunakan sebagai "jembatan" atau perantara untuk memanggil metodePribadi() yang private dari luar class.

2. Analisis Class AccessModifierTest.java
   File ini adalah "driver" atau class penguji yang berisi method main.

Tujuan: Membuat objek Person dan mencoba mengakses semua atribut dan method-nya untuk menguji aturan Access Modifier.

Package: modul_5.praktikum_1 (Poin penting: Ini ada di package yang sama dengan Person).

Analisis Method main
![teks yang ingin ditampilkan](gambar/yg1.png)
3. Penjelasan Error: "Coba uncomment baris..."
   Ini adalah inti dari demonstrasi Enkapsulasi. Jika Anda menghapus tanda // pada baris-baris berikut:

![teks yang ingin ditampilkan](gambar/ke2.png)
Program tidak akan bisa di-compile. Anda akan mendapatkan compile-time error.

Mengapa Error Terjadi?
Penyebab utamanya adalah Pelanggaran Akses private.

Prinsip dasarnya sangat sederhana:

Anggota (atribut atau method) yang ditandai sebagai private HANYA bisa diakses dari dalam class itu sendiri.

Mari kita bedah satu per satu:

person.nama = "Andi"; (ERROR)

Anda mencoba mengakses atribut nama dari objek person.

Atribut nama didefinisikan di class Person sebagai private.

Kode yang mencoba mengaksesnya (person.nama = "Andi";) berada di class AccessModifierTest.

Karena AccessModifierTest bukan class Person, ia tidak memiliki izin untuk mengakses anggota private milik Person.

person.umur = 30; (ERROR)

Alasannya sama persis dengan nama. umur adalah private di Person dan tidak bisa diakses dari luar.

person.metodePribadi(); (ERROR)

Alasannya juga sama. metodePribadi() adalah method private di Person. Hanya method lain di dalam Person (seperti panggilMetodePribadi()) yang boleh memanggilnya.

Analogi Sederhana
Bayangkan class Person adalah Rumah Anda:

public (email): Seperti Pagar Depan. Siapa saja di jalan bisa melihatnya.

default (alamat): Seperti Ruang Tamu. Orang yang Anda izinkan masuk ke komplek/package (tetangga) bisa melihatnya.

protected (telepon): Seperti Kamar Tidur Tamu. Tetangga dan keluarga (subclass) boleh mengaksesnya.

private (nama, umur): Seperti Brankas di Kamar Pribadi Anda. HANYA Anda (class Person itu sendiri) yang bisa membukanya.

Ketika class AccessModifierTest (tetangga) mencoba mengakses person.nama, itu sama seperti tetangga Anda mencoba membuka paksa brankas pribadi Anda. Tentu saja tidak bisa dan itu melanggar aturan (error).

Cara Akses yang Benar (Sesuai Konsep OOP)
Kode Anda sudah menunjukkan cara yang benar:

Untuk melihat data private: person.tampilkanInfo();

Untuk menjalankan method private: person.panggilMetodePribadi();

Anda berinteraksi melalui "pintu" public yang sudah disediakan, bukan dengan mencoba mendobrak dinding private.

### Praktikum 2: Getter dan Setter
Getter dan Setter adalah method yang digunakan untuk mengakses dan mengubah nilai private attributes.

#### Naming Convention:
+ Getter: get + NamaAttribute (contoh: getNama())
+ Setter: set + NamaAttribute (contoh: setNama())
+ Boolean Getter: is + NamaAttribute (contoh: isActive())

#### Keuntungan Menggunakan Getter/Setter:
+ Kontrol akses terhadap data
+ Validasi data sebelum disimpan
+ Read-only atau write-only attributes
+ Computed attributes
+ Lazy initialization

Contoh Program yang mengikuti modul:
1. Class Mahasiswa
   ![teks yang ingin ditampilkan](gambar/mhs.png)
   ![teks yang ingin ditampilkan](gambar/mhs1.png)
   ![teks yang ingin ditampilkan](gambar/mhs2.png)
   ![teks yang ingin ditampilkan](gambar/mhs3.png)
    ![teks yang ingin ditampilkan](gambar/mhs4.png)
    ![teks yang ingin ditampilkan](gambar/mhs5.png)
2. Class GetterSetterTest
   ![teks yang ingin ditampilkan](gambar/set1.png)
   ![teks yang ingin ditampilkan](gambar/set2.png)
   ![teks yang ingin ditampilkan](gambar/set3.png)
Output:
   ![teks yang ingin ditampilkan](gambar/set4.png)
   ![teks yang ingin ditampilkan](gambar/set5.png)
   ![teks yang ingin ditampilkan](gambar/set6.png)
Analisa:
</br>
Class Mahasiswa.java
   Ini adalah class blueprint yang mendefinisikan objek Mahasiswa.

Perlindungan Data (Enkapsulasi)
Semua atribut (data) dideklarasikan sebagai private:

private String npm;
private String nama;
private String jurusan;
private double ipk;
private int semester;
private boolean aktif;
Ini berarti mereka tidak bisa diakses atau diubah secara langsung dari luar class Mahasiswa.

1. Getter: Berfungsi untuk Membaca Data
   Untuk mengizinkan class lain membaca data yang private, kita menyediakan Getter Methods.

public String getNpm()

public String getNama()

public String getJurusan()

public double getIpk()

public int getSemester()

public boolean isAktif() (Khusus untuk boolean, konvensinya menggunakan awalan is bukan get).

Metode-metode ini bersifat public dan satu-satunya tugas mereka adalah mengembalikan nilai dari atribut privat.

2. Setter: Melakukan Validasi Sebelum Mengubah Data
   Untuk mengizinkan class lain mengubah data, kita menyediakan Setter Methods. Inilah letak kekuatan enkapsulasi: kita bisa menyisipkan logika validasi di dalamnya.

Contoh 1: Validasi IPK
![teks yang ingin ditampilkan](gambar/ipk.png)
Contoh 2: Validasi Nama
![teks yang ingin ditampilkan](gambar/nama.png)
Jika Anda mencoba setNama("Budi123"), validasi regex akan gagal, dan nama tidak akan diubah.

3. Attribute Read-Only (Tidak Ada Setter)
   Perhatikan atribut npm.

Ada public String getNpm() (ada Getter).

Tidak ada public void setNpm(String npm) (tidak ada Setter).

Artinya, npm hanya bisa diatur satu kali saat objek dibuat (melalui constructor). Setelah itu, npm bersifat read-only: bisa dibaca oleh siapa saja (via getNpm()), tapi tidak bisa diubah lagi.

2. Analisis Class GetterSetterTest.java
   Ini adalah class "driver" yang berisi main untuk menguji class Mahasiswa.

Pengamatan Saat Program Dijalankan
Data Awal & Test Getter:

Objek mhs dibuat dengan data awal.

Blok "TEST GETTER" membuktikan bahwa kita bisa membaca semua data awal (Budi Santoso, 0.0, true, dll.) menggunakan method get... dan is....

Test Setter (Poin Kunci):

mhs.setIpk(3.75);

Hasil: BERHASIL. Angka 3.75 lolos validasi (0.0 <= ipk <= 4.0).

Output: "✓ IPK berhasil diubah..." dan "★ Excellent! IPK sangat baik!" (karena setIpk memanggil cekStatusAkademik()).

mhs.setIpk(5.0);

Hasil: DITOLAK. Angka 5.0 gagal validasi.

Output: "Error: IPK harus antara 0.0 - 4.0!".

mhs.setNama("Budi123");

Hasil: DITOLAK. String "Budi123" gagal validasi regex [a-zA-Z .']+ (karena mengandung angka).

Output: "Error: Nama hanya boleh berisi huruf dan spasi!".

mhs.setSemester(20);

Hasil: DITOLAK. Angka 20 gagal validasi (1 <= semester <= 14).

Output: "Error: Semester harus antara 1 - 14!".

Data Akhir:

Ketika mhs.tampilkanInfo() dipanggil di akhir, kita melihat:

IPK adalah 3.75 (bukan 0.0 dan bukan 5.0).

Nama tetap "Ahmad Budi Santoso" (bukan "Budi123").

Semester adalah 5 (bukan 1 dan bukan 20).

Ini membuktikan bahwa setter berhasil melindungi data dari nilai yang tidak valid.

Larangan Akses Langsung:

Baris // X TIDAK BISA: mhs.npm = "123"; menegaskan ini. Jika Anda menghapus //, program akan error karena npm adalah private.

Anda dipaksa menggunakan mhs.setIpk(3.5) (yang memiliki validasi) dan dilarang melakukan mhs.ipk = 5.0 (yang berbahaya).

Kesimpulan
Program ini mendemonstrasikan fondasi enkapsulasi:

Getter (getNama(), isAktif()) adalah "jendela" publik untuk melihat data privat.

Setter (setNama(), setIpk()) adalah "pintu" publik untuk mengubah data privat, yang dijaga oleh "satpam" (logika validasi).

Read-Only (seperti npm) dicapai dengan hanya menyediakan "jendela" (Getter) tapi tidak ada "pintu" (Setter).

Manfaat utamanya adalah integritas data. Objek Mahasiswa tidak akan pernah bisa memiliki data "sampah" atau tidak valid (seperti IPK 5.0 atau semester 20), karena setter telah mencegahnya di pintu masuk.

### Praktikum 3: Read-Only dan Write-Only Properties
Memahami konsep read-only dan write-only properties menggunakan getter/setter.
</br> Contoh Program yang mengikuti modul:
1. Class Product
   ![teks yang ingin ditampilkan](gambar/p1.png)
   ![teks yang ingin ditampilkan](gambar/p2.png)
   ![teks yang ingin ditampilkan](gambar/p3.png)
   ![teks yang ingin ditampilkan](gambar/p4.png)
   ![teks yang ingin ditampilkan](gambar/p5.png)
   ![teks yang ingin ditampilkan](gambar/p6.png)
   ![teks yang ingin ditampilkan](gambar/p7.png)
   ![teks yang ingin ditampilkan](gambar/p8.png)
2. Class ProductTest
   ![teks yang ingin ditampilkan](gambar/ps.png)
   ![teks yang ingin ditampilkan](gambar/ps1.png)
   ![teks yang ingin ditampilkan](gambar/ps2.png)
   ![teks yang ingin ditampilkan](gambar/ps3.png)
OutPut:
   ![teks yang ingin ditampilkan](gambar/pt1.png)
   ![teks yang ingin ditampilkan](gambar/pt2.png)
   ![teks yang ingin ditampilkan](gambar/pt3.png)
   ![teks yang ingin ditampilkan](gambar/pt4.png)
   ![teks yang ingin ditampilkan](gambar/pt5.png)
Analisa:
   Program Product.java dan ProductTest.java merupakan implementasi yang sangat baik untuk mendemonstrasikan konsep Encapsulation dalam pemrograman berorientasi objek (OOP), khususnya dalam penggunaan Access Modifier dan kontrol akses terhadap atribut kelas. Konsep utama yang ditunjukkan adalah bagaimana read-only, write-only, read-write, dan computed properties bekerja dalam menjaga keamanan dan konsistensi data suatu objek, serta bagaimana proses validasi PIN digunakan untuk memastikan perubahan data hanya dilakukan oleh pihak yang berwenang.

Pertama, atribut read-only seperti productId dan createdAt hanya memiliki metode getter tanpa setter. Nilai keduanya ditetapkan sekali pada saat objek dibuat melalui konstruktor dan tidak dapat diubah lagi setelahnya. Hal ini ditunjukkan ketika program mencoba mengubah productId, yang menghasilkan error karena atribut tersebut memiliki modifier final dan tidak menyediakan metode pengubah (setter). Dengan demikian, atribut ini bersifat konstan sepanjang masa hidup objek dan menjamin identitas produk tetap konsisten.

Selanjutnya, atribut write-only seperti adminPin hanya memiliki setter tanpa getter. Hal ini berarti nilainya dapat diubah, tetapi tidak dapat dibaca secara langsung dari luar kelas. Tujuan dari pendekatan ini adalah menjaga keamanan informasi sensitif seperti PIN agar tidak terekspos ke luar. Di dalam program, pengubahan PIN dilakukan menggunakan metode changeAdminPin(), yang mensyaratkan PIN lama dan PIN baru. Apabila PIN lama salah, maka perubahan akan ditolak. Pendekatan ini mencontohkan bagaimana enkapsulasi dapat digunakan untuk melindungi data sensitif dengan memberikan kontrol penuh terhadap akses data.

Selain itu, program juga menampilkan konsep computed properties, yaitu properti yang nilainya tidak disimpan secara langsung dalam atribut, melainkan dihitung setiap kali dibutuhkan. Contohnya adalah getTotalNilai() yang menghitung total nilai barang berdasarkan harga dikalikan stok, serta getStatusStok() yang menilai kondisi stok berdasarkan jumlah yang tersedia. Karena nilainya dihitung secara langsung dari atribut lain, computed properties selalu memberikan informasi yang mutakhir tanpa memerlukan penyimpanan tambahan. Ini merupakan contoh penggunaan properti dinamis dalam desain kelas yang efisien.

Atribut read-write seperti nama, harga, dan stok memiliki baik getter maupun setter, namun dengan tambahan logika validasi berupa PIN. Setiap kali pengguna ingin mengubah nilai atribut tersebut, program akan memeriksa apakah PIN yang dimasukkan sesuai dengan PIN admin yang tersimpan. Jika PIN salah, perubahan ditolak dan pesan kesalahan akan ditampilkan. Validasi ini menjadi mekanisme pengaman agar hanya pengguna yang memiliki otoritas yang dapat melakukan perubahan terhadap data produk. Dengan cara ini, program memastikan bahwa data penting tidak bisa dimodifikasi sembarangan, mencerminkan praktik keamanan data yang baik dalam OOP.

Secara keseluruhan, hasil dari eksekusi program memperlihatkan bahwa read-only properties tidak dapat diubah, write-only properties tidak dapat dibaca, computed properties dihitung secara otomatis (on-the-fly), dan setiap perubahan data harus melalui validasi PIN yang benar. Semua perilaku ini membuktikan bahwa kelas Product dirancang dengan prinsip enkapsulasi yang kuat — melindungi data internal, memberikan antarmuka publik yang terkontrol, dan memastikan integritas serta keamanan data melalui penggunaan Access Modifier dan validasi logika bisnis yang tepat.

## Kesimpulan
Dari seluruh rangkaian praktikum mengenai Enkapsulasi (Encapsulation), dapat disimpulkan bahwa konsep ini merupakan salah satu pilar utama dalam pemrograman berorientasi objek yang berperan penting dalam menjaga keamanan, konsistensi, dan integritas data. Melalui penggunaan access modifier seperti private, protected, public, dan default, programmer dapat mengontrol secara ketat bagaimana data diakses dan dimodifikasi oleh bagian lain dari program.

Praktikum pertama menunjukkan bagaimana setiap jenis access modifier memiliki tingkat akses yang berbeda, dan bagaimana pelanggaran terhadap aturan akses tersebut akan menimbulkan error — hal ini mempertegas fungsi enkapsulasi dalam melindungi atribut dari manipulasi langsung. Praktikum kedua memperkenalkan getter dan setter sebagai mekanisme aman untuk membaca dan mengubah data privat. Dengan menambahkan validasi pada setter, data yang masuk dapat disaring sehingga hanya nilai yang valid yang diterima oleh sistem.

Sementara itu, praktikum ketiga memperdalam konsep read-only, write-only, dan computed properties, serta penerapan validasi keamanan menggunakan PIN untuk mengontrol perubahan data. Pendekatan ini mencontohkan bagaimana enkapsulasi tidak hanya melindungi data, tetapi juga mengatur alur logika bisnis dengan aman dan efisien.

Secara keseluruhan, penerapan enkapsulasi membuat kode menjadi lebih aman, mudah dipelihara, fleksibel, dan terstruktur. Data penting tidak dapat diubah secara sembarangan, sementara perubahan yang diizinkan selalu melalui jalur kontrol yang jelas. Dengan demikian, enkapsulasi bukan hanya tentang menyembunyikan data, tetapi juga tentang menciptakan sistem yang stabil, terpercaya, dan berorientasi pada keamanan informasi dalam pengembangan perangkat lunak berbasis objek.

## Referensi
Oracle Corporation. (2024). The Java™ Tutorials: Controlling Access to Members of a Class. Diakses pada 6 November 2025, dari https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
Oracle Corporation. (2024). The Java™ Tutorials: Encapsulation. Diakses pada 6 November 2025, dari https://www.oracle.com/java/technologies/tutorial-object-oriented-concepts.html#encapsulation