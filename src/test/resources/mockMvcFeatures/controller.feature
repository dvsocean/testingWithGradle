Feature: Create and find node thru controller
  Scenario: Create a node and then find that node using the provided controller features
    Given I create a node by the name of "Charlie"
    But I already have a node by the name of "JohnnyFive"
    When I should receive the correct data object
    And a node by the name of "JohnnyFive" already exists
    Then I should see a list containing



#  Data can only be passed from either Given, When or Then but
#  not from muliple methods at once. If you would like to pass
#  multipe sets of data then use But or And methods