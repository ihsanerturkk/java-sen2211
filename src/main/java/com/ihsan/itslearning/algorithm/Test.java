package com.ihsan.itslearning.algorithm;

import java.util.Random;

public class Test {

	
	public static int rec_factorial (int number) {
		//number = 5
		//5! = 5 * 24 --> 4! = 4 * 6 --> 3! = 3 *2 --> 2! = 2 * 1 --> 1! = 1
		if(number == 1)
			return 1;
		return number * rec_factorial(number - 1);
	}
	
	public static void main(String[] args) {
//		System.out.println(factorial(7));
//		System.out.println(rec_factorial(5));
		
		int arr [] = new int[6];
		
		//class_name object_name = new constructor
		Random r = new Random();
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = r.nextInt(91) + 10; //[10, 100]
			System.out.println(arr[i]);
		}
		
	}
	
	//public return_type function_name (parameters)
	public static int factorial (int number) {
		//number = 5
		//5! = 5*4*3*2*1
		
		int result = 1; //res= 1
		
		for (int i = 1; i <= number; i++) {//i=6
			result *= i;//result =120 --> result = result * i
		}	
		
		return result;
	}
	
	
	

}
