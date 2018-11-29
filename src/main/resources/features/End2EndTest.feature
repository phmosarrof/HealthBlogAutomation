Feature: Health blog Functionality test
  I want to use this Health blog for my health information

  Scenario: Vitamins Page information
    Given I want to go to the home page of the Health blogs
    When I click the Vitamins menu
    And I click the read more link
    Then I enter into Vitamins page

  Scenario: medicine Page information
    Given I want to go to the home page of the Health blogs
    When I click the medicine menu
    And I click the readmore link
    Then I enter into medicine page
