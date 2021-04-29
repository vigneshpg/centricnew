#Author: karthick@kripya.com
@Selenium @seasonCreation 
Feature: Creation of Season Hierarchy

  Scenario Outline: User creates New season for a product
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Click style tab and get the listed season name in the style tab
    When User create New season with mandatory deatails for season creation "<StyleA>","<ScodeA>","<SdescriptionA>","<StyleB>","<ScodeB>","<SdescriptionB>"
    And User performing delete action
    And User performing edit action on season
    Then Click New Brand
    And Create Brand by providing valid and mandatory data "<Brand>","<Bcode>","<Bdescription>"
    Then Save the New Brand which was created
    Then Click New department by providing valid data  "<Dept>","<Dcode>","<Ddescription>"
    Then Save the New department which was created
    Then Click New collection
    And Create collection by providing valida and mandatory details "<Collection>","<Ccode>","<Cdesription>"
    Then Save the collection which was created
    Then Click New style
    And Create Style followed by its style Type "<StyleTypeA>","<StyleTypeB>","<StyleTypeC>","<StyleTypeD>"
    Then Logout from the Application

    Examples:
      | StyleA        | ScodeA     | SdescriptionA | StyleB        | ScodeB     | SdescriptionB | Brand | Bcode      | Bdescription | Dept | Dcode    | Ddescription | Collection | Ccode     | Cdesription | StyleTypeA               | StyleTypeB               | StyleTypeC          | StyleTypeD                      |
      | summer season | 123 summer | Automation    | winter season | 123 winter | Automation    | Denim | Denim Code | Automation   | Mens | 123 Mens | Automation   | Jeans      | 123 jeans | Automation  | Apparel - Color and Size | Accessories - Only Color | Apparel - Only Size | Accessories - No color and Size |
