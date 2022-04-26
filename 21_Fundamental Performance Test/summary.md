# Fundamental Performance Test
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-Performance Test
-Introduction to JMeter
-Post Processor
-Understanding JMeter Result
### Performance Test 
#### Apa Itu Tes Performance Test?  
- Teknik nonfunctional testing untuk menerntukan parameter sistem dalam hal responsif dan stabilitas dibawah berbagai beban (load) kerja.
- Performarice testing mengukur kualitas atribut dari sistem seperti stabilitas, ketahanan (reliability) dan penggunaan sumber daya.
#### Apa Yang Diukur Dari Performance Test?  
• Performa suatu aplikasi sampai suatu batas tertentu. 
• Bukan merupakan functional-test 
• Bisa dalam berbagai bentuk untuk memahami reabilitu, stability, dan availability pada enviroment-nya.  
contoh: 
  • Mengamati respons ketika menjalankan permintaan (request) dalam jumlah yang sangat banyak. 
   • Melihat suatu sistem berinteraksi dengan jumlah data yang cukup besar.
#### Mengapa Performance Test Jarang Dilakukan?  
Pada umumnya pengujian kinerja cukup untuk diterapkan dan dijaiankan, namun dapat dijadikan tolak ukur apakah sistem tersebut dapat mengakomodasi traffic yang ada.  Hal ini disebabkan karena pengetesannya memerlukan persiapan yang dimana beberapa kasus harus membuat lingkungan terpisah dari produksi agar tidak tercampurnya pengujian data dengan produksi data. Environment ini ada juga yang dibuat di server cloud yang biayanya bisa lebih besar dari environment production.
#### Apa Yang Perlu Diperhatikan Dari Tes Kinerja? 
Dalam melakukan performance test yang biasanya menjadi perhatian adalah throughput dan response data-nya.  Misal sistem yang sudah ditest mendapatkan hasil:
#### Contoh Kasus Performance Test
Sebuah sistem baru yang akan diluncurkan ke produksi, namun sebelum masuk ke produksi perlu dilakukan performance test untuk mengetahui throughput dan response time dari sistem tersebut.  Untuk informasi endpoint yang akan di test adalah:
1./login 
2./beli-pulsa 3.
3. /cek-out
#### Contoh Kasus Performance Test 
Langkah yang harus dilakukan: 
1.Membuat test plan 2. 
2.Membuat script test 3.
3.Melakukan performance test 4. 
4.Menganalisa hasil performance test
### Metode Performance Test
#### Membuat Test Plan 
Kenali yang dibutuhkan : 
• Endpoint yang akan ditest : 
-/login 
-/beli_pulsa 
-/cek_out
 • Kebutuhan masing - masing endpoint: 
-Username dan password untuk endpoint /login
-Produk, denom dan nomor untuk pengetesan endpoint /beli_pulsa 
-Metode  pembayaran yang dipilih untuk endpoint /cek out
#### Menentukan Metode Tes 
• Pilih berdasarkan sistem kondisi, apakah belum pernah atau sudah 
• Selalu awali dengan tes beban untuk mengetahui kondisi sistem 
• Pilih berdasarkan situasi yang akan dihadapi
#### Some Types of Performance Test
-Load test
-Endurance test
-Stress test
-Peak Test
1.Smoke Testing
Dilakukan untuk memverifikasi skrip yang sudah dibuat, apakah sistem tersebut dapat menangani beban minimal, tanpa masalah sama sekali.  Biasanya hanya 1-2 VUs.
2.Load Testing 
Load Testing adalah pengujian perilaku yang paling sederhana yang dilakukan untuk memahami sistem dalam keadaan beban tertentu.  Hasil dari load test digunakan untuk mengukur kepentingan bisnis saat transaksi kritis dengan memantau dampak terhadap database, server aplikasi, atau pendukung lainnya.  Sederhananya Load Testing menentukan kelakuan sistem pada saat kondisi normal dan puncak Idealnya, kita mengetahui jumlah traffic yang ada di prod sebagai nilai uji beban di load test.  Bagaimana jika sistem belum pernah masuk ke produksi dan tidak diketahui idealnya?
#### Tabel Tier 
Table Tier ini dapat dijadikan patokan ideal suatu sistem baru yang belum pernah masuk ke produksi.
1.Tier 1 =  Response Time < 220 ms. Threads 95% - 100% from target. Notes (10% only, very good).
2.Tier 2 =  Response Time 220 - 324 ms. Threads 85% - 94% from target. Notes (20% only, good).
3.Tier 3 =  Response Time 324 - 912 ms. Threads 65% - 84% from target. Notes (average, mostly 615 ms).
4.Tier 4 =  Response Time 912 - 1500 ms. Threads 50% - 64% from target. Notes (bad, mostly 1,1 sec)
5.Tier 4 =  Response Time > 1500 ms. Threads Under 50% from target. Notes (worst, mostly more than 1,5 sec)
1.Stress Testing
 Metode ini untuk dilakukan untuk mengamati pengamatan dan kestabilan sistem pada saat kondisi ekstrem Dilakukan bertahap menuju beban normal, puncak, dan melampauinya, lalu turun untuk melihat proses pemulihan (recovery).
2.Spike Testing 
Seperti stress test, namun naik langsung menuju puncak dilakukan dalam waktu singkat.  Jika stress test memberikan waktu untuk scale-out, disini tidoak.  Salah satu contoh adalah pada saat flash sale di suatu e-commerce, dimana jumlah pengunjung yang langsung memuncak saat mengakses halaman flash sale.
3.Soak Testing Untuk mengetahui reliabilitas ketika dalam tekanan di bawah puncak dalam jangka panjang (>=1 jam).  Dapat mengetahui apakah terdapat bug pado race condition, memory leaks, db connection dsb.  Tips: metode ini bisa dilakukan pada jam-jam sepi tidak ada transaksi pada sistem jika test dilakukan di produksi.
#### Beberapa istilah penting dalam performance test 
1.System Under Test (SUT): Sebutan unituk sistem yang sedang dilakukan test.
2.Load Generator: Sebutan untuk server yang digunakan untuk memtbuat request.
3.Throughput: Satuan kerja dalam satuan waktu. Misalnya Request per second (RPS) dan Request per minute (RPM)
4.Performance  Threshold: Target maksimal nilai yang dipertoiehkan, misalnya response time 2 detik, Max CPU usage 70% dan sebagainya Kondisi dmana SU1 atau l oad Generator sudah dalam kondisi maksiniumi dalam merespon atau mengenerate 
5.Saluration: Kondisi dimana SUT atau Load Generator sudah dalam kondisi maksimum dalam merespon atau mengenerate.
6.Virtual Users: Simulasi cari users yang melakukan pengujian, dapat melakukan satu atau lebih requests dalam satu  iterasi.
7.Respons Time: Lama waktu, pengirim request hingga menerima response
#### Apa itu tes volume?  Apakah sama dengan uji beban?  
Volume test adalah salah satu non-functional test yang menguji ketahanan suatu sistem ketika diberi database yang banyak.  Dikenal juga dengan istilah tes banjir.  Berbeda dengan uji beban yang menguji ketahanan secara umum, uji volume berfokus pada sistem databasenya saja.
