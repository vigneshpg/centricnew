#Author: karthick@kripya.com
@Selenium @Specificationsize
Feature: Specification validation

  @Specification
  Scenario Outline: Specification Hierarchy creation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User Click on specification and creates hierarchy "<Brand>","<Collection>","<Department>","<Code>","<Description>"
    And User creates style template "<Style>","<StyleType>"

    Examples: 
      | Brand         | Collection        | Department        | Code             | Description | Style              | StyleType                |
      | Denim - Brand | Mens - collection | Mens - Department | 123 - Automation | Automation  | Apparel - Template | Apparel - Color and Size |

  #-------------------------------------------------------------------------------------------------------------
  @Specification
  Scenario: Specification Classifier creation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates Classifier "Classifier"
    Then Logout from the Application

  #-------------------------------------------------------------------------------------------------------------
  @2DSizes @Specification
  Scenario Outline: User create 2d sizes and validation
    Given User launches centric application
    When Setup Enum for size dimensions in setup page "<Enumeration>"
    Then Create the Enum value for the sizes "<Enumeration Value>","<Description>","<EnumerationValue2>","<Description2>"
    And User navigates to type config
    When user creates the size spec data for size label module "<SizeSpec>"
    And Update the Enum through partial configuration
    Then validate and accept the alert
    Then Go to homepage
    And verify user screen
    When User creates multiple sizes with different type for TwoDSizes "<Size>","<Size1>","<Size2>","<Size3>","<Size4>","<Size5>","<SortOrder>","<SortOrder1>","<SortOrder2>","<SortOrder3>","<SortOrder4>","<SortOrder5>"
    Then Create duplicate Sizes and verify the error message "<DuplicateSize>","<DupSortOrder>"
    And Create twoD sizes with different type of dimension "<CompSize>","<CompSize2>","<CompSize3>","<CompSize4>","<CompSize5>","<CompSize6>","<DimensionType>","<DimensionType2>","<DimensionType3>","<DimensionType4>","<DimensionType5>","<DimensionType6>","<CompSizeSO1>","<CompSizeSO2>","<CompSizeSO3>","<CompSizeSO4>","<CompSizeSO5>","<CompSizeSO6>"
    When User selects the created sizes for TwoD sizes "<2DimensionSize1>","<2DimensionSize2>","<2DimensionSize3>","<2DimensionSize4>","<2DimensionSize5>","<2DimensionSize6>","<2DimensionSize7>","<2DimensionSize8>","<2DimensionSize9>","<CompSize>","<CompSize2>","<CompSize3>","<CompSize4>","<CompSize5>","<CompSize6>"
    And Create size range for the sizes "<SizeRange>","<Description>","<EnumerationValue2>","<Enumeration Value>"
    Then User selects the sizes for the created size range "<2DimensionSize1>","<2DimensionSize2>","<2DimensionSize3>","<2DimensionSize4>","<2DimensionSize5>","<2DimensionSize6>","<2DimensionSize7>","<2DimensionSize8>","<2DimensionSize9>","<SizeRange>"
    And User creates simple size range for validation "<SimpleSizeName1>","<SimpleSizeName2>","<CompSizeName>"
    Then Merging of composite size type "<Size>","<Size1>","<Size2>","<Size3>","<Size4>","<Size5>","<SimpleSizeName1>","<SimpleSizeName2>"
    And Selecting the sub ranges for composite sizes "<SimpleSizeName1>","<SimpleSizeName2>"
    Then Validate the options like copy and delete for size Range "<CopySizeName>","<CompSizeName>"
    And Create a Size Map and validate the status "<SizeRange>","<CompSizeName>","<SizeMapName>","<Size>"
    Then Logout from the Application

    Examples: 
      | Enumeration       | Enumeration Value | Description | EnumerationValue2 | Description2 | Size  | SortOrder | Size1  | SortOrder1 | Size2 | SortOrder2 | Size3 | SortOrder3 | Size4 | SortOrder4 | Size5 | SortOrder5 | DuplicateSize | DupSortOrder | CompSize | DimensionType | CompSize2 | DimensionType2 | CompSize3 | DimensionType3 | CompSize4 | DimensionType4 | CompSize5 | DimensionType5 | CompSize6 | DimensionType6 | CompSizeSO1 | CompSizeSO2 | CompSizeSO3 | CompSizeSO4 | CompSizeSO5 | CompSizeSO6 | 2DimensionSize1 | 2DimensionSize2 | 2DimensionSize3 | 2DimensionSize4 | 2DimensionSize5 | 2DimensionSize6 | 2DimensionSize7 | 2DimensionSize8 | 2DimensionSize9 | SizeRange   | SimpleSizeName1 | SimpleSizeName2 | CompSizeName  | CopySizeName | SizeMapName | SizeSpec                              |
      | DimensionType (1) | Length            | 2DSizeModul | Waist             | 2DSize       | small |        10 | medium |         11 | large |         12 | SMALL |         13 | XL    |         14 | XXL   |         15 | SMALL         |           16 | W1       | Waist         | W2        | Waist          | W3        | Waist          | L1        | Length         | L2        | Length         | L3        | Length         |          11 |          12 |          13 |          14 |          15 |          16 | W1/L1           | W1/L2           | W1/L3           | W2/L1           | W2/L2           | W2/L3           | W3/L1           | W3/L2           | W3/L3           | MensRegular | MensPants       | MensJeans       | Childrenswear | 2DSizesCopy  | Elastic     | Characteristic,Construction,Packaging |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @ColorSpec @Specification
  Scenario Outline: Colour specification Creation and validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then Click on specification tab and create color specification "<ColorSpecificationName1>","<Code>","<Description>","<ColorSpecificationName2>","<CCode>","<CDescription>","<ColorSpecificationName3>","<ColorSpecificationName4>","<ColorSpecificationName5>"
    Then User creates the Custom view and add the options to the table of Color spec "<AvailableAttributes>","<SelectedAttributes>"
    And Merge the color specification and validate the status after merging "<ColorSpecificationName2>"
    Then Validate the options like copy and delete "Reg_colorCopy","<ColorSpecificationName1>"
    When User delete the merged colour spec and verify the error message "<ColorSpecificationName1>"
    And User enters the RBG value and verify the colour in the table "<ColorSpecificationName2>","<RGB Hex>"
    Then User enters the RBG value and colour in the table "<ColorSpecificationName1>","<ColorSpecificationName3>","<ColorSpecificationName4>","<ColorSpecificationName5>"
    Then Logout from the Application

    Examples: 
      | ColorSpecificationName1 | Code | Description          | ColorSpecificationName2 | CCode | CDescription         | AvailableAttributes | SelectedAttributes                | ColorName  | RGB Hex | ColorSpecificationName3 | ColorSpecificationName4 | ColorSpecificationName5 |
      | 11-0103 EGRET           |  022 | RegressionValidation | 11-0104 VANILLA ICE     |   023 | RegressionValidation | RGB Hex             | Pantone,Pantone TC,Libraries,Tags | Reg_color2 | #323232 | 11-0105 ANTIQUE WHITE   | 11-0107 PAPYRUS         | 11-0205 GLASS GREEN     |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  