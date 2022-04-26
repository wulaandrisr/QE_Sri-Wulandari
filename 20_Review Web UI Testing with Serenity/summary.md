# Review Web UI Testing with Serenity
## Resume
Point dari materi yang kami pelajari dalam section ini adalah 
-Web Testing using Serenity BDD
1.Introduction Serenity BDD
2.BDD Framework With Cucumber
3.Practice Scenario
4.Digging Deeper

### Introduction Serenity BDD
1.Architecture Serenity BDD
Serenity is open source BDD Framework that helps making write well-structured and maintainable automated acceptance test.  
Serenity architecture consists of Requirements, Tests, Steps, Pages, and Reports.
2.Define Requirements 
When using Serenity, you start with the requirements you need to implement. 
These are often expressed as user "stories" with acceptance criteria that help clarify requirements. 
 It is these "stories" that Serenity automate.
3.Automate Acceptance Criteria
Next, describe the acceptance criteria in high-level business terms.  
Record these acceptance criteria using either a BDD tool such as Cucumber with the form "feature", so that Serenity can run them.
4.Implement the Test 
Implement the acceptance criteria into a code, so that they can run against the actual application. 
 Under the hood, tests are broken down into nested steps for better readability and easier maintenance
5.Report on Test Result 
Serenity provides detailed reports on the test results and execution, including:
A narrative for each test
Screenshots for each step in the test 
Test results including execution: times and error messages if a test failed
### BDD Framework With Cucumber
-The Step Overview
1.Write Story
Gherkin Syntax (Given, When, Then)
2.Configure Stories
Combine stories and step
3.Browser Interaction 
Map steps to browser manipulation
4.Run Stories
Intellij IDEA, maven
5.View Reports
6.Make a report using Serenity
-Preparation
1.Maven
2.Homebrew
3.Chrome
4.Intellij IDEA
-Writing the Test
Serenity Cucumber (using Serenity Cucumber)
1.Create File Stories > Define Test Scenario
2.Craete File Test Class > Automate Stories
3.Create File Test Steps > Define Scenario Steps
4.Create File Page Objects > Interact With Browser
### Practice Scenario
Scenario Login Success in Facebook
-Write Test Story 
• Create story file in test resource root directory 
• Feature consist of 3 parts: Feature, Scenario, and Gherkin Syntax scenario (Given, When, Then) 
• Feature syntax should be like in the following picture
-Create Test Class
• Create test class in package test/java
• Each given, when and then in file story should be represented only in 1 function
• Function annotated with corresponding gherkin syntax
-Create Test Steps 
• Create steps class that extends class ScenarioSteps 
• Class name should ending with "Steps for ease maintainability 
• In this class, steps should call function that located in PageObject class
-Create Page Object
• Create class that extends PageObject 
• This class consist of function that locating and operating website element 
• Theres no restriction on how to locate the element (id, xpath, class, etc)
-Run the test 
• Run the test with commoand mvn verify 
• It should print any logging in console and any error if present
• After test run, report will automatically generated and located by default in path targetisiteiserenity
### Digging Deeper
Serenity with Cucumber
-Serenity Properties 
• Serenity support many properties to customize the way test is run 
• Webdriver.driver define which browser will be used to test 
• Ignore.failures.in.stories set the serenity to continue testing the next scenario even curent Scenario is failed
-Parameter Injection
• Text in study can be used as variable, using bracket {} in annotation string in test class
	• Example, “billy@alterra.com“ is used as variable named email_user
-Meta Filtering
• In order to help manage story scenario we con use tog" to the corresponding feature or scenario 
• To run test with specific tog, use command like this
Mvn verify -Dtags=”@User”
-Parameterized Scenario
• In story.  scenario can be parameterised with configured value
• Parameterised scenario is same with same multiple scenario but different value
