package com.cc.config;

import android.util.Log;
import com.google.common.hash.*;
import java.nio.charset.StandardCharsets;

/**
 * @Description MurMur3测试
 * @Author：CASE
 * @Date：2021-05-02
 * @Time：00:15
 */
public class MurMur3 {
  //校验地址http://murmurhash.shorelabs.com/
  public static void test() {
    HashCode hashCodeX86_32 = Hashing.murmur3_32(42).hashString("linus", StandardCharsets.UTF_8);
    String x86_32 = hashCodeX86_32.asInt() + "";
    //1302636108
    Log.e("CASE", "MurMur3_X86_32位计算结果:" + x86_32);

    HashCode hashCodeX64_128 = Hashing.murmur3_128(42).hashString("linus", StandardCharsets.UTF_8);
    String reverseHex = reverseHex(hashCodeX64_128 + "");
    String x64_128 = reverseHex.substring(reverseHex.length() / 2) + reverseHex.substring(0, reverseHex.length() / 2);
    //9998c0523c849bdb5b52cf78f183d331
    Log.e("CASE", "MurMur3_X64_128位计算结果:" + x64_128);
  }

  private static String reverseHex(String hex) {
    char[] charArray = hex.toCharArray();
    int length = charArray.length;
    int times = length / 2;
    for (int c1i = 0; c1i < times; c1i += 2) {
      int c2i = c1i + 1;
      char c1 = charArray[c1i];
      char c2 = charArray[c2i];
      int c3i = length - c1i - 2;
      int c4i = length - c1i - 1;
      charArray[c1i] = charArray[c3i];
      charArray[c2i] = charArray[c4i];
      charArray[c3i] = c1;
      charArray[c4i] = c2;
    }
    return new String(charArray);
  }
}
