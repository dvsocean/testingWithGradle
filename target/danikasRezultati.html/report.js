$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("wiremockWednesdays/wiremockWednesdays.feature");
formatter.feature({
  "line": 1,
  "name": "Pretty print node information",
  "description": "",
  "id": "pretty-print-node-information",
  "keyword": "Feature"
});
formatter.before({
  "duration": 438256262,
  "status": "passed"
});
formatter.before({
  "duration": 4435035,
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
  "duration": 1016207107,
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
  "duration": 37428514,
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
  "duration": 26682286,
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
  "duration": 155073086,
  "status": "passed"
});
formatter.match({
  "location": "WiremockWednesdaysTests.then_confirm_object_array_is_not_empty()"
});
formatter.result({
  "duration": 24967116,
  "status": "passed"
});
});