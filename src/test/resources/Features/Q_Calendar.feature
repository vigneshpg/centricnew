#yuvaraj@kripya.com
@Calendar
Feature: Data Setup for Calendar

  Scenario Outline: calendar setup for season
    Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for season "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create season Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<TrackingPhase>","<Trackingstate>"

    Examples: 
      | calendartype | templatecalendar | calendardescription      | Templateactivity                         | ActivityType                   | ActivityLevel          | TrackingType             | TrackingPhase     | Trackingstate |
      | Season       | Calendar_Season  | Season calendar Template | Manual,Milestone,Artwork Track,IDS Track | Manual Activity,Track Activity | Brand,Collection,Style | Artwork,Image Data Sheet | Production,sample | APPROVED      |

  @Calendar_Setup
  Scenario Outline: calendar setup for material
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for material "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create material Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<Trackingstate>"

    Examples: 
      | calendartype            | templatecalendar | calendardescription   | Templateactivity                                                 | ActivityType                             | ActivityLevel                        | TrackingType                                    | Trackingstate    |
      | Material Security Group | Calendar_MSG     | MSG Calendar Template | Manual,BOM Track,Color Data Sheet Track,Test Run Track,Milestone | Manual Activity,Track Activity,Milestone | Material Security Group,Material BOM | Material BOM,Material Color Data Sheet,Test Run | APPROVED,PENDING |

  @Calendar_master
  Scenario Outline: master calendar creation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    Then User moves into Calendar Template setup
    And User create Calendar Type for PO "<calendartype>","<templatecalendar>","<calendardescription>"
    Then user create PO Template activity under Calendar Type "<Templateactivity>","<ActivityType>","<ActivityLevel>","<TrackingType>","<Trackingstate>"
    And Go to homepage and create master calendar

    Examples: 
      | calendartype | templatecalendar | calendardescription  | Templateactivity                                 | ActivityType                             | ActivityLevel                            | TrackingType                   | Trackingstate |
      | PO Group     | Calendar_PO      | PO Calendar Template | Manual,Style Review Track,Size Chart Review,Mile | Manual Activity,Track Activity,Milestone | PO Group,PO Color,PO Product,Supplier PO | Style Review,Size Chart Review | APPROVED      |

  @Calendar_date
  Scenario Outline: calendar date selection and validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user enter date for calendar season
    And user modify the manual date and approves it
    And user navigates into Artwork tab and creates "<Artworkname>"
    And user navigates into Image tab and creates "<IDSName>"
    Then user select calendar season under style denim and verify the screen

    Examples: 
      | Artworkname      | IDSName      |
      | Calendar Artwork | Calendar IDS |

  @Calendar_material
  Scenario Outline: calendar date selection in material
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And user create material sku under material "<materailsku>"
    And user select calendar enter date for the calendar season
    And user freeze and apply calendar
    And user edit manual date under material activities
    And user navigates MSGSTANDALONE creates BOM and approves it "<Bomvalue>"
    And user approves created MDS and MCDS "<mdsvalue>","<colorvalue>"

    Examples: 
      | materailsku | Bomvalue     | mdsvalue     | colorvalue    |
      | MT SKU      | Calendar BOM | Calendar MDS | 11-0103 EGRET |

  @Calendar_sourcing
  Scenario Outline: calendar sourcing and po order validation
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And create calendar po template for order po group
    And Navigate to calendarpo and enter date for the calendar
    And user freeze and apply calendar for the data
    And Navigate to style create review "<Review>"
    Then Logout from the Application

    Examples: 
      | Review                |
      | Calendar Style Review |
