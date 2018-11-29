@Smoke
Feature: Health blog Functionality test
  I want to use this Health blog for my health information

  @Smoke
  Scenario: Men Health information
    Given I want to go to the home page of the Health blog
    When I click the Men Health menu
    Then I enter into Men Health page
    Then I close the browser
