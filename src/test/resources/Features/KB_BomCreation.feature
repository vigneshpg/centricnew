#yuvaraj@kripya.com
@Selenium @BOM 
Feature: BOMCreation

  @BomSection
  Scenario Outline: BOM Creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user creates NewBOMSection "<Bomstylesection>","<Stylesortvalue>","<filterName>"
    Then user Creates NewMaterialBomSection "<BomMaterialSection>","<Materialsortvalue>"

    Examples: 
      | Bomstylesection                                           | Stylesortvalue  | filterName | BomMaterialSection                        | Materialsortvalue |
      | Apparel section,fabric section,All section,Delete section | 10,12,100,50,15 | Material   | fabric section,All section,Delete section |          23,24,25 |

  @BomTemplate
  Scenario Outline: BOM Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user created NewBOMTemplate "<Subtype>","<TemplateName>","<createsection>","<EditComment>"
    Then Logout from the Application

    Examples: 
      | Subtype     | TemplateName         | createsection                     | EditComment     |
      | Apparel BOM | Apparel BOM Template | auto adhoc section,Delete section | automation test |
