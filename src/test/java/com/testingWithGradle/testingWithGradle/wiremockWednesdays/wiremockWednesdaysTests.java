package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import com.testingWithGradle.testingWithGradle.wiremock.BaseWireMock;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;

public class wiremockWednesdaysTests extends BaseWireMock {

  @Before
  public void setup(){
    RestAssured.baseURI = "http://localhost:5550";
  }

  @Given("^I initialize my mock server$")
  public void i_initialize_my_mock_server() throws Throwable {
    setupMockServer("Joe");
  }

  @When("^I check for the created node$")
  public void i_check_for_the_created_node() throws Throwable {

  }

  @Then("^I should find object with the correct name$")
  public void i_should_find_object_with_the_correct_name() throws Throwable {

  }

  @Then("^I should discover object color$")
  public void i_should_discover_object_color() throws Throwable {

  }

}//End of class
