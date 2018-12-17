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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "ya edu na mercedese",
  "keyword": "Given "
});
formatter.match({
  "location": "CherniyBumer.ya_edu_na_mercedese()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "ya razgonyaus bolshe chem 100 mil v chas",
  "keyword": "When "
});
formatter.match({
  "location": "CherniyBumer.ya_razgonyaus_bolshe_chem_mil_v_chas(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "moi krilya opuskautsa",
  "keyword": "Then "
});
formatter.match({
  "location": "CherniyBumer.moi_krilya_opuskautsa()"
});
formatter.result({
  "status": "passed"
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
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I have element space inside of my array",
  "keyword": "Given "
});
formatter.match({
  "location": "WiremockCucumber.i_have_element_space_inside_of_my_array()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "a motherboard by the name of \"Sally\" has already been created",
  "keyword": "But "
});
formatter.match({
  "location": "WiremockCucumber.a_motherboard_by_the_name_of_has_already_been_created(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I create a board named \"shutTheFrontDoor\"",
  "keyword": "When "
});
formatter.match({
  "location": "WiremockCucumber.i_create_a_board_named(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I have a free node",
  "keyword": "And "
});
formatter.match({
  "location": "WiremockCucumber.i_have_a_free_node()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should still see available space",
  "keyword": "Then "
});
formatter.match({
  "location": "WiremockCucumber.i_should_still_see_available_space()"
});
formatter.result({
  "status": "passed"
});
});