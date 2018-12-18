package com.testingWithGradle.testingWithGradle.replicaMockMvc;

import static org.hamcrest.Matchers.hasSize;
import static org.junit.Assert.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.jayway.jsonpath.JsonPath;
import com.testingWithGradle.testingWithGradle.TestingWithGradleApplication;
import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
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

  private ZportStation station = new ZportStation();

  @Test
  @Given("^I hit the correct endpoint$")
  public void i_hit_the_correct_endpoint() throws Throwable {
    System.out.println("proper service has been accessed");
  }

  @When("^I provide \"([^\"]*)\" as the node name$")
  public void i_provide_as_the_node_name(String arg1) throws Throwable {
    MockHttpServletResponse res = mockMvc.perform(get("/createNode/" + arg1))
        .andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value(arg1))
        .andReturn().getResponse();

    System.out.println("RES from ReplicaMvc --> " + res.getContentAsString());
  }

  @When("^I make sure station size is (\\d+)$")
  public void i_make_sure_station_size_is(int arg1) throws Throwable {
    MockHttpServletResponse res = mockMvc.perform(get("/createNode/Harrelson"))
        .andExpect(status().isOk())
        .andReturn().getResponse();
  }

  @When("^Im able to find \"([^\"]*)\" in the garage$")
  public void im_able_to_find_in_the_garage(String arg1) throws Throwable {
    //assertEquals(arg1, station.retrieveByMotherboardName(arg1).getMotherboard().getNodeName());
  }

  @Then("^total nodeGarage size should be (\\d+)$")
  public void total_nodeGarage_size_should_be(int arg1) throws Throwable {
    //assertEquals(arg1, station.getNodesGarage().size());
  }

}//End of class
