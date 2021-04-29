#Author: karthick@kripya.com
@Selenium @MaterialSample 
Feature: Material Update validation


  Scenario Outline: Material ColorSpec creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update material property table with "<SizeRange>"
    And User creates material colorway "<ColorwayA>","<Description>"

    Examples: 
      | SizeRange | Description | ColorwayA     |
      | MensJeans | Automation  | Green CM - 01 |

  #-----------------------------------------------------------------------------------------------------------------

  Scenario Outline: Material Sample Creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates material sample combination "<MaterialSample>","<Material>","<DimensionA>","<DimensionB>","<Code>"

    Examples: 
      | Code | Material         | MaterialSample          | DimensionA | DimensionB              |
      |  123 | Material - Proto | Jeans Sample - Material | Colors     | Sample per active color |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Material Quality Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates Material quality "<TestrunA>","<TestRunB>","<TestGrpA>","<TestGrpB>","<SampleA>","<SampleB>","<User>","<Supplier>"
    And User approve material test run
    And User Creates material test run templates

    Examples: 
      | TestrunA             | TestRunB             | TestGrpA            | TestGrpB        | SampleA | SampleB | User          | Supplier |
      | Acid Test - Material | Wash Test - Material | Chemical Test Group | Wash Test Group | Green   | EGRET   | Administrator | Supplier |

  #-----------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Supplier Quotes & Samples
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates material supplier quotes
    And user creates material supplier request "<Template>","<Request>"
    When user removing supplier under supplier request setup
    And user validating supplier quotes & samples
    Then Go to homepage
    And user validating material supplier quotes
    And user issuing material supplier request

    Examples: 
      | Template       | Request              |
      | SRT - Material | SR - Material Cotton |

  #---------------------------------------------------------------------------------------------------
  
  Scenario Outline: Supplier Quotes Update
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user enters designated supplier "Supplier" and template details
    And User creates material product blended cost "<Product>"
    Then Logout from the Application

    Examples: 
      | Product        |
      | Material - PBC |
