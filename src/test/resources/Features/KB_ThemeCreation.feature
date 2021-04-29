#Author: karthick@kripya.com
@Selenium @Theme
Feature: Theme creation and validation


  Scenario Outline: Theme creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates theme for single season "TM-Single Season","Wild Theme Master","Wild Theme","winter season"
    And User creates new theme from style "<StyleSubType>","<StyleTM>"
    And User creates new theme from material "<MaterialSubType>","<MaterialTM>"
    And User creates theme for All season "TM-All Season","All season TM","All season - Theme"
    And User is performing theme copy,edit and delete action
    And User creates Security group "<SecurityGrp>" and update values under Theme "TSG"
    And User creates color inside theme "Blue Theme","White Theme","Glass Theme"
    And User creates product alternative "Italy"
    #Then Logout from the Application
    

    Examples: 
      | StyleSubType                | StyleTM            | MaterialSubType    | MaterialTM            | SecurityGrp |
      | TM-Allow material variation | Style Theme Master | TM-Multiple Season | Material Theme Master | TSG -All    |

 #-----------------------------------------------------------------------------------------------------------------
  @ThemeMaterial
  Scenario Outline: Theme BOM creation and validation
   # Given User launches centric application
    And User Click on setup icon
    And User creates theme BOM type "<BOMSubType>","No Theme Lock"
    And User Click on setup icon
    Then User click on update cnfiguration
    Then Go to homepage
    When User creates new theme placement "<PlacementA>","Theme BOM Value"
    When User creates new theme placement from material
    When User creates new from theme placement
    When User creates select section and update color value "<PlacementB>","<ColorA>"
    When User creates adhoc section "<Adhoc>"
    And User is performing select,create,arrange and delete section activities under sections
    When User creates style BOM "<BOMSubType>","<BOM_Value>"
    And User creates and update style BOM placements "<BOMSubType>","<PlacementB>"
    And Validating under style placements
    Then Go to homepage
    When user updates existing style BOM "<ColorB>","<BOMSubType>" and validate style placements
    Then Go to homepage
    And User performing delete style BOM placements and validate style
    And User performing unlink and synch from theme validation
    Then Logout from the Application

    Examples: 
      | BOMSubType | PlacementA         | PlacementB     | ColorA | ColorB | BOM_Value                | Adhoc               |
      | Theme Lock | Shoulder - placement | Neck - placement | Blue   | Red    | Apparel BOM - Theme Lock | Theme Adhoc Section |
