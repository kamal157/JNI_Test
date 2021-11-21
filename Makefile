CC= g++
LINKER_FLAG= -c -fPIC
LINKER_FLAG_DYN= -dynamiclib

run:make
	@echo "System millis :::" ; ${JAVA_HOME}/bin/java -Dfile.encoding=UTF-8 -cp generated -Djava.library.path=generated/  JNI_Test 

clean_run: clean make run

make:
	${JAVA_HOME}/bin/javac src/JNI_Test.java -d generated/
	${CC} ${LINKER_FLAG} -I${JAVA_HOME}/include -I${JAVA_HOME}/include/darwin NativeCFiles/JNI_Test.cpp -o generated/JNI_Test.o
	${CC} ${LINKER_FLAG_DYN} -o generated/libJNI_Test_Native_Lib.dylib generated/JNI_Test.o -lc 

clean:
	rm -rf generated/*



