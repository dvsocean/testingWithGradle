Feature: Create and update a node
  Scenario: Create with a given name, update color and assert

    Given I prepare multiple users and initialize multiple nodes
    And I provide the node names
    |Rusty Yard Saw| Greddy turbo| 4matic| Powerful laptop|
    When I lookup a node with the name "4matic"
    Then I should be able to assert the name