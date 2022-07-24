package com.tnif.Genericsdemo;

public class GenericsClass<T> {
	private T data;
	
	public GenericsClass(T data) {
		super();
		this.data=data;
	}
 public  T getData() {
	 return this.data;
 }
	}
