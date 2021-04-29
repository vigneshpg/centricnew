#Author: karthick@kripya.com
@Selenium @Shape
Feature: Shape creation and validation

  Scenario Outline: Shape creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates product group in size chart "<ProductGrp>","<Description>"
    And User update dimension,increments "<Increments>" and tolerance
    Then Go to homepage
    And User creates shape "Circle Shape","winter season" and update shape master "Object Shape Master"
    And User is performing copy,edit and delete action
    And User creates Security group "<SecurityGrp>" and update values under shape "MensJeans"
    And User creates shape sample "<Sample>","Supplier"
    And User is performing sample copy,edit and delete action
    And User Creates shape size chart for "Circle SC-Lock All","Circle SC-Lock Dimension","Circle SC-Lock Tolerance","Circle SC-Lock Values"
    Then Logout from the Application

    Examples: 
      | ProductGrp | Description | Increments       | SecurityGrp            | Sample              |
      | PG - 01    | Automation  | Pants Grade Rule | Security Group - Shape | Circle Shape Sample |
