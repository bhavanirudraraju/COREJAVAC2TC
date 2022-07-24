package com.tnsif.Thread;

public class DemoMultithreading {
 public static void main(String[] args) {
	 Demomultithreads obj=new Demomultithreads();
	 Thread tobj=new Thread(obj);
	 tobj.start();
	 
	 Eclipse obj1=new Eclipse();
	 Thread tobj1=new Thread(obj1);
	 tobj1.start();
	 
	 onenote obj2=new onenote();
	 Thread tobj2=new Thread(obj2);
	 tobj2.start();
	 
	 onenote obj3=new onenote();
	 Thread tobj3=new Thread(obj3);
	 tobj3.start();
	 
	 
	 
 }
}
