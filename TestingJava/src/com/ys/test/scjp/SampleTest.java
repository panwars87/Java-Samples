package com.ys.test.scjp;

public class SampleTest {
	public String name = "Shashant";
	public int age=26;
	
	//You can declare enum as class instance variable but you cannot define enum in method.
	enum CoffeeType {LATEE,CAFE,MOCHA};
	
	//You can pass different integers, array of integers but not arrayList, object or collection.
	static void getNumbers(int... x){
		for(int i : x){
			System.out.println("x is : "+i);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*getNumbers(1,2,3,4,5,6,7);
		getNumbers();
		int numbers[] = new int[]{4,5,6,3,4,2};
		getNumbers(numbers);*/
		
		CoffeeSize cs = CoffeeSize.TALL;
		CoffeeType drink = SampleTest.CoffeeType.LATEE;
		System.out.println("Siz is : "+cs.getOunces()+" and lid type is : "+cs.getLidType());
	}

}
