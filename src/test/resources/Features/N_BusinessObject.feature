#Author: karthick@kripya.com  yuvaraj@kripya.com
@Selenium @BusinessObject
Feature: Creation of Business Object


  Scenario Outline: User creates Business Object
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Enumeration value in Config_Setup "<EnumValue1>","<EnumValue2>","<EnumValue3>"
    Then User select Style from Business Object "Style"
    And User create New Attribute for Enum values "<AttributeName>","<AttributeType>","<DisplayName>"
    Then User Navigates to formDefinition
    And Select the Business Object Attributes
    Then User click on update cnfiguration

    Examples: 
      | EnumValue1             | EnumValue2             | EnumValue3     | AttributeName                              | AttributeType | DisplayName          |
      | Enum A,Enum A1,Enum A2 | Enum B,Enum B1,Enum B2 | Enum C,Enum C1 | Auto_String,Auto_Test,Enum_A,Enum_B,Enum_C | enum          | Tested by Automation |


  Scenario Outline: User Creates Style-Apparel BO
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User Create New Style in Season "<season>","<stylename>","<Enumvalue>"
    Then User Clicks NewStyle and verify created values in BusinessObject
    And User Clicks ApparelBO and manage Views
    Then User Verify that AutoString "<AutoString>"
    Then Logout from the Application

    Examples: 
      | season        | stylename  | Enumvalue | AutoString           |
      | winter season | Apparel-BO | Enum A1   | Tested by Automation |
