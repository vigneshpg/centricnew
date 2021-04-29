#Author: karthick@kripya.com  yuvaraj@kripya.com
@Selenium @BOMStyle
Feature: Creation of BOMStyle


  Scenario Outline: User creates NewStyleBOM-Set1
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates NeStyleBOM  under Apparelcolorandsize "<BOMName>"
    And user creates BOM validation in manage-views
    And user validates Color under NewStyleBOM-placements
    And user creates NewOfMaterial
    And user select season availability for cotton jersey-copy
    Then Go to homepage
    When user creates NewFromMaterial "<BOMValue>"
    And user select Materialsection also draganddrop the created material
    And user select Apparel and fabric section
    And user creates Newofstyle and newfromstyle apparel section "<Style>","<Color>"
    Then user creates NewSpecial in fabric section "<MaterialNew>"
    And user creates and verify the common color in material section "<Commoncolor>"
    And user verfies copy color for Material section
    And user update unit cost "<unitcost>"
    And update unitcost for all in apparel section

    Examples: 
      | BOMName                | BOMValue         | Style        | Color      | MaterialNew     | Commoncolor   | unitcost  |
      | Apparel BOM Validation | Material section | New of style | Only Color | SpecialMaterial | BOM RED,EGRET | 3400 |

  
  Scenario Outline: User creates NewStyleBOM-Set2
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user edit color by selecting placements and colorways
    And user edit variation by color in material section
    Then user match color in material section
    And user edit Variation by size "<size>"
    Then user edit Variation by quantity for small and medium "<quantity>"
    Then user Reset variation by size
    And user validate BOM
    Then user Approves the ApparelBOMValidation and verify Action button is disabled
    Then user copy ApparelBOMValidation	"<BOMName>"
    And user Freezes the ApparelBOMValidation-Copy and verify Action button is disabled
    Then user Reopen the copied BOM
    And user created NewFromStyle in Apparelsection
    Then user verify the values refelected in multi level placements
    Then user add tracking changea and comments in manageviews
    Then Logout from the Application

    Examples: 
      | placement                                     | colorways                   | common qty      | common size | size         | quantity    | spec  | BOMName                       |
      | Sholuder - placement 100% Cotton/Rayon Jersey | Egret,Vanilla,Antique,Green | 150,200,300,350 |       14,16 | medium,large | 400 200 100 | 14,12 | Apparel BOM Validation copy |
