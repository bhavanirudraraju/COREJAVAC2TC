package com.tnsif.Thread;

public class Demomultithreads extends Thread {
	public void run() {
		System.out.println("The Id for the class"+Thread.currentThread().getId());
	}
}
class Eclipse extends Thread{
public void run() {
	System.out.println("The Id for eclipse class"+Thread.currentThread().getId());
}
}
class onenote extends Thread {
	public void run() {
		System.out.println("The Id for onenote class"+Thread.currentThread().getId());
	}
}

class outlook extends Thread {
	public void run() {
		System.out.println("The Id for outlook class"+Thread.currentThread().getId());
	}
}


