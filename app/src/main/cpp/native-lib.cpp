#include <jni.h>
#include <string>

extern "C"
JNIEXPORT jstring JNICALL
Java_development_software_gps_1learn_MainActivity_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {

}

extern "C"
JNIEXPORT jstring JNICALL
Java_development_software_gps_1learn_Service_Activity_1Service_stringFromJNI(JNIEnv *env,
                                                                             jobject instance) {

    // TODO


    std::string hello = "http://192.168.1.104:3000";
    //"http://ebrahimkhani.ir/active/active.php";
    return env->NewStringUTF(hello.c_str());
}