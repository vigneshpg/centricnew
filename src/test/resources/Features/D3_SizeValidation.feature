#Author: tharun@kripya.com
@SizeValidation @Specification
Feature: validation scenario of size & style

  Scenario Outline: Size validation & Colour validation
    Given User launches centric application
    #And User Click on setup icon
    #When User creates style type in setup page "<StyleTypeA>","<StyleTypeB>","<StyleTypeC>","<StyleTypeD>"
    #And User deselects the colour specification option "<StyleTypeB>"
    #And User fills all the style type attributes fields
    #Then User click on update cnfiguration
    #And validate and accept the alert
    Then Go to homepage
    And verify user screen
    And Click style tab and get the listed season name in the style tab
    When User create New season with mandatory deatails for season creation "<season>","<scode>","<sdescription>"
    Then Click New Brand
    Then Save the New Brand which was created
    Then Click New department by providing valid data "<dept>"
    Then Save the New department which was created
    Then Click New collection
    And Create collection by providing valida and mandatory details "<collection>"
    Then Save the collection which was created
    Then Click New style
    And Create Style followed by its style Type "<StyleTypeA>","<StyleTypeA>","<StyleTypeA>","<StyleTypeA>","<StyleName1>","<StyleName2>","<StyleName3>","<StyleName4>"
    Then Click New style
    And Create Style followed by its style Type "<StyleTypeB>","<StyleTypeB1>"
    And Create Style followed by its style Type "<StyleTypeC>","<StyleTypeC1>"
    And Create Style followed by its style Type "<StyleTypeD>","<StyleTypeD1>"
    When User creates the Custom view and add the options to the table "Colorway","Color Specification"
    And User deletes the unwanted attributes from custom views column for styles "<SelectedAttributes1>","<SelectedAttributes2>","<SelectedAttributes3>","<SelectedAttributes4>","<SelectedAttributes5>"
    Then User selects the size range for the styles "<StyleName1>","<StyleName2>","<StyleName3>","<StyleName4>","<SizeRange>","<SimpleSizeName1>","<SimpleSizeName2>","<CompSizeName>"
    When User selects the colorway through option from the styles page itself "<StyleName4>"
    And user selects the colorway for the styles "<StyleName1>","<NavignSearchtype>"
    Then User creates the colorway for the style and maps it "<ColorSpecificationName2>","<ColorSpecificationName3>"
    And user selects the colorway for the styles "<StyleName2>","<NavignSearchtype>"
    Then User creates the colorway for the style and maps it "<ColorSpecificationName4>","<ColorSpecificationName5>"
    And user selects the colorway for the styles "<StyleName3>","<NavignSearchtype>"
    Then User creates the colorway for the style and maps it "<ColorSpecificationName4>","<ColorSpecificationName1>"
    Then Logout from the Application

    Examples: 
      | StyleTypeA               | StyleTypeB               | StyleTypeC          | StyleTypeD                      | season           | scode | sdescription                   | brand   | bcode | bdescription   | dept        | dcode | ddescription | collection | ccode | cdesription | SelectedAttributes1 | SelectedAttributes2        | SelectedAttributes3 | SelectedAttributes4 | StyleName1 | StyleName2 | StyleName3 | StyleName4 | SizeRange   | SimpleSizeName1 | SimpleSizeName2 | CompSizeName  | NavignSearchtype | ColorSpecificationName2 | ColorSpecificationName3 | ColorSpecificationName4 | ColorSpecificationName5 | ColorSpecificationName1 | SelectedAttributes5 | StyleTypeB1       | StyleTypeC1  | StyleTypeD1    |
      | Apparel - Color and Size | Accessories - Only Color | Apparel - Only Size | Accessories - No color and Size | 01 - Spring 2020 | SP20  | Spring 2020 Development Season | Brand X | B03   | SizeValidation | Accessories |   105 | pant         | Belts      |   110 | cotton      | Description         | Tool (Style Specification) | Development Type    | Theme               | HC&S1      | HC&S2      | HC&S3      | HC&S4      | MensRegular | MensPants       | MensJeans       | Childrenswear | Style            | 11-0104 VANILLA ICE     | 11-0105 ANTIQUE WHITE   | 11-0107 PAPYRUS         | 11-0205 GLASS GREEN     | 11-0103 EGRET           | Code                | HomeAssortmentOC2 | HardgoodsOS1 | FootwearNC&NS1 |
