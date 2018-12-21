package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

import static org.hamcrest.Matchers.*;

public class WiremockWednesdaysTests extends SetupServerBase {

  private ActionsObject ba = new ActionsObject();
  private String endpoint = "/findExtraNodes";

  @Before
  public void setupServer() {
    RestAssured.baseURI = "http://localhost:5550";
    ba.initServer("MCI");
  }

  @Given("^I confirm node has been created$")
  public void i_confirm_node_has_been_created() {
    ba.confirmEndpointAndGetData(endpoint, "isEmpty()", is(false));
  }

  @When("^I verify that node has the name \"([^\"]*)\"$")
  public void i_verify_that_node_has_the_name(String arg1) {
    ba.confirmEndpointAndGetData(endpoint, "name", containsString(arg1));
  }

  @When("^I should find object with the engine name \"([^\"]*)\"$")
  public void i_should_find_object_with_the_engine_name(String arg1) {
    ba.confirmEndpointAndGetData(endpoint, "engine", containsString(arg1));
  }

  @When("^I should find object with nodeColor \"([^\"]*)\"$")
  public void i_should_find_object_with_nodeColor(String arg1) {
    ba.confirmEndpointAndGetData(endpoint, "motherboard.nodeColor", containsString(arg1));
  }

  @Then("^then confirm object array is not empty$")
  public void then_confirm_object_array_is_not_empty() {
    ba.confirmEndpointAndGetData(endpoint, "isEmpty()", is(false));
  }

}//End of class
