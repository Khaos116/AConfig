package com.cc.config

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.ResourceUtils
import com.blankj.utilcode.util.Utils
import com.cc.config.utils.AppInfoUtils
import com.cc.configjarlib.ConfigJarUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
  @SuppressLint("SetTextI18n")
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)
    Utils.init(application)
    mainTvAppInfo.text = AppInfoUtils.instance.getAppInfo()
    mainTvLibsInfo.text = "jar内读取:\n\n${ConfigJarUtils.getStrFromJAR()}"
    mainTvAssetsInfo.text = "assets内容读取:\n\n${ResourceUtils.readAssets2String("read.txt")}"
  }
}