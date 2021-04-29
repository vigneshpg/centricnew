#Author: karthick@kripya.com
@Selenium @Quality 
Feature: Quality validation

  Scenario Outline: Quality setup creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates test spec under quality "<TestSpecA>","<TestSpecB>","<Code>","<Description>"
    And User creates test group "<TestSpecA>","<TestSpecC>","<Code>","<Description>"
    And User creates test templates "<TestSpecA>","<TestSpecB>","<TestSpecC>","<User>","<Supplier>"
    Then Logout from the Application

    Examples: 
      | TestSpecA     | TestSpecB    | TestSpecC | Code             | Description |User|Supplier|
      | Chemical Test | Ironing Test | Wash Test | 123 - Automation | Automation  |Administrator|Supplier|
