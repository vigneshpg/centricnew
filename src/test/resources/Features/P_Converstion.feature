@Conversation
Feature: Creation of Conversation Categories

  
  Scenario Outline: User Conversation Categories creation
    Given User launches centric application
    Then User creates converstion value in config_setup "<conversation1>"
    And Edit and delete the existing conversation data "<conversation2>","<conversation3>"
    And User select Style from Business Object "Style"
    When Navigate to to conversation cateogries within style
    And User click on update cnfiguration

    Examples: 
      | conversation1                                                                 | conversation2                           | conversation3 |
      | Planning the style,Planning the Material,Designing the Style,Plan for Seasons | Test Running,Design Style,Plan Material | Tested Runner |


  Scenario Outline: Conversation with season hierarchy
    #Given User launches centric application
    Then Go to homepage
    And verify user screen
    And Navigate to season create conversation
    When Edit and Delete the created conversation
    And Verify the conversation by sort order
    And Navigate to Material create conversation
    Then Logout from the Application

    Examples: 
      | conversation1                                                                 | conversation2                           | conversation3 |
      | Planning the style,Planning the Material,Designing the Style,Plan for Seasons | Test Running,Design Style,Plan Material | Tested Runner |
