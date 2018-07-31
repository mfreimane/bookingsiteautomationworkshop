# new feature
# Tags: optional
#
Feature: Login feature
  Test the functionality of login

  Background:
    Given I have opened homepage
    Then I select MY ACCOUNT

  Scenario: Log in - positive
    And I select Login button
    And I enter a regular user email
    And I enter a regular user password
    And I check "Remember me" checkbox
    Then I successfully logged in