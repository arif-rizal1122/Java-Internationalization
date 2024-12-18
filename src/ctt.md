
#### ¥ INTERNALIZATION ¥ ####

1. Internationalization atau biasa disingkat I18N, karena ada 18 karakter diantara hurup I dan N
2. I18N adalah proses membuat desain aplikasi yang bisa beradaptasi sesuai dengan bahasa dan tempat dari pengguna aplikasinya tanpa harus melakukan perubahan pada kode program aplikasi yang kita buat
3. Java sudah mendukung I18N, jadi kita bisa membuat aplikasi kita mendukung banyak bahasa (misal bahasa Indonesia, Inggris, dan lain-lain)


¥ Karakteristik Aplikasi yang Mendukung I18N

1. Penambahan dukungan bahasa tidak perlu melakukan perubahan kode program Java
2. Tampilan yang berubah text / label, seperti misal status, label di komponen UI, semuanya tidak di hardcode di kode program, melainkan disimpan di tempat diluar kode program, dan diambil secara dinamis sesuai dengan bahasa dan lokasi pengguna aplikasi
3. Mengikuti kultur lokasi user, seperti format tanggal, waktu, angka dan mata uang.
4. Penambahan dukungan bahasa baru bisa dilakukan secara cepat


# LOCALE

1. DI Java, bahasa dan negara sudah ada representasinya, namanya adalah class Locale
2. Class Locale ini bisa digunakan sebagai representasi bahasa dan negara
3. Kenapa ada negara dan bahasa? Kenapa tidak negara saja, atau bahasa saja? Karena kadang ada bahasa yang sama untuk negara berbeda, atau bahasa berbeda untuk negara yang sama
4. Locale mengikuti standar IETF BCP 47, yang terdiri dari RFC 4647 "Matching of Language Tags” dan RFC 5646 "Tags for Identifying Languages"

¥ Penulisan Bahasa

1. Penulisan bahasa di Locale menggunakan ISO 639 alpha 2 atau alpha 3
2. Ketika sebuah bahasa memiliki kode alpha 2 dan alpha 3, maka yang harus digunakan adalah alpha 2
3. https://www.loc.gov/standards/iso639-2/php/code_list.php 

¥ Penulisan Negara

1. Penulisan negara di Locale menggunakan ISO 3166 alpha-2
2. https://www.iban.com/country-codes 

# RESOURCE BUNDLE

1. ResourceBundle adalah class yang digunakan sebagai bundle yang berisikan data yang bisa berubah sesuai dengan Locale yang dipilih.
2. ResourceBundle cocok digunakan untuk menyimpan data I18N, dimana semua data akan disimpan dalam sebuah properties file

¥ Properties File
1. Saat kita menggunakan ResourceBundle, kita perlu membuat properties file di dalam resources sebagai tempat untuk ResourceBundle melakukan lookup data
2. Misal kita membuat file properties dengan nama message.properties di dalam resources


¥ I18N di ResourceBundle
1. Kode sebelumnya kita hanya menggunakan ResourceBundle sebagai object untuk mengambil data dari properties file, kalo seperti ini tidak ada bedanya dengan class Properties
2. Yang membedakan, dalam ResourceBundle, kita bisa melakukan I18N
3. Namun untuk melakukan itu, kita perlu menyediakan properties file sesuai dengan Locale nya
4. Misal jika kita ingin mendukung bahasa in dan negara ID, maka kita perlu membuat message_in_ID.properties.
5. File nya butuh diawali dengan message karena sebelumnya kita menggunakan nama file message.properties

¥ Jika Tidak ada Properties untuk Locale
1. Apa yang terjadi jika ada Locale yang tidak tersedia dalam file properties nya?
2. Misal kita akan menggunakan Locale en_US, sedangkan tidak ada file message_en_US.properties nya?
3. Jika itu terjadi, secara default ResourceBundle akan menggunakan message.properties

¥ Amankah Membuat ResourceBundle Terus?
1. Cara membuat ResourceBundle menggunakan static method getBundle()
2. Di dalam implementasi getBundle() telah diimplementasikan caching, artinya jika kita mengambil resource yang sama dengan locale yang sama, tidak akan dibuat ulang, melainkan akan menggunakan ResourceBundle yang sudah tersedia
3. Hal ini menjadi aman jika kita selalu membuat ResourceBundle terus menerus


# I18N DI DATE DAN TIME

1. I18N di tipe data String mungkin sederhana, bagaimana jika tipe data Date atau Waktu?
2. Di Java kita tahu bahwa tipe data Date dan Time direpresentasikan dalam class Date
3. Bagaimana misal jika kita ingin menampilkan tanggal dalam bahasa Indonesia, bahasa Inggris, atau yang lainnya?
4. Di Java, I18N di Date sudah disediakan menggunakan DateFormatter

¥ DateFormat Class
1. DateFormat merupakan class yang bisa kita gunakan untuk melakukan parsing dari String ke Date, atau format dari Date ke String
2. DateFormat mendukung I18N jika misal kita ingin melakukan format dan parse, sehingga bisa menerima hari dengan data Sunday, Monday atau Minggu, Senin
3. DateFormat adalah abstract class, salah satu implementasinya adalah class SimpleDateFormat

# I18N DI NUMBER

1. Apakah perlu I18N di number?
2. Yup perlu, karena kadang beda bahasa beda format penulisan number nya.
3. Contoh, di Indonesia menggunakan . (titik) sebagai pemisah ribuan, dan , (koma) untuk pemisah bilangan pecahan, sedangkan di Amerika, itu terbalik

¥ NumberFormat Class
1. Untuk melakukan I18N di Java, kita bisa menggunakan class NumberFormat
2. NumberFormat adalah abstract class, untuk membuat object NumberFormat, kita bisa menggunakan static method getInstance() milik class NumberFormat


# I18N DI CURRENCY

1. Java juga mendukung I18N untuk mata uang atau currency
2. Ada 2 class yang bisa kita gunakan untuk melakukan I18N di Java, yaitu class Currency dan class NumberFormat


¥ Currency class
1. Currency class adalah implementasi standard dari ISO 4217 currency codes
2. https://www.iso.org/iso-4217-currency-codes.html
3. Dengan menggunakan class ini, kita bisa mengetahui nama mata uang, kode mata uang sampai simbol yang digunakan
4. Untuk membuat object Currency, kita wajib menggunakan Locale yang memiliki negara, karena memang mata uang tergantung dari negaranya, bukan bahasanya
5. Constructor Currency class adalah private, jadi untuk membuat Currency, kita harus menggunakan static method getInstance()

























