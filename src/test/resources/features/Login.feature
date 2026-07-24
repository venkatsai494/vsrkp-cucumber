Feature: Testing the login functionality of the application

  @HappyPath
  Scenario: Test the login functionality by providing valid user credentials
  Given User launches the browser
    And User enters the url in the browser
    When User enters the valid search text in the searchbox
    And clicks on the Google search button
    Then the results should be displayed

  @NegativeScenario
  Scenario: Test the login functionality by providing invalid user credentials
    Given User launches the browser
    And User enters the url in the browser
    When User enters the invalid search text in the searchbox
    And clicks on the Google search button
    Then the results should be displayed