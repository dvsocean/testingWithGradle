package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import io.restassured.response.Response;

import static org.hamcrest.Matchers.containsString;

public class BackgroundActions extends SetupServerBase {

    public void initServer() throws Throwable {
        wireMockRule.start();
        setupMockServer("Joe");
        Response res = confirmData();
        System.out.println("PRE PRINT --> " + res.prettyPrint());
        wireMockRule.stop();
    }

    public void validateCreatedNode() throws Throwable {
        wireMockRule.start();
        Response res = confirmData();
        res.then().body("color", containsString("Green"));
        wireMockRule.stop();
    }

    public void confirmObjectHasCorrectName(String name) {
        wireMockRule.start();
        Response res = confirmData();
        res.then().body("name", containsString(name));
        wireMockRule.stop();
    }

    public void confirmObjectWithEngineName(String engineName) {
        wireMockRule.start();
        Response res = confirmData();
        res.then().body("engine", containsString(engineName));
        wireMockRule.stop();
    }

    public void confirmObjectWithNodeColor(String nodeColor) {
        wireMockRule.start();
        Response res = confirmData();
        res.then().body("motherboard.nodeColor", containsString(nodeColor));
        wireMockRule.stop();
    }
}//End of class
