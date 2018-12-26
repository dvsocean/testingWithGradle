package com.testingWithGradle.testingWithGradle;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/java/com/testingWithGradle/testingWithGradle/features/nodeBilling")
public class NodeBillingTestSuite {

}
