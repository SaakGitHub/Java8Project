package com.lambda;
/*
 *Normal Approach 
 *
class MyThread implements Runnable {
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.println("Child Thread");
		}
	}
}
public class ThreadFunctional {
	public static void main(String[] args) {
		MyThread r = new MyThread();
		Thread t = new Thread(r);
		System.out.println(t.currentThread().getName());
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Parent Thread");
		}
	}
}
*/

/*Functional Interface Approach

*/

public class ThreadFunctional {
	public static void main(String[] args) {
		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Lambda Child Thread");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Lambda Parent Thread");
		}
	}
}