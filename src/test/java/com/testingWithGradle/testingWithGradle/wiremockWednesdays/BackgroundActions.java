package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import static org.hamcrest.Matchers.containsString;
import static org.hamcrest.Matchers.is;

public class BackgroundActions extends SetupServerBase {

    public void initServer(String motherboardName) throws Throwable {
        setupMockServer(motherboardName);
    }

    public void validateCreatedNode() throws Throwable {
        wireMockRule.start();
        confirmData("/findExtraNodes", "isEmpty()", is(false));
        wireMockRule.stop();
    }

    public void confirmObjectHasCorrectName(String name) {
        wireMockRule.start();
        confirmData("/findExtraNodes", "name", containsString(name));
        wireMockRule.stop();
    }

    public void verifyEngine(String engineName){
        wireMockRule.start();
        confirmData("/findExtraNodes", "engine", containsString(engineName));
        wireMockRule.stop();
    }

    public void verifyNodeColor(String nodeColor){
        wireMockRule.start();
        confirmData("/findExtraNodes", "motherboard.nodeColor", containsString(nodeColor));
        wireMockRule.stop();
    }

}//End of class
