#Author: karthick@kripya.com yuvaraj@kripya.com
@Selenium @ThemeColorRule
Feature: ThemeColorRule  validation


  Scenario Outline: Theme Color Rule Data Setup
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When Navigate to Theme – Color Matching type, Create Color Matching type with Delete option  "<ColorMatchingType>","11-0103 EGRET"
    And Click style tab and get the listed season name in the style tab
    And Create a New Season "<Season>"
    And Create three Material with Colored Material and Enable “Ok for Color Specification” – True and False "<Material>"
    And Create New Theme value with above created Season "<Season>","<SubType>","Color Rule"
    And Navigate into the Theme Master and Create Custom view in properties level
    And Select the "Contrast" value in Color Matching type
    And Navigate to above create Theme node value
    And Add two Theme Colorway values "Theme Blue","Theme Egret"
    And Go & Check the Theme – Material tab > Color Rule should be displayed after refreshing the page

    Examples: 
      | ColorMatchingType        | Season                  | SubType          | Material              |
      | Contrast,Tone-Tone,Dummy | Theme Color Rule Season | TM-Single Season | Linen,Cotton,Polyster |


  Scenario: Verify Generate Color Rule
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When Add above created two Material placements
    And Set Main Material for both Material Placements
    And Set a Color Specification common value for 1 placement
    And Set a Colored Material common value for 1 placement
    Then Now Click Generate Color Rule verify > It will Generate two Theme Color rule – Check the Status message status with condition
    And Navigate to Theme Placement Change the Colored Material value and Check again Generate Color Rule


  Scenario: Verify Apply Color Rules
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When Navigate to same Theme used above scenario
    And Change the Main Material Set to True for 1st placements and Set false for 2nd placements
    And Add Material Family from the Custom view in Theme – Placement table
    And Set Colored Material common value for both Material Placements
    And Set Theme Main Material Group value for both placements “Set – Group”
    And Set Material Family for 2nd placements
    And Click Action – Generate Color Rule
    And Navigate to Season – Theme – Color Rule, Click Action > Apply Color for Theme value and set option is displayed window and click save > Verify it is applied color rule theme correctly
    And Navigate to Theme – Placements tab >> Add “Applied Color Rule” in Custom view Color Matrix and check values are updated correctly
    And Change the Color, Material Family Color Rule name, State in season level and verify it updated on theme level


  Scenario: Verify Generate Color Rules from Availability
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Delete Existing ColorRule in ThemeRuleSeason
    And Approve Red Fmaily and Blule Family
    Then Navigate to Material and Set Main Material = True for 3 Materials i.e. created above scenario
    And Navigate to Style – Season, Create a Season Color Rule – Availability
    And Navigate to Season – Specification, Add 3 Materials
    Then Go to Season – Theme – Color Rule and Click Action - Generate Color rules from Availability
    Then Verify Color Rule generate from availability
    Then Logout from the Application
