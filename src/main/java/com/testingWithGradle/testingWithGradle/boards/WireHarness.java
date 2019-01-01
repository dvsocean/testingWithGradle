package com.testingWithGradle.testingWithGradle.boards;

import com.testingWithGradle.testingWithGradle.boards.utils.WireHarnessUtils;

public class WireHarness extends WireHarnessUtils {

  private int packetCount = packetInitializer();
  private int colorCount;
  private String strategyPyramid;

  public WireHarness(int colorCount, String strategyPyramid) {
    this.colorCount = colorCount;
    this.strategyPyramid = strategyPyramid;
  }

  public WireHarness() {
    //
  }

  public int getPacketCount() {
    return packetCount;
  }

  public void setPacketCount(int packetCount) {
    this.packetCount = packetCount;
  }

  public int getColorCount() {
    return colorCount;
  }

  public void setColorCount(int colorCount) {
    this.colorCount = colorCount;
  }

  public String getStrategyPyramid() {
    return strategyPyramid;
  }

  public void setStrategyPyramid(String strategyPyramid) {
    this.strategyPyramid = strategyPyramid;
  }
}//End of class
