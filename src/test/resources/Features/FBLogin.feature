@Jenkins
Feature: Title of your feature
  
  Scenario: Login 
    Given User launches FB url
    When user enter username and password
    And user enter click on login button
    Then user should be navigated into home page
    
  Scenario Outline: Login 
    Given User launches FB url
    When user enter username and password "<usr>","<pass>"
    And user enter click on login button
    Then user should be navigated into home page  
    
    Examples:
    |usr|pass|
    |karthi|676544|
    |yuvraj|554456|
 
