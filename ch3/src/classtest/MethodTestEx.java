package classtest;

import java.util.Arrays;

public class MethodTestEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		
		System.out.println(obj.sum(5, 6));
		
		char charValue = obj.method1();
		
		int value = charValue+1;
		System.out.println(value);
		
		float result1 = obj.divided2(5.0f, 2.0f);
		System.out.println(result1);
		
		//array
		int arr[] = {4,5,6,7};
		int arr2[] = obj.array(arr);
		System.out.println(Arrays.toString(arr2));
		
	}

}
