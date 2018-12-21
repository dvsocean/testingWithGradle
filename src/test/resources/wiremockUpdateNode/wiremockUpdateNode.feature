Feature: Update node
  Scenario: Create a node and then update it
    Given I created a node
    When I update the node with "V55" engine and "BLACK AND YELLOW" color
    Then I confirm the node by checking attributes for "V55"