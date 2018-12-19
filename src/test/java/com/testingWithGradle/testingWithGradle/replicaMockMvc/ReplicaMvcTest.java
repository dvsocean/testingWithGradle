package com.testingWithGradle.testingWithGradle.replicaMockMvc;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.testingWithGradle.testingWithGradle.TestingWithGradleApplication;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

/*
 * In order to mix cucumber with a mockMvc test the
 * @ContextConfiguration annotation must be included
 * exactly as I have included it in this file*/
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = TestingWithGradleApplication.class)
public class ReplicaMvcTest {

  @Autowired
  private MockMvc mockMvc;

  private String nodeName;

  @Test
  @Given("^I hit the correct endpoint$")
  public void i_hit_the_correct_endpoint() throws Throwable {
    System.out.println("proper service has been accessed");
  }

  @When("^I provide \"([^\"]*)\" as the node name$")
  public void i_provide_as_the_node_name(String arg1) throws Throwable {
    nodeName = arg1;
    mockMvc.perform(get("/createNode/" + arg1))
        .andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(arg1));
  }

  @When("^I make sure station size is not empty$")
  public void i_make_sure_station_size_is_not_empty() throws Throwable {
    mockMvc.perform(get("/createNode/" + nodeName))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$").isNotEmpty());
  }

  @When("^Im able to find \"([^\"]*)\" in the garage$")
  public void im_able_to_find_in_the_garage(String arg1) throws Throwable {
    mockMvc.perform(get("/findNode/" + arg1)).andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(arg1));
  }

  @Then("^the created node should exist in the station$")
  public void the_created_node_should_exist_in_the_station() throws Throwable {
    MockHttpServletResponse res = mockMvc.perform(get("/findNode/" + nodeName))
        .andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(nodeName))
        .andReturn().getResponse();

    System.out.println("Last created node with name " + nodeName + " is --> " + res.getContentAsString());
  }



}//End of class
