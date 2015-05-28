package com.ys.test.singleton;

public class TestThreadSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r1 = new ThreadSingleton();
		Runnable r2 = new ThreadSingleton();
		
		new Thread(r1).start();
		new Thread(r2).start();
	}

}
