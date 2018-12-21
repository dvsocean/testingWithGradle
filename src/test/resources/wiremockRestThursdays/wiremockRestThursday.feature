Feature: Acceptance for nodes

  Background: Create node
    Given I have provided "Hollister" as a motherboard name
    When I create a node from the given name

  Scenario: Create a node and verify its motherboard node color
    Then I verify that the object color attribute is "Magenta"

  Scenario: Create a node and verify its engine type
    Then I verify that nodes engine is "Rotax Powered John Deere" for agility and horsepower

  Scenario: Create a node and verify its name
    Then I verify that node has the proper attribute


