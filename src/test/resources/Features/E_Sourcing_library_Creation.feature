#Author: karthick@kripya.com
@Selenium @Sourcing 
Feature: Sourcing Validation


  Scenario Outline: capability and operation group validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates capability "<Shipping Port>","<Factory>","<Supplier>" and Operation group "<OperationGroup>"
    And User creates sub routing "<SubRoutingA>","<SubRoutingB>"

    Examples: 
      | Shipping Port       | Factory        | Supplier        | OperationGroup | SubRoutingA     | SubRoutingB     |
      | Cut - Shipping Port | Pack - Factory | Ship - Supplier | MAKE           | MAKE Subrouting | SHIP Subrouting |

  #-------------------------------------------------------------------------------------------------------------

  Scenario Outline: Sales Region and country creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates Country "<CountryA>","<CountryB>","<CountryC>"
    And User creates sales region "<SalesRegionA>","<SalesRegionB>"

    Examples: 
      | CountryA       | CountryB       | CountryC                        | SalesRegionA | SalesRegionB |
      | India-IND-Asia | China-CHN-Asia | United States-USA-North America | CAD SR       | USA SR       |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: HTS code creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates HTS code "<HTS_A>","<HTS_B>","<Description>","<From>","<To>","<Duty>"

    Examples: 
      | HTS_A          | HTS_B        | Description | From                | To                  | Duty  |
      | India HTS Code | USA HTS Code | Automation  | India/United States | United States/India | 15/20 |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Container creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates container "<container>","<Volume>","<Weight>","<Efficiency>"

    Examples: 
      | container | Volume | Weight | Efficiency |
      | Container | 30/40  | 15/10  | 70/80      |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Shipping Port creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates shipping port "<portA>","<portB>","<portC>","<portD>"

    Examples: 
      | portA                  | portB                 | portC                      | portD                            |
      | Chennai Port/India/231 | Mumbai Port/India/123 | SFS port/United States/456 | New York Port/United States/7855 |

  #-------------------------------------------------------------------------------------------------------------

  Scenario Outline: Shpping Rate creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates shipping rate "<rateA>","<rateB>","<Freightrate>","<origin>","<destination>","<container>"

    Examples: 
      | rateA                 | rateB                 | Freightrate | origin     | destination | container |
      | India - United States | United States - India | 30000/40000 | Mumbai/SFS | SFS/Mumbai  | Container |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Review creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates and validates Questions subsection"<Percentage>"
    And User validates review templates "<Review>"

    Examples: 
      | Review                                | Percentage |
      | Sourcing Review Template - Automation | 25/55      |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Template creation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates routing template "<SRoutingTemp>","<Description>","Divider","<Factory>"
    #Then Go to homepage
    And User creates quote template "<SQuoteTemp>","<Placement>"

    Examples: 
      | Placement            | SQuoteTemp                | SRoutingTemp                | Description | Factory         |
      | Shoulder - placement | Supplier Quote - Template | Supplier Routing - Template | Automation  | Chennai Factory |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: SR Template creation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates data package template in specification "DPT - Style","DPT - Material"
    And User setup enumeration configurtion for Sample "<Style>","<Material>"
    And User update configuration
    Then Go to homepage
    And User creates supplier request templates "<TemplateA>","<TemplateB>","<Supplier>","<Style>","<Material>"

    Examples: 
      | Supplier | Style         | Material         | TemplateA   | TemplateB      |
      | Supplier | Style - Proto | Material - Proto | SRT - Style | SRT - Material |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Factory creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User creates factory "<FactoryA>","<FactoryB>","<Percentage>","<min-order>","<re-order>"
    And User validates factory reviews "<FactoryA>"
    And User validates supplier reviews

    Examples: 
      | FactoryA        | FactoryB           | Percentage | min-order | re-order |
      | Chennai Factory | Los Angels Factory |         20 |      1000 |      100 |

  #   -----------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Customer creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates customer "<CustomerA>","<CustomerB>","<CustomerC>"

    Examples: 
      | CustomerA   | CustomerB      | CustomerC            |
      | H&M - India | Target - China | Zara - United States |

  #   -----------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Shipment creation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates Shipment "<Shipment>","<PortFrom>","<PortTo>"
    Then Logout from the Application

    Examples: 
      | Shipment | PortFrom    | PortTo   |
      | Fedex    | Mumbai Port | SFS port |
