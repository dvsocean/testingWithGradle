$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/extendedBaseFeatureFile/extendedFile.feature");
formatter.feature({
  "name": "Kto ubil lenku finta",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "proverit esle zdes mozhno exat",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "ya edu na mercedese",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "ya razgonyaus bolshe chem 100 mil v chas",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "moi krilya opuskautsa",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/mockMvcFeatures/controller.feature");
formatter.feature({
  "name": "Create and find node thru controller",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Create a node and then find that node using the provided controller features",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I create a node by the name of \"Charlie\"",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I already have a node by the name of \"JohnnyFive\"",
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should receive the correct data object",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a node by the name of \"JohnnyFive\" already exists",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should see a list containing",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/mockMvcFeatures/mockMvc.feature");
formatter.feature({
  "name": "The node creation feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Creating a node inside of an array scenario",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have a blank array",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I initialize a random element",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a node gets created when I hit the \"/createNode/JohnnyFivve\" endpoint",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/mockMvcFeatures/replicaMvc.feature");
formatter.feature({
  "name": "Create a node",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Node creation providing multiple params",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I hit the correct endpoint",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I provide \"TechJunkie\" as the node name",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I make sure station size is not empty",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Im able to find \"TechJunkie\" in the garage",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "the created node should exist in the station",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/outlineServiceWithWiremock/wiremock.feature");
formatter.feature({
  "name": "Express board creation",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Find space for the creation of wiremock data",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have element space inside of my array",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "a motherboard by the name of \"Sally\" has already been created",
  "keyword": "But "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I create a board named \"shutTheFrontDoor\"",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I have a free node",
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I should still see available space",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/unspecifiedError/unspecified/unspecified.feature");
formatter.feature({
  "name": "testing the gradle error",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "verify creation",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I have sapce in array",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I creation from terminal",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I have one less space",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.uri("src/test/resources/wiremockWednesdays/wiremockWednesdays.feature");
formatter.feature({
  "name": "Pretty print node information",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I initialize my mock server",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I check for the created node",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Using the background keyword, pretty print the node object",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should find object with the correct name",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "I initialize my mock server",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "I check for the created node",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Pretty printing the object after its been auto generated",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "I should discover object color",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});