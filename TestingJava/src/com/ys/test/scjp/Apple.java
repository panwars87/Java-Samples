package com.ys.test.scjp;

import com.ys.test.scjp2.Fruit;

class Apple extends Fruit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Apple fruit = new Apple();
		fruit.printFruitName("Apple");
		fruit.fruitTaste();
	}

	public void printFruitName(String fruitName){
		System.out.println("Fruit Name is : "+fruitName);
	}

}
