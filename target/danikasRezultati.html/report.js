$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("wiremockRestThursdays/wiremockRestThursday.feature");
formatter.feature({
  "line": 1,
  "name": "Acceptance for nodes",
  "description": "",
  "id": "acceptance-for-nodes",
  "keyword": "Feature"
});
formatter.before({
  "duration": 410033623,
  "status": "passed"
});
formatter.before({
  "duration": 741340575,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Create node",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I have provided \"Hollister\" as a motherboard name",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a node from the given name",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Hollister",
      "offset": 17
    }
  ],
  "location": "WiremockRestThursday.i_have_provided_as_a_motherboard_name(String)"
});
formatter.result({
  "duration": 93341915,
  "status": "passed"
});
formatter.match({
  "location": "WiremockRestThursday.i_create_a_node_from_the_given_name()"
});
formatter.result({
  "duration": 38163065,
  "status": "passed"
});
formatter.scenario({
  "line": 7,
  "name": "Create a node and verify its motherboard node color",
  "description": "",
  "id": "acceptance-for-nodes;create-a-node-and-verify-its-motherboard-node-color",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 8,
  "name": "I verify that the object color attribute is \"Magenta\"",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Magenta",
      "offset": 45
    }
  ],
  "location": "WiremockRestThursday.i_verify_that_the_object_color_attribute_is(String)"
});
formatter.result({
  "duration": 415691715,
  "status": "passed"
});
formatter.before({
  "duration": 1743224,
  "status": "passed"
});
formatter.before({
  "duration": 25718690,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Create node",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I have provided \"Hollister\" as a motherboard name",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a node from the given name",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Hollister",
      "offset": 17
    }
  ],
  "location": "WiremockRestThursday.i_have_provided_as_a_motherboard_name(String)"
});
formatter.result({
  "duration": 2588158,
  "status": "passed"
});
formatter.match({
  "location": "WiremockRestThursday.i_create_a_node_from_the_given_name()"
});
formatter.result({
  "duration": 21879569,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Create a node and verify its engine type",
  "description": "",
  "id": "acceptance-for-nodes;create-a-node-and-verify-its-engine-type",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "I verify that nodes engine is \"Rotax Powered John Deere\" for agility and horsepower",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Rotax Powered John Deere",
      "offset": 31
    }
  ],
  "location": "WiremockRestThursday.i_verify_that_nodes_engine_is_for_agility_and_horsepower(String)"
});
formatter.result({
  "duration": 28033888,
  "status": "passed"
});
formatter.before({
  "duration": 2449574,
  "status": "passed"
});
formatter.before({
  "duration": 20863936,
  "status": "passed"
});
formatter.background({
  "line": 3,
  "name": "Create node",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 4,
  "name": "I have provided \"Hollister\" as a motherboard name",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I create a node from the given name",
  "keyword": "When "
});
formatter.match({
  "arguments": [
    {
      "val": "Hollister",
      "offset": 17
    }
  ],
  "location": "WiremockRestThursday.i_have_provided_as_a_motherboard_name(String)"
});
formatter.result({
  "duration": 1958321,
  "status": "passed"
});
formatter.match({
  "location": "WiremockRestThursday.i_create_a_node_from_the_given_name()"
});
formatter.result({
  "duration": 18853678,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Create a node and verify its name",
  "description": "",
  "id": "acceptance-for-nodes;create-a-node-and-verify-its-name",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 14,
  "name": "I verify that node has the proper attribute",
  "keyword": "Then "
});
formatter.match({
  "location": "WiremockRestThursday.i_verify_that_node_has_the_proper_attribute()"
});
formatter.result({
  "duration": 23393823,
  "status": "passed"
});
formatter.uri("wiremockUpdateNode/wiremockUpdateNode.feature");
formatter.feature({
  "line": 1,
  "name": "Update node",
  "description": "",
  "id": "update-node",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1765219,
  "status": "passed"
});
formatter.before({
  "duration": 18729651,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Create a node and then update it",
  "description": "",
  "id": "update-node;create-a-node-and-then-update-it",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I created a node",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I update the node with \"V55\" engine and \"BLACK AND YELLOW\" color",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I confirm the node by checking attributes for \"V55\"",
  "keyword": "Then "
});
formatter.match({
  "location": "UpdateNode.i_created_a_node()"
});
formatter.result({
  "duration": 24092257,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "V55",
      "offset": 24
    },
    {
      "val": "BLACK AND YELLOW",
      "offset": 41
    }
  ],
  "location": "UpdateNode.i_update_the_node_with_engine_and_color(String,String)"
});
formatter.result({
  "duration": 14627576,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "V55",
      "offset": 47
    }
  ],
  "location": "UpdateNode.i_confirm_the_node_by_checking_attributes_for(String)"
});
formatter.result({
  "duration": 21769308,
  "status": "passed"
});
formatter.uri("wiremockWednesdays/wiremockWednesdays.feature");
formatter.feature({
  "line": 1,
  "name": "Pretty print node information",
  "description": "",
  "id": "pretty-print-node-information",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1858793,
  "status": "passed"
});
formatter.before({
  "duration": 19616479,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "pretty print the node object",
  "description": "",
  "id": "pretty-print-node-information;pretty-print-the-node-object",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I confirm node has been created",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I verify that node has the name \"Jane\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "I should find object with the engine name \"Rotax Powered John Deere\"",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should find object with nodeColor \"Magenta\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "then confirm object array is not empty",
  "keyword": "Then "
});
formatter.match({
  "location": "WiremockWednesdaysTests.i_confirm_node_has_been_created()"
});
formatter.result({
  "duration": 23741583,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jane",
      "offset": 33
    }
  ],
  "location": "WiremockWednesdaysTests.i_verify_that_node_has_the_name(String)"
});
formatter.result({
  "duration": 33759559,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Rotax Powered John Deere",
      "offset": 43
    }
  ],
  "location": "WiremockWednesdaysTests.i_should_find_object_with_the_engine_name(String)"
});
formatter.result({
  "duration": 21409806,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Magenta",
      "offset": 37
    }
  ],
  "location": "WiremockWednesdaysTests.i_should_find_object_with_nodeColor(String)"
});
formatter.result({
  "duration": 20933707,
  "status": "passed"
});
formatter.match({
  "location": "WiremockWednesdaysTests.then_confirm_object_array_is_not_empty()"
});
formatter.result({
  "duration": 20744999,
  "status": "passed"
});
});