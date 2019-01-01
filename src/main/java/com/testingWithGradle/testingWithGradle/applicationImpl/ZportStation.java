package com.testingWithGradle.testingWithGradle.applicationImpl;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
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
          node.getMotherboard().setMotherboardColor("MOTHERBOARD FOUND, FILTER APPLIED --> BLACK ON BLACK");
          node.getMotherboard().setMotherboardType("MOTHERBOARD FOUND, FILTER APPLIED --> BLACK ON BLACK");
          node.getMotherboard().setMotherboardEngine("MOTHERBOARD FOUND, FILTER APPLIED --> BLACK ON BLACK");
          node.getMotherboard().setMotherboardBrand("MOTHERBOARD FOUND, FILTER APPLIED --> BLACK ON BLACK");
          node.getMotherboard().setMotherboardModel("MOTHERBOARD FOUND, FILTER APPLIED --> BLACK ON BLACK");
          return node;
        }
      }
    }
    return new Nodes(new Motherboard("MotherboardName not found --> created a blank Node"));
  }

  /*Because we are using a functional interface we are not using the "implements" keyword
  * at the class level. Simply pass it in as an argument*/
  public void ifNodeIdIsAboveFiftyThenReassignValues(Nodes nd, Predicate<Nodes> prd) {
    if(prd.test(nd)){
      nd.setNodeType("PASSED CONDITIONALS, VALUE RE-ASSIGNED --> POSITIVE!");
    } else {
      nd.setNodeType("RE-ASSIGN FAILED, NODE ID UNDER 200");
    }
  }
  /*the predicate interface is a generic interface but here we are passing
  * in the actual data type making it a parametrized type*/

  public Nodes locateEngineFor(Nodes n, Predicate<Nodes> prd) {
    if(prd.test(n)){
      n.setValid(true);
      return n;
    } else {
      n.getMotherboard().setMotherboardEngine("CANNOT VALIDATE WITH NO ENGINE");
      return n;
    }
  }

  //As opposed to Predicate, the Consumer interface is responsible for performing actions
  public void updateTagsWithGivenNode(Nodes node, Consumer<Nodes> cns) {
    cns.accept(node);
  }


  public Nodes confirmAndValidate(Nodes node, Function<Nodes, String> fn, Predicate<String> prd) {
    String data = fn.apply(node);
    if(prd.test(data)){
      node.setValid(true);
    } else {
      node.setNodeType("TYPE REVOKED DUE TO VALIDATION FAILURE");
    }
    return node;
  }

}//End of class
