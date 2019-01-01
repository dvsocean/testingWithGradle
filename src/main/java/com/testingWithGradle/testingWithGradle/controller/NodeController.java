package com.testingWithGradle.testingWithGradle.controller;

import com.testingWithGradle.testingWithGradle.applicationImpl.ZportStation;
import com.testingWithGradle.testingWithGradle.boards.Motherboard;
import com.testingWithGradle.testingWithGradle.boards.WireHarness;
import com.testingWithGradle.testingWithGradle.nodes.Nodes;
import com.testingWithGradle.testingWithGradle.nodes.utils.StandAloneID;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NodeController {

  /*
  curl -H "Content-Type: application/json" -d '{"engine":"SuperChargedJavaScript", "color":"Stripped and coiled"}' -X POST http://localhost:5050/updateNode/{name}
  or to be more explicit use..
  curl --header "Content-Type: application/json" --data '{"engine":"V55","color":"black and yellow"}' -X POST http://localhost:5050/updateNode/{name}
  * */

  @Autowired
  private ZportStation zportStation;

  @Autowired
  private StandAloneID standAloneID;

  @RequestMapping(value = "/findNode/{name}")
  public Nodes findSingleNode(@PathVariable("name") String name) {
    return zportStation.retrieveByMotherboardName(name);
  }

  @RequestMapping(value = "/createNode/{name}")
  public Nodes createSingleNode(@PathVariable("name") String name) {
    List<Nodes> gar = zportStation.getNodesGarage();
    for(Nodes n : gar) {
      if(n.getMotherboard().getMotherboardName().equalsIgnoreCase(name)){
        return new Nodes(new Motherboard("Node not saved, duplicate found. " +
            "ID is --> " + standAloneID.genStandaloneID()));
      }
    }
    return zportStation.addNodeForMvcTest(name);
  }

  @RequestMapping(value = "/showAll")
  public List<Nodes> showAllNodes() {
    return zportStation.getNodesGarage();
  }

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
    n.getMotherboard().setWireHarness(new WireHarness(node.getMotherboard().getWireHarness().getColorCount(),
        node.getMotherboard().getWireHarness().getStrategyPyramid()));
    return n;
  }

  @PostMapping(value = "/filteredNode")
  public Nodes fetchFilteredNode(@RequestBody Nodes node){
    return zportStation.fetchFilteredNode(node.getMotherboard().getMotherboardName(),
        nodes -> nodes.getMotherboard().getMotherboardName().equals(node.getMotherboard().getMotherboardName()));
  }

  @PostMapping(value = "/updateChipset/{name}")
  public Nodes updateChipset(@PathVariable("name") String name, @RequestBody Nodes node){
    Nodes n = zportStation.retrieveByMotherboardName(name);
    n.getMotherboard().getChipset().setChipsetFamily(node.getMotherboard().getChipset().getChipsetFamily());
    return n;
  }

  @PostMapping(value = "/firstCompareThenUpdate/{name}")
  public Nodes martiansVsGoblins(@PathVariable("name") String name, @RequestBody Nodes node){
    Nodes n = zportStation.retrieveByMotherboardName(name);
    zportStation.ifNodeIdIsAboveFiftyThenReassignValues(n, nodes -> node.getNodeId() > 200);
    return n;
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/updateTags/{name}")
  public Nodes updateTags(@PathVariable("name") String name, @RequestBody Nodes node){
    Nodes n = zportStation.retrieveByMotherboardName(name);
    zportStation.updateTagsWithGivenNode(n,
        nodes -> nodes.getMotherboard().getChipset().setTags(node.getMotherboard().getChipset().getTags()));
    return n;
  }

  @RequestMapping(method = RequestMethod.PUT, value = "/validate")
  public Nodes validateNode(@RequestBody Nodes node){
    return zportStation.confirmAndValidate(node, Nodes::getNodeType,
        s -> s.equalsIgnoreCase("HEAVY DUTY") || s.equalsIgnoreCase("LightWeight"));
  }

}//End of class
