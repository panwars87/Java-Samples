package com.ys.test.singleton;

public class TestSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SingletonTest firstSingle = SingletonTest.getInstance();
		System.out.println("Object id is : "+ System.identityHashCode(firstSingle));
		firstSingle.getConfirmation();
		
		SingletonTest secondSingle = SingletonTest.getInstance();
		System.out.println("Object id is : "+ System.identityHashCode(secondSingle));
		secondSingle.getConfirmation();
	}

}
