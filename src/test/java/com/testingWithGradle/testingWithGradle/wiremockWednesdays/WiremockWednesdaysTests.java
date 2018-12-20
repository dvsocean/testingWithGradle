package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

public class WiremockWednesdaysTests extends SetupServerBase {

  private BackgroundActions ba = new BackgroundActions();

  @Before
  public void setupServer() throws Throwable {
    RestAssured.baseURI = "http://localhost:5550";
    ba.initServer("MCI");
  }

  @Given("^I confirm node has been created$")
  public void i_confirm_node_has_been_created() throws Throwable {
    ba.validateCreatedNode();
  }

  @When("^I verify that node has the name \"([^\"]*)\"$")
  public void i_verify_that_node_has_the_name(String arg1) throws Throwable {
    ba.confirmObjectHasCorrectName(arg1);
  }

  @When("^I should find object with the engine name \"([^\"]*)\"$")
  public void i_should_find_object_with_the_engine_name(String arg1) throws Throwable {
    ba.verifyEngine(arg1);
  }

  @When("^I should find object with nodeColor \"([^\"]*)\"$")
  public void i_should_find_object_with_nodeColor(String arg1) throws Throwable {
    ba.verifyNodeColor(arg1);
  }

  @Then("^then confirm object array is not empty$")
  public void then_confirm_object_array_is_not_empty() throws Throwable {
    ba.validateCreatedNode();
  }

}//End of class
