package com.ys.test.singleton;

public class ThreadSingleton implements Runnable {
	
	public void run(){
		System.out.println("Inside run...."+Thread.currentThread().getName());
		
		SingletonTest firstSingle = SingletonTest.getInstance();
		System.out.println("Object id is : "+System.identityHashCode(firstSingle));
		firstSingle.getConfirmation();
	}
	
}
