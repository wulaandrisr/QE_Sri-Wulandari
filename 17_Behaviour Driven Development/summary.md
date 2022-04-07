# Behaviour Driven Development (BDD)
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-What is DBB
-What is Cucumber
-Demo BDD with Cucumber
### Behaviour Driven Development (BDD)
- BDD merupakan proses software development yang menerapkan penulisan test case sebelum developer menuliskan production code nya. Proses bdd sendiri berfokus pada komponen-komponen dalam sistem dan tase case ditulis dalam berbahasa pemrograman serupa dengan TDD, BDD juga menerapkan konsep test first namun dengan fokus yang berbeda. Dalan BDD test tim developer akan menuliskan berbagai scenario yang menjelaskan tentang BDD sistem dari perspektif pengguna.  Scenario dituliskan menggunakan format bahasa yang mudah dipahami oleh seluruh stakeholder dalam pengembangan sistem.
- BDD memiliki tujuan utama untuk meningkatkan komunikasi dan kolaborasi antara seluruh stakeholder, tim bisnis maupun technical yang terlibat dalam pengembangan sistem. Hal ini dapat membantu memastikan bahwa fitur fitur dalam sistem dengan baik seluruh anggota tim, komunikasi yang baik dapat menyatukan persepsi stakeholder yang berbeda-beda dalam suatu pemahaman dan ekspektasi yang sama serta fitur-fitur sistem dapat memenuhi kebutuhan pengguna dan menghasilkan bisnis value.
- Prinsip dasar dari BDD adalah mendeskripsi behavior dari sebuah sistem tanpa melibatkan penjelasan implementasinya secara rinci, terdapat pemisahan antara keduanya dalam pendekatan BDD seluruh stakeholder technical maupun non technical saling berkolaborasi untuk mendeskripsikan kebutuhan pengguna dan kebutuhan fungsional sistem yang dituliskan melalui feature file. Deskripsi yang ada pada feature file berperan sebagai test logic kemudian akan menjadi dasar sebagai quality assurance(QA). Dalam menuliskan teks script implementasi pengujian dan dasar baru bagi developer dalam menuliskan implementasi codenya untuk membangun system.
- BDD Format
Feature file dalam BDD dituliskan menggunakan bahasa Gherkin dengan format berbahasa Inggris yang mudah dipahami oleh semua orang.
1.User Story
User Story, untuk menjelaskan kebutuhan pengguna dan fungsionalitas sistem yang diharapkan
2.As a [X] I want [Y] So that [Z]
3.Scenario
Menuliskan skenario dalam feature file menggunakan Gherkin syntax berdasarkan users storynya. Mengimplementasikan test script dalam setiap file berdasarkan scenario.
4.Given When Then
-Given menjelaskan konteks dari scenario.
-When menjelaskan tindakan yang dilakukan oleh user.
-Then menjelaskan tindakan yang akan dilakukan oleh user.
- Gherkin BDD Languange
1. Meta: Search feature for users 
This feature is very important because it will allow users to filter products 
2. Narrative: As a user 
I want to searches, without spelling mistake, for a product name present in inventory So all the products with similar name should be displayed 
3. Scenario: Search laptop 
Given User is on the main page of www.myshopingsite.com When User searches for laptops Then search page should be updated with the lists of laptops
### What is Cucumber
	Cucumber adalah tools yang mendukung untuk melakukan serangkaian BDD test. Cucumber membaca semacam ketentuan yang akan dieksekusi dimana ditulis menggunakan teks biasa dan ketentuan tersebut memvalidasi bahwa sistem atau aplikasi melakukan apa yang ditulis dalam ketentuan tersebut, ketentuan tersebut terdiri dari beberapa scenario.
### BDD with Cucumber
- The Step Overview
1.Write Story
Gherkin Syntax (Given, When, Then)
2.Map Step to Java
Configure steps script and validation
3.Configure Stories
Combine stories and step
4.Run Stories
Intellij IDEA, maven
5.View Reports
Make a report using Serenity
- Preparation
1.Java 1.8
2.Mven 3.5.2
3.Intelij IDEA 2018
