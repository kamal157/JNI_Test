/**
 * 
 */
public class JNI_Test {
	
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
