package com.tnsif.thiskeyword;

import java.io.IOException;

public class DemoThrows {
	int division(int a,int b)throws ArithmeticException,IOException 
	{
		int result=a/b;
		return result;
	}

	public static void main(String[] args) {
		DemoThrows obj=new DemoThrows();
		try {
			
		System.out.println (obj.division(22, 12));
	}
 catch (ArithmeticException | IOException e) {
	 e.printStackTrace();
 }
}
}