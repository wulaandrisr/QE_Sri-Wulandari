# Agile Testing
## Resume

### 1. Definition of SDLC 

Merupakan proses yang digunakan untuk merancang, mengembangkan, dan menguji software yang berkualitas tinggi

### Tujuan dari SDLC:
Untuk menyediakan alur terstruktur dalam membantu organisasi mengahasilkan software berkualitas tinggi, yang diselesaikan dengan perkiraan waktu yang singkat dan biaya yang lebih rendah. Namun tetap memenuhi atau melebihi harapan pelanggan. Dalam prakteknya SDLC akan dimulai dengan evaluasi sistem yang ada untuk mendefinisikan persyaratan pada sistem yang baru, baru setelah itu software akan dibuat berdasarkan tahapan-tahapan SDLC yang ada. SDLC dapat mengantisipasi kemungkinan adanya kesalahan sehingga dapat mengurangi kemungkinan pengerjaan ulang atau perbaikan setelah software telah jadi. SDLC juga merupakan metodologi yang berulang sehingga kita harus memastikan kualitas kode yang ada disetiap siklusnya.

### SDLC memiliki banyak fungsi antara lain
- Sebagai sarana komunikasi antara tim developer dengan pemegang kepentingan
- Sebagai pembagian peranan dan tanggung jawab yang jelas antara developer, designer, bisnis analis, dan manager proyek
- Dapat memberikan gambaran input dan output yang jelas dari satu tahap menuju tahap selanjutnya

### Phase of SDLC
Tahapan tahapan dalam SDLC, antara lain :
- Requirement Gathering : pada tahap ini sistem akan dianalisis bagaimana akan dijalankan nantinya, hasil analisis berupa kelebihan dan kekurangan sistem, fungsi sistem hingga pembaharuan yang dapat diterapkan. 
- Design : Tahap design dalam SDLC adalah tahap dimana kita akan membuat model, cara kerja aplikasi atau software.
- Development (Code) : Pada tahap ini dimana program atau code ditulis, biasanya jika proyek tersebut kecil maka program dapat ditulis oleh satu developer saja namun jika proyek besar bisa dipecah dan dikerjakan oleh beberapa tim. Pada fase ini bisa juga digunakan aplikasi akses kontrol atau source code management untuk membuat developer melacak perubahan pada code dan memastikan probabilitas antar proyek tim yang berbeda sehingga sasaran terpenuhi. Pada tahap ini perancangan bisa saja berubah karena satu atau banyak hal.
- Testing : Sesudah sistem selesai dikembangkan sistem harus melalui pengujian sebelum digunakan atau dipublikasikan. Tahap testing sistem harus dijalankan untuk mencoba apakah sistem yang dikembangkan dapat bekerja optimal atau tidak. Pada tahap ini ada beberapa hal yang harus diperhatikan seperti kemudahan penggunaan sistem pencapaian tujuan dari sistem yang sudah disusun setiap perancangan sistem yang dilakukan. Tahap testing dalam SDLC adalah bagian paling penting dalam rangkaian pembuatan sebuah software karena sangat tidak mungkin mempublikasikan sebuah software tanpa melalui tahapan testing terlebih dahulu. Beberapa tahapan testing yang harus dilewati antara lain, kualitas kode, functional testing, interaction testing, performances testing, dan security testing.
- Deployment : Pada tahap ini aplikasi sudah tersedia pada user untuk digunakan, meski begitu tahapan inibisa jadi lebih rumit. Contohnya beberapa perusahaan mungkin perlu melakukan pembaharuan database kedalam aplikasi yang baru dikembangkan, sehingga memakan lebih banyak waktu dan tenaga. Tahap ini bukan untuk menunjukkan bahwa setiap tahapan SDLC sudah selesai namun berbagai kritik disampaikan oleh user juga harus didengarkan lagi, bila perlu akan ada penyesuaian lagi terhadap produk.
- Maintenance : Pada tahap ini sebenarnya aplikasi sudah selesai dan bisa digunakan dilapangan, namun tahapan maintenance masih dianggap penting sebab dalam tahapan ini pengguna bisa jadi menemukan bug yang tidak ditemukan selama pengujian sehingga kesalahan perlu diatasi, disini bisa jadi memunculkan siklus software development life cycle yang baru untuk memperbaiki bug, menentukan rencanaan pengembangan berulang atau tambahan fitur yang akan rilis mendatang.

### Model-model SDLC 
1. Waterfall Model
Model SDLC ini adalah salah satu model tertua dan tersingkat dalam penerapannya. Dalam sistem ini, setelah satu fase selesai, fase berikutnya harus segera dimulai.
2. Agile model
Agile model adalah model SDLC yang dapat memisahkan produk dengan proses dan waktu pengerjaannya secara cepat. Metodologi ini diyakini sangat efektif untuk keberhasilan penciptaan sebuah produk.
3. Iterative model
Metode SDLC ini adalah metode yang memiliki repetisi tinggi. Developer akan menciptakan produk dengan versi cepat dan pastinya murah.
4. V-Shaped model
V-shaped SDLC model adalah lanjutan dari Waterfall Model. Metode SDLC ini akan mencoba tiap fase dalam proses pengembangan suatu produk.
5. Big bang model
Model software development life cycle ini adalah model yang diklaim memiliki risiko tinggi saat dijalankan.
6. Spiral model
Metode ini merupakan metode yang paling fleksibel dan mirip dengan iterative model. Metode ini fokus pada repetisi dalam pengerjaannya.

### 2. Agile Testing Manifesto
Ada 5 kunci dalam melakukan testing manifesto
1. Testing is an activity not a phase
2. Prevent bugs rather than finding bugs
3. Don't be a checker, be a tester
4. Don't try to break the system, instead help build the best possible system
5. The whole team is responsible for quality, not just the tester


### 3. Testing Pyramid
Testing Pyramid adalah strategi yang dapat membantu tim development dan automation dalam membuat software testing yang berkualitas tinggi dan anda. Dapat mengurangi waktu yang dibutuhkan tim untuk mengidentifikasi apakah perubahan yang dilakukan dapat merusak sistem dengan menawarkan feedback secara langsung. Testing Pyramid yang beroperasi pada tiga tingkat dapat mengurangi jumlah waktu yang dihabiskan tim automation dalam mengeksekusi test case dengan mengkategorikan setiap fitur baru kedalam satu atau semua test. 
Ada tiga level dalam testing pyramid yaitu, level paling bawah : 
1. Unit test, merupakan pengujian perangkat lunak yang menguji setiap unit atau komponen dari sebuah perangkat lunak, unit testing dilakukan saat pengembangan atau saat menuliskan kode program dari developer. Komponen yg diuji yaitu : function, method, procedure, module, object.
2. Integration, adalah pengujian dari hasil penggabungan unit-unit yang ada didalam software.
3. UI, adalah yang paling dekat dengan interaksi pengguna pada aplikasi web maupun android/ios
Berdasarkan test pyramid kita dapat dengan mudah melihat beberapa hal penting seperti: 
- Semakin tinggi level semakin sedikit test yang harus kita lakukan
- Penulisan test setiap level berbeda tingkat levelnya
- Meskipun kita dapat menampilkan semua aplikasi dan koneksi dari ujung ke ujung untuk ditest kita tetap tidak dapat menguji semua tipe testing


