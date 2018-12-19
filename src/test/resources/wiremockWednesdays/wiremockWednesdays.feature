Feature: Pretty print node information

  Background:
    Given I initialize my mock server
    When I check for the created node

  Scenario: Using the background keyword, pretty print the node object
    Then I should find object with the correct name


