package com.prasanth.threads.basics;

import java.util.ArrayList;
import java.util.List;

public class ThreadSynchronization {

	List<String> items = new ArrayList<String>();

	public void produce() {

		synchronized (this) {
			while (true) {
				String strProduce = items.size() + 1 + "item";
				items.add(strProduce);
				System.out.println("Produced" + strProduce + " " + items.size());

				try {
					if (items.size() > 5) {
						wait();
						notify();
					}
				} catch (InterruptedException e) {

					e.printStackTrace();
				}

			}
		}

	}

	public void consume() {

		synchronized (this) {
			while (true) {
				try {
					if (items.size() == 0) {
						notify();
						wait();
					}
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				String strConsume = items.size() - 1 + "item";
				items.remove(items.size() - 1);
				System.out.println("Consume" + strConsume + " " + items.size());

			}
		}
	}

	public static void main(String[] args) {

		ThreadSynchronization ts = new ThreadSynchronization();

		Runnable r1 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ts.produce();
			}
		};

		Runnable r2 = new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				ts.consume();
			}
		};

		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.setPriority(10);
		t2.setPriority(4);
		t1.start();
		t2.start();
	}
}
