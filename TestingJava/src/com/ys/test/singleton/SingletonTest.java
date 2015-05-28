package com.ys.test.singleton;

public class SingletonTest {

	private static SingletonTest singletonObject = null;
	
	//private constructor so that no initialization takes place
	private SingletonTest(){}

	public static SingletonTest getInstance(){
		synchronized(SingletonTest.class){
			if(singletonObject == null)singletonObject = new SingletonTest();
		}
		return singletonObject;
	}
	
	public void getConfirmation(){
		System.out.println("Object Created successfully");
	}
}
