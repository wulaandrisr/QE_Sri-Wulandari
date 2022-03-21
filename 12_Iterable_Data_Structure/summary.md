# Iterable Data Structure
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
1.Iterable Data Structure
-Iterable
-Collection
-List
-Set
-SortedSet
-Queue
-Deque	
### Iterable
Merupakan sekumpulan data atau struktur data yang dapat dilakukan literasi atau perulangan kepadanya.
- Java Interable
(Hierarchy Interface)
Interface Interable menjadi interface yang tertinggi dari struktur data yang lainnya seperti Collection, dan List.
Seluruh interface (Hierarchy Interface) merupakan struktur data yang dapat dilakukan perulangan terhadap masing-masing data yang disimpan.
- General-purpose
Interface: Set => HashSet => TreeSet => LinkedHashSet
Interface : List => ArrayList => LinkedList
Interface: => Deque => ArrayDeque => LinkedList
Disini artinya jika kita ingin menggunakan struktur data dari masing-masing implementation ini kita bisa juga menggunakan interface Set, List atau Deque sebagai tipe data dari variabel tempat kita menyimpan sekumpulan data tersebut.
- Method Iterable : forEach, iterator, spliterator
	- Iterator: merupakan kelas yang memanages literasi dari sebuah itereble. Iterator ini 		mengelola pada bagian mana kita sudah melakukan literasi pada data itereble, dan 	mengetahui data apa yg berikutnya dapat diambil dan bagaimana cara mengambilnya.
### Collection
Collection merupakan kumpulan dari objek atau data yang diletakkan dalam satu tempat yang sama dan ini dikenal sebagai Collection of objects atau sekumpulan object atau data.
- Java Collection 
Collection merupakan turunan dari interface iterable.
- Method Collection
Proses proses yang terjadi adalah proses penambahan, penghapusan data, memeriksa isi data dari data yang tersedia, dan method method dari itereble ada juga method yang digunakan untuk melihat ukuran dari collection. Collection: add, addAll, clear, contains, containsAll, equals, hashCode, isEmpty, iterator, parallelStream, remove, removeAll, removeIf, retainAll, size, spliterator, stream, toArray.
### List
List merupakan sebuah interface yang menyediakan cara untuk menyimpan datasecara linier, list ini merupakan turunan dari interface collection, list juga dapat menerima nilai yang sama sehingga jika kita menginputkan dua kali data yang bernilai sama pada list itu dapat dilakukan, urutan data pada list bergantung pada kapan data tersebut dimasukkan kedalam list jadi data yang pertama kali dimasukkan akan terdapat pada urutan pertama dan data berikutnya akan menyusul pada urutan-urutan yang selanjutnya.
- Method List
Pada dasarnya method method pada list digunakan untuk memanajemen data yang terdapat pada list seperti menambah, menghapus, mengecek, dan mencocokkan apakah sebuah list sama dengan list yang lainnya, dan method lain yg ada pada collection.
- Java List
Implementation
	1. AbstrackCollection
	2. AbstrackList : 
	3. ArrayList : menyediakan penyimpanan data yang dinamis, artinya tidak terikat dengan 	kapasitas data yang dapat disimpan oleh ArrayList tersebut, jadi data yang dapat 	disimpan oleh ArrayList itu bisa sebanyak apapun selama memori dari computer 	sanggup untuk menyimpan data tersebut.
	4. AbstrackSequantialList
	5. LinkedList : LinkedList merupakan struktur data yang menyimpan setiap 		elemennya terhubung satu sama lain, cara LinkedList menghubungkan satu elemen 	dengan elemen lainnya adalah dengan menyimpan alamat memori dari masing-masing 	elemen baik elemen setelah atau dari sebelumnya, jadi jika ada terdapat sebuah elemen 	di LinkedList pada elemen tersebut akan menyimpan alamat memori dari elemen yang 	sebelumnya lalu elemen yang sebelumnya juga akan menyimpan alamat memori dari 	elemen yang sebelumnya lagi.
- Time Cimplexity : Perbedaan antara ArrayList dan LinkedList dapat kita lihat pada saat mengambil data. 
- Immutable List : Merupakan merupakan bagian dari list tetapi immutable list tidak dapat diubah datanya.
- Stack : Menyimpan data secara linier tetapi dalam proses penambahan dan pengambilan datanya itu menggunakan LIFO (las-in-first-out)  artinya data yang baru dimasukkan maka akan akan dikeluarkan terlebih dahulu, ibaratkan sebuah tumpukan buku jika kita ingin mengambil sebuah buku maka kita harus mengambil buku yang paling atas. Memiliki beberapa method yaitu: pop (untuk mengambil data), push (untuk menambah data) dan peek (untuk mengintip data).
### Set
Set merupakan sebuah struktur data yang dapat menyimpan sekumpulan data secara linier sama seperti list tetapi set tidak dapat menerima data yang diduplikat, jadi jika set menerima data yang kembar maka menganggap data tersebut hanya berjumlah satu saja.
- Set (Hierarchy Interface & Implementation) 
	1. AbstrackCollection
	2. AbstrackSet
Implementation
1.Enum Set
2.Hash Set : Method-method dalam hash set secara garis besar dapat digunakan untuk mengelola seluruh data atau elemen yang terdapat dalam hash set, bagian yang menarik dalam hash set adalah hash set dikatakan sebagai struktur data yang menyediakan cara tercepat untuk proses pencarian data, untuk menggunakan hash set kita bisa menggunakan interface set sebagai tipe data lalu pada variabelnya kita bisa isi data new HashSet.
3.Tree Set
4.LinkedHastSet
- LinkedHastSet : Menyimpan insertion Order, artinya data yang diinput terlebih dahulu maka akan terdapat pada urutan yang paling depan. 
- Enum Set : Set jenis ini digunakan untuk menyimpan nilai enum, untuk urutannya di sini mengikuti urutan dari penulisan enum tersebut.
### SortedSet
Dapat mengelola urutan dari data
- Method SortedSet : Method-method dari SortedSet adalah comparator, first, headset, last, spliterator, subset, tailSet. Bagian yang paling paling berbeda kita bisa melihat adalah terdapat sebuah method yang bernama headset dan juga tailSet yang artinya kita bisa melihat bagian kepala dan juga bagian ekor dari elemen yang terdapat pada Set tersebut
- Implementasi Sorted Set
	1. TreeSet
	2. NavigableSet
### Queue
Mengimplementasi mekanisme first in first out artinya data yang lebih dulu dimasukkan akan lebih dulu diambil, sehingga queue ini bisa diibaratkan sebuah antrian siapa yang mengantri lebih dulu maka ia lah yang akan dilayani di lebih dahulu pula, untuk mengambil data pada queue di sini kita menggunakan deque, deque akan mengambil data yang paling depan dari sebuah queue lalu untuk menambahkan data kita bisa menggunakan enqueue, enqueue ini akan menambahkan data pada bagian belakang karena pada konsep antrian kita tidak dapat menyala antrian di tengah ataupun di depan sehingga data akan dimasukkan paling akhir.
### Deque
 Deque merupakan merupakan sebuah queue tetapi memiliki dua ujung.
- Deque Method
Jika kita melihat method yang terdapat dalam deque disini untuk menambahkan data kita bisa menggunakan addFirst atau addLast artinya kita bisa nambah di depan atau di belakang. Kemudian kita bisa getFirst atau getLast yaitu mengambil data pada bagian depan atau pada bagian belakang, kita bisa mengoperasikan data di belakang atau di belakang dari queue oleh karena itu kenapa queue jenis ini disebut double-ended queue karena dapat dikelola pada bagian depan dan pada bagian belakang
