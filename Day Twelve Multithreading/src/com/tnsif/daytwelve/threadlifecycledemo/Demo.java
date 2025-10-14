package com.tnsif.daytwelve.threadlifecycledemo;

public class Demo {

	public static void main(String[] args) {

		
		Thread myThread=new ThreadLifeCycleDemo();
		
		System.out.println("Before Runnable State thread is alive or not ?"
				+ myThread.isAlive());
		
		myThread.start();
		
		
		try {
			Thread.sleep(200);
		}
		catch (InterruptedException e)
		{
			System.err.println(e);
		}
		
		System.out.println("After Completion execution, it is alive or not ?"
				+ myThread.isAlive());
		
		
	}

}