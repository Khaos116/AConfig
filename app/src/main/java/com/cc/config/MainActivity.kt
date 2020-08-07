package com.cc.config

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ResourceUtils
import com.blankj.utilcode.util.Utils
import com.cc.config.utils.AppInfoUtils
import com.cc.configjarlib.ConfigJarUtils
import com.cc.configsolib.ConfigSoUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Utils.init(application)
    mainTvAppInfo.text = AppInfoUtils.instance.getAppInfo()
    mainTvJarInfo.text = "jar信息读取:\n\n${ConfigJarUtils.getStrFromJAR()}"
    mainTvSoInfo.text = "so信息读取:\n\n${ConfigSoUtils.stringFromSo()}"
    mainTvAssetsInfo.text = "assets信息读取:\n\n${ResourceUtils.readAssets2String("read.txt")}"
  }
}