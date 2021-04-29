#Author: karthick@kripya.com
@Selenium @MaterialCreation 
Feature: Creation of Material Hierarchy


  Scenario Outline: User creates New material for a product
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Click Libraries tab under specification
    When User create New material with mandatory deatails for material creation "<Standalone-value>","<Standalone-material>","<Standalone-code>"
    And User create material for Structure Component "<StrComponent-value>","<StrComponent-material>","<StrComponent-code>","<Tool-value>","<Tool-material>","<Tool-code>"
    And User performing copy and delete action on material
    And User creates color and size
    # Then select the image from the avilable resource
    Then Go to homepage
    And User creating suppliers,samples and sku and validates "<SupplierA>","<SupplierB>","<SupplierC>","<material-Sample>","<colors/sizes>","<SKU>","<ChooseSupplier>"

    Examples: 
      | SupplierA | SupplierB | SupplierC | material-Sample    | colors/sizes       | SKU          | Standalone-value    | Standalone-material      | Standalone-code  | StrComponent-value           | StrComponent-material  | StrComponent-code | Tool-value    | Tool-material                    | Tool-code        | ChooseSupplier |
      | Changshu  | Frontline | Supplier  | 100% Cotton Jersey | colors and sizes=1 | Material SKU | Fabric - Stanadlone | 100% Cotton/Rayon Jersey | 123 - Automation | Fabric - Structure Component | 100% Polyester Chiffon | 123 - Automation  | Fabric - Tool | 100% Polyester Chiffon (Striped) | 123 - Automation | Supplier       |

  #-------------------------------------------------------------------------------------------------------------

  Scenario Outline: Material Gallery validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material gallery "<Test>","<MG-Filter>"

    Examples: 
      | Test          | MG-Filter |
      | QA Automation | Active    |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: Material Security Group validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material security group "<Test>","<MSG-Standalone>","<MSG-All>","<MSG-A>","<MSG-B>"

    Examples: 
      | Test          | MSG-Standalone | MSG-All | MSG-A              | MSG-B            |
      | QA Automation | MSG-Standalone | MSG-All | Changshu Materials | Vendor Materials |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario: Material color validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates colored material

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Sample validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates and edit material samples "<material-Sample>","<ChooseSupplier>"

    Examples: 
      | material-Sample    | ChooseSupplier |
      | 100% Cotton Jersey | Supplier       |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario: Material SKU validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates material SKU's

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario: Material Sourcing validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates sourcing

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Care Label validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates care label "<CL-Wash>","<CL-Iron>","<CL-Special>"

    Examples: 
      | CL-Wash     | CL-Iron       | CL-Special            |
      | Do Not Wash | Iron Low Heat | Wash With Like Colors |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Composition Placement validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates composition placements "<CompPlacement-A>","<CompPlacement-B>"

    Examples: 
      | CompPlacement-A          | CompPlacement-B          |
      | Inner Lining - Placement | Outer Lining - placement |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Composite Material validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates composition material "<compMaterial-A>","<compMaterial-B>","<compMaterial-C>"

    Examples: 
      | compMaterial-A | compMaterial-B | compMaterial-C |
      | BRASS          | COTTON         | LEATHER        |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Placement validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates placement "<Placement-A>","<Placement-B>"

    Examples: 
      | Placement-A          | Placement-B      |
      | Shoulder - placement | Neck - placement |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Product Symbols validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates product symbols "<PS-Brand>","<PS-Feature>","<PS-Function>"

    Examples: 
      | PS-Brand | PS-Feature | PS-Function |
      | Heat     | Vibration  | Waterproof  |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Language validation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates language "<Language-A>","<Language-B>","<Language-C>"

    Examples: 
      | Language-A   | Language-B | Language-C |
      | English - US | French     | Japanese   |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Material Structure Component validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User validates product structure "<StrComponent-material>"
    Then Logout from the Application

    Examples: 
      | StrComponent-material |
      | shoe structure        |
#-------------------------------------------------------------------------------------------------------------      
