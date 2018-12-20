package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import com.testingWithGradle.testingWithGradle.wiremock.BaseWireMock;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class WiremockWednesdaysTests extends BaseWireMock {

  private BackgroundActions gba = new BackgroundActions();

  @Given("^I initialize my mock server$")
  public void i_initialize_my_mock_server() throws Throwable {
    gba.initServer();
  }

  @When("^I confirm node has been created$")
  public void i_confirm_node_has_been_created() throws Throwable {
    gba.validateCreatedNode();
  }

  @Then("^I should find object with the name \"([^\"]*)\"$")
  public void i_should_find_object_with_the_name(String arg1) throws Throwable {
    gba.confirmObjectHasCorrectName(arg1);
  }

  @Then("^I should find object with the engine name \"([^\"]*)\"$")
  public void i_should_find_object_with_the_engine_name(String arg1) throws Throwable {
    gba.confirmObjectWithEngineName(arg1);
  }

  @Then("^I should find object with nodeColor \"([^\"]*)\"$")
  public void i_should_find_object_with_nodeColor(String arg1) throws Throwable {
    gba.confirmObjectWithNodeColor(arg1);
  }

}//End of class
