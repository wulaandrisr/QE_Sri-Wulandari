# Object Oriented Programming
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-	Object Oriented Programming
1.	Class
2.	Object : Declaration, Intantiation, Initialization
3.	Atribut
4.	Method :  Variable,  Acces Modifier 
### Object Oriented Programming
Object Oriented Programming (OOP) merupakan suatu metode pemrograman yang berorientasi kepada objek. Merupakan sebuah paradigma atau Teknik pemrograman yang berorientasi kepada objek Pada OOP variabel dan fungsi yang  dibungkus ke dalam objek ataupun class. Keduanya dapat saling berinteraksi sehingga membentuk sebuah program. 
Mengapa Harus OOP? Seperti yang kamu ketahui sebelumnya, programmer harus mampu meminimalisir program dan membuatnya tertata rapi. Selain itu juga untuk mempercepat pembuatan aplikasi
#### Class 
Class bertugas untuk mengumpulkan prosedur/fungsi dan variabel dalam satu tempat. Class merupakan blueprint dari sebuah objek atau cetakan untuk membuat objek. Class akan merepresentasikan objek yang mau dibuat. Jadi dalam membuat nama kelas harus disesuaikan dengan objek yang akan dibuat. Penulisan nama class memiliki aturan. Yakni dengan format PascalCase. Penulisannya diiawali dengan huruf kapital. Jika nama variabel tersusun dari dua kata atau lebih maka tidak perlu diberi spasi di antaranya dan diawali dengan huruf kapital pula. Misal: class GetMethod, class Car. Class berisi dari beberapa kumpulan definisi variabel dan fungsi yang menggambarkan sebuah objek. 
#### Object
Sedangkan object adalah sebuah variabel instance yang merupakan wujud dari class. Instance merupakan wujud dari sebuah kelas. Sebuah objek digambarkan dengan variable dan method.
#### Atribut
Atribut merupakan bagian dari sebuah kelas yang masih berhubungan erat dari kelas tersebut. Atribut bisa juga disebut sebagai properti atau properties dari sebuah class. Contohnya ketika kamu punya sebuah class Car, maka kamu dapat menambahkan atribut seperti kecepatan , spead, tire dsb. Penggunaan atribut berlaku dari kurung kurawal awal ({) sampai dengan sebelum kurung kurawal akhir (}). Ini dinamakan scope. Untuk penulisannya menggunakan format lowerCamelCase. Jadi untuk kata pertama diawali dengan huruf kecil, sedangkan kata selanjutnya diawali dengan huruf kapital. Contohnya: listCar, listGetMethod dll.
#### Method
Method berperan menjelaskan bagaimana suatu atribut beraksi. Peran yang dimaksud berupa tingkah laku (behavior) yang dapat digambarkan oleh suatu method. Misal class Manusia. Manusia tentu memiliki method berupa tingkah laku, seperti berpikir, berjalan, berbicara, makan dll. Maka tentunya method dapat disesuaikan dengan program yang dibuat.
#### Inheritance
Inheritance adalah hubungan antara dua objek atau lebih, dimana terdapat sebuah objek utama yang mewariskan atribut maupun method yang dimilikinya kepada objek yang lainnya baik itu sebagaian ataupun keseluruhan. Contohnya seekor anak kucing berjenis mamalia mewariskan sifat dan juga bentuk orang tuanya, seperti: bulu, mata, telinga, bahkan suaranya.
Ada 3 Macam Modifier dalam Java :
- Secara umum ada 3 macam modifier yang digunakan dalam Java: public, private, dan protected.
1.	Public
Modifier public akan membuat member dan class bisa di akses dari mana saja.
2.	Private
Modifier private akan membuat member hanya bisa diakses oleh dari dalam class itu sendiri.
Perlu diingat: 
Modifier private tidak bisa diberikan kepada class, enum, dan interface. Modifier private hanya bisa diberikan kepada member class.
3.	Protected
Modifier protected akan membuat member dan class hanya bisa diakses dari:
-	Class itu sendiri;
-	Sub class atau class anak;
-	Package (class yang berada satu package dengannya).
Modifier protected juga hanya boleh digunakan pada member saja.
