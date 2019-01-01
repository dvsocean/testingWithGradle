package com.testingWithGradle.testingWithGradle.boards.utils;

public class WireHarnessUtils {

  protected int packetInitializer(){
    int[] packetStorage = new int[]{
        233, 45, 87, 453, 12, 112, 98, 679, 34, 344, 33, 239
    };
    int index = (int) (Math.random() * packetStorage.length);
    return packetStorage[index];
  }

}
