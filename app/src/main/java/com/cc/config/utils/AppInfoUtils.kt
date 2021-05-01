package com.cc.config.utils

import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.StringUtils
import com.cc.config.BuildConfig
import com.cc.config.R
import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * Description:
 * @author: CASE
 * @date: 2019/11/6 17:29
 */
class AppInfoUtils private constructor() {
  private object SingletonHolder {
    val holder = AppInfoUtils()
  }

  companion object {
    val instance = SingletonHolder.holder
  }

  //获取APP版本信息
  fun getAppInfo(): String {
    val builder: StringBuilder = StringBuilder()
    builder.append("版本信息：")
        .append("\n")
        .append("DEBUG：")
        .append(BuildConfig.DEBUG)
        .append("\n")
        .append("BUILD_TIME：")
        .append(StringUtils.getString(R.string.build_time))
        .append("\n")
        .append("PACKAGE_NAME：")
        .append(AppUtils.getAppPackageName())
        .append("\n")
        .append("VERSION_NAME：")
        .append(AppUtils.getAppVersionName())
        .append("\n")
        .append("VERSION_CODE：")
        .append(AppUtils.getAppVersionCode())
        .append("\n")
        .append("CPU：")
        .append(getDeviceCPU())
        .append("\n")
        .append("SHA1：")
        .append(AppUtils.getAppSignaturesSHA1().firstOrNull() ?: "null")
    return builder.toString()
  }

  //获取CPU架构
  fun getDeviceCPU(): String {
    return try {
      BufferedReader(
          InputStreamReader(
              Runtime.getRuntime().exec("getprop ro.product.cpu.abi").inputStream
          )
      ).readLine()
    } catch (e: Exception) {
      ""
    }
  }
}