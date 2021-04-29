@Merchandise
Feature: Creating Merchandising Setup

  Scenario Outline: Create Secondary type
    Given User launches centric application
    And User Click on setup icon
    And Navigate to Secondary Type tab create data "<SecondaryType>"
    And Navigate to Option Type and Product type create data "<OptionType>","<ProductType>"
    And Navigate to Collection type and create data "<CollectionType>"
    When Navigate to Folder type "<FolderType>"
    And Create plan type data "<PlanType>"
    And Enumeration creation
    And Navigate to Business Object
    Then Create style attribute for merchandise product version
    And Navigate to style push template and add mapping expression
    And Create style copy templates
    And User select Style from Business Object "Style"
    And Navigate to style create atrributes
    And Again navigate to copy template and create new style copy template
    And User click on update cnfiguration
    And Create Merchandise copy template

    Examples: 
      | SecondaryType   | OptionType | ProductType | CollectionType | FolderType               | PlanType   |
      | Segment,Monthly | Option     | Product     | Product Group  | Department,Gender,Region | Merch Plan |

  @set72
  Scenario Outline: Setup for hierarchy creation
    #Given User launches centric application
    And User Click on setup icon
    And Navigate to Folder type to check Brand
    Then Go to homepage
    And Navigate to Home Page and setup template for hierarchy "<SeasonName1>"
    Then Go to homepage
    And Create new season choose existing hierarchy value "<SeasonName2>"

    Examples: 
      | SeasonName1 | SeasonName2 |
      | Summer 2021 | Summer 2022 |

  @set73
  Scenario Outline: Create Plan in Merchandise
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user creates new Plan "<PlanName>","<seasonname>"
    Then user creates season under version "<seasonname>"
    And under secondarysetup created monthly and segment setup "<month>","<segment>"
    Then user selects monthly and segment value under Secondary
    Then user click PlanTab, adds created monthly
    Then user moves to created season
    And user selects monthly and segment value under Secondary for summer2022

    Examples: 
      | PlanName | seasonname              | month             | segment           |
      | Plan 1   | Summer 2021,Summer 2022 | monthly1,monthly2 | segment1,segment2 |

  @set74
  Scenario Outline: Folder creation and validation in merchandise
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user navigates into created season "<season>"
    And create newfolder under Plan "<foldername>"
    Then create NewProducts and verify the attribute value of quantity created "<productvalue>","<optionNamevalue>"
    Then user copy, delete and edit the created product "<copygreenvalue>"
    Then Navigate to Product tab and validate Tops available or not

    Examples: 
      | season      | foldername                        | productvalue            | optionNamevalue   | copygreenvalue |
      | Summer 2021 | Americas,Childrenswear,Boys,Tops | Tops-01,Tops-02,Tops-03 | Option,Blue,Green | Greenshade     |

  @set75
  Scenario Outline: Brand Creation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user creates brand under Heirarchy Template "<BrandValue>"
    Then Click New Brand
    And create Brand for merchandise "<BrandValue>"
    

    Examples: 
      | BrandValue      |
      | Brand X,Brand Y,Childrenswear,Tops |
      
	@set76
	Scenario Outline: Product Creation
		#Given User launches centric application
		Then Go to homepage
		And verify user screen
		Then user navigate to merch collection create product"<Product>""<Season>""<Brand>"
		Then create product with candidate"<Product1>""<Season>""<Brand>" 
		Then Logout from the Application
		
		
    Examples:
    |Product  						|Season  			|Brand    |Product1		|
    |Round Neck T-Shirt   |spring 2020  |Brand X  |RNT1				|