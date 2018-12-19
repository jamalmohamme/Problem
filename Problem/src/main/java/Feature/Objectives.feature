Feature:  Objectives 

Scenario: Initialize the Chrome driver
Given Go to the path where driver is located
When  once the driver is initialzed accss the url "problem.html"
Then  Maximize the window and jump to the objectives

Scenario: Objective - Verifying the right count of the values provided in the problem
Given Verify if there are values on the screen
Then print out the result with right count of  values


Scenario: Objective - Verifying the values provided in the problem are greate than 0
Given verify if there are integers on the screen
Then output the result with the value for the true condition



Scenario: Objective - Verifying if the values are formatted as currencies
Given Getting the regex for currency validating
Then Print the result if the condition matches


Scenario: Need to verify the total balance matches the sum of the values
Given locating the elements
Then output the result 