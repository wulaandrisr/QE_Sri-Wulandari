# REST API Testing
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
1.	Basic of API Testing
-	API & REST API
-	Testing API
-	Advantages & Challenge
### API & REST API
1.	Pengertiang API dan Cara Kerjanya
-	API aslah singkatan untuk “Application Programming Interface”
-	API memungkinkan komunikasi dan pertukaran data antara 2 atau lebih software/system yang terpisah.
2.	Rest API
-	REST singkatan dari “Representational State Transfer”
-	HTTP Method
•	Resource = URL
•	GET = Membaca data
•	PUT = Membuat atau mengganti data
•	POST = Membuat data baru
•	DELETE = Menghapus data yang ada
3.	Rest API Component
•	Method 
•	URL (Base URL + Path)
•	Header
•	Body
4.	HTTP Response Code
•	200 = OK
•	201 = Created
•	400 = Bad Request
•	401 = Unauthorized
•	404 = Not Found
•	405 = Method not allowed
•	500 = Internal server error
5.	Rest API Inputs
•	GET = Method – GET, URL, Custom – Header
•	POST = Method – POST, URL, Custom – Header, Input JSON
•	PUT = Method – PUT, URL, Custom – Header, Input JSON
•	DELETE = Method – DELETE, URL, Custom – Header
### API TESTING
1.	Approach of API Testing
-	Mengerti fungsi dari API.
-	Dapat mengaplikasikan Teknik testing.
-	Input parameter untuk API perlu direncanakan dan ditentukan sebelumnya.
-	Jalankan test case dan bandingkan antara hasil yang diharapkan dengan hasil yang didapatkan.
2.	What’s API Testing
-	API test sangat berbeda dengan GUI.
-	Mengirim request dan mendapatkan responsenya.
-	Memverifikasi response yang benar dan error handling.
3.	Kind of API Testing
-	Functionality
-	Load Test
-	Security
4.	API Testing Tools
-	Postman
-	JMeter
-	Frisby.js
-	Rest-assured
5.	Difference between API Test & Unit Test
-	Unit Test
•	Dilakukan oleh Developer
•	Fungsi-fungsi terpisah
•	Developer bisa mengakses source code
•	Hanya dasar functionality yang di test
•	Scapenya terbatas
•	Biasanya dilakukan sebelum build
-	API Test
•	Tester perform it
•	End to End
•	Tisak bisa mengakses source code
•	Hanya fungsi API saja
•	Semua functional issue
•	Scapenya lebih luas
•	Dilakukan setelah build
6.	API Testing Process
-	Specification Rewiew
-	Specification Development
-	Framework Development
-	Test Case Development
-	Execution & Report
7.	Test Cases for API Testing
-	Mendapatkan balikan (response) yang sesuai dengan inputan 
-	Apakah memberikan balikan atau tidak
-	Apakah menganggu fitur yang lain atau tidak
-	Update struktur data
-	Memodifikasi data yang ada
8.	Best Practices of API Testing
-	Kelompokkan test case kedalam beberapa kategori.
-	Beri judul yang sesui pada setiap test.
-	Harus berhati-hati ketika melakukan test yang berhubungan dengan menghapus sesuatu.
-	Ketika membuat test case harus diperkirakan juga segala kombinasi input pada API.
9.	Type of Output of an API
-	Bisa berbentuk apa saja, tapi pada umumnya JSON dan XML.
-	Status balikan (response) apakah Passed atau Fail.
-	Memanggil fungsi API lain.
10.	Common Type of Test in API Testing
-	Memverifikasi apakah kita memdapatkan respon dari API.
-	Memverifikasi apakah hasil input/request sudah sesuai atau belum.
-	Memverifikasi apakah data yang kita input/update sudah benar-benar berubah atau bertambah.
-	Memverifikasi waktu response yang diberikan
11.	 Type of Bug that API testing Detects
-	Gagal melakukan error handling pada keadaan tertentu.
-	Kesulitan untuk terhubung dan mendapat respon API.
-	Isu keamanan.
-	Performance Issues.
-	Error atau warning yang tidak tepat.
-	Struktur dari data respon tidak benar (JSON & XML) 
### Advantages & Challenge of API Testing
1.	Advantages  of API Testing
-	Efisiensi waktu.
-	Bahasa yang independent.
-	Mengurangi biaya testing.
-	Mengurangi resiko.
2.	Challenge of API Testing
-	Kombinasi parameter, pemilihan parameter.
-	Tidak ada GUI (Graphical User Interface).
-	Kita harus mengetahui terlebih dahulu parameter.
-	Perlu juga mengetest error handling dari setiap API.
3.	API Testing Tools
-	Postman
-	Frisby.js
-	Katalon
