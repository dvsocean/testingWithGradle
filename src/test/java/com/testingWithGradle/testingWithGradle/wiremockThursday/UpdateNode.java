package com.testingWithGradle.testingWithGradle.wiremockThursday;

import com.testingWithGradle.testingWithGradle.wiremockWednesdays.ActionsObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.Matchers.containsString;

public class UpdateNode {

    private ActionsObject actionsObject = new ActionsObject();
    private String endpoint = "/findExtraNodes";

    @Given("^I created a node$")
    public void i_created_a_node() throws Throwable {
        actionsObject.initServer("John Rambo");
    }

    @When("^I update the node with \"([^\"]*)\" engine and \"([^\"]*)\" color$")
    public void i_update_the_node_with_engine_and_color(String engine, String color) throws Throwable {
        actionsObject.updateNode(engine, color);
    }

    @Then("^I confirm the node by checking attributes for \"([^\"]*)\"$")
    public void i_confirm_the_node_by_checking_attributes_for(String arg1) throws Throwable {
        actionsObject.confirmEndpointAndGetData(endpoint, "engine", containsString(arg1));
    }

}//End of class
