package com.tnsif.thiskeyword;

public class DemoThrow {
	void checkAge(int age)
	{
		if (age<18)
			throw new ArithmeticException("Not eliglible for voting");
		else
			System.out.println("Eliglible for voting");
	}

	public static void main(String[] args) {
    DemoThrow obj=new DemoThrow();
    obj.checkAge(18);
	}

}
