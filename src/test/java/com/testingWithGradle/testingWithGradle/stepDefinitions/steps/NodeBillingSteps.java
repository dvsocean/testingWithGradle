package com.testingWithGradle.testingWithGradle.stepDefinitions.steps;

import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import net.thucydides.core.annotations.Step;

public class NodeBillingSteps {

  private ZportStation zportStation = new ZportStation();

  @Step
  public Nodes createNode(String name ){
    return zportStation.addNodeForMvcTest(name);
  }

  @Step
  public void updateNode(String oldName, String newName){
    Nodes node = zportStation.retrieveByMotherboardName(oldName);
    node.setMotherboard(new Motherboard(newName));
    System.out.println("NODECOLOR BEFORE UPDATE --> " + node.getColor());
    System.out.println("NODENAME BEFORE UPDATE --> " + node.getMotherboard().getNodeName());
  }

  @Step
  public void provideNewColor(String name, String newColor){
    Nodes node  = zportStation.retrieveByMotherboardName(name);
    node.setColor(newColor);
    System.out.println("AFTER UPDATE --> " + node.getColor());
  }

}//End of class
