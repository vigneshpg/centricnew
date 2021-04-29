#yuvaraj@kripya.com
@SizeChartEvaluation
Feature: Creation and evaluation of sizechart


  Scenario Outline: Sizechart creation setup
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates setup page in Increment "<Incrementvalue>"
    And User sets grainline in ProductGroup

    Examples: 
      | Incrementvalue                |
      | 34,30,45,55,67,45,34,32,56,66 |


  Scenario Outline: Sizechart creation setup
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User Navigates to apparelColorandsize under season
    Then User creates NewSizeChart "<sizechartvalue>"
    And User manageviews for Dimension and TDS
    And Select the Warp, weave, grainlinevalues "<warpShrinkagevalue>","<weaveShrinkagevalue>","<gralinevalue">
    Then user fills the pattern value for large, medium and small "<small>","<medium>","<large>"
    And User restore increments and restore tolerance
    And user enter Shrinkagevalue "<Shrinkagevalue>"
    Then user restoreshrinkage
    Then user Resetpattern

    Examples: 
      | sizechartvalue  | small       | medium      | large       | Shrinkagevalue | warpShrinkagevalue | weaveShrinkagevalue | gralinevalue                             |
      | Apparel SC - 01 | 45,46,32,45 | 45,56,70,56 | 34,34,24,34 |          15,20 |                  5 |                  10 | Cut With Grainline,Cut Against Grainline |

 

  Scenario Outline: Sizechart setup for changeproductgroup
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User create New Increment value
    And select Dimension from list "<Incrementvalue>"
    Then User create New product group value
    Then User enters value in newfromdimension "<Tolerancevalue>"

    Examples: 
      | Incrementvalue | Tolerancevalue |
      |  8,3,9,2,10,11 |          1,2,3 |

 
  
  Scenario Outline: changeproductgroup in Sizechart
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User Navigates to apparelColorandsize under season
    And user changeproductgroup under sizechart "<newProdgrp>"
    And user changeincrement under sizechart "<newProdgrp>"
    Then user change sizerange

    Examples: 
      | newProdgrp  |
      | NEW PG - 01 |
      
 
  Scenario Outline: Evaluate Sizechart for Apparel SC - 01
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User Navigates to apparelColorandsize under season
    And user selects the created sizechart uncheck size medium 
    Then Evalaute the Sizechart "<supplierrequest>","<sampledimension>"
    And verify values under Evaluation tab
    Then User pass the Evaluation as Expected value refelcted in page
    Then Logout from the Application

    Examples: 
      | supplierrequest | sampledimension  |
      | Apparel - SR    | Colors and Sizes |
