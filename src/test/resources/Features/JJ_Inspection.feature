#yuvaraj@kripya.com
@Selenium @Inspection
Feature: Inspection_creation

  @InspectionCreation
  Scenario Outline: Inspection Setup
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Enumeration "<DefectsCategory>"
    And update configuration for inspection
    Then user creates Defects in Inspection "<Defects>"
    Then user creates AccLimit in Inspection "<AccLimit>","<sortOrder>"
    Then user creates TestSpecification and sampling in Inspection "<TestSpecification>","<SamplingValue>"
    Then User creates ErrorType in Inspection "<ErrorType>"
    And user creates TemplateName BomName sizechart and Dimension "<TemplateName>","<BOMName>","<SizeChart>","<DimensioName>","<TestSpecification>","<SamplingValue>","<ErrorType>","<InspectionGrpName>"
   

    Examples: 
      | Defects                                              | AccLimit                | sortOrder | TestSpecification                                   | SamplingValue         | ErrorType                 | TemplateName    | BOMName        | SizeChart   | DimensioName  | InspectionGrpName    | DefectsCategory |
      | Size Defect,Sewing Defect,Fabric Defect,Color Defect | 2.5%AQL,4.5%AQL,ACL 3.0 |     0,1,2 | No Link,BOM,Size Chart,Spec Data Sheet,Style Review | Single SP,Multiple SP | Critical,High,Check Error | auto-inspection | Inspection BOM | Ins Special | New Dimension | New Inspection Group | High,Medium,Low |

	@InspectionGroupName
	Scenario Outline: Inspection Groupname
  	#Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then user creates Inspection group name"<InspectionGrpName>"
    
     Examples: 
     |InspectionGrpName|
     |New Inspection Group|
     
  @InspectionStyleCreation
  Scenario Outline: Inspection style Specification creation
  #  Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User creates Style for inspection "<BOMName>"
    And User creates ImageDatasheet "<ImageName>","<Description>"
    Then User creates Review "<ReviewName>","<ReviewDesc>","<canvasNote>"
    And User creates sizechart "<InsSize>"
    Then User creates spec "<specvalue>","<datasheet>","<specdesc>","<customspecvalue>","<specialvalue>"
    And User Copy BOM Name "<Bomcopy1>","<Bomcopy2>"
    Then User creates Inspection and verify the created items in Style Specification "<InspectionName>","<Samplingvalue>","<SupplierValue>"

    Examples: 
      | BOMName | ImageName | Description              | ReviewName       | ReviewDesc               | canvasNote         | InsSize       | specvalue | datasheet          | specdesc           | customspecvalue     | specialvalue   | Bomcopy1     | Bomcopy2      | InspectionName     | Samplingvalue | SupplierValue |
      | Ins-BOM | INS-IDS   | Image Inspection Testing | Ins-Style Review | Style Inspection testing | Automation Testing | Ins-SizeChart | character | Ins-spec datasheet | Inspection Testing | Custom spec section | Characteristic | Ins-BOM COPY | Ins-BOM COPY2 | Apparel-Inspection | Single        | Supplier      |

  @InspectionContinuation
  Scenario Outline: Inspection NewInspectionSecurityGroup creation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then create NewInspectionSecurityGroup "<ErrorType>","<AccLimit>","<SampleQtyMethod>","<InsBatchName>","<Attribute>","<Batchcolorway>","<BatchSize>","<Defectvalue>","<DefectCounter>"
    And User verify the PDF and InspectionBatch status
    Then User waits for PDF and verify it

    Examples: 
      | ErrorType     | AccLimit | SampleQtyMethod   | InsBatchName     | Attribute                                            | Batchcolorway | BatchSize | Defectvalue | DefectCounter |
      | High,Critical | 2.5,4.5  | Static,Percentage | Size chart batch | Inspection Size Chart Dimension,Size Chart Dimension | Vanilla       | small     | size        |             5 |

  @InspectionShipment
  Scenario Outline: Inspection Shipment Style Order creation
    # Given User launches centric application
    Then Go to homepage
    And verify user screen
    And User Creates Style Inspection "<ProductionQuote>","<styleInspValue>","<TemplateValue>","<ErrorType>","<DefectValue>"
    Then User creates Shipment Inspection "<ShipmentInspValue>","<TemplateValue>","<BatchShipment>","<Level>","<DefectValue>","<ErrorType>"
    And User Creates Order Inspection "<ErrorType>","<TemplateValue>","<Level>","<OrderInspection>","<DefectCounter>","<DefectValue>","<BatchSize>","<OrderBatchName>"
    Then User Create Tempalte under Inspection "<TemplateName>"
    And verify Template has created or not "<TemplateName>"

    Examples: 
      | ErrorType     | ProductionQuote | styleInspValue   | TemplateValue | ShipmentInspValue   | Level          | BatchShipment  | OrderInspection  | TemplateName              | DefectCounter | DefectValue  | BatchSize | OrderBatchName  |
      | High,Critical | Supplier        | Style-Inspection | inspection    | Shipment-Inspection | Shipment,Order | Batch-shipment | Order-Inspection | order-inspection template |           1,2 | fabric,color | small     | Batch for Order |
