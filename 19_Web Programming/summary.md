# Web Programing
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
- Front-end Development
- Analogi CSS
- Apa Itu Frontend Framework?
### Front-end Development
Hypertext Markup Language (HTML)
Cascading Style Sheets (CSS)
- FRONT-END
Frontend adalah sebuah bagiana dari website yang membuat tampilan yang menarik kepada user
- Hypertext Markup Language (HTML)
Adalah sebuah standar yang digunakn secara luas untuk menampilkan halaman web.
- Kegunaan HTML
	1. Membuat struktur dari halaman website.
	2. Mengatur tampilan dan isi dari halaman web.
	3. Membuat tabel dengan tag HTML table.
	4. Membuat form HTML.
	5. Membuat gambar dengan canvas.
	6. Mempublikasikan halaman website secara online.
- HTML Editors
	1. Notepad
	2. Visual Studio Code
	3. Sublime Text
	4. Notepad++
	5. Atom
- Dokumentasi HTML
	1. ! DOCTYPE html = Mendefinisikan dokumen ini sebagai HTML5
	2. html   = Elemen root dari halaman HTML
	3. head   = Berisi informasi meta tentang dokumen
	4. title    = Menentukan judul untuk dokumen
	5. body   = Berisi konten halaman yang terlihat
- Contoh Tag HTML
 Menggunakan tag div 
		
- Tag Heading & Paragraph HTML
Heading dibagi dari heading 1 sampai 6
- Styling pada Paragraph HTML
	1. strong membuat text menjadi bold 
	2. em membuat penekanan pada text menjadi italic 
	3. s membuat text dengan garis tercoret
	4. u membuat text dengan garis bawah
	5. br (line break, untuk membuat garis baru)
- Text Link HTML
- Text Image HTML
- List Html
Ada 2 jenis List dalam HTML :
1. Ordered List adalah list yang berurut.
2. unordered List adalah List Yang tak Berurut. 
Setiap list item pada Ordered List dan Unordered List dideklarasikan menggunakan 
- CSS (Cascading Style Sheets)
Dapat menghias halaman web (color, size, font, background, width, height, dll). Dapat mengatur posisi pada halaman web (float, align, display, position, dll).
- Tag Table HTML
	1. Membuat table pada HTML menggunakan tag table
	2. Setiap baris table dideklarasikan menggunakan tr
	3. Setiap kolom table dideklarasikan menggunakan td
	4. Untuk kolom pada table header menggunakan th
### Analogi CSS
- Menambahkan file CSS
3 cara menambahkan file CSS ke dalam HTML
	1. External CSS
	2. Internal CSS
Syntax ini dapat digunakan di dalam satu file HTML. Didefinisikan di dalam elemen 'style', didalam bagian 'head', atau di dalam bagian 'body'.
	3. Inline CSS
	- Syntax ini dapat digunakan untuk elemen tunggak pada HTML.
	- Diprioritaskan untuk menerapkan style yang unik.
- Syntax CSS
	1. h1 = Selector
	2. color(Property): pink(Value); = Declaration
	3. front-size(Property): 15px(Value); = Declaration
- CSS Selector
Pola yang digunakan untuk memilih element, yang ingin di styling.
Penanda HTML ke dalam CSS. Dapat menggunakan selector ID dan Class.
	1. ID = (#)
	- Setia
	- P elemen hanya dapat memiliki satu tag id
	- Dalam satu halaman tidak boleh ada dua penamaan id yang berbeda
	2. Class = (#)
	- Tag class dengan nama yang sama dapat dipakai berulang-ulang pada satu halaman.
	- Satu elemen boleh memiliki lebih dari satu Class yang berbeda-beda.
	- CSS Grouping
Beberapa selector dapat dikelompokkan dalam satu deklarasi style.
- CSS Font
Beberapa style font di css
CSS Fonts Properties
	1. Font = Menetapkan semua property font dalam satu deklarasi
	2. Font-family = Menentukan kelompok font teks
	3. Font-size = Menentukan ukuran font teks
	4. Font-weight = Menentukan ketebalan untuk font teks
	5. Font-style = Menentukan font teks menjadi miring
- CSS Margin & Padding
Membuat ruang disekitar element.
CS
	Margin : 25px 20px;
	Padding : 25px 40px;

- CSS Background
Beberapa style background di css.
	1. Background-color = Menetapkan warna background pada suatu elemen.
	2. Background-image = Menentukan gambat background pada suatu elemen.
	3. Background-repeat = Menentukan gambar background untuk diulang.
	4. Background-size = Menentukan ukuran gambar untuk background.
	5. Background-position = Mengatur posisi awal gambar background.
CSS Background
.content 
	Background-color : #f2f2f2;
	Background-image: url ( . . /img/background.jpg);
	Background-repeat: no-repeat;	
	Background-size: 100%;
	Background-position right top;

- CSS Link Event
Beberapa link event pada CSS
	1. CSS Link 
	- : hover = Kondisi style ketika mouse berada diatas elemen.
	- : active = Style ketika link “a” ditekan.
	- : visited = Style dimana elemen link “a” telah dikunjungi / diklik.
	2. CSS Transisi 
Transisi CSS dpat mengubah value property menjadi lebih halus dalam durasi yang ditentukan
- CSS Display
Menentukan bagaimana tampilan pada suatu elemen
	1. Block = Elemen block selalu dimulai pada baris baru. (dimulai dari kiri ke kanan)
	2. Inline-block = Elemen inline-block membutuhkan lebar sesuai yang diperlukan.
	3. None = Menyembunyikan elemen untuk tidak ditampilkan.
- CSS Table
Membuat style pada elemen table HTML
	1. Border = Menambahkan border pada table, th dan td
	2.Border-collapse = Membuat border menjadi single border
	3. :nth-child(even) = Membuat background stripe
### Apa Itu Frontend Framework?
Front End Framework adalah sekumpulan aturan code yang bis akita gunakan untuk mempermudah dalam membuat suatu tampilan website.
- Kenapa Bootstrap?
	1. Gratis
	2. Mudah dipelajari
	3. Cepat
	4. Mendukung responsive
- Class pada Bootstrap
	1. Container = container, container-fluid
	2. Row = row
	3. Column = col-md-12, col-lg-12, col-sm-6
	4. Button = btn-primary, btn-success, btn-danger
