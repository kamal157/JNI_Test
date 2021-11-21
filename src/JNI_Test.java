/**
 * 
 */

/**
 * @author kamal-3928
 *
 */
public class JNI_Test {

	//for mac os
	// g++ -c -fPIC -I{JAVA_HOME}/include -I{JAVA_HOME}/include/darwin JNI_Test.cpp -o JNI_Test.o
	// g++ -dynamiclib -o libJNI_Test_Native_Lib.dylib JNI_Test.o -lc 
	// {JAVA_HOME}/bin/java -Dfile.encoding=UTF-8 -classpath {CLASS_PATH}  JNI_Test -Djava.library.path={NATIVE_LIB_FOLDER}
	
	static
	{
		System.loadLibrary("JNI_Test_Native_Lib");
	}
	
	public  native long getSystemMills();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JNI_Test obj = new JNI_Test();
		System.out.println( obj.getSystemMills());

	}

}

//

//