#Author:Tharun@kripya.com
@Specification @overallspecification
Feature: The overall scenarios of specification module

  @PrintDesign 
  Scenario Outline: Print design Creation and validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to print design tab
    Then user creates print design data "<PrintDesign>","<PrintType>","<NoOfPrintPosition>","<RepeatHeight>","<RepeatWidth>"
    And user creates the new print color "<NewPrintColor>","<PrintDesign1>","<NewPrintColor1>","<code>"
    Then user navigates to position tab and create data "<PrintPositionName>","<PrintTech>"

    Examples: 
      | PrintDesign                             | PrintType               | NoOfPrintPosition | RepeatHeight | RepeatWidth | NewPrintColor        | PrintDesign1    | NewPrintColor1       | code    | PrintPositionName  | PrintTech    |
      | Abstract Floral,Batik Print,Lilac Print | All Over,Placement,Logo |             3,4,6 |     12,12,12 |    12,12,24 | Blue Abstract Floral | Abstract Floral | Grey Abstract Floral | PDC 100 | ground,leaf,swoosh | Screen Print |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeChart 
  Scenario Outline: Data creation for the size chart and validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size chart tab
    Then create the size charts "<SizeChart>","<SizeChartDec>","<SizeChartDecAlt>"

    Examples: 
      | SizeChart                                | SizeChartDec                                                                                                                                                                            | SizeChartDecAlt                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       |
      | A15E,A16S,A25FE,A26FS,A29,C122,C123,U550 | NECK WIDTH_EDGE TO EDGE,NECK WIDTH_SEAM TO SEAM,FRONT NECK DROP_EDGE TO EDGE,FRONT NECK DROP_SEAM TO SEAM,HPS DROP TO CLOSURE_LOW,WAIST_RIGID WAISTBAND,WAIST_ELASTIC BAND RELAXED,KNEE | Measure neck opening straight across from inside edge to inside edge,Measure neck opening straight across from seam to seam,Measure from high point shoulder to center front neck edge,Measure from high point shoulder seam to center front neck seam,Measure from high point shoulder to center of first button,Align top edge of waistband Measure straight across from inside edge to inside edge (waist closure must be fastened),Measure with elastic relaxed and top edge of waistband aligned straight across top edge from inside edge to inside edge (waist closure must be fastened),Measure straight across leg grain at point indicated on specification |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeChart @Increment 
  Scenario Outline: SizeChart increment creation and validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then creates the increment for the size chart "<SizeIncrement>"

    Examples: 
      | SizeIncrement                      |
      | Womens alpha tops,Pants Grade Rule |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeChart @Increment 
  Scenario Outline: Mapping of values increment Tab and validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to sizeRange tab for twoDsize validation "MensRegular"
    And user navigates to increment tab and create custom view "<RemoveAttributes>"
    Then user maps the size range for the increments "<SizeIncrement>","<SizeRange>"
    And user maps the dimensions inside the increments values "<Increment1>","<Increment2>","<dim1>","<dim2>","<dim3>","<dim4>","<dim5>","<dim6>","<dim7>"
   # When user selects the base sizes for the increments "<Increment1>","<Increment2>","<baseSize1>","<baseSize2>"
   #  And user creation of tags in the dimension "<dim3>"
   # Then user will create the product group

    Examples: 
      | SizeRange                 | SizeIncrement                      | Increment1        | Increment2       | dim1 | dim2 | dim3 | dim4 | dim5  | dim6 | dim7  | baseSize1 | baseSize2 | RemoveAttributes |
      | Childrenswear,MensRegular | Womens alpha tops,Pants Grade Rule | Womens alpha tops | Pants Grade Rule | C122 | C123 | A15E | A16S | A25FE | A29  | A26FS | small     | large     | Description,Tags |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeLabel 
  Scenario Outline: User creates sizeLabel and validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size label tab
    And user creates the size label "<SizeLabel>"
    Then Validate the options like copy and delete for size label "Horizontal Size Label-COPY","<SizeLabelCopy>"

    Examples: 
      | SizeLabel                                 | SizeLabelCopy         |
      | Horizontal Size Label,Vertical Size Label | Horizontal Size Label |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeSpecs 
  Scenario Outline: User creates SizeSpecs and validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size spec tab
    And user creates the size spec "<SizeSpec>"
    Then Validate the options like copy and delete for size spec "<SizeSpecCopy>"

    Examples: 
      | SizeSpec          | SizeSpecCopy |
      | 12,14,16,4*6,8x11 |           12 |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @SizeItems 
  Scenario Outline: User creates size items and validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to size items tab
    And user creates the size item "<SizeItem>","<SizeSpec>"
    Then user creates the size item with all the types for Template scenario "<SizeItems>","<SizeSpec>"
    And user creates the spec items with different types "<ValueItems>","<SizeSpec>"
    Then Validate the options like copy and delete for size item "Reg_colorCopy","<SizeItemCopy>"
    And user creation of tags in the size item "<SizeItem>","<SizeItemTag>"

    Examples: 
      | SizeItem                                                 | SizeItemCopy  | SizeSpec                              | SizeItemTag              | SizeItems                                                                                                                 | ValueItems                 |
      | Armhole_Bound,Armhole_Faced,Belt Loops_Clean Finish Make | Armhole_Bound | Characteristic,Construction,Packaging | sleeve,armhole,waistband | Alphanumeric,Barcode,Email Address,Hyperlink,Latest Multi-line Comment,Multi-line Comment,Multi-line Text,Phone,Rich Text | double,integer,ref,reflist |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @LookUp 
  Scenario Outline: Lookup creation and validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to lookup tab
    And user creates the lookup "<LookUp>","<LookUpTypes>","<Code>","<desc>"
    And user creates the lookup "<LookUp1>","<LookUpTypes2>","<Code>","<desc>"
    And user creates the lookup "<LookUp2>","<LookUpTypes3>","<Code>","<desc>"
    Then Validate the options like copy and delete for lookup "Reg_colorCopy","<LookUpCopy>"

    Examples: 
      | LookUp                                                                                                         | LookUpCopy                               | LookUpTypes  | LookUpTypes2     | LookUpTypes3         | LookUp1                                                                                | LookUp2                                                                                                                                                                                                                | Code      | desc       |
      | 01_Low Cost Factor,02_Mid Cost Factor,03_High Cost Factor,04_Very High Cost Factor,05_Speciality Products Only | 005a_Create Design BOM_Apparel_Carryover | Cost Factors | Holiday Calendar | User Task Lead Times | IND-Dussehra-2020,IND-Dussehra-2019,IND-Diwali-2020,IND-Diwali-2019,IND-Christmas-2020 | 001_Fill Set-up details_Apparel_Carryover,002_Review and Approve Style Targets_Apparel_Carryover,003_Create Colorways_Apparel_Carryover,004_Upload Sketches_Apparel_Carryover,005a_Create Design BOM_Apparel_Carryover | 1,2,3,4,5 | LookupData |

  #----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @ProductAlternative 
  Scenario Outline: Product alternative and validation
   #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to product alternative tab
    Then user creates the product alternative data "<ProductAlternative>"
    Then Validate the options like copy and delete for size label "China-COPY","<ProductAlternativeCopy>"

    Examples: 
      | ProductAlternative             | ProductAlternativeCopy |
      | China,Italy,Vietnam (no qoute) | China                  |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Libraries
  Scenario Outline: Libraries Creation and validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to tab
    Then user creates the data for the libraries "<CareLibrary>"

    Examples: 
      | CareLibrary   |
      | Electric Boho |

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Libraries
  Scenario: Libraries Creation and validation
    Then user creates the data for the color libraries "Blue Haze"

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Libraries
  Scenario: Libraries Creation and validation
    Then Go to homepage
    Then user creates the data for New Material library "Fall 2020 Materials"

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Libraries
  Scenario: Libraries Creation and validation
    Then Go to homepage
    And user creates the data for print design library "Fall 2020 Concept Prints"

  #-------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Libraries
  Scenario: Libraries Creation and validation
    #Then Go to homepage
    Then user creates the data for New size library "Winter 2020 3D"

  #Examples:
  #  |CareLibrary  |NewSpecLibrary|NewMatLibrary      |NewPrintDesignLibrary   |NewSizeLibrary|
  #  |Electric Boho|Blue Haze     |Fall 2020 Materials|Fall 2020 Concept Prints|Winter 2020 3D|
  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @Templates
  Scenario Outline: User create templates
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to template tab
    And user creates the template "<Template>","<Type>"
    Then user creates the datasheet template for style "<DataSheetType>","<TemplateStyle>"
    Then Go to homepage
    And user creates the datasheet template for material "<DataSheetType1>","<TemplateMaterial>"

    Examples: 
      | Template                     | Type           | DataSheetType                        | TemplateStyle   | DataSheetType1                                    | TemplateMaterial |
      | Costing Package,DPT Material | Style,Material | Artwork,Routing,Size Chart,Style BOM | Costing Package | Test Run,Material BOM,Routing,Material Data Sheet | DPT Material     |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @canvas
  Scenario Outline: User create canvas
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to canvas tab
    Then user creates a manage view for the page "<RemoveAttributes>"
    And user creates the canvas template "<Template>","<Type>"
    Then verify the description of canvas template screen message "<TemplateStyle>"
    And create a canvas and select the rectangle box

    Examples: 
      | Template                                            | Type                 | TemplateStyle            | RemoveAttributes    |
      | 1st Proto Review-Apparel,Fit Correction:Across Back | Artwork,Style Review | 1st Proto Review-Apparel | Description,Subtype |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @canvas @SizeChartCanvas 
  Scenario Outline: SizeChart Canvas creation & validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to SizeCanvas tab
    Then user creates the sizeChart canvas "<SizeChartName>"
    And user creates the dimension inside the canvas "Bra"
    Then user enters the values in the dimensions "<Dimensions>"

    Examples: 
      | SizeChartName             | Dimensions |
      | Bra,Womens Basic Knit Tee | A15E       |

  #---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
  @canvas @SpecSizeDefinitions 
  Scenario Outline: SpecSection definition Canvas creation & validation
   # Given User launches centric application
    Then Go to homepage
    And verify user screen
    When user navigates to SpecSizeCanvas tab
    Then user creates the Spec Section definitions canvas "<SpecSectionName>","<SizeSpec>"
    And user creates the data inside the characteristics value "<NameOfNewSpecSectionInsideChar>","<SpecSectionName>"
    Then user selects the values from the options of spec items "<NameOfNewSpecSectionInsideChar>"
    And user creates a custom view to verify the data output "<Attributes>","<DeselectAttributes>"
    Then user validate the special created data

    #Then Go to homepage
    #When user navigates to SpecSizeCanvas tab
    #Then user validate for next data type "<NameOfNewSpecSectionInsideChar>","<SpecSectionName>"
    #Then Logout from the Application
    Examples: 
      | SpecSectionName                                              | SizeSpec                              | NameOfNewSpecSectionInsideChar    | Attributes | DeselectAttributes            |
      | Model of Characteristics,KnitBottoms,Lighting Specifications | Characteristic,Construction,Packaging | Mount holder,General Construction | Value Type | Description,Image (Spec Item) |
