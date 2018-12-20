Feature: Pretty print node information

  Scenario: pretty print the node object
    Given I confirm node has been created
    When I verify that node has the name "Jane"
    And I should find object with the engine name "Rotax Powered John Deere"
    And I should find object with nodeColor "Magenta"
    Then then confirm object array is not empty



