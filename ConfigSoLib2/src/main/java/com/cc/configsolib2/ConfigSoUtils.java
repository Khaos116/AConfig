package com.cc.configsolib2;

/**
 * Description:
 *
 * @author: CASE
 * @date: 2020/8/7 11:16
 */
public class ConfigSoUtils {
  static {
    //这里采用了ConfigSO
    System.loadLibrary("configSoLib2");
  }

 public static native String stringFromSO();
}
