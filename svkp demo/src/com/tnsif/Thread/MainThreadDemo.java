package com.tnsif.Thread;

public class MainThreadDemo {

	public static void main(String[] args) {

		DemoThread obj=new DemoThread();
		Thread tobj=new Thread(obj);
		tobj.run();
	}

}
