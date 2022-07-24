package com.tnif.Genericsdemo;

public class GenericMain {

	public static void main(String[] args) {
    //initialize to Integer value
        GenericsClass<Integer> intObj=new GenericsClass<Integer>(47);
		System.out.println("The Generics class return: "+intObj.getData());
		
	    //initialize to String value
        GenericsClass<String> strObj=new GenericsClass<String>("bhavani");
		System.out.println("The Generics class return: "+strObj.getData());

	}

}
