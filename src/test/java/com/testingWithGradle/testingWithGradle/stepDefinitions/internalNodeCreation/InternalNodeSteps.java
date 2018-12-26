package com.testingWithGradle.testingWithGradle.stepDefinitions.internalNodeCreation;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;

public class InternalNodeSteps {

  private Nodes lookUpClassLevelNode;

  private ZportStation zportStation = new ZportStation();

  @Given("^I prepare multiple users and initialize multiple nodes$")
  public void i_prepare_multiple_users_and_initialize_multiple_nodes() {
    System.out.println("Preparing to initialize multiple nodes");
  }

  @Given("^I provide the node names$")
  public void i_provide_the_node_names(DataTable fromFeatureFile) {
    List<List<String>> data = fromFeatureFile.raw();
    zportStation.addNodeForMvcTest(data.get(0).get(0));
    zportStation.addNodeForMvcTest(data.get(0).get(1));
    zportStation.addNodeForMvcTest(data.get(0).get(2));
    zportStation.addNodeForMvcTest(data.get(0).get(3));

    for(List<String> d: data) {
      for (int i = 0; i < d.size(); i++) {
        System.out.println("Multi --> " + d.get(i));
      }
    }
  }

  @When("^I lookup a node with the name \"([^\"]*)\"$")
  public void i_lookup_a_node_with_the_name(String lookUpNode) {
    lookUpClassLevelNode = zportStation.retrieveByMotherboardName(lookUpNode);
  }

  @Then("^I should be able to assert the name$")
  public void i_should_be_able_to_assert_the_name() {
    assertThat("4matic", is(lookUpClassLevelNode.getMotherboard().getNodeName()));
  }

}//End of class
