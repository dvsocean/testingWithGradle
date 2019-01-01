package com.testingWithGradle.testingWithGradle.nodes;

import com.testingWithGradle.testingWithGradle.boards.Motherboard;

public class Nodes extends NodeSelector {

  private int nodeId = generateUniqueID();
  private String nodeName = randomNodeNameSelector();
  private String nodeColor = randomNodeColorSelector();
  private String nodeType = randomNodeTypeSelector();
  private String nodeEngine = randomNodeEngineSelector();

  private boolean isValid;

  public Motherboard motherboard;

  public Nodes(Motherboard motherboard) {
   this.motherboard = motherboard;

  }

  public Nodes(){
    //So mockito wont complain
  }

  public int getNodeId() {
    return nodeId;
  }

  public void setNodeId(int nodeId) {
    this.nodeId = nodeId;
  }

  public String getNodeName() {
    return nodeName;
  }

  public void setNodeName(String nodeName) {
    this.nodeName = nodeName;
  }

  public String getNodeColor() {
    return nodeColor;
  }

  public void setNodeColor(String nodeColor) {
    this.nodeColor = nodeColor;
  }

  public String getNodeType() {
    return nodeType;
  }

  public void setNodeType(String nodeType) {
    this.nodeType = nodeType;
  }

  public String getNodeEngine() {
    return nodeEngine;
  }

  public void setNodeEngine(String nodeEngine) {
    this.nodeEngine = nodeEngine;
  }

  public boolean isValid() {
    return isValid;
  }

  public void setValid(boolean valid) {
    isValid = valid;
  }

  public Motherboard getMotherboard() {
    return motherboard;
  }

  public void setMotherboard(Motherboard motherboard) {
    this.motherboard = motherboard;
  }
}
