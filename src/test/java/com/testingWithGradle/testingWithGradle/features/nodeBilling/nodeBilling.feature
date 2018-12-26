Feature: Create and bill node
  Scenario: Create and verify, then bill
    Given I create a node
    And give it the name "NodeRunner"
    When I update the same node
    And provide a new color "purple and green"
    Then I should be able to assert new node