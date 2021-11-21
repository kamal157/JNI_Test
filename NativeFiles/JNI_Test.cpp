#include "JNI_Test.h"
#include <chrono>
#include <ctime>
#include <stdlib.h>
#include <iostream>      

using namespace std;

JNIEXPORT jlong JNICALL Java_JNI_1Test_getSystemMills (JNIEnv *, jobject){

	time_t now = time(0);
    char* dt = ctime(&now);
	return atol(dt);
}


int main(int n,char**args){

    /*
    * TO_DO impl
    */
    time_t now = time(0);
    char* dt = ctime(&now);
    cout<<dt;
    return 1;

}