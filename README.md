# pbo-post-test-2
Nama : Muhammad Fandi Perdana
NIM : 2209116094




1. Ini adalah penjelasan kode Java yang mendefinisikan kelas Phone dalam paket project.HP. Kelas ini mewakili ponsel dengan properti seperti nama, merek, dan harga. Juga, kelas ini menyediakan metode untuk mengakses dan memodifikasi properti-properti ini.

Deklarasi Paket:

Kode dimulai dengan deklarasi paket yang menentukan bahwa kelas ini termasuk dalam paket project.HP. Paket digunakan untuk mengorganisir kelas-kelas terkait dalam Java.
Deklarasi Kelas:

Kelas Phone dideklarasikan dengan modifier akses public final. Ini berarti bahwa kelas ini dapat diakses dari luar paketnya, dan kelas ini tidak dapat diwariskan atau diperluas (karena kata kunci final).
Variabel Instansi:

Kelas ini memiliki tiga variabel instansi:
phoneName: Sebuah String yang menyimpan nama ponsel.
brand: Sebuah String yang menyimpan merek ponsel.
price: Sebuah double yang menyimpan harga ponsel.
Konstruktor:

Kelas ini mendefinisikan sebuah konstruktor dengan tiga parameter: phoneName, brand, dan price. Konstruktor ini digunakan untuk menginisialisasi objek Phone ketika objek tersebut dibuat. Nilai-nilai yang diteruskan ke konstruktor ditetapkan ke variabel instansi yang sesuai.
Metode Getter:

Kelas ini menyediakan tiga metode getter untuk mengambil nilai-nilai dari variabel instansinya:
getPhoneName(): Mengembalikan nama ponsel.
getBrand(): Mengembalikan merek ponsel.
getPrice(): Mengembalikan harga ponsel.
Metode toString():

Metode toString() dioverride untuk memberikan representasi string kustom dari objek Phone. Metode ini menggunakan objek DecimalFormat untuk memformat price dengan dua tempat desimal dan menambahkan "Rp" (diasumsikan sebagai simbol mata uang) ke harga.
Metode Setter:

Kelas ini menyediakan metode setter, setPrice(double price), yang memungkinkan Anda untuk memperbarui harga ponsel. Metode ini mengambil harga baru sebagai parameter dan mengatur variabel instansi price ke nilai baru.


2. Kode Java ini adalah program manajemen ponsel yang memungkinkan pengguna untuk menambah, melihat, mencari, memperbarui, dan menghapus daftar ponsel.

Import Statements:

Program mengimpor kelas Phone yang didefinisikan dalam paket project.HP. Ini adalah kelas yang digunakan untuk merepresentasikan ponsel.
Class Declaration:

Posttest2 adalah kelas utama yang berisi metode main. Ini adalah titik masuk utama program.
Main Method:

main adalah metode utama program yang akan dieksekusi saat program dijalankan.
Dalam metode main, kita membuat sebuah ArrayList dengan tipe data Phone yang digunakan untuk menyimpan objek-objek ponsel.
Objek Scanner juga dibuat untuk menerima input pengguna.
Menu Display:

Program memulai loop tak terbatas yang menampilkan menu manajemen ponsel kepada pengguna dengan opsi berikut:
Tambah Ponsel
Lihat Daftar Ponsel
Cari Ponsel
Perbarui Ponsel
Hapus Ponsel
Keluar
Pengguna diminta untuk memasukkan pilihan dengan memasukkan nomor (1-6).
Switch Statement:

Program menggunakan pernyataan switch untuk menangani pilihan pengguna sesuai dengan nomor yang dimasukkan.
Di bawah ini adalah penanganan untuk masing-masing pilihan:
"1" (Tambah Ponsel): Pengguna diminta untuk memasukkan nama, merek, dan harga ponsel, dan kemudian ponsel baru ditambahkan ke daftar.
"2" (Lihat Daftar Ponsel): Program mencetak daftar ponsel yang telah ditambahkan.
"3" (Cari Ponsel): Pengguna diminta untuk memasukkan nama ponsel yang ingin dicari, dan program mencari dan menampilkan ponsel yang sesuai.
"4" (Perbarui Ponsel): Pengguna diminta untuk memasukkan nama ponsel yang ingin diperbarui, kemudian mengganti nama, merek, dan harga ponsel yang sudah ada dengan yang baru.
"5" (Hapus Ponsel): Pengguna diminta untuk memasukkan nama ponsel yang ingin dihapus, dan program menghapus ponsel dari daftar.
"6" (Keluar): Program menampilkan pesan terima kasih, menutup Scanner, dan keluar dari program.


A. ![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/396abc29-f349-4825-95d9-93eccc6c93e7)
  ini adalah hasil dari penambahan hp




B.![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/53811025-5156-4442-bd60-32312eadf622)
ini adalah hasil dari lihat daftar hp




C.![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/47d826c3-9278-42e3-8b71-4cb28a7f5ce6)
ini adalah hasil dari cari daftar hp



D.![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/d85bd0a2-d1ae-4d19-808c-dcd6faef5282)
ini adalah hasil dari update daftar hp



E.![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/dbfb18fa-6b8b-4aca-b6ee-b6c078733a98)
ini adalah hasil dari hapus daftar hp




F. ![image](https://github.com/muhammadFandi12/pbo-post-test-2/assets/127529693/84145087-6efa-4cf9-bf90-21b02c73331d)
ini adalah hasil dari keluar program






