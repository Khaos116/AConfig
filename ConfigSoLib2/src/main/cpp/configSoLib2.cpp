#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_cc_configsolib2_ConfigSoUtils_stringFromSO(JNIEnv *env, jclass)  {
    std::string info = "这是默认版的lib2.SO返回的数据";
//    std::string info = "这是原始版的lib2.SO返回的数据";
//    std::string info = "这是渠道A01的lib2.SO返回的数据";
//    std::string info = "这是渠道A02的lib2.SO返回的数据";
    return env->NewStringUTF(info.c_str());
}
