$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("extendedBaseFeatureFile/extendedFile.feature");
formatter.feature({
  "line": 1,
  "name": "Kto ubil lenku finta",
  "description": "",
  "id": "kto-ubil-lenku-finta",
  "keyword": "Feature"
});
formatter.before({
  "duration": 550012236,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "proverit esle zdes mozhno exat",
  "description": "",
  "id": "kto-ubil-lenku-finta;proverit-esle-zdes-mozhno-exat",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "ya edu na mercedese",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "ya razgonyaus bolshe chem 100 mil v chas",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "moi krilya opuskautsa",
  "keyword": "Then "
});
formatter.match({
  "location": "CherniyBumer.ya_edu_na_mercedese()"
});
formatter.result({
  "duration": 75479748,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 26
    }
  ],
  "location": "CherniyBumer.ya_razgonyaus_bolshe_chem_mil_v_chas(int)"
});
formatter.result({
  "duration": 2183899,
  "status": "passed"
});
formatter.match({
  "location": "CherniyBumer.moi_krilya_opuskautsa()"
});
formatter.result({
  "duration": 114328,
  "status": "passed"
});
formatter.uri("mockMvcFeatures/controller.feature");
formatter.feature({
  "line": 1,
  "name": "Create and find node thru controller",
  "description": "",
  "id": "create-and-find-node-thru-controller",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4485413,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Create a node and then find that node using the provided controller features",
  "description": "",
  "id": "create-and-find-node-thru-controller;create-a-node-and-then-find-that-node-using-the-provided-controller-features",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I create a node by the name of \"Charlie\"",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I already have a node by the name of \"JohnnyFive\"",
  "keyword": "But "
});
formatter.step({
  "line": 5,
  "name": "I should receive the correct data object",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "a node by the name of \"JohnnyFive\" already exists",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should see a list containing",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "Charlie",
      "offset": 32
    }
  ],
  "location": "NodeControllerSearchTests.i_create_a_node_by_the_name_of(String)"
});
formatter.result({
  "duration": 178899121,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JohnnyFive",
      "offset": 38
    }
  ],
  "location": "NodeControllerSearchTests.i_already_have_a_node_by_the_name_of(String)"
});
formatter.result({
  "duration": 3423946,
  "status": "passed"
});
formatter.match({
  "location": "NodeControllerSearchTests.i_should_receive_the_correct_data_object()"
});
formatter.result({
  "duration": 1954142,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JohnnyFive",
      "offset": 23
    }
  ],
  "location": "NodeControllerSearchTests.a_node_by_the_name_of_already_exists(String)"
});
formatter.result({
  "duration": 221121,
  "status": "passed"
});
formatter.match({
  "location": "NodeControllerSearchTests.i_should_see_a_list_containing()"
});
formatter.result({
  "duration": 48027,
  "status": "passed"
});
formatter.uri("mockMvcFeatures/mockMvc.feature");
formatter.feature({
  "line": 1,
  "name": "The node creation feature",
  "description": "",
  "id": "the-node-creation-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4063845,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Creating a node inside of an array scenario",
  "description": "",
  "id": "the-node-creation-feature;creating-a-node-inside-of-an-array-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have a blank array",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I initialize a random element",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "a node gets created when I hit the \"/createNode/JohnnyFivve\" endpoint",
  "keyword": "Then "
});
formatter.match({
  "location": "MockMvcTests.i_have_a_blank_array()"
});
formatter.result({
  "duration": 2849261,
  "status": "passed"
});
formatter.match({
  "location": "MockMvcTests.i_initialize_a_random_element()"
});
formatter.result({
  "duration": 122670,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "/createNode/JohnnyFivve",
      "offset": 36
    }
  ],
  "location": "MockMvcTests.a_node_gets_created_when_I_hit_the_endpoint(String)"
});
formatter.result({
  "duration": 2573514,
  "status": "passed"
});
formatter.uri("outlineServiceWithWiremock/wiremock.feature");
formatter.feature({
  "line": 1,
  "name": "Express board creation",
  "description": "",
  "id": "express-board-creation",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3513559,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "Find space for the creation of wiremock data",
  "description": "",
  "id": "express-board-creation;find-space-for-the-creation-of-wiremock-data",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I have element space inside of my array",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "a motherboard by the name of \"Sally\" has already been created",
  "keyword": "But "
});
formatter.step({
  "line": 6,
  "name": "I create a board named \"shutTheFrontDoor\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I have a free node",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I should still see available space",
  "keyword": "Then "
});
formatter.match({
  "location": "WiremockCucumber.i_have_element_space_inside_of_my_array()"
});
formatter.result({
  "duration": 201156,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Sally",
      "offset": 30
    }
  ],
  "location": "WiremockCucumber.a_motherboard_by_the_name_of_has_already_been_created(String)"
});
formatter.result({
  "duration": 894733353,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "shutTheFrontDoor",
      "offset": 24
    }
  ],
  "location": "WiremockCucumber.i_create_a_board_named(String)"
});
formatter.result({
  "duration": 38256078,
  "status": "passed"
});
formatter.match({
  "location": "WiremockCucumber.i_have_a_free_node()"
});
formatter.result({
  "duration": 113661,
  "status": "passed"
});
formatter.match({
  "location": "WiremockCucumber.i_should_still_see_available_space()"
});
formatter.result({
  "duration": 127590,
  "status": "passed"
});
formatter.uri("unspecifiedError/unspecified/unspecified.feature");
formatter.feature({
  "line": 1,
  "name": "testing the gradle error",
  "description": "",
  "id": "testing-the-gradle-error",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3775693,
  "status": "passed"
});
formatter.scenario({
  "line": 2,
  "name": "verify creation",
  "description": "",
  "id": "testing-the-gradle-error;verify-creation",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "I have sapce in array",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I creation from terminal",
  "keyword": "When "
});
formatter.step({
  "line": 5,
  "name": "I have one less space",
  "keyword": "Then "
});
formatter.match({
  "location": "Unspecified.i_have_sapce_in_array()"
});
formatter.result({
  "duration": 2054242,
  "status": "passed"
});
formatter.match({
  "location": "Unspecified.i_creation_from_terminal()"
});
formatter.result({
  "duration": 98286,
  "status": "passed"
});
formatter.match({
  "location": "Unspecified.i_have_one_less_space()"
});
formatter.result({
  "duration": 123379,
  "status": "passed"
});
});