package com.tnsif.daytwelve.multithreadingdemo;

public class ChildThread extends Thread{

	//Data members
	int n;
	String msg;
	
	public ChildThread(int n, String msg)
	{
		this.n=n;
		this.msg=msg;
	}
	
	public void run()
	{
		for(int i=1; i<n; i++)
		{
			try {
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.err.println(e.getMessage());
			}
			System.out.println(i + msg);
		}
	}
	
	
	
	
	
}