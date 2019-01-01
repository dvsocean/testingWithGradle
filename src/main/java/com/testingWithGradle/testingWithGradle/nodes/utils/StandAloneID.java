package com.testingWithGradle.testingWithGradle.nodes.utils;

import org.springframework.stereotype.Component;

@Component
public class StandAloneID {

  public int genStandaloneID(){
    int[] namesArray = new int[500];
    int index = (int) (Math.random() * namesArray.length);

    for (int i = 0; i < namesArray.length - 1; i++) {
      namesArray[i] = index;
    }
    return namesArray[index];
  }
}
