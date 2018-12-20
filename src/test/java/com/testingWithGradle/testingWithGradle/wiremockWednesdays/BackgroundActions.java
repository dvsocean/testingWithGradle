package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import static org.hamcrest.Matchers.*;

public class BackgroundActions extends SetupServerBase {

    public void initServer(String motherboardName) throws Throwable {
        wireMockRule.start();
        setupMockServer(motherboardName);
        confirmData();
        wireMockRule.stop();
    }

    public void validateCreatedNode() throws Throwable {
        wireMockRule.start();
        confirmData().then().body("isEmpty()", is(false));
        wireMockRule.stop();
    }

    public void confirmObjectHasCorrectName(String name) {
        wireMockRule.start();
        confirmData().then().body("name", containsString(name));
        wireMockRule.stop();
    }

    public void confirmObjectWithEngineName(String engineName) {
        wireMockRule.start();
        confirmData().then().body("engine", containsString(engineName));
        wireMockRule.stop();
    }

    public void confirmObjectWithNodeColor(String nodeColor) {
        wireMockRule.start();
        confirmData().then().body("motherboard.nodeColor", containsString(nodeColor));
        wireMockRule.stop();
    }

}//End of class
