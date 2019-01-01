package com.testingWithGradle.testingWithGradle.applicationImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import org.springframework.stereotype.Component;

@Component
public class ZportStation {

  private List<Nodes> nodesGarage = new ArrayList<Nodes>();

  public List<Nodes> getNodesGarage() {
    return nodesGarage;
  }

  public Nodes findNodeById(int id) {
    for(Nodes node: nodesGarage) {
      if(node.getNodeId() == id){
        return node;
      }
    }
    return null;
  }

  public boolean addSingleNode(Nodes node) {
    return nodesGarage.add(node);
  }

  public Nodes retrieveByMotherboardName(String name) {
    for(Nodes node : nodesGarage) {
      if(node.getMotherboard().getMotherboardName().equalsIgnoreCase(name)){
        return node;
      }
    }
    return null;
  }

  public boolean returnNodeColor() {
    for(Nodes node : nodesGarage) {
      if(node.getNodeColor().length() > 0){
        return true;
      }
    }
    return false;
  }

  public void debugPrint() throws JsonProcessingException {
    ObjectMapper mapper = new ObjectMapper();
    for(Nodes node : nodesGarage) {
      System.out.println(mapper.writeValueAsString(node));
    }
  }

  public Nodes addNodeForMvcTest(String name) {
    Nodes node = new Nodes(new Motherboard(name));
    nodesGarage.add(node);
    return node;
  }

  public Nodes validateNodeIfJavascriptEngineFound(Nodes toValidate){
    if(nodesGarage.size() > 0){
      for(Nodes node : nodesGarage) {
        if(node.getNodeEngine().equalsIgnoreCase(toValidate.getNodeEngine())){
          toValidate.setValid(true);
        }
      }
    }
    return toValidate;
  }

  public Nodes fetchFilteredNode(String motherboardName, Predicate<Nodes> prd) {
    for(Nodes node : nodesGarage) {
      if(node.getMotherboard().getMotherboardName().equals(motherboardName)){
        if(prd.test(node)){
          return node;
        } else {
          node.errorMessage("NOT FOUND");
        }
      }
    }
    return null;
  }

  public void ifNodeIdIsAboveFiftyThenReassignValues(Nodes nd, Predicate<Nodes> prd) {
    if(nd.getNodeId() > 50){
      if(prd.test(nd)){
        nd.setNodeType("PASSED CONDITIONALS, VALUE RE-ASSIGNED --> POSITIVE!");
      }
    }
  }

}//End of class
