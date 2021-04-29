@FoodSetupHeirarchy
Feature: Creating Food Setup

  Scenario Outline: Creation for Food
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to Food Setup and create food config "<Allergens>"
    And Navigate to food claims and Create claims "<Claims>"
    And Navigate to food ingredient create ingredients "<Ingredients>"
    Then Create food nutrients "<Nutrients>"
    Then Logout from the Application

    Examples: 
      | Allergens            | Claims                     | Ingredients           | Nutrients                         |
      | Eggs,Fish,Milk,Wheat | Sodium,Sugar,Fibre,Calcium | Pepper,Oil,Salt,Flour | Proteins,Vitamins,Minerals,Lipids |
