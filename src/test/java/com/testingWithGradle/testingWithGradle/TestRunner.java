package com.testingWithGradle.testingWithGradle;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;


//@ContextConfiguration(classes = TestingWithGradleApplication.class)
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/danikasRezultati.html"},
                  features = {"src/test/resources"})
@SpringBootTest
public class TestRunner {

}
