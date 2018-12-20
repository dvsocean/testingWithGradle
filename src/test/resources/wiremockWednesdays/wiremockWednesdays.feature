Feature: Pretty print node information

  Background:
    Given I initialize my mock server
    When I confirm node has been created

  Scenario: Using the background keyword, pretty print the node object
    Then I should find object with the name "Jane"

  Scenario: Using a second background keyword, pretty print object
    Then I should find object with the engine name "Rotax Powered John Deere"

  Scenario: Using the atrtribute name, confirm object
    Then I should find object with nodeColor "Magenta"


