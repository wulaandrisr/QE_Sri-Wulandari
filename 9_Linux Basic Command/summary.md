# Basic Linux Command
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-	Basic Linux Commads
-	Shell Script
## Basic Linux Commads
### Introduction  Linux Commands
Linux Commands adalah sebuah utilitas dari sistem operasi Linux, semua tugas dasar dan lanjutan dilakukan dengan menjalankan commands. Commands dijalankan diterminal Linux, terminal merupakan antar muka baris perintah untuk berinteraksi dengan sistem yang mirip dengan command prompt di OS Windows. Commands di Linux sensitif dengan huruf besar maupun huruf kecil.
Command line di Linux penuh dengan text-based, dan lebih cepat daripada menggunakan GUI
- Kelebihan dari Command line :
1. Less Resources, command line ringan sehingga tidak mengharuskan komputer untuk memiliki spesifikasi tinggi, bila ingin menggunakan command line
2. Repetitive Task Friendly, kita dapat menyimpan script untuk mengotomatiskan tugas yang sama berulang kali
3. Powerful, karena hanya menggunakan text antar muka, sistem operasi ini  terlihat lebih stabil dibandingkan GUI
### Kind Of Commands Linux 
Struktur Commands Linux :
Ada beberapa contoh commands linux seperti : ls, cd dsb
ls memiliki fungsi untuk menampilkan semua file didirektori kerja, namun dalam prakteknya command tanpa [options] dan [parameter] tidak berguna.
contoh : 
ls -a /usr : untuk mencari file atau menampilkan file dengan format panjang didirektori usr
Command ls dapat digunakan dengan beberapa options seperti :
ls -a -l
ls -al
- Basic Commands :
cal : berfungsi untuk menampilkan kalender
date : untuk menampilkan tanggal pada zona waktu yang tertera di OS kita
etc
- File System Commands :
touch, cat, cp, mv, rm, mkdir, rmdir, cd, pwd
- Processes Control Commands
top : command topvakqn menampilkan daftar proses yang sedang berlangsung dan seberapa banyak ruang CPU yang digunakan oleh tiap proses tersebut
clear : command clear digunakan untuk membersihkan terminal, jika didalamnya sudah banyak sekali terdapat command
history : command history digunakan untuk mengecek kembali command yang telah ditambahkan sebelumnya
- Utilities Programs Commands
ls : menampilkan semua file didirektori kerja kita
which : digunakan untuk mencari file yang dapat dieksekusi terkait command yang diberikan
sudo : berfungsi untuk menjalankan task yang memerlukan hak akses atau permision administratif atau run
find : digunakan untuk mencari file direktori, lebih ditujukan untuk mencari file yang berlokasi didalam direktori yang diberikan
### File Access Permisions
chmod : digunakan untuk membaca, menulis dan menjalankan permision dari file dan direktori
chown : digunakan untuk mengubah atau mentransfer kepemilikan file ke user name khusus atau spesifik
## Shell Script
### Introduction Shell Script 
Shell Script  adalah sebuah bahasa pemrograman yang disusun berdasarkan command command shell.
Shell merupakan program yang berfungsi sebagai jembatan antar user dan kernel
### Why We Learn Shell Script 
1. Kebanyakan konfigurasi sistem dapat dilakukan dari shell command
2. Linux shell memberikan fleksibilitas terutama saat anda bekerja dengan banyak file
3. Untuk tindakan penyelamatan terhadap sebuah data atau recovery terhadap sistem dan pekerjaan maintenance sistem pada single mode dapat anda lakukan lewat shellcommand
