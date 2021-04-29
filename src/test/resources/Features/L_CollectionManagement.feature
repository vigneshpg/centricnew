#Author: karthick@kripya.com  yuvaraj@kripya.com
@Selenium @CollectionManagement 
Feature: Creation of Collection Management


  Scenario Outline: User creates enumeration and currency
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates enumeration "Segment - 01","Segment - 02"
    And user run update configuration
    When user creates currencies in general setup "<CurrencyA>","<CurrencyB>","<CurrencyC>"
    And user performing delete action

    Examples: 
      | CurrencyA | CurrencyB | CurrencyC |
      | Rupee,R   | Dollar,$  | Euro,E    |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario: User creates curreny table
    # Given User launches centric application
    # Then Go to homepage
    # And verify user screen
    When user creates currency table in general setup "CT - 01"
    And user updating currency exchange rates

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: User creates sales market
    # Given User launches centric application
    # Then Go to homepage
    # And verify user screen
     When user creates Sales market in general setup "<SalesMarketA>","<SalesMarketB>"

    Examples: 
      | SalesMarketA        | SalesMarketB     |
      | Indian Market,Rupee | US Market,Dollar |

  #-------------------------------------------------------------------------------------------------------------

  Scenario Outline: User creates sales division
    # Given User launches centric application
    # Then Go to homepage
    # And verify user screen
    When user creates Sales division in general setup "<SalesDivA>","<SalesDivB>","<SalesDivC>","<SalesDivD>"
    And user updating contact inside sales division

    Examples: 
      | SalesDivA  | SalesDivB  | SalesDivC     | SalesDivD     |
      | US - North | US - South | India - South | India - North |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: User creates collection management
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user creates marketing looks "Avengers"
    And user creates marketing tools "<ToolA>","<ToolB>"
    And performing delete action
    And user creates collection management "<CollectionValue>","<Currency>"
    And user creates style marketing products "TShirts Style","123 Avengers","smoke"
    And user creates new marketing product "MP - TShirt","123 - Marketing","Apparel - Color and Size"
    And user creates colorway inside marketing product "<ColorA>","<ColorB>"
    And user creates marketing material and looks "<LookA>","<LookB>"
    And user update material value in material product and segments
    Then user click on release to markets and release to customers
    And user creates sales market in collection management
    Then Go to homepage
    And creates sales order "TShirt Sales Order","Indian Market"

    Examples: 
      | ToolA  | ToolB   | CollectionValue                  | Currency | ColorA | ColorB | LookA      | LookA    |
      | Banner | Canoply | TShirts Collection - without SKU | Dollar   | Blue   | Green  | Spider Man | Iron Man |

  @CM1  
  Scenario Outline: User creates collection management with SKU
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
      When user creates collection management with SKU "<CollectionValue>","<Currency>","123 Automation","CT - 01","Stripped Jeans - SKU"
    And user creates styles marketing products "Apparel - Jeans","123 Automation","smoke"
    And verify material SKU values
    And user creates marketing material and update values in marketing product "<MaterialA>","<MaterialB>","<Color>"
    And user creates SKU sales market in collection management "<Customer>"
    And User creates promotion and sales order "New Promo","Indian Sales Order","India - North","<Customer>"
    And user creates marketing tools and update sales order
    And user creates sales order group and update catalog configuration
    Then Logout from the Application
    
    Examples:
    |CollectionValue|Currency|MaterialA|MaterialB|Color|Customer|
    |Jeans|Rupee|100% Cotton/Rayon Jersey|100% Cotton/Rayon Jersey - Copy|Blue|H&M|
    