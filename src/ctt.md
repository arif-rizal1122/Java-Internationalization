
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