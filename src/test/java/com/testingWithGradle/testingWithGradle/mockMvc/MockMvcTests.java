package com.testingWithGradle.testingWithGradle.mockMvc;

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
public class MockMvcTests {

  @Autowired
  private MockMvc mockMvc;

  //private ZportStation station = new ZportStation();

  //Must have at least one @Test annotation so that runnable methods can be detected, this annotation can be attached to any method
  @Test
  @Given("^I have a blank array$")
  public void i_have_a_blank_array() throws Throwable {
    System.out.println("MockMvc1 is responding");
  }

  @When("^I initialize a random element$")
  public void i_initialize_a_random_element() throws Throwable {
    System.out.println("MockMvc2 is responding");
  }

  /*
  * Keep in mind that a controller needs to be in the code base
  * if you want to perform a mockMvc test
  * */
  @Then("^a node gets created when I hit the \"([^\"]*)\" endpoint$")
  public void a_node_gets_created_when_I_hit_the_endpoint(String arg1) throws Throwable {
    MockHttpServletResponse res = mockMvc.perform(get(arg1))
        .andExpect(status().isOk())
        .andExpect(jsonPath("motherboard.nodeName").value("JohnnyFivve"))
        .andReturn().getResponse();

    System.out.println("mmMockMvc Results --> " + res.getContentAsString());
  }

}//End of class
