Feature: Login
  As a user, I want to login with my email and password, in order to use the application

  Background: User navigates to infraspeak login page
    Given I am on the login page

  Scenario: Successful login
    When I fill in the email and the password with valid credentials
    And I click the login button
    Then I should be at the Assets page

  Scenario: Failed login using wrong credentials
    When I fill in the email and the password with invalid credentials
    And I click the login button
    Then I should receive an error message about my credentials