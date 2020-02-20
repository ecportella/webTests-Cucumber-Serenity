Feature: Forgot Password
  As a user, I want to recover my forgotten password, in order to use the application

  Background:
    Given I am on the login page

  Scenario: Successfully recover password
    When I click the forgot your password link
    And I fill the email field in the recovery page
    Then an email should be sent to me with instructions to recover my password

  Scenario: Wrong email
    When I click the forgot your password link
    And I fill the email field in the recovery page
    Then a message of non existing email should be shown