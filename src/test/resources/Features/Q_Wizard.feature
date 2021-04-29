
@Wizard
Feature: Creation of New Wizard
  
  Scenario Outline: User Create New style with wizard
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to style tab and create new style with name as wizard "<StyleName>"
    When Navigate to new from style
    And Create Move Style from within the style tab
    And Navigate to apparel color and size style add image
    And Navigate to new apparel wizard colorway verify data visible

    Examples: 
      | Style Name  				 | 
      | New Apparel - Wizard | 
      
