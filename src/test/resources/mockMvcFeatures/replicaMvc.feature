Feature: Create a node
  Scenario: Node creation providing multiple params
    Given I hit the correct endpoint
    When I provide "TechJunkie" as the node name
    And I make sure station size is 1
    And Im able to find "TechJunkie" in the garage
    Then total nodeGarage size should be 1