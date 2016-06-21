Feature: Testing Mercury tours

  @Runme
  Scenario: Login to application
    Given I am on the HomePage
    When I click on SIGN-ON link
    And enter login credentials and sign in
    Then Flight finder page is displayed

  Scenario: Search for flights
    Given I am logged in the application
    When I enter search parameters
    And click on search
    Then flight search results should be displayed

  Scenario: Book a flight ticket
    Given I am logged in the application
    And I Search for flight
    And I Select the required flights
    And I Book tickets
    Then Booking confirmation number should be displayed
