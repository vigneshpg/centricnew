#Author: karthick@kripya.com
@Selenium @StyleSample
Feature: Style Update validation


  Scenario Outline: Style ColorSpec creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update property table with "<Code>","<Description>","<SizeRange>"
    And User creates colorway "<ColorSpec>","<ColorwayA>","<ColorwayB>","<Description>"

    Examples: 
      | Code | Description | SizeRange | ColorSpec   | ColorwayA        | ColorwayB         |
      |  123 | Automation  | MensJeans | GLASS GREEN | Blue Color faded | Green Color faded |

  #-----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Style Sample Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates style sample combination "<StyleSample>","<Style>","<DimensionA>","<DimensionB>"

    Examples: 
      | StyleSample          | DimensionA | DimensionB       | Style         |
      | Jeans Sample - Style | Colors     | Colors and Sizes | Style - Proto |

  #-----------------------------------------------------------------------------------------------------------------
   
  Scenario Outline: Style Quality Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User update quality types
    Then Go to homepage
    And User creates Style quality "<TestrunA>","<TestRunB>","<TestGrpA>","<TestGrpB>","<SampleA>","<SampleB>","<User>","<Supplier>"
    And User Creates test run templates
    And User approve test run "<Code>","<Description>","<Comment>"

    Examples: 
      | TestrunA          | TestRunB          | TestGrpA            | TestGrpB        | SampleA | SampleB | User          | Supplier | Code | Description | Comment  |
      | Acid Test - Style | Wash Test - Style | Chemical Test Group | Wash Test Group | small   | EGRET   | Administrator | Supplier |  123 | Automation  | Test Run |

  #-----------------------------------------------------------------------------------------------------------------
  @defect
  Scenario Outline: Supplier Quote Creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Style sourcing price list
    And User Creates Style Supplier Quotes "<Supplier>","<SQ-Template>","<Set>"
    And User creates Style product blended cost "<Product>"

    Examples: 
      | Supplier | SQ-Template               | Set           | Product            |
      | Supplier | Supplier Quote - Template | SS - Supplier | Product Blend Cost |

  #-----------------------------------------------------------------------------------------------------------------
  @defect
  Scenario Outline: Supplier Request Creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Supplier Requests "<RequestTemplate>","<RequestName>"
    And User creates copy templates "<CopyTemp>"
    Then Go to homepage
    And User add new inspiration products "<InspA>","<InspB>"

    Examples: 
      | RequestTemplate | RequestName  | InspA            | InspB           | CopyTemp                    |
      | SRT - Style     | Apparel - SR | Auto Inspiration | New Inspiration | Copy Template - Inspiration |

  #---------------------------------------------------------------------------------------------------
  
  Scenario Outline: Supplier PO
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When Create PO Group and Supplier PO "<PoGroup>","<supplierpovalue1>","<supplierpovalue2>","<quotevalueBlue>","<quotevaluegreen>","<EditValue>","<dispoint>","<disvalue>","<allowancepoint>","<allowancevalue>"
    Then user creates shipment qc and set "<unitvalueb1>","<unitvalueg1>","<bshipvalue>","<qshipvalue>","<qcissue>","<selectset>","<gshipqty>","<bshipqty>"

    Examples: 
      | PoGroup        | supplierpovalue1    | supplierpovalue2     | EditValue  | quotevalueBlue         | quotevaluegreen         | dispoint | disvalue | allowancepoint | allowancevalue | unitvalueb1 | unitvalueg1 | bshipvalue | qshipvalue | qcissue  | selectset   | gshipqty | bshipqty |
      | order po group | PO-AP1321-Not color | PO-AP1123-colorbased | Automation | blue color faded-large | green color faded-large |        1 |       10 |              2 |             20 |           3 |           5 |         50 |        100 | qc issue | SS-Shipment |       60 |       30 |

  #---------------------------------------------------------------------------------------------------
  
  Scenario Outline: Customer PO
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates customerpo and issue "<povalue>","<B_baseprice>","<G_baseprice>","<B_orderqty>","<G_orderqty>","<dispnt>","<disvalue>","<allowanpct>","<allowvalue>","<commission>","<payment>"

    Examples: 
      | povalue             | B_baseprice | G_baseprice | B_orderqty | G_orderqty | dispnt | disvalue | allowanpct | allowvalue | commission | payment |
      | Target PO123#-color |         200 |         350 |         30 |         40 |      1 |      100 |          2 |         50 |          3 | cheque  |

  #---------------------------------------------------------------------------------------------------
  
  Scenario Outline: Style Sample Update
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user update delete style samples "<Sample>","<Quantity>"
    And User modify the sample names

    Examples: 
      | Sample | Quantity |
      | Sample |        5 |

  #---------------------------------------------------------------------------------------------------
    
  Scenario Outline: Delete Supplier Quotes & Samples
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates delete supplier quotes "<Delete>"
    And user creates supplier request "<Template>","<Request>"
    And User Selects quotes and modifying states
    And User select Supplier request samples

    Examples: 
      | Delete    | Template    | Request                             |
      | Delete SQ | SRT - Style | SR - Delete Quotes & Samples - True |

  #---------------------------------------------------------------------------------------------------
 @defect 
  Scenario: Validating quotes & samples
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user removing supplier under supplier request setup
    And user validating supplier request and samples displayed datas are correct or not
    Then Go to homepage
    And user validating supplier quotes displayed datas are correct or not
    Then Go to homepage
    And User validating style sample displayed datas are correct or not

  #---------------------------------------------------------------------------------------------------
  @defect   
  Scenario Outline: Copy Supplier Request
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creating new inspiration "<Inspiration>"
    And User copy supplier request "<SR>"

    Examples: 
      | Inspiration | SR                       |
      | Ins - 01    | Apparel SR - Inspiration |

  #---------------------------------------------------------------------------------------------------
  @defect    
  Scenario Outline: Issuing Supplier Request
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User issuing apparel SR
    Then Go to homepage
    And user creates issue supplier request "<Template>","<Request>"

    Examples: 
      | Template    | Request                |
      | SRT - Style | SR - with two products |

  #---------------------------------------------------------------------------------------------------
   @SS1
  Scenario Outline: Supplier Quotes Update
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user enters designated supplier "Supplier" and samples details
    Then Go to homepage
    And User Creates supplier request template without style "<Template>","<value>"
    Then Go to homepage
    And validating copy and delete action "<value>"
    And User Creates supplier request template with style "<Template>","<Stylevalue>","<Style>"
    Then Go to homepage
    And user validating style template updated correctly or not
    Then Go to homepage
    And User issuing without style template
    Then Logout from the Application

    Examples: 
      | Template    | value    | Stylevalue         | Style                    |
      | SRT - Style | Style SR | Style Home - Jeans | Apparel - Color and Size |
