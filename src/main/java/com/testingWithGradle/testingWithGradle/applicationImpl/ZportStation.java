package com.testingWithGradle.testingWithGradle.applicationImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import java.util.ArrayList;
import java.util.List;
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

}//End of class
