# RESTful API Testing with Rest Assured
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-	API Automation Testing with Rest Assured
-	Rest Assured
### API Automation Testing with Rest Assured
•	Rest API 
API Concept And Fundamental
1.	API Consept
User (Mobile App)  > Request, Response < Waiter (API) > Request, Response < Kitchen (Application)
2.	- Fundamental API Integration
Mobile App > API Server > Ext Process > API Testing
- Fundamental API 
Test Process
Record, Define API Information > Parsing, Filter or Recording API Data and then extract > Reconstruction API calls, and sent them form a simulate client > Test Validation
3.	The Practical Test Pyramid
-	UI = (End To End) Test the interaction between The overall through the user Interface
-	Integration = Test the interactin between two modules or Sub-system Through API Contract
-	Component = Tests a specific modules or sub-system through the API
-	UNIT = Tests the smallest testable part of an application through methods
4.	BDD Framework With Cucumber
-	The Step Overview
1.	Write Story
Gherkin Syntax (Given, When, Than)
2.	Map Step to Java
Configure steps script and validation
3.	Configure Stories
Combine stories and step
4.	Run Stories
Intellij IDEA, maven
5.	View Reports
Make a report using Serenity
### Rest Assured
Features And Writing Test
- Rest Assured 
And The Futures
1.	HTTPS = Supports for HTTP methods
2.	Supports for BDD / Gherkin (Given, When, Then)
3.	Use of Hamcrest matches for checks (equalTo)
4.	User of Gpath for selecting element fron JSON response
- Preparation 
Make sure everything below are installed
1.	Java 1.8
2.	Maven 3.5.2
3.	Intelij IDEA 2018
- Writing The Test
Using Rest Assured
RestAssured
.given()… > Test Setup { [.contentType()], [.header()] }
.when()… > Test Action { [.get (url), .post(), .put(), .delete(), etc.], [log().all()]}
.then()… > Tast Verification { [.statusCode()], [.body(“data.nama”, equalTo(“Kentir”))] }
