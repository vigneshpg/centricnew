#Author: karthick@kripya.com

@Selenium
Feature: User Management Setup

@Roles @Jenkins
  Scenario Outline: Roles Creation
    Given User launches centric application
    And User click on setup icon and roles under user management
    When User creates new admin role "<Role>"
    And User select security roles in the action coloumn
    And User click on custom view and copy the default custom view and name the custom view as "<custom name>"
    And User apply the filter conditions as "<Attribute>","<Operator>","<Value>"
    And User set results display size as "<ResultSize>"
    Then User verify the displaying results size are more than 68
    And User select all results and click on save button

    Examples: 
      | Role       | custom name   | Attribute      | Operator | Value | ResultSize |
      | ADMIN ROLE | Automation CV | Security Roles | Matches  | Admin |        200 |

@Announcements @Jenkins
  Scenario Outline: Announcements Creation
    Given User launches centric application
    And User click on setup icon and announcement under user management
    When User creates new announcement and edit message "<Message>"
    And User effective to and companies
    Then User validating the announcement is displaying in home page or not

    Examples: 
      | Message                   |
      | Automation QA>PLMC 6.2 QA |
