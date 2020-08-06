package com.cc.configlib

import android.content.Context

/**
 * Description: ConfigLib用来创建jar文件的，没有其他作用
 * @author: CASE
 * @date: 2020/8/6 16:09
 */
class ConfigLibUtils private constructor() {
  private object SingletonHolder {
    val holder = ConfigLibUtils()
  }

  companion object {
    val instance = SingletonHolder.holder
  }

  fun getPackageName(context: Context): String {
    return "原始版:" +context.applicationContext.packageName
  }
}