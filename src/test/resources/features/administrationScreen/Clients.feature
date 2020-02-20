Feature: Clients
  As an admin user, I want to add/view/edit/delete a client, in order to maintain my clients management

  Background:
    Given I am on the administration page
    When I select the Clients and Suppliers menu then Clients submenu

  Scenario: Add New Client
    And I click the New Client button
    And I fill all of the required fields and finish the registration
    Then a new client must be shown on the list with the data filled in the registration

  Scenario: Fail to add a New Client
    And I click the New Client button
    And I leave the form blank and try to finish the registration
    Then the app should alert the user for the required fields

  Scenario: View Client
    And I click the View Client icon from one of the clients from the list
    Then all of the information from that client must be shown on a modal

  Scenario: Edit Client
    And I click the Edit Client icon from one of the clients from the list
    And I change the content of some fields and finish the edition
    Then the edited client must be shown on the list with the data updated

  Scenario: Delete Client
    And I click the Delete Client icon from one of the clients from the list
    And I confirm that I want to delete this client
    Then the client must be removed from the list