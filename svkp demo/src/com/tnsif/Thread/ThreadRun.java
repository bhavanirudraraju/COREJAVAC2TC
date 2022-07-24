package com.tnsif.Thread;

public class ThreadRun implements Runnable {
	
		@Override
		public void run() {
               System.out.println("Thread id running");			
		}	
		public static void main(String[] args) {
			ThreadRun obj=new ThreadRun();
			Thread tobj=new Thread(obj);
			tobj.start();
		
	}

}


