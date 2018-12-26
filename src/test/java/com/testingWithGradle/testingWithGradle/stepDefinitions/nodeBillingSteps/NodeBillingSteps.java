package com.testingWithGradle.testingWithGradle.stepDefinitions.nodeBillingSteps;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class NodeBillingSteps {

  private Nodes classLevelNode;

  @Steps
  private com.testingWithGradle.testingWithGradle.stepDefinitions.steps.NodeBillingSteps nodeBillingSteps;

  @Given("^I create a node$")
  public void i_create_a_node() {
    System.out.println("Node creation started");
  }

  @Given("^give it the name \"([^\"]*)\"$")
  public void give_it_the_name(String motherBoardName) {
    classLevelNode = nodeBillingSteps.createNode(motherBoardName);
    System.out.println("CREATED NODE --> " + classLevelNode.getMotherboard().getNodeName());
  }

  @When("^I update the node with name \"([^\"]*)\"$")
  public void i_update_the_node_with_name(String newNodeName) {
    nodeBillingSteps.updateNode(classLevelNode.getMotherboard().getNodeName(), newNodeName);
  }

  @When("^provide a name \"([^\"]*)\" for new node color \"([^\"]*)\"$")
  public void provide_a_name_for_new_node_color(String newName, String newColor) {
    nodeBillingSteps.provideNewColor(newName, newColor);
  }

  @Then("^I should be able to assert new node$")
  public void i_should_be_able_to_assert_new_node() {
    assertThat("CinderBlocks", is(classLevelNode.getMotherboard().getNodeName()));
  }

}//End of class
