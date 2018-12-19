Project Title:
This project is based on the problem given by the recruiter. This solution for the problem was accoomplished by using html,Java,Selenium,Cucumber,Page Object Model and Maven.

I made a mock webpage of myself by using html and have used the values for the objectives purposes. I have used Java with Selenium and cucumber to solve objective directly from the .html which I created. This project will launch the browser(chrome) and start solving the objects directly from the screen by using locators(<tagName><id><ClassName>).

Structure:

This project is created by using Maven project.
1. Created a feature file which whill have features,scenarios and steps. 
2. Step definition file with the code to support feature file. 
3. Test Runner Class
4. Page class with all the utils(Note: I have my own library which I can use for framework)
5. Driver Loader class to initialize the driver


Getting Started with Prerequisites:

Download Java, and IDE (Eclipse Oxygen)
Create a Maven Project as its coming inbuild with the IDE
Create A Maven Project
Go to google and type maven repository and get the necessary dependencies and place it inside the <dependencies> </dependencies> tags in POM.XML

Dependencies:

Junit
Cucumber-Junit
Selenium
Cucumber -Java


Running the tests:
Import the project and Right click on Test Runner and run the test in Junit

Break down into end to end tests:
The Test Runner file has the location of both feature file and step definition file. It checks the feature file first as it will be first then will use the content mentioned after the Gherkin keywords and matches with the method name in the Step Definition file. Every step definition will have a Gherkin Keywords annotations (@Given,@When,@Then,@And). The code step deinition files extends the ProblemDomain file which has the utils and utilize the methods which are necesary and few methods were written directly. The first Test case is to initialize the driver and launch the browser and url then the test will move to objectives. So the step definition file will have the methods from the driver loader class also with the help of using constructor. 


Authors
Jamaluddin A Mohammed



Acknowledgments:

Approach 1 - Built with JAVA,Selenium,PageObjectModel,Maven,Cucumber:

Page Object Model can be only done by using Selenium. And for selenium I have to have a web application so I created a mock page using html and accomplished the result. I am attaching the .html file too which I used while coding.


Approach 2  - Built with JAVA,PageObjectModel(mock design),Maven,Cucumber -
 
However, if this was suppose to be done in only Java it would be just few basic Java code while using the same design pattern and my assumption is that would be too generic and easy. But still I am adding the result which I got from just Java without Selenium.

Result:
