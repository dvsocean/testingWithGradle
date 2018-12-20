package com.testingWithGradle.testingWithGradle.wiremockWednesdays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import io.restassured.RestAssured;
import org.hamcrest.Matcher;
import org.junit.Rule;

import static com.github.tomakehurst.wiremock.client.WireMock.*;

public class SetupServerBase {

    //Access modifier needs to be public if class is being inherited
    @Rule
    public WireMockRule wireMockRule = new WireMockRule(5550);

    protected void confirmData(String endpoint, String target, Matcher matchers){
        RestAssured.given().when().get(endpoint)
                .then().body(target, (Matcher<?>) matchers);
    }

    protected void setupMockServer(String name){
        Nodes node = new Nodes(new Motherboard(name));
        wireMockRule.stubFor(get(urlMatching("/findExtraNodes"))
                .willReturn(aResponse()
                        .withStatus(200)
                        .withHeader("Content-Type", "application/json")
                        .withBody(convertToJson(node))));
    }

    private String convertToJson(Nodes node){
        ObjectMapper mapper = new ObjectMapper();
        String json = "";
        try {
            json = mapper.writeValueAsString(node);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return json;
    }
}
