package com.testingWithGradle.testingWithGradle.controllerMockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;


/*
* Data can only be passed from either Given, When or Then but
* not from muliple methods at once. If you would like to pass
* multipe sets of data then use But or And methods*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class NodeControllerSearchTests {

  @Autowired
  private MockMvc mockMvc;

  private ZportStation station = new ZportStation();

  @Given("^I create a node by the name of \"([^\"]*)\"$")
  public void i_create_a_node_by_the_name_of(String arg1) throws Throwable {
    MockHttpServletResponse response = mockMvc.perform(get("/createNode/" + arg1)).andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(arg1))
        .andReturn().getResponse();

    System.out.println("RESULTS FROM NODE CONTROLLER TEST --> " + response.getContentAsString());
  }

  @Given("^I already have a node by the name of \"([^\"]*)\"$")
  public void i_already_have_a_node_by_the_name_of(String arg1) throws Throwable {
    station.addNodeForMvcTest(arg1);
    MockHttpServletResponse res = mockMvc.perform(get("/createNode/" + arg1)).andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(arg1))
        .andReturn().getResponse();

    System.out.println("Res from But method passing second set of data --> " + res.getContentAsString());
  }

  @When("^I should receive the correct data object$")
  public void i_should_receive_the_correct_data_object() throws Throwable {
    System.out.println("IT WORKS");
  }

  @Test
  @Then("^I should see a list containing$")
  public void i_should_see_a_list_containing() throws Throwable {
    System.out.println("IT WORKS");
  }
}
