Feature: The node creation feature
  Scenario: Creating a node inside of an array scenario
    Given I have a blank array
    When I initialize a random element
    Then a node gets created when I hit the "/createNode/JohnnyFivve" endpoint