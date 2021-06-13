#include <jni.h>
#include <android/log.h>

jstring Java_com_cc_configsolib_ConfigSoUtils_stringFromSo(JNIEnv *env, jobject obj) {
    __android_log_print(ANDROID_LOG_ERROR, "Khaos", "从SO获取String");
    char *ext = "这是从默认版本获取的lib.SO信息";
//  char *ext = "这是从原始版本获取的lib.SO信息";
//  char *ext = "这是从渠道A01版本获取的lib.SO信息";
//  char *ext = "这是从渠道A02版本获取的lib.SO信息";
    return (*env)->NewStringUTF(env, ext);
}

