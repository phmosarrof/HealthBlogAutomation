@Smoke @Regression
Feature: Health Blog
  I want to use this Health blog to get the important information.

  Background: 
    Given I want to go to the home page of the Health blog

  @Functional
  Scenario: Children Health menu functionality test
    When I want to click the Children Health menu
    And I want to click the Food menu
    Then I validate the Children Health page is open successfully
    And I validate the Children Food page is open successfully

  @Wip
  Scenario Outline: Checking the recent Post Link
    When I check for the "<recentPostLink>" in the right upper corner of the home Page
    Then I verify the "<postLinkpage>" open successfully

    Examples: 
      | recentPostLink                                              | postLinkpage                                       |
      | Females Information to Mature Acne                          | Acne is a generally happening epidermis disease    |
      | How To Quit Locks Loss                                      | Are you a man United Nations agency perpetually    |
      | Easy Guidelines To Quit Hair Loss                           | Ever wondered about methods in which to quit locks |
      | Acne Can Create Your Experience Look Ugly                   | A very prevalent issue that is discovered          |
      | Fat loss Formula Both Diet program Information And For many | When you end up bent reducing your fat             |
