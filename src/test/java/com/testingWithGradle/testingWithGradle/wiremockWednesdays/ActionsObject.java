package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.hamcrest.Matcher;
import org.json.JSONException;

public class ActionsObject extends SetupServerBase {

    public void initServer(String motherboardName) {
        setupMockServer(motherboardName);
        wireMockRule.start();
        Response res = RestAssured.given().when().get("/findExtraNodes");
        wireMockRule.stop();
        System.out.println("MOCKED SERVER OUTPUT --> " + res.prettyPrint());
    }

    public void confirmEndpointAndGetData(String endpoint, String target, Matcher matcher){
        wireMockRule.start();
        RestAssured.given().when().get(endpoint)
                .then().body(target, (Matcher<?>) matcher);
        wireMockRule.stop();
    }

    public void updateNode(String engine, String color) throws JSONException {
        Nodes node = new Nodes(new Motherboard("Aikey"));
        node.setEngine(engine);
        node.setColor(color);
        setupMockServerForUpdatedNode(node);
        wireMockRule.start();
        Response res = RestAssured.given().when().get("/findExtraNodes");
        wireMockRule.stop();
        System.out.println("UPDATED NODE OUTPUT --> " + res.prettyPrint());
    }

}//End of class
