package com.testingWithGradle.testingWithGradle.controller;

import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
import com.testingWithGradle.testingWithGradle.boards.WireHarness;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

  @Autowired
  private ZportStation zportStation;

  @RequestMapping(value = "/findNode/{name}")
  public Nodes findSingleNode(@PathVariable("name") String name) {
    return zportStation.retrieveByMotherboardName(name);
  }

  @RequestMapping(value = "/createNode/{name}")
  public Nodes createSingleNode(@PathVariable("name") String name) {
    zportStation.addNodeForMvcTest(name);
    return zportStation.retrieveByMotherboardName(name);
  }

  @RequestMapping(value = "/showAll")
  public List<Nodes> showAllNodes() {
    return zportStation.getNodesGarage();
  }

  /*
  curl -H "Content-Type: application/json" -d '{"engine":"SuperChargedJavaScript", "color":"Stripped and coiled"}' -X POST http://localhost:5050/updateNode/{name}
  or to be more explicit use..
  curl --header "Content-Type: application/json" --data '{"engine":"V55","color":"black and yellow"}' -X POST http://localhost:5050/updateNode/{name}
  * */
  @PostMapping(value = "/updateNode/{name}")
  public Nodes updateNode(@PathVariable("name") String name, @RequestBody Nodes node){
    Nodes toUpdate = zportStation.retrieveByMotherboardName(name);
    toUpdate.setNodeEngine(node.getNodeEngine());
    toUpdate.setNodeColor(node.getNodeColor());
    toUpdate.getMotherboard().setMotherboardColor(node.motherboard.getMotherboardColor());
    toUpdate.getMotherboard().setMotherboardType(node.getMotherboard().getMotherboardType());
    toUpdate.getMotherboard().getWireHarness().setStrategyPyramid(node.getMotherboard().getWireHarness().getStrategyPyramid());
    return toUpdate;
  }

  @PostMapping(value = "/installHarness/{nodeName}")
  public Nodes installNewHarness(@PathVariable("nodeName") String nodeName, @RequestBody Nodes node){
    Nodes n = zportStation.retrieveByMotherboardName(nodeName);
    n.getMotherboard().setWireHarness(new WireHarness(node.getMotherboard().getWireHarness().getColorCount(), node.getMotherboard().getWireHarness().getStrategyPyramid()));
    return n;
  }

  @PostMapping(value = "/filteredNode")
  public Nodes fetchFilteredNode(@RequestBody Nodes node){
    return zportStation.fetchFilteredNode(node.getMotherboard().getMotherboardName(), nodes -> nodes.getMotherboard().getMotherboardName().equals(node.getMotherboard().getMotherboardName()));
  }

}//End of class
