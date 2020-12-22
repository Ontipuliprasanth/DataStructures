package com.prasanth.threads.basics;

public class ThreadsBasics {

	
	void method()
	{
		
		synchronized (this) {
			try {
				System.out.println("Method1 start");
				while(true)
				{
				this.wait();
				System.out.println("Method1 end");
				}
			
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	void method2()
	{
		
		synchronized (this) {
			System.out.println("Method2 start");
//			while(true)
//			{
//			this.notify();
//			}
			System.out.println("Method2 end");
		}
	}
	public static void main(String[] args) {
		

		ThreadsBasics tb=new ThreadsBasics();
	Runnable r1= new Runnable() {
		public void run() {
			tb.method();
		}
	};
	
	Runnable r2= new Runnable() {
		public void run() {
			tb.method2();
		}
	};
	
	Thread t1=new Thread(r1);
	Thread t2=new Thread(r2);
	t1.start();
	t2.start();
	
	}
}
