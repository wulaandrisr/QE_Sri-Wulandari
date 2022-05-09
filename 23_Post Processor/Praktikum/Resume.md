#  Post Processors
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-Performance Test
-Post Processors
### Post Processors
1. What is Post Processors
Post Processor adalah bagian dari test plan yang merupakan sebuah aksi yang berjalan setelah proses dilakukan, proses ini sendiri adalah proses test request dalam sebuah alamat web. Proses yang dilakukan dalam post processors ini pada umumnya adalah untuk mengekstrak value yang didapatkan dari hasil dari mengakses sebuah alamat web, seperti data-data pada json, pada session atau pada bagian response yang lainnya.
2. JSON Path
- Digunakan untuk ekstrak isi dari json response
- Beberapa ekspresi yang umum digunakan :
a.$ = root element, maksudnya seluruh data json yang didapatkan itu adalah $.
b.. = child operator (object)
c.[] = child operator (array), berdasarkan indeksnya.
d... = recursive descent (langsung ke objek), misalnya terdapat objeck didalam array dan ketika kita ingin mengambil semua objek didalam array kitab isa menggunakan tanda .. tanpa menuliskan indeks dalam elemen array tersebut.
e.* = wildcard (all things)
f.[strat:end) array slice operator borrowed (memotong array dari indeks sekian sampai indeks sekian)
JMeter Post-Processors are at the heart of Performance Testing
