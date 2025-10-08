# Laporan Modul 3: Dasar Pemrograman Java Lanjutan
**Mata Kuliah:** Praktikum Pemrograman Berorientasi Objek  
**Nama:** [Riski Al Fatah]  
**NIM:** [2024573010036]  
**Kelas:** [TI.2E]

---

## 1. Abstrak
Laporan ini merangkum hasil praktikum **Modul 3: Dasar Pemrograman Java Lanjutan**, yang berfokus pada tiga topik utama: **Array**, **Method/Function**, dan **String/Manipulasi String**. Tujuan dari laporan ini adalah untuk mendokumentasikan pemahaman konsep, langkah-langkah implementasi kode, hasil eksekusi, serta analisis mendalam dari setiap praktikum dan tugas yang diselesaikan. Melalui serangkaian praktikum ini, mahasiswa berhasil mengimplementasikan array satu dan dua dimensi, mendefinisikan dan memanggil method dengan berbagai tipe, serta melakukan manipulasi string kompleks, termasuk validasi dan pemformatan data. Diharapkan laporan ini menjadi bukti pemahaman yang kuat terhadap fundamental lanjutan pemrograman Java.

---

## 2. Praktikum

### Praktikum 1.1 - Array Satu Dimensi

#### Dasar Teori
**Array** adalah struktur data homogen yang menyimpan kumpulan nilai dengan tipe data yang sama. Array di Java memiliki ukuran yang tetap *(fixed size)* dan elemennya diakses melalui **indeks** yang dimulai dari 0. Praktikum ini berfokus pada deklarasi, inisialisasi, dan akses elemen array, serta modifikasi untuk mencari nilai tertinggi dan terendah.

#### Langkah Praktikum
1.  Membuat *package* `modul_3` dan *class* `ArraySatuDimensi.java`.
2.  Mendeklarasikan dan menginisialisasi array integer `nilaiSiswa`.
3.  Menambahkan perulangan *enhanced for* untuk mencari **nilai tertinggi** dan **nilai terendah** dalam array.
4.  Menampilkan hasil array, akses elemen spesifik, serta hasil pencarian nilai ekstrem.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/ArrayDuaDimensi.png)
![teks yang ingin ditampilkan](gambar/ArrayDuaDimensi1.png)
![teks yang ingin ditampilkan](gambar/ArrayDuaDimensi2.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk membuat array satu dimensi yang menyimpan nilai ujian dari 10 siswa. Tugas ini mencakup:
- Menampilkan nilai seluruh siswa yang disimpan dalam array.
- Menghitung rata-rata nilai ujian seluruh siswa.
- Mencari nilai tertinggi dan terendah dari array yang telah dibuat.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/Latihan1.png)
![teks yang ingin ditampilkan](gambar/Latihan01.png)

#### Analisa dan Pembahasan
Pada praktikum ini, array `nilaiSiswa` berhasil dideklarasikan dan diakses. Modifikasi kode untuk mencari nilai tertinggi dan terendah dilakukan dengan inisialisasi awal `nilaiTertinggi` dan `nilaiTerendah` dengan elemen pertama array (`nilaiSiswa[0]`). Kemudian, perulangan `for-each` digunakan untuk membandingkan setiap elemen dengan nilai ekstrem yang tersimpan, memperbarui variabel `nilaiTertinggi` jika ditemukan nilai yang lebih besar, dan `nilaiTerendah` jika ditemukan nilai yang lebih kecil. Ini menunjukkan efisiensi penggunaan perulangan untuk analisis data dalam array.

---

### Praktikum 1.2 - Array Dua Dimensi

#### Dasar Teori
Array Dua Dimensi (2D) atau matriks adalah array dari array. Array 2D digunakan untuk merepresentasikan data dalam bentuk baris dan kolom. Akses elemen memerlukan dua indeks: namaArray[baris][kolom]. Praktikum ini melibatkan pemrosesan data nilai siswa per mata pelajaran.

#### Langkah Praktikum
1. Membuat class `ArrayDuaDimensi.java`.
2. Mendeklarasikan array 2D nilai yang merepresentasikan nilai 3 siswa untuk 4 mata pelajaran.
3. Menjalankan program dan menganalisis struktur data.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/Arraysatudimensi.png)
![teks yang ingin ditampilkan](gambar/Arraysatudimensi%20(2).png)
![teks yang ingin ditampilkan](gambar/satudimensi.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk membuat array dua dimensi untuk menyimpan nilai ujian siswa pada beberapa mata pelajaran. Tugas ini mencakup:
- Menampilkan mata pelajaran dengan nilai tertinggi untuk setiap siswa.
- Menghitung rata-rata nilai untuk setiap mata pelajaran yang ada.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/Latihan2.png)
![teks yang ingin ditampilkan](gambar/Latihan02.png)
![teks yang ingin ditampilkan](gambar/samaaja.png)

#### Analisa dan Pembahasan
Array 2D berhasil diimplementasikan, di mana indeks pertama merepresentasikan siswa (baris) dan indeks kedua merepresentasikan mata pelajaran (kolom). Analisis menunjukkan bahwa array 2D sangat cocok untuk data tabular.

---

### Praktikum 2.1 - Method Dasar

#### Dasar Teori
Method (atau Function) adalah blok kode yang dirancang untuk menjalankan tugas tertentu. Praktikum ini mengeksplorasi pembuatan method dengan berbagai jenis: void (tidak mengembalikan nilai) dan return method (mengembalikan nilai), serta penggunaan parameter untuk input data. Penggunaan method meningkatkan modularitas dan menghindari pengulangan kode (Don't Repeat Yourself - DRY).

#### Langkah Praktikum
1. Membuat class `MethodDasar.java`.
2. Membuat method `tampilkanHeader()` (void tanpa parameter) dan `tampilkanHasil()` (void dengan parameter).
3. Membuat method untuk operasi dasar matematika (tambah, kurang, kali, bagi) yang mengembalikan nilai.
4. Membuat method `validasiAngka()` untuk memastikan input valid.
5. Memanggil semua method di main.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/pertama.png)
![teks yang ingin ditampilkan](gambar/kedua.png)
![teks yang ingin ditampilkan](gambar/ketiga.png)
![teks yang ingin ditampilkan](gambar/siap.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk membuat beberapa method untuk melakukan operasi matematika dasar seperti penjumlahan, pengurangan, perkalian, dan pembagian. Selain itu, tugas ini juga mencakup:
- Validasi pembagian dengan nol.
- Penggunaan method dengan parameter dan return type.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/metodedasar.png)
![teks yang ingin ditampilkan](gambar/metodedasar1.png)
![teks yang ingin ditampilkan](gambar/metodedasar2.png)

#### Analisa dan Pembahasan
Implementasi method berjalan dengan baik. Method `tambah`, `kurang`, dan `kali` menggunakan tipe data double sebagai return type untuk mendukung perhitungan desimal. Method `bagi` menyertakan validasi sederhana untuk menghindari `ArithmeticException` (pembagian dengan nol). Pemisahan logika program ke dalam method membuat kode di main lebih bersih dan mudah dipahami, menunjukkan prinsip modularitas.

---

### Praktikum 2.2 - Method Dengan Array

#### Dasar Teori
Method dapat menerima array sebagai parameter dan mengembalikan array sebagai return type. Hal ini memungkinkan pemrosesan array yang kompleks (seperti pengurutan, pencarian maksimum/minimum, atau penghitungan rata-rata) diisolasi dalam fungsi yang spesifik.

#### Langkah Praktikum
1. Membuat class `ArrayMethod.java`.
2. Membuat method untuk `inputArray`, `tampilkanArray`, `cariMaksimum`, `cariMinimum`, `hitungRataRata`, dan `urutkanArray`.
3. Method `inputArray` menggunakan `Scanner` untuk input dinamis.
4. Method `urutkanArray` menggunakan algoritma Bubble Sort dasar.
5. Menggabungkan semua method di main untuk alur analisis array lengkap.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/metodearray.png)
![teks yang ingin ditampilkan](gambar/metodearray1.png)
![teks yang ingin ditampilkan](gambar/metodearray2.png)
![teks yang ingin ditampilkan](gambar/metodearray3.png)
![teks yang ingin ditampilkan](gambar/metodearray4.png)
![teks yang ingin ditampilkan](gambar/metodearray5.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk membuat beberapa method untuk menghitung rata-rata nilai dalam array, serta mencari nilai maksimum dan minimum dalam array. Tugas ini juga mencakup:
- Mengurutkan array dan menampilkan hasilnya.
- Menampilkan nilai maksimum, minimum, dan rata-rata array.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/latihan4.png)
![teks yang ingin ditampilkan](gambar/4.png)
![teks yang ingin ditampilkan](gambar/04.png)

#### Analisa dan Pembahasan
Pemisahan logika pemrosesan array ke dalam method yang berbeda (input, output, analisis, sort) terbukti efektif. Dengan adanya method, kode menjadi lebih terorganisir dan fungsionalitasnya dapat digunakan kembali. Method `urutkanArray` menggunakan `array.clone()` untuk memastikan array asli tidak diubah (prinsip immutability yang baik).

---

### Praktikum 3.1 - Manipulasi String Dasar

#### Dasar Teori
String di Java adalah objek yang merepresentasikan rangkaian karakter dan bersifat immutable (tidak dapat diubah setelah dibuat). Java menyediakan berbagai method built-in untuk manipulasi string, seperti `length()`, `charAt()`, `toUpperCase()`, `toLowerCase()`, dan `contains()`. Praktikum ini fokus pada penggunaan dasar method tersebut.

#### Langkah Praktikum
1. Membuat class `StringDasar.java`.
2. Mendefinisikan method `analysisString`, `hitungVokal`, `reverseString`, dan `isPalindrome`.
3. `analysisString` menggunakan method built-in dan `split()` untuk menghitung kata.
4. `isPalindrome` menggunakan `reverseString` setelah membersihkan string dari karakter non-alfanumerik.
5. Menggunakan `Scanner` untuk input dinamis dan demonstrasi semua fungsi.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/stringdasar.png)
![teks yang ingin ditampilkan](gambar/string1.png)
![teks yang ingin ditampilkan](gambar/string2.png)
![teks yang ingin ditampilkan](gambar/string3.png)
![teks yang ingin ditampilkan](gambar/string4.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk melakukan beberapa manipulasi string seperti:
- Menghitung jumlah vokal dalam sebuah string.
- Mengubah string menjadi uppercase dan lowercase.
- Menampilkan jumlah kata dalam string.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/latihan5.png)
![teks yang ingin ditampilkan](gambar/latihan05.png)
![teks yang ingin ditampilkan](gambar/latihan05%20(2).png)


#### Analisa dan Pembahasan
String manipulasi menggunakan method objek sangat efisien. Proses pengecekan palindrome menunjukkan pentingnya pembersihan string (`replaceAll("[^a-zA-Z0-9]", "")`) dan konversi case (`toLowerCase()`) sebelum perbandingan. Penggunaan `StringBuilder` (meskipun tidak eksplisit di kode, tetapi `reverseString` dapat dioptimasi dengan itu) lebih efisien untuk operasi penggabungan/modifikasi string berulang dibandingkan hanya dengan operator `+`.

---

### Praktikum 3.2 - Pengolahan Data Text

#### Dasar Teori
Pengolahan data teks sering melibatkan pemisahan token (kata, nama) dari sebuah delimiter (koma, spasi), serta pemformatan string ke format tertentu (misalnya, Title Case atau Username). Method `split()` sangat penting untuk memecah string berdasarkan pola.

#### Langkah Praktikum
1. Membuat class `TextProcessing.java`.
2. Membuat method `prosesDataMahasiswa` untuk memecah data nama yang dipisahkan koma (`split(",")`).
3. Method ini juga mencari nama terpanjang/terpendek dan mengurutkan nama menggunakan perbandingan `String` (`compareToIgnoreCase`).
4. Membuat method pemformatan nama: `formatTitleCase`, `formatKataInitial`, dan `buatUsername`.
5. Menggunakan `Scanner` untuk input data massal dan nama individu.

#### Screenshoot Hasil Praktikum
![teks yang ingin ditampilkan](gambar/last.png)
![teks yang ingin ditampilkan](gambar/last1.png)
![teks yang ingin ditampilkan](gambar/last2.png)
![teks yang ingin ditampilkan](gambar/last3.png)
![teks yang ingin ditampilkan](gambar/last4.png)
![teks yang ingin ditampilkan](gambar/last5.png)

#### Penjelasan Latihan
Pada tugas ini, saya diminta untuk:
- Membuat program untuk memvalidasi format nama (tidak boleh mengandung angka atau karakter khusus).
- Membuat program untuk menghasilkan alamat email berdasarkan nama lengkap.

#### Screenshoot Hasil Latihan
![teks yang ingin ditampilkan](gambar/latihan6.png)
![teks yang ingin ditampilkan](gambar/latihan6%20(2).png)
![teks yang ingin ditampilkan](gambar/latihan6%20(3).png)


#### Analisa dan Pembahasan
Penggunaan `String.split(",")` sangat efektif untuk mengubah data teks terstruktur menjadi array yang dapat diproses. Untuk pengurutan nama, digunakan Bubble Sort dengan method `compareToIgnoreCase()` untuk membandingkan string tanpa memperhatikan case, memastikan urutan alfabetis yang benar. Method pemformatan menunjukkan fleksibilitas manipulasi string dengan mengubah case dan menggunakan `replaceAll()` untuk membersihkan karakter.

---

## 3. Kesimpulan
Praktikum Modul 3: Dasar Pemrograman Java Lanjutan telah berhasil memberikan pemahaman yang mendalam mengenai fundamental lanjutan pemrograman Java, yang mencakup struktur data **Array**, konsep **Method/Function**, dan **Manipulasi String**.

Array terbukti menjadi struktur data yang efektif untuk mengelola data homogen, baik satu dimensi (untuk deret data tunggal) maupun dua dimensi (untuk data tabular), dengan implementasi algoritma pencarian nilai ekstrem dan rata-rata.

Konsep Method berhasil diimplementasikan untuk menciptakan kode yang modular dan dapat digunakan kembali (reusable), ditunjukkan melalui pembuatan fungsi kalkulator dan fungsi pemrosesan array. Hal ini sangat penting untuk program yang terstruktur dan mudah dirawat.

String sebagai objek yang immutable menunjukkan kemampuan manipulasi teks yang luas melalui berbagai method built-in dan Regular Expression untuk tugas-tugas seperti validasi, pemformatan case, dan pemecahan data.

Secara keseluruhan, modul ini telah memperkuat keterampilan dalam menyusun logika program yang kompleks, mengelola data secara efisien menggunakan array, dan mempraktikkan desain kode yang bersih dan terstruktur.

---

## 5. Referensi
1. Java Documentation: Arrays - https://docs.oracle.com/javase/tutorial/java/nutsandbolts/arrays.html
2. Java Documentation: Methods - https://docs.oracle.com/javase/tutorial/java/javaOO/methods.html
3. Java Documentation: The String Class - https://docs.oracle.com/javase/tutorial/java/data/strings.html
