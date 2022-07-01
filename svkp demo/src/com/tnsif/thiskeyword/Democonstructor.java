package com.tnsif.thiskeyword;

import java.util.Objects;

public class Democonstructor 
{ 
	int num1;
	int num2;
 
	public Democonstructor(int num1,int num2)
	{
		super();
		this.num1=num1;
		this.num2=num2;
		
	}
void display()
 {
	 System.out.println("this is example for constructor");
 }
	public static void main(String[] args)
	{
		Democonstructor obj=new Democonstructor(10,30);
		obj.display();
	}

}
