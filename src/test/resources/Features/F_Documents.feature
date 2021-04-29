#Author: karthick@kripya.com yuvaraj@kripya.com
@Selenium @Documents @Jenkins
Feature: Documents upload


  Scenario Outline: Documents validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates document "<Document>","<file>"
    And User upload another file and validating
    And User validating revise and approve
    And User validating share document functionality "<StyleType>"
    And User verifying shared document under style tab "<Document>"

    Examples: 
      | Document                   | file                        | StyleType                |
      | Automation Document upload | \\TestData\\credentials.txt | Apparel - Color and Size |

  #-------------------------------------------------------------------------------------------------------------
 
  Scenario Outline: All Document validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User upload documents under style "<StyleDoc>","<file>"
    Then Go to homepage
    When User upload documents under material "<MaterialDoc>","<file>"
    Then Go to homepage
    And User validating all documents

    Examples: 
      | StyleDoc                  | file                        | MaterialDoc                  |
      | Automation Style Document | \\TestData\\credentials.txt | Automation Material Document |

  #-------------------------------------------------------------------------------------------------------------
  
  Scenario Outline: Contractual document validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User creates contractual doc "<CD-All>","<CD-HED>","<From>","<To>","<Description>","<file>"
    And User creates contractual doc group "<CD-Grp>","<Description>"
    And User creates contractual doc "<CD-RA>","<Description>","<file>"
    And User validating supplier contactual document

    Examples: 
      | CD-All   | CD-HED   | From       | To         | Description | file                        | CD-Grp      | CD-RA   |
      | CDOC-ALL | CDOC-HED | 05/30/2020 | 06/30/2020 | Automation  | \\TestData\\credentials.txt | CDOC-Groups | CDOC-RA |
     #-------------------------------------------------------------------------------------------------------------   
 
  Scenario Outline: Contractual document validation
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    When User reupload contractual doc "<EffTo>","<file>"
    Then User creates Supplier ContractualDocument-Group and Special Document "<From>","<To>","<SupplierConDoc>","<file>","<CD-All>"
    

    Examples: 
      | CD-All   | EffTo | From       | To         | SupplierConDoc | file                        |
      | CDOC-ALL |    28 | 04/30/2020 | 05/30/2020 | CDOC-Special   | \\TestData\\credentials.txt |
      
    #------------------------------------------------------------------------------------------------------------------------------------  