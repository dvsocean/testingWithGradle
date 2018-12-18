package com.testingWithGradle.testingWithGradle.mockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.testingWithGradle.testingWithGradle.TestingWithGradleApplication;
import com.testingWithGradle.testingWithGradle.controller.NodeController;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootContextLoader;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ContextConfiguration(loader = SpringBootContextLoader.class, classes = TestingWithGradleApplication.class)
public class MockMvcTests {

  @Autowired
  private MockMvc mockMvc;

  //private ZportStation station = new ZportStation();


  @Given("^I have a blank array$")
  public void i_have_a_blank_array() throws Throwable {
    System.out.println("MockMvc1 is responding");
  }

  @When("^I initialize a random element$")
  public void i_initialize_a_random_element() throws Throwable {
    System.out.println("MockMvc2 is responding");
  }

  @Test
  @Then("^a node gets created inside of the array$")
  public void a_node_gets_created_inside_of_the_array() throws Throwable {
    //station.addNodeForMvcTest("Zero");
    MockHttpServletResponse res = mockMvc.perform(get("/createNode/JohnnyFivve"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value("JohnnyFivve"))
        .andReturn().getResponse();

    System.out.println("mmMockMvc Results --> " + res.getContentAsString());
  }

}
