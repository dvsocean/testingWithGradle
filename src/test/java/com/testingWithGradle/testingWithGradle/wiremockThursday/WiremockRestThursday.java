package com.testingWithGradle.testingWithGradle.wiremockThursday;

import com.testingWithGradle.testingWithGradle.wiremockWednesdays.ActionsObject;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.hamcrest.Matchers.containsString;

public class WiremockRestThursday {

    private ActionsObject actionsObject = new ActionsObject();

    private String motherBoardName;
    private String endpoint = "/findExtraNodes";

    @Given("^I have provided \"([^\"]*)\" as a motherboard name$")
    public void i_have_provided_as_a_motherboard_name(String arg1) {
        motherBoardName = arg1;
    }

    @When("^I create a node from the given name$")
    public void i_create_a_node_from_the_given_name() {
        actionsObject.initServer(motherBoardName);
    }

    @Then("^I verify that the object color attribute is \"([^\"]*)\"$")
    public void i_verify_that_the_object_color_attribute_is(String arg1) {
        actionsObject.confirmEndpointAndGetData(endpoint, "motherboard.nodeColor", containsString(arg1));
    }

    @Then("^I verify that nodes engine is \"([^\"]*)\" for agility and horsepower$")
    public void i_verify_that_nodes_engine_is_for_agility_and_horsepower(String arg1) {
        actionsObject.confirmEndpointAndGetData(endpoint, "engine", containsString(arg1));
    }

    @Then("^I verify that node has the proper attribute$")
    public void i_verify_that_node_has_the_proper_attribute() {
        actionsObject.confirmEndpointAndGetData(endpoint, "motherboard.nodeName", containsString(motherBoardName));
    }

}//End of class
