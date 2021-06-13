package com.cc.configsolib;

/**
 * Description:
 *
 * @author: Khaos
 * @date: 2020/8/7 13:18
 */
public class ConfigSoUtils {
  static {
    try {
      System.loadLibrary("config_so");
    } catch (Exception mE) {
      mE.printStackTrace();
    }
  }

  public native static String stringFromSo();
}
