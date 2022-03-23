# Map Data Structure
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-	Map
-	SortedMap
-	NavigableMap
### Map
Map merupakan struktur data yang di Java yang dapat digunakan untuk menyimpan banyak data di dalamnya. Data-data yang tersimpan di dalam map diidentifikasi menggunakan Queue, dan setiap Queue akan memiliki datanya sendiri yang disebut dengan value jadi dengan bentuk yang seperti itu disebut juga dengan penyimpanan data berbasis Queue value.
- Method Map
Pada dasarnya method-method di map dapat digunakan untuk proses menambah menghapus mengubah dan juga untuk memeriksa isi dari map
- Implementasi Map
	1. HashMap
	HashMap merupakan implementasi dari map yang menggunakan algoritma struktur 	data hashtable
	2. WeakHashMap
	WeakHashMap masih menggunakan hashtable tetapi bedanya pada bagian 	WeakHashMap, queue itu dapat dihilangkan jika sudah tidak digunakan, jadi saat kita 	memanggil sistem .gc ini akan menyebabkan beberapa queue yang tidak digunakan lagi 	datanya akan hilang dari map
	3. IdentityHashMap
	IdentityHashMap masih menerapkan hashtable tetapi jika queue memiliki referensi 	pada memori yang berbeda maka akan dianggap sebagai data yang berbeda
	4. LinkedHashMap
	Pada LinkedHashMap di sini tidak ada perbedaan yang signifikan dengan HashMap biasa 	tetapi secara internal LinkedHashMap menerapkan LinkedList dan juga Hashtable 	sebagai struktur data di dalam mapnya
	5. ImmutableMap
	Dari namanya sendiri ini Immutable artinya tidak dapat diubah, jadi map dalam bentuk 	ini tidak dapat diubah bentuk isinya baik ditambah ataupun mengubah data yang sudah 	ada.
### SortedMap
SortedMap artinya map yang dapat diurutkan baik secara ascending maupun secara descending. Masing-masing penerapan dari SortedMap ini memiliki cara sortingnya sendiri-sendiri.
- Method SortedMap
Pada dasarnya serta map terdiri dari method yang digunakan untuk mengurutkan queue yang ada pada map tersebut. Selain itu method lainnya digunakan untuk mendapatkan queue berdasarkan urutan yang diinginkan bisa yang pertama bisa yang terakhir.
### Navigable Map
Navigable Map masih termasuk SortedMap tetapi dengan method-method untuk menavigasi yang lebih lengkap.
