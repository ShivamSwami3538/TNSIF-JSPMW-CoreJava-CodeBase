package com.tnsif.daytwelve.multithreadingdemo;

public class ThreadMethodDemo {

	public static void main(String[] args) {
		
		
		ChildThread t1=new ChildThread(5, "First");
		ChildThread t2=new ChildThread(10, "Second");
		
		
		t1.start();
		t2.start();
		
		Thread.currentThread().setName("Parent Thread"); //assigning name to main thread as a parent thread
		Thread.currentThread().setPriority(Thread.MIN_PRIORITY);  // changing the priority of the thread
		System.out.println("Current Thread :"+ Thread.currentThread());

		
		try {
			t1.join();  //wait current threads until t1 is dead 
			t2.join(); // wait current thread until t2 is dead 
			
		}
		catch (InterruptedException e)
		{
			Thread.currentThread().interrupt(); // restore interrupted status 
			System.err.println(e.getMessage());
		}
		
		System.out.println("-------End of Main------");
		
		
	}

}